// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.util;

import android.app.Activity;
import android.content.*;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.exoplayer2.*;
import com.google.android.exoplayer2.upstream.DataSource;
import java.io.*;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.google.android.exoplayer2.util:
//			MimeTypes, Assertions

public final class Util
{

	private Util()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #346 <Method void Object()>
	//    2    4:return          
	}

	public static long addWithOverflowDefault(long l, long l1, long l2)
	{
		long l3 = l + l1;
	//    0    0:lload_0         
	//    1    1:lload_2         
	//    2    2:ladd            
	//    3    3:lstore          6
		if(((l ^ l3) & (l1 ^ l3)) < 0L)
	//*   4    5:lload_0         
	//*   5    6:lload           6
	//*   6    8:lxor            
	//*   7    9:lload_2         
	//*   8   10:lload           6
	//*   9   12:lxor            
	//*  10   13:land            
	//*  11   14:lconst_0        
	//*  12   15:lcmp            
	//*  13   16:ifge            22
			return l2;
	//   14   19:lload           4
	//   15   21:lreturn         
		else
			return l3;
	//   16   22:lload           6
	//   17   24:lreturn         
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
	//   10   14:invokevirtual   #355 <Method boolean Object.equals(Object)>
	//   11   17:ireturn         
	}

	public static int binarySearchCeil(List list, Object obj, boolean flag, boolean flag1)
	{
		int i = Collections.binarySearch(list, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #364 <Method int Collections.binarySearch(List, Object)>
	//    3    5:istore          4
		if(i < 0)
	//*   4    7:iload           4
	//*   5    9:ifge            21
		{
			i = ~i;
	//    6   12:iload           4
	//    7   14:iconst_m1       
	//    8   15:ixor            
	//    9   16:istore          4
		} else
	//*  10   18:goto            78
		{
			int j = list.size();
	//   11   21:aload_0         
	//   12   22:invokeinterface #370 <Method int List.size()>
	//   13   27:istore          5
			do
				i++;
	//   14   29:iload           4
	//   15   31:iconst_1        
	//   16   32:iadd            
	//   17   33:istore          4
			while(i < j && ((Comparable)list.get(i)).compareTo(obj) == 0);
	//   18   35:iload           4
	//   19   37:iload           5
	//   20   39:icmpge          65
	//   21   42:aload_0         
	//   22   43:iload           4
	//   23   45:invokeinterface #374 <Method Object List.get(int)>
	//   24   50:checkcast       #376 <Class Comparable>
	//   25   53:aload_1         
	//   26   54:invokeinterface #380 <Method int Comparable.compareTo(Object)>
	//   27   59:ifne            65
	//*  28   62:goto            29
			if(flag)
	//*  29   65:iload_2         
	//*  30   66:ifeq            78
				i--;
	//   31   69:iload           4
	//   32   71:iconst_1        
	//   33   72:isub            
	//   34   73:istore          4
		}
	//*  35   75:goto            78
		int k = i;
	//   36   78:iload           4
	//   37   80:istore          5
		if(flag1)
	//*  38   82:iload_3         
	//*  39   83:ifeq            101
			k = Math.min(list.size() - 1, i);
	//   40   86:aload_0         
	//   41   87:invokeinterface #370 <Method int List.size()>
	//   42   92:iconst_1        
	//   43   93:isub            
	//   44   94:iload           4
	//   45   96:invokestatic    #386 <Method int Math.min(int, int)>
	//   46   99:istore          5
		return k;
	//   47  101:iload           5
	//   48  103:ireturn         
	}

	public static int binarySearchCeil(long al[], long l, boolean flag, boolean flag1)
	{
		int j = Arrays.binarySearch(al, l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokestatic    #394 <Method int Arrays.binarySearch(long[], long)>
	//    3    5:istore          6
		int i = j;
	//    4    7:iload           6
	//    5    9:istore          5
		if(j < 0)
	//*   6   11:iload           6
	//*   7   13:ifge            25
		{
			i = ~j;
	//    8   16:iload           6
	//    9   18:iconst_m1       
	//   10   19:ixor            
	//   11   20:istore          5
		} else
	//*  12   22:goto            63
		{
			do
				i++;
	//   13   25:iload           5
	//   14   27:iconst_1        
	//   15   28:iadd            
	//   16   29:istore          5
			while(i < al.length && al[i] == l);
	//   17   31:iload           5
	//   18   33:aload_0         
	//   19   34:arraylength     
	//   20   35:icmpge          50
	//   21   38:aload_0         
	//   22   39:iload           5
	//   23   41:laload          
	//   24   42:lload_1         
	//   25   43:lcmp            
	//   26   44:ifne            50
	//*  27   47:goto            25
			if(flag)
	//*  28   50:iload_3         
	//*  29   51:ifeq            63
				i--;
	//   30   54:iload           5
	//   31   56:iconst_1        
	//   32   57:isub            
	//   33   58:istore          5
		}
	//*  34   60:goto            63
		j = i;
	//   35   63:iload           5
	//   36   65:istore          6
		if(flag1)
	//*  37   67:iload           4
	//*  38   69:ifeq            83
			j = Math.min(al.length - 1, i);
	//   39   72:aload_0         
	//   40   73:arraylength     
	//   41   74:iconst_1        
	//   42   75:isub            
	//   43   76:iload           5
	//   44   78:invokestatic    #386 <Method int Math.min(int, int)>
	//   45   81:istore          6
		return j;
	//   46   83:iload           6
	//   47   85:ireturn         
	}

	public static int binarySearchFloor(List list, Object obj, boolean flag, boolean flag1)
	{
		int j = Collections.binarySearch(list, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #364 <Method int Collections.binarySearch(List, Object)>
	//    3    5:istore          5
		int i = j;
	//    4    7:iload           5
	//    5    9:istore          4
		if(j < 0)
	//*   6   11:iload           5
	//*   7   13:ifge            26
		{
			i = -(j + 2);
	//    8   16:iload           5
	//    9   18:iconst_2        
	//   10   19:iadd            
	//   11   20:ineg            
	//   12   21:istore          4
		} else
	//*  13   23:goto            73
		{
			do
				i--;
	//   14   26:iload           4
	//   15   28:iconst_1        
	//   16   29:isub            
	//   17   30:istore          4
			while(i >= 0 && ((Comparable)list.get(i)).compareTo(obj) == 0);
	//   18   32:iload           4
	//   19   34:iflt            60
	//   20   37:aload_0         
	//   21   38:iload           4
	//   22   40:invokeinterface #374 <Method Object List.get(int)>
	//   23   45:checkcast       #376 <Class Comparable>
	//   24   48:aload_1         
	//   25   49:invokeinterface #380 <Method int Comparable.compareTo(Object)>
	//   26   54:ifne            60
	//*  27   57:goto            26
			if(flag)
	//*  28   60:iload_2         
	//*  29   61:ifeq            73
				i++;
	//   30   64:iload           4
	//   31   66:iconst_1        
	//   32   67:iadd            
	//   33   68:istore          4
		}
	//*  34   70:goto            73
		j = i;
	//   35   73:iload           4
	//   36   75:istore          5
		if(flag1)
	//*  37   77:iload_3         
	//*  38   78:ifeq            89
			j = Math.max(0, i);
	//   39   81:iconst_0        
	//   40   82:iload           4
	//   41   84:invokestatic    #398 <Method int Math.max(int, int)>
	//   42   87:istore          5
		return j;
	//   43   89:iload           5
	//   44   91:ireturn         
	}

	public static int binarySearchFloor(int ai[], int i, boolean flag, boolean flag1)
	{
		int k = Arrays.binarySearch(ai, i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #402 <Method int Arrays.binarySearch(int[], int)>
	//    3    5:istore          5
		int j = k;
	//    4    7:iload           5
	//    5    9:istore          4
		if(k < 0)
	//*   6   11:iload           5
	//*   7   13:ifge            25
		{
			i = -(k + 2);
	//    8   16:iload           5
	//    9   18:iconst_2        
	//   10   19:iadd            
	//   11   20:ineg            
	//   12   21:istore_1        
		} else
	//*  13   22:goto            62
		{
			do
				j--;
	//   14   25:iload           4
	//   15   27:iconst_1        
	//   16   28:isub            
	//   17   29:istore          4
			while(j >= 0 && ai[j] == i);
	//   18   31:iload           4
	//   19   33:iflt            47
	//   20   36:aload_0         
	//   21   37:iload           4
	//   22   39:iaload          
	//   23   40:iload_1         
	//   24   41:icmpne          47
	//*  25   44:goto            25
			if(flag)
	//*  26   47:iload_2         
	//*  27   48:ifeq            59
				i = j + 1;
	//   28   51:iload           4
	//   29   53:iconst_1        
	//   30   54:iadd            
	//   31   55:istore_1        
			else
	//*  32   56:goto            62
				i = j;
	//   33   59:iload           4
	//   34   61:istore_1        
		}
		j = i;
	//   35   62:iload_1         
	//   36   63:istore          4
		if(flag1)
	//*  37   65:iload_3         
	//*  38   66:ifeq            76
			j = Math.max(0, i);
	//   39   69:iconst_0        
	//   40   70:iload_1         
	//   41   71:invokestatic    #398 <Method int Math.max(int, int)>
	//   42   74:istore          4
		return j;
	//   43   76:iload           4
	//   44   78:ireturn         
	}

	public static int binarySearchFloor(long al[], long l, boolean flag, boolean flag1)
	{
		int j = Arrays.binarySearch(al, l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokestatic    #394 <Method int Arrays.binarySearch(long[], long)>
	//    3    5:istore          6
		int i = j;
	//    4    7:iload           6
	//    5    9:istore          5
		if(j < 0)
	//*   6   11:iload           6
	//*   7   13:ifge            26
		{
			i = -(j + 2);
	//    8   16:iload           6
	//    9   18:iconst_2        
	//   10   19:iadd            
	//   11   20:ineg            
	//   12   21:istore          5
		} else
	//*  13   23:goto            62
		{
			do
				i--;
	//   14   26:iload           5
	//   15   28:iconst_1        
	//   16   29:isub            
	//   17   30:istore          5
			while(i >= 0 && al[i] == l);
	//   18   32:iload           5
	//   19   34:iflt            49
	//   20   37:aload_0         
	//   21   38:iload           5
	//   22   40:laload          
	//   23   41:lload_1         
	//   24   42:lcmp            
	//   25   43:ifne            49
	//*  26   46:goto            26
			if(flag)
	//*  27   49:iload_3         
	//*  28   50:ifeq            62
				i++;
	//   29   53:iload           5
	//   30   55:iconst_1        
	//   31   56:iadd            
	//   32   57:istore          5
		}
	//*  33   59:goto            62
		j = i;
	//   34   62:iload           5
	//   35   64:istore          6
		if(flag1)
	//*  36   66:iload           4
	//*  37   68:ifeq            79
			j = Math.max(0, i);
	//   38   71:iconst_0        
	//   39   72:iload           5
	//   40   74:invokestatic    #398 <Method int Math.max(int, int)>
	//   41   77:istore          6
		return j;
	//   42   79:iload           6
	//   43   81:ireturn         
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
	//    3    5:invokeinterface #413 <Method void DataSource.close()>
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
	//    3    5:invokeinterface #417 <Method void Closeable.close()>
		return;
	//    4   10:return          
		closeable;
	//    5   11:astore_0        
	//    6   12:return          
	}

	public static int compareLong(long l, long l1)
	{
		if(l < l1)
	//*   0    0:lload_0         
	//*   1    1:lload_2         
	//*   2    2:lcmp            
	//*   3    3:ifge            8
			return -1;
	//    4    6:iconst_m1       
	//    5    7:ireturn         
		return l != l1 ? 1 : 0;
	//    6    8:lload_0         
	//    7    9:lload_2         
	//    8   10:lcmp            
	//    9   11:ifne            16
	//   10   14:iconst_0        
	//   11   15:ireturn         
	//   12   16:iconst_1        
	//   13   17:ireturn         
	}

	public static float constrainValue(float f, float f1, float f2)
	{
		return Math.max(f1, Math.min(f, f2));
	//    0    0:fload_1         
	//    1    1:fload_0         
	//    2    2:fload_2         
	//    3    3:invokestatic    #424 <Method float Math.min(float, float)>
	//    4    6:invokestatic    #426 <Method float Math.max(float, float)>
	//    5    9:freturn         
	}

	public static int constrainValue(int i, int j, int k)
	{
		return Math.max(j, Math.min(i, k));
	//    0    0:iload_1         
	//    1    1:iload_0         
	//    2    2:iload_2         
	//    3    3:invokestatic    #386 <Method int Math.min(int, int)>
	//    4    6:invokestatic    #398 <Method int Math.max(int, int)>
	//    5    9:ireturn         
	}

	public static long constrainValue(long l, long l1, long l2)
	{
		return Math.max(l1, Math.min(l, l2));
	//    0    0:lload_2         
	//    1    1:lload_0         
	//    2    2:lload           4
	//    3    4:invokestatic    #429 <Method long Math.min(long, long)>
	//    4    7:invokestatic    #431 <Method long Math.max(long, long)>
	//    5   10:lreturn         
	}

	public static boolean contains(Object aobj[], Object obj)
	{
		int j = aobj.length;
	//    0    0:aload_0         
	//    1    1:arraylength     
	//    2    2:istore_3        
		for(int i = 0; i < j; i++)
	//*   3    3:iconst_0        
	//*   4    4:istore_2        
	//*   5    5:iload_2         
	//*   6    6:iload_3         
	//*   7    7:icmpge          29
			if(areEqual(aobj[i], obj))
	//*   8   10:aload_0         
	//*   9   11:iload_2         
	//*  10   12:aaload          
	//*  11   13:aload_1         
	//*  12   14:invokestatic    #435 <Method boolean areEqual(Object, Object)>
	//*  13   17:ifeq            22
				return true;
	//   14   20:iconst_1        
	//   15   21:ireturn         

	//   16   22:iload_2         
	//   17   23:iconst_1        
	//   18   24:iadd            
	//   19   25:istore_2        
	//*  20   26:goto            5
		return false;
	//   21   29:iconst_0        
	//   22   30:ireturn         
	}

	public static int crc(byte abyte0[], int i, int j, int k)
	{
		for(; i < j; i++)
	//*   0    0:iload_1         
	//*   1    1:iload_2         
	//*   2    2:icmpge          38
			k = CRC32_BYTES_MSBF[(k >>> 24 ^ abyte0[i] & 0xff) & 0xff] ^ k << 8;
	//    3    5:getstatic       #344 <Field int[] CRC32_BYTES_MSBF>
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

	public static File createTempDirectory(Context context, String s)
		throws IOException
	{
		context = ((Context) (createTempFile(context, s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #442 <Method File createTempFile(Context, String)>
	//    3    5:astore_0        
		((File) (context)).delete();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #448 <Method boolean File.delete()>
	//    6   10:pop             
		((File) (context)).mkdir();
	//    7   11:aload_0         
	//    8   12:invokevirtual   #451 <Method boolean File.mkdir()>
	//    9   15:pop             
		return ((File) (context));
	//   10   16:aload_0         
	//   11   17:areturn         
	}

	public static File createTempFile(Context context, String s)
		throws IOException
	{
		return File.createTempFile(s, ((String) (null)), context.getCacheDir());
	//    0    0:aload_1         
	//    1    1:aconst_null     
	//    2    2:aload_0         
	//    3    3:invokevirtual   #458 <Method File Context.getCacheDir()>
	//    4    6:invokestatic    #461 <Method File File.createTempFile(String, String, File)>
	//    5    9:areturn         
	}

	public static String escapeFileName(String s)
	{
		int l = s.length();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #466 <Method int String.length()>
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
	//*  16   24:invokevirtual   #37  <Method char String.charAt(int)>
	//*  17   27:invokestatic    #470 <Method boolean shouldEscapeCharacter(char)>
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
	//   34   54:new             #51  <Class StringBuilder>
	//   35   57:dup             
	//   36   58:iload_2         
	//   37   59:iconst_2        
	//   38   60:imul            
	//   39   61:iload           6
	//   40   63:iadd            
	//   41   64:invokespecial   #473 <Method void StringBuilder(int)>
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
	//   51   80:invokevirtual   #37  <Method char String.charAt(int)>
	//   52   83:istore_1        
			if(shouldEscapeCharacter(c))
	//*  53   84:iload_1         
	//*  54   85:invokestatic    #470 <Method boolean shouldEscapeCharacter(char)>
	//*  55   88:ifeq            116
			{
				stringbuilder.append('%');
	//   56   91:aload           7
	//   57   93:bipush          37
	//   58   95:invokevirtual   #476 <Method StringBuilder StringBuilder.append(char)>
	//   59   98:pop             
				stringbuilder.append(Integer.toHexString(((int) (c))));
	//   60   99:aload           7
	//   61  101:iload_1         
	//   62  102:invokestatic    #482 <Method String Integer.toHexString(int)>
	//   63  105:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
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
	//   72  119:invokevirtual   #476 <Method StringBuilder StringBuilder.append(char)>
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
	//   86  142:invokevirtual   #485 <Method StringBuilder StringBuilder.append(CharSequence, int, int)>
	//   87  145:pop             
		return stringbuilder.toString();
	//   88  146:aload           7
	//   89  148:invokevirtual   #67  <Method String StringBuilder.toString()>
	//   90  151:areturn         
	}

	public static transient String formatInvariant(String s, Object aobj[])
	{
		return String.format(Locale.US, s, aobj);
	//    0    0:getstatic       #493 <Field Locale Locale.US>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokestatic    #497 <Method String String.format(Locale, String, Object[])>
	//    4    8:areturn         
	}

	public static String fromUtf8Bytes(byte abyte0[])
	{
		return new String(abyte0, Charset.forName("UTF-8"));
	//    0    0:new             #33  <Class String>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc2            #501 <String "UTF-8">
	//    4    8:invokestatic    #507 <Method Charset Charset.forName(String)>
	//    5   11:invokespecial   #510 <Method void String(byte[], Charset)>
	//    6   14:areturn         
	}

	public static String fromUtf8Bytes(byte abyte0[], int i, int j)
	{
		return new String(abyte0, i, j, Charset.forName("UTF-8"));
	//    0    0:new             #33  <Class String>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:iload_2         
	//    5    7:ldc2            #501 <String "UTF-8">
	//    6   10:invokestatic    #507 <Method Charset Charset.forName(String)>
	//    7   13:invokespecial   #514 <Method void String(byte[], int, int, Charset)>
	//    8   16:areturn         
	}

	public static int getAudioContentTypeForStreamType(int i)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     0 8: default 52
	//	               0 56
	//	               1 54
	//	               2 54
	//	               3 52
	//	               4 54
	//	               5 54
	//	               6 52
	//	               7 52
	//	               8 54
		case 3: // '\003'
		case 6: // '\006'
		case 7: // '\007'
		default:
			return 2;
	//    2   52:iconst_2        
	//    3   53:ireturn         

		case 1: // '\001'
		case 2: // '\002'
		case 4: // '\004'
		case 5: // '\005'
		case 8: // '\b'
			return 4;
	//    4   54:iconst_4        
	//    5   55:ireturn         

		case 0: // '\0'
			return 1;
	//    6   56:iconst_1        
	//    7   57:ireturn         
		}
	}

	public static int getAudioUsageForStreamType(int i)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     0 8: default 52
	//	               0 66
	//	               1 63
	//	               2 60
	//	               3 52
	//	               4 58
	//	               5 56
	//	               6 52
	//	               7 52
	//	               8 54
		case 3: // '\003'
		case 6: // '\006'
		case 7: // '\007'
		default:
			return 1;
	//    2   52:iconst_1        
	//    3   53:ireturn         

		case 8: // '\b'
			return 3;
	//    4   54:iconst_3        
	//    5   55:ireturn         

		case 5: // '\005'
			return 5;
	//    6   56:iconst_5        
	//    7   57:ireturn         

		case 4: // '\004'
			return 4;
	//    8   58:iconst_4        
	//    9   59:ireturn         

		case 2: // '\002'
			return 6;
	//   10   60:bipush          6
	//   11   62:ireturn         

		case 1: // '\001'
			return 13;
	//   12   63:bipush          13
	//   13   65:ireturn         

		case 0: // '\0'
			return 2;
	//   14   66:iconst_2        
	//   15   67:ireturn         
		}
	}

	public static byte[] getBytesFromHexString(String s)
	{
		byte abyte0[] = new byte[s.length() / 2];
	//    0    0:aload_0         
	//    1    1:invokevirtual   #466 <Method int String.length()>
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
	//   20   25:invokevirtual   #37  <Method char String.charAt(int)>
	//   21   28:bipush          16
	//   22   30:invokestatic    #525 <Method int Character.digit(char, int)>
	//   23   33:iconst_4        
	//   24   34:ishl            
	//   25   35:aload_0         
	//   26   36:iload_2         
	//   27   37:iconst_1        
	//   28   38:iadd            
	//   29   39:invokevirtual   #37  <Method char String.charAt(int)>
	//   30   42:bipush          16
	//   31   44:invokestatic    #525 <Method int Character.digit(char, int)>
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

	public static String getCodecsOfType(String s, int i)
	{
		boolean flag = TextUtils.isEmpty(((CharSequence) (s)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #533 <Method boolean TextUtils.isEmpty(CharSequence)>
	//    2    4:istore          4
		Object obj = null;
	//    3    6:aconst_null     
	//    4    7:astore          5
		if(flag)
	//*   5    9:iload           4
	//*   6   11:ifeq            16
			return null;
	//    7   14:aconst_null     
	//    8   15:areturn         
		s = ((String) (split(s.trim(), "(\\s*,\\s*)")));
	//    9   16:aload_0         
	//   10   17:invokevirtual   #536 <Method String String.trim()>
	//   11   20:ldc2            #538 <String "(\\s*,\\s*)">
	//   12   23:invokestatic    #542 <Method String[] split(String, String)>
	//   13   26:astore_0        
		StringBuilder stringbuilder = new StringBuilder();
	//   14   27:new             #51  <Class StringBuilder>
	//   15   30:dup             
	//   16   31:invokespecial   #54  <Method void StringBuilder()>
	//   17   34:astore          6
		int k = s.length;
	//   18   36:aload_0         
	//   19   37:arraylength     
	//   20   38:istore_3        
		for(int j = 0; j < k; j++)
	//*  21   39:iconst_0        
	//*  22   40:istore_2        
	//*  23   41:iload_2         
	//*  24   42:iload_3         
	//*  25   43:icmpge          92
		{
			String s1 = ((String) (s[j]));
	//   26   46:aload_0         
	//   27   47:iload_2         
	//   28   48:aaload          
	//   29   49:astore          7
			if(i != MimeTypes.getTrackTypeOfCodec(s1))
				continue;
	//   30   51:iload_1         
	//   31   52:aload           7
	//   32   54:invokestatic    #548 <Method int MimeTypes.getTrackTypeOfCodec(String)>
	//   33   57:icmpne          85
			if(stringbuilder.length() > 0)
	//*  34   60:aload           6
	//*  35   62:invokevirtual   #549 <Method int StringBuilder.length()>
	//*  36   65:ifle            77
				stringbuilder.append(",");
	//   37   68:aload           6
	//   38   70:ldc2            #551 <String ",">
	//   39   73:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   40   76:pop             
			stringbuilder.append(s1);
	//   41   77:aload           6
	//   42   79:aload           7
	//   43   81:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   44   84:pop             
		}

	//   45   85:iload_2         
	//   46   86:iconst_1        
	//   47   87:iadd            
	//   48   88:istore_2        
	//*  49   89:goto            41
		s = ((String) (obj));
	//   50   92:aload           5
	//   51   94:astore_0        
		if(stringbuilder.length() > 0)
	//*  52   95:aload           6
	//*  53   97:invokevirtual   #549 <Method int StringBuilder.length()>
	//*  54  100:ifle            109
			s = stringbuilder.toString();
	//   55  103:aload           6
	//   56  105:invokevirtual   #67  <Method String StringBuilder.toString()>
	//   57  108:astore_0        
		return s;
	//   58  109:aload_0         
	//   59  110:areturn         
	}

	public static String getCommaDelimitedSimpleClassNames(Object aobj[])
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #51  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #54  <Method void StringBuilder()>
	//    3    7:astore_2        
		for(int i = 0; i < aobj.length; i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:aload_0         
	//*   8   12:arraylength     
	//*   9   13:icmpge          52
		{
			stringbuilder.append(aobj[i].getClass().getSimpleName());
	//   10   16:aload_2         
	//   11   17:aload_0         
	//   12   18:iload_1         
	//   13   19:aaload          
	//   14   20:invokevirtual   #557 <Method Class Object.getClass()>
	//   15   23:invokevirtual   #562 <Method String Class.getSimpleName()>
	//   16   26:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   17   29:pop             
			if(i < aobj.length - 1)
	//*  18   30:iload_1         
	//*  19   31:aload_0         
	//*  20   32:arraylength     
	//*  21   33:iconst_1        
	//*  22   34:isub            
	//*  23   35:icmpge          45
				stringbuilder.append(", ");
	//   24   38:aload_2         
	//   25   39:ldc1            #60  <String ", ">
	//   26   41:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   27   44:pop             
		}

	//   28   45:iload_1         
	//   29   46:iconst_1        
	//   30   47:iadd            
	//   31   48:istore_1        
	//*  32   49:goto            10
		return stringbuilder.toString();
	//   33   52:aload_2         
	//   34   53:invokevirtual   #67  <Method String StringBuilder.toString()>
	//   35   56:areturn         
	}

	public static int getDefaultBufferSize(int i)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     0 4: default 36
	//	               0 60
	//	               1 56
	//	               2 52
	//	               3 48
	//	               4 44
		default:
			throw new IllegalStateException();
	//    2   36:new             #565 <Class IllegalStateException>
	//    3   39:dup             
	//    4   40:invokespecial   #566 <Method void IllegalStateException()>
	//    5   43:athrow          

		case 4: // '\004'
			return 0x20000;
	//    6   44:ldc2            #567 <Int 0x20000>
	//    7   47:ireturn         

		case 3: // '\003'
			return 0x20000;
	//    8   48:ldc2            #567 <Int 0x20000>
	//    9   51:ireturn         

		case 2: // '\002'
			return 0xc80000;
	//   10   52:ldc2            #568 <Int 0xc80000>
	//   11   55:ireturn         

		case 1: // '\001'
			return 0x360000;
	//   12   56:ldc2            #569 <Int 0x360000>
	//   13   59:ireturn         

		case 0: // '\0'
			return 0x1000000;
	//   14   60:ldc2            #570 <Int 0x1000000>
	//   15   63:ireturn         
		}
	}

	private static void getDisplaySizeV16(Display display, Point point)
	{
		display.getSize(point);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #581 <Method void Display.getSize(Point)>
	//    3    5:return          
	}

	private static void getDisplaySizeV17(Display display, Point point)
	{
		display.getRealSize(point);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #587 <Method void Display.getRealSize(Point)>
	//    3    5:return          
	}

	private static void getDisplaySizeV23(Display display, Point point)
	{
		display = ((Display) (display.getMode()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #593 <Method android.view.Display$Mode Display.getMode()>
	//    2    4:astore_0        
		point.x = ((android.view.Display.Mode) (display)).getPhysicalWidth();
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:invokevirtual   #598 <Method int android.view.Display$Mode.getPhysicalWidth()>
	//    6   10:putfield        #603 <Field int Point.x>
		point.y = ((android.view.Display.Mode) (display)).getPhysicalHeight();
	//    7   13:aload_1         
	//    8   14:aload_0         
	//    9   15:invokevirtual   #606 <Method int android.view.Display$Mode.getPhysicalHeight()>
	//   10   18:putfield        #609 <Field int Point.y>
	//   11   21:return          
	}

	private static void getDisplaySizeV9(Display display, Point point)
	{
		point.x = display.getWidth();
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #613 <Method int Display.getWidth()>
	//    3    5:putfield        #603 <Field int Point.x>
		point.y = display.getHeight();
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #616 <Method int Display.getHeight()>
	//    7   13:putfield        #609 <Field int Point.y>
	//    8   16:return          
	}

	public static UUID getDrmUuid(String s)
	{
		int i;
label0:
		{
			String s1 = toLowerInvariant(s);
	//    0    0:aload_0         
	//    1    1:invokestatic    #623 <Method String toLowerInvariant(String)>
	//    2    4:astore_2        
			i = s1.hashCode();
	//    3    5:aload_2         
	//    4    6:invokevirtual   #626 <Method int String.hashCode()>
	//    5    9:istore_1        
			if(i != 0x911c2eef)
	//*   6   10:iload_1         
	//*   7   11:ldc2            #627 <Int 0x911c2eef>
	//*   8   14:icmpeq          64
			{
				if(i != 0xac8548fd)
	//*   9   17:iload_1         
	//*  10   18:ldc2            #628 <Int 0xac8548fd>
	//*  11   21:icmpeq          49
				{
					if(i == 0x2f1b28f2 && s1.equals("clearkey"))
	//*  12   24:iload_1         
	//*  13   25:ldc2            #629 <Int 0x2f1b28f2>
	//*  14   28:icmpeq          34
	//*  15   31:goto            79
	//*  16   34:aload_2         
	//*  17   35:ldc2            #631 <String "clearkey">
	//*  18   38:invokevirtual   #632 <Method boolean String.equals(Object)>
	//*  19   41:ifeq            79
					{
						i = 2;
	//   20   44:iconst_2        
	//   21   45:istore_1        
						break label0;
	//   22   46:goto            81
					}
				} else
				if(s1.equals("widevine"))
	//*  23   49:aload_2         
	//*  24   50:ldc2            #634 <String "widevine">
	//*  25   53:invokevirtual   #632 <Method boolean String.equals(Object)>
	//*  26   56:ifeq            79
				{
					i = 0;
	//   27   59:iconst_0        
	//   28   60:istore_1        
					break label0;
	//   29   61:goto            81
				}
			} else
			if(s1.equals("playready"))
	//*  30   64:aload_2         
	//*  31   65:ldc2            #636 <String "playready">
	//*  32   68:invokevirtual   #632 <Method boolean String.equals(Object)>
	//*  33   71:ifeq            79
			{
				i = 1;
	//   34   74:iconst_1        
	//   35   75:istore_1        
				break label0;
	//   36   76:goto            81
			}
			i = -1;
	//   37   79:iconst_m1       
	//   38   80:istore_1        
		}
		switch(i)
	//*  39   81:iload_1         
		{
	//*  40   82:tableswitch     0 2: default 108
	//	               0 123
	//	               1 119
	//	               2 115
		default:
			try
			{
				s = ((String) (UUID.fromString(s)));
	//   41  108:aload_0         
	//   42  109:invokestatic    #641 <Method UUID UUID.fromString(String)>
	//   43  112:astore_0        
			}
	//*  44  113:aload_0         
	//*  45  114:areturn         
	//*  46  115:getstatic       #647 <Field UUID C.CLEARKEY_UUID>
	//*  47  118:areturn         
	//*  48  119:getstatic       #650 <Field UUID C.PLAYREADY_UUID>
	//*  49  122:areturn         
	//*  50  123:getstatic       #653 <Field UUID C.WIDEVINE_UUID>
	//*  51  126:areturn         
	//*  52  127:aconst_null     
	//*  53  128:areturn         
			// Misplaced declaration of an exception variable
			catch(String s)
			{
				return null;
			}
			return ((UUID) (s));

		case 2: // '\002'
			return C.CLEARKEY_UUID;

		case 1: // '\001'
			return C.PLAYREADY_UUID;

		case 0: // '\0'
			return C.WIDEVINE_UUID;
		}
	//*  54  129:astore_0        
	//*  55  130:goto            127
	}

	public static int getIntegerCodeForString(String s)
	{
		int k = s.length();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #466 <Method int String.length()>
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
	//   14   23:invokestatic    #660 <Method void Assertions.checkArgument(boolean)>
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
	//   25   39:invokevirtual   #37  <Method char String.charAt(int)>
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

	public static long getMediaDurationForPlayoutDuration(long l, float f)
	{
		if(f == 1.0F)
	//*   0    0:fload_2         
	//*   1    1:fconst_1        
	//*   2    2:fcmpl           
	//*   3    3:ifne            8
			return l;
	//    4    6:lload_0         
	//    5    7:lreturn         
		else
			return Math.round((double)l * (double)f);
	//    6    8:lload_0         
	//    7    9:l2d             
	//    8   10:fload_2         
	//    9   11:f2d             
	//   10   12:dmul            
	//   11   13:invokestatic    #666 <Method long Math.round(double)>
	//   12   16:lreturn         
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
	//   14   26:ldc2            #668 <Int 0x40000000>
	//   15   29:ireturn         
				else
					return 0x80000000;
	//   16   30:ldc2            #669 <Int 0x80000000>
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

	public static int getPcmFrameSize(int i, int j)
	{
		if(i != 0x80000000)
	//*   0    0:iload_0         
	//*   1    1:ldc2            #669 <Int 0x80000000>
	//*   2    4:icmpeq          58
		{
			if(i != 0x40000000)
	//*   3    7:iload_0         
	//*   4    8:ldc2            #668 <Int 0x40000000>
	//*   5   11:icmpeq          54
				switch(i)
	//*   6   14:iload_0         
				{
	//*   7   15:tableswitch     2 4: default 40
	//	               2 50
	//	               3 48
	//	               4 54
				default:
					throw new IllegalArgumentException();
	//    8   40:new             #672 <Class IllegalArgumentException>
	//    9   43:dup             
	//   10   44:invokespecial   #673 <Method void IllegalArgumentException()>
	//   11   47:athrow          

				case 3: // '\003'
					return j;
	//   12   48:iload_1         
	//   13   49:ireturn         

				case 2: // '\002'
					return j * 2;
	//   14   50:iload_1         
	//   15   51:iconst_2        
	//   16   52:imul            
	//   17   53:ireturn         

				case 4: // '\004'
					break;
				}
			return j * 4;
	//   18   54:iload_1         
	//   19   55:iconst_4        
	//   20   56:imul            
	//   21   57:ireturn         
		} else
		{
			return j * 3;
	//   22   58:iload_1         
	//   23   59:iconst_3        
	//   24   60:imul            
	//   25   61:ireturn         
		}
	}

	public static Point getPhysicalDisplaySize(Context context)
	{
		return getPhysicalDisplaySize(context, ((WindowManager)context.getSystemService("window")).getDefaultDisplay());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:ldc2            #677 <String "window">
	//    3    5:invokevirtual   #681 <Method Object Context.getSystemService(String)>
	//    4    8:checkcast       #683 <Class WindowManager>
	//    5   11:invokeinterface #687 <Method Display WindowManager.getDefaultDisplay()>
	//    6   16:invokestatic    #690 <Method Point getPhysicalDisplaySize(Context, Display)>
	//    7   19:areturn         
	}

	public static Point getPhysicalDisplaySize(Context context, Display display)
	{
		if(SDK_INT >= 25 || display.getDisplayId() != 0) goto _L2; else goto _L1
	//    0    0:getstatic       #38  <Field int SDK_INT>
	//    1    3:bipush          25
	//    2    5:icmpge          307
	//    3    8:aload_1         
	//    4    9:invokevirtual   #697 <Method int Display.getDisplayId()>
	//    5   12:ifne            307
_L1:
		if("Sony".equals(((Object) (MANUFACTURER))) && MODEL.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd"))
	//*   6   15:ldc2            #699 <String "Sony">
	//*   7   18:getstatic       #46  <Field String MANUFACTURER>
	//*   8   21:invokevirtual   #632 <Method boolean String.equals(Object)>
	//*   9   24:ifeq            66
	//*  10   27:getstatic       #49  <Field String MODEL>
	//*  11   30:ldc2            #701 <String "BRAVIA">
	//*  12   33:invokevirtual   #705 <Method boolean String.startsWith(String)>
	//*  13   36:ifeq            66
	//*  14   39:aload_0         
	//*  15   40:invokevirtual   #709 <Method PackageManager Context.getPackageManager()>
	//*  16   43:ldc2            #711 <String "com.sony.dtv.hardware.panel.qfhd">
	//*  17   46:invokevirtual   #716 <Method boolean PackageManager.hasSystemFeature(String)>
	//*  18   49:ifeq            66
			return new Point(3840, 2160);
	//   19   52:new             #600 <Class Point>
	//   20   55:dup             
	//   21   56:sipush          3840
	//   22   59:sipush          2160
	//   23   62:invokespecial   #719 <Method void Point(int, int)>
	//   24   65:areturn         
		if((!"NVIDIA".equals(((Object) (MANUFACTURER))) || !MODEL.contains("SHIELD")) && (!"philips".equals(((Object) (toLowerInvariant(MANUFACTURER)))) || !MODEL.startsWith("QM1") && !MODEL.equals("QV151E") && !MODEL.equals("TPM171E"))) goto _L2; else goto _L3
	//   25   66:ldc2            #721 <String "NVIDIA">
	//   26   69:getstatic       #46  <Field String MANUFACTURER>
	//   27   72:invokevirtual   #632 <Method boolean String.equals(Object)>
	//   28   75:ifeq            90
	//   29   78:getstatic       #49  <Field String MODEL>
	//   30   81:ldc2            #723 <String "SHIELD">
	//   31   84:invokevirtual   #725 <Method boolean String.contains(CharSequence)>
	//   32   87:ifne            141
	//   33   90:ldc2            #727 <String "philips">
	//   34   93:getstatic       #46  <Field String MANUFACTURER>
	//   35   96:invokestatic    #623 <Method String toLowerInvariant(String)>
	//   36   99:invokevirtual   #632 <Method boolean String.equals(Object)>
	//   37  102:ifeq            307
	//   38  105:getstatic       #49  <Field String MODEL>
	//   39  108:ldc2            #729 <String "QM1">
	//   40  111:invokevirtual   #705 <Method boolean String.startsWith(String)>
	//   41  114:ifne            141
	//   42  117:getstatic       #49  <Field String MODEL>
	//   43  120:ldc2            #731 <String "QV151E">
	//   44  123:invokevirtual   #632 <Method boolean String.equals(Object)>
	//   45  126:ifne            141
	//   46  129:getstatic       #49  <Field String MODEL>
	//   47  132:ldc2            #733 <String "TPM171E">
	//   48  135:invokevirtual   #632 <Method boolean String.equals(Object)>
	//   49  138:ifeq            307
_L3:
		context = null;
	//   50  141:aconst_null     
	//   51  142:astore_0        
		Object obj;
		obj = ((Object) (Class.forName("android.os.SystemProperties")));
	//   52  143:ldc2            #735 <String "android.os.SystemProperties">
	//   53  146:invokestatic    #738 <Method Class Class.forName(String)>
	//   54  149:astore          4
		obj = ((Object) ((String)((Class) (obj)).getMethod("get", new Class[] {
			java/lang/String
		}).invoke(obj, new Object[] {
			"sys.display-size"
		})));
	//   55  151:aload           4
	//   56  153:ldc2            #739 <String "get">
	//   57  156:iconst_1        
	//   58  157:anewarray       Class[]
	//   59  160:dup             
	//   60  161:iconst_0        
	//   61  162:ldc1            #33  <Class String>
	//   62  164:aastore         
	//   63  165:invokevirtual   #743 <Method Method Class.getMethod(String, Class[])>
	//   64  168:aload           4
	//   65  170:iconst_1        
	//   66  171:anewarray       Object[]
	//   67  174:dup             
	//   68  175:iconst_0        
	//   69  176:ldc2            #745 <String "sys.display-size">
	//   70  179:aastore         
	//   71  180:invokevirtual   #751 <Method Object Method.invoke(Object, Object[])>
	//   72  183:checkcast       #33  <Class String>
	//   73  186:astore          4
		context = ((Context) (obj));
	//   74  188:aload           4
	//   75  190:astore_0        
		break MISSING_BLOCK_LABEL_207;
	//   76  191:goto            207
		Object obj1;
		obj1;
	//   77  194:astore          4
		Log.e("Util", "Failed to read sys.display-size", ((Throwable) (obj1)));
	//   78  196:ldc1            #20  <String "Util">
	//   79  198:ldc2            #753 <String "Failed to read sys.display-size">
	//   80  201:aload           4
	//   81  203:invokestatic    #759 <Method int Log.e(String, String, Throwable)>
	//   82  206:pop             
		if(TextUtils.isEmpty(((CharSequence) (context)))) goto _L2; else goto _L4
	//   83  207:aload_0         
	//   84  208:invokestatic    #533 <Method boolean TextUtils.isEmpty(CharSequence)>
	//   85  211:ifne            307
_L4:
		int i;
		int j;
		String as[] = split(((String) (context)).trim(), "x");
	//   86  214:aload_0         
	//   87  215:invokevirtual   #536 <Method String String.trim()>
	//   88  218:ldc2            #760 <String "x">
	//   89  221:invokestatic    #542 <Method String[] split(String, String)>
	//   90  224:astore          4
		if(as.length != 2)
			break MISSING_BLOCK_LABEL_271;
	//   91  226:aload           4
	//   92  228:arraylength     
	//   93  229:iconst_2        
	//   94  230:icmpne          271
		i = Integer.parseInt(as[0]);
	//   95  233:aload           4
	//   96  235:iconst_0        
	//   97  236:aaload          
	//   98  237:invokestatic    #763 <Method int Integer.parseInt(String)>
	//   99  240:istore_2        
		j = Integer.parseInt(as[1]);
	//  100  241:aload           4
	//  101  243:iconst_1        
	//  102  244:aaload          
	//  103  245:invokestatic    #763 <Method int Integer.parseInt(String)>
	//  104  248:istore_3        
		if(i <= 0 || j <= 0)
			break MISSING_BLOCK_LABEL_271;
	//  105  249:iload_2         
	//  106  250:ifle            271
	//  107  253:iload_3         
	//  108  254:ifle            271
		as = ((String []) (new Point(i, j)));
	//  109  257:new             #600 <Class Point>
	//  110  260:dup             
	//  111  261:iload_2         
	//  112  262:iload_3         
	//  113  263:invokespecial   #719 <Method void Point(int, int)>
	//  114  266:astore          4
		return ((Point) (as));
	//  115  268:aload           4
	//  116  270:areturn         
_L6:
		StringBuilder stringbuilder = new StringBuilder();
	//  117  271:new             #51  <Class StringBuilder>
	//  118  274:dup             
	//  119  275:invokespecial   #54  <Method void StringBuilder()>
	//  120  278:astore          4
		stringbuilder.append("Invalid sys.display-size: ");
	//  121  280:aload           4
	//  122  282:ldc2            #765 <String "Invalid sys.display-size: ">
	//  123  285:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//  124  288:pop             
		stringbuilder.append(((String) (context)));
	//  125  289:aload           4
	//  126  291:aload_0         
	//  127  292:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//  128  295:pop             
		Log.e("Util", stringbuilder.toString());
	//  129  296:ldc1            #20  <String "Util">
	//  130  298:aload           4
	//  131  300:invokevirtual   #67  <Method String StringBuilder.toString()>
	//  132  303:invokestatic    #768 <Method int Log.e(String, String)>
	//  133  306:pop             
_L2:
		context = ((Context) (new Point()));
	//  134  307:new             #600 <Class Point>
	//  135  310:dup             
	//  136  311:invokespecial   #769 <Method void Point()>
	//  137  314:astore_0        
		if(SDK_INT >= 23)
	//* 138  315:getstatic       #38  <Field int SDK_INT>
	//* 139  318:bipush          23
	//* 140  320:icmplt          330
		{
			getDisplaySizeV23(display, ((Point) (context)));
	//  141  323:aload_1         
	//  142  324:aload_0         
	//  143  325:invokestatic    #771 <Method void getDisplaySizeV23(Display, Point)>
			return ((Point) (context));
	//  144  328:aload_0         
	//  145  329:areturn         
		}
		if(SDK_INT >= 17)
	//* 146  330:getstatic       #38  <Field int SDK_INT>
	//* 147  333:bipush          17
	//* 148  335:icmplt          345
		{
			getDisplaySizeV17(display, ((Point) (context)));
	//  149  338:aload_1         
	//  150  339:aload_0         
	//  151  340:invokestatic    #773 <Method void getDisplaySizeV17(Display, Point)>
			return ((Point) (context));
	//  152  343:aload_0         
	//  153  344:areturn         
		}
		if(SDK_INT >= 16)
	//* 154  345:getstatic       #38  <Field int SDK_INT>
	//* 155  348:bipush          16
	//* 156  350:icmplt          360
		{
			getDisplaySizeV16(display, ((Point) (context)));
	//  157  353:aload_1         
	//  158  354:aload_0         
	//  159  355:invokestatic    #775 <Method void getDisplaySizeV16(Display, Point)>
			return ((Point) (context));
	//  160  358:aload_0         
	//  161  359:areturn         
		} else
		{
			getDisplaySizeV9(display, ((Point) (context)));
	//  162  360:aload_1         
	//  163  361:aload_0         
	//  164  362:invokestatic    #777 <Method void getDisplaySizeV9(Display, Point)>
			return ((Point) (context));
	//  165  365:aload_0         
	//  166  366:areturn         
		}
		stringbuilder;
	//  167  367:astore          4
		if(true) goto _L6; else goto _L5
	//  168  369:goto            271
_L5:
	}

	public static long getPlayoutDurationForMediaDuration(long l, float f)
	{
		if(f == 1.0F)
	//*   0    0:fload_2         
	//*   1    1:fconst_1        
	//*   2    2:fcmpl           
	//*   3    3:ifne            8
			return l;
	//    4    6:lload_0         
	//    5    7:lreturn         
		else
			return Math.round((double)l / (double)f);
	//    6    8:lload_0         
	//    7    9:l2d             
	//    8   10:fload_2         
	//    9   11:f2d             
	//   10   12:ddiv            
	//   11   13:invokestatic    #666 <Method long Math.round(double)>
	//   12   16:lreturn         
	}

	public static int getStreamTypeForAudioUsage(int i)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     1 14: default 72
	//	               1 87
	//	               2 85
	//	               3 82
	//	               4 80
	//	               5 78
	//	               6 76
	//	               7 78
	//	               8 78
	//	               9 78
	//	               10 78
	//	               11 72
	//	               12 87
	//	               13 74
	//	               14 87
		case 11: // '\013'
		default:
			return 3;
	//    2   72:iconst_3        
	//    3   73:ireturn         

		case 13: // '\r'
			return 1;
	//    4   74:iconst_1        
	//    5   75:ireturn         

		case 6: // '\006'
			return 2;
	//    6   76:iconst_2        
	//    7   77:ireturn         

		case 5: // '\005'
		case 7: // '\007'
		case 8: // '\b'
		case 9: // '\t'
		case 10: // '\n'
			return 5;
	//    8   78:iconst_5        
	//    9   79:ireturn         

		case 4: // '\004'
			return 4;
	//   10   80:iconst_4        
	//   11   81:ireturn         

		case 3: // '\003'
			return 8;
	//   12   82:bipush          8
	//   13   84:ireturn         

		case 2: // '\002'
			return 0;
	//   14   85:iconst_0        
	//   15   86:ireturn         

		case 1: // '\001'
		case 12: // '\f'
		case 14: // '\016'
			return 3;
	//   16   87:iconst_3        
	//   17   88:ireturn         
		}
	}

	public static String getStringForTime(StringBuilder stringbuilder, Formatter formatter, long l)
	{
		long l1 = l;
	//    0    0:lload_2         
	//    1    1:lstore          4
		if(l == 0x1L)
	//*   2    3:lload_2         
	//*   3    4:ldc2w           #782 <Long 0x1L>
	//*   4    7:lcmp            
	//*   5    8:ifne            14
			l1 = 0L;
	//    6   11:lconst_0        
	//    7   12:lstore          4
		long l2 = (l1 + 500L) / 1000L;
	//    8   14:lload           4
	//    9   16:ldc2w           #784 <Long 500L>
	//   10   19:ladd            
	//   11   20:ldc2w           #786 <Long 1000L>
	//   12   23:ldiv            
	//   13   24:lstore          6
		l = l2 % 60L;
	//   14   26:lload           6
	//   15   28:ldc2w           #788 <Long 60L>
	//   16   31:lrem            
	//   17   32:lstore_2        
		l1 = (l2 / 60L) % 60L;
	//   18   33:lload           6
	//   19   35:ldc2w           #788 <Long 60L>
	//   20   38:ldiv            
	//   21   39:ldc2w           #788 <Long 60L>
	//   22   42:lrem            
	//   23   43:lstore          4
		l2 /= 3600L;
	//   24   45:lload           6
	//   25   47:ldc2w           #790 <Long 3600L>
	//   26   50:ldiv            
	//   27   51:lstore          6
		stringbuilder.setLength(0);
	//   28   53:aload_0         
	//   29   54:iconst_0        
	//   30   55:invokevirtual   #794 <Method void StringBuilder.setLength(int)>
		if(l2 > 0L)
	//*  31   58:lload           6
	//*  32   60:lconst_0        
	//*  33   61:lcmp            
	//*  34   62:ifle            103
			return formatter.format("%d:%02d:%02d", new Object[] {
				Long.valueOf(l2), Long.valueOf(l1), Long.valueOf(l)
			}).toString();
	//   35   65:aload_1         
	//   36   66:ldc2            #796 <String "%d:%02d:%02d">
	//   37   69:iconst_3        
	//   38   70:anewarray       Object[]
	//   39   73:dup             
	//   40   74:iconst_0        
	//   41   75:lload           6
	//   42   77:invokestatic    #802 <Method Long Long.valueOf(long)>
	//   43   80:aastore         
	//   44   81:dup             
	//   45   82:iconst_1        
	//   46   83:lload           4
	//   47   85:invokestatic    #802 <Method Long Long.valueOf(long)>
	//   48   88:aastore         
	//   49   89:dup             
	//   50   90:iconst_2        
	//   51   91:lload_2         
	//   52   92:invokestatic    #802 <Method Long Long.valueOf(long)>
	//   53   95:aastore         
	//   54   96:invokevirtual   #807 <Method Formatter Formatter.format(String, Object[])>
	//   55   99:invokevirtual   #808 <Method String Formatter.toString()>
	//   56  102:areturn         
		else
			return formatter.format("%02d:%02d", new Object[] {
				Long.valueOf(l1), Long.valueOf(l)
			}).toString();
	//   57  103:aload_1         
	//   58  104:ldc2            #810 <String "%02d:%02d">
	//   59  107:iconst_2        
	//   60  108:anewarray       Object[]
	//   61  111:dup             
	//   62  112:iconst_0        
	//   63  113:lload           4
	//   64  115:invokestatic    #802 <Method Long Long.valueOf(long)>
	//   65  118:aastore         
	//   66  119:dup             
	//   67  120:iconst_1        
	//   68  121:lload_2         
	//   69  122:invokestatic    #802 <Method Long Long.valueOf(long)>
	//   70  125:aastore         
	//   71  126:invokevirtual   #807 <Method Formatter Formatter.format(String, Object[])>
	//   72  129:invokevirtual   #808 <Method String Formatter.toString()>
	//   73  132:areturn         
	}

	public static String getUserAgent(Context context, String s)
	{
		try
		{
			String s1 = context.getPackageName();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #817 <Method String Context.getPackageName()>
	//    2    4:astore_2        
			context = ((Context) (context.getPackageManager().getPackageInfo(s1, 0).versionName));
	//    3    5:aload_0         
	//    4    6:invokevirtual   #709 <Method PackageManager Context.getPackageManager()>
	//    5    9:aload_2         
	//    6   10:iconst_0        
	//    7   11:invokevirtual   #821 <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//    8   14:getfield        #826 <Field String PackageInfo.versionName>
	//    9   17:astore_0        
		}
	//*  10   18:goto            25
	//*  11   21:ldc2            #828 <String "?">
	//*  12   24:astore_0        
	//*  13   25:new             #51  <Class StringBuilder>
	//*  14   28:dup             
	//*  15   29:invokespecial   #54  <Method void StringBuilder()>
	//*  16   32:astore_2        
	//*  17   33:aload_2         
	//*  18   34:aload_1         
	//*  19   35:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//*  20   38:pop             
	//*  21   39:aload_2         
	//*  22   40:ldc2            #830 <String "/">
	//*  23   43:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//*  24   46:pop             
	//*  25   47:aload_2         
	//*  26   48:aload_0         
	//*  27   49:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//*  28   52:pop             
	//*  29   53:aload_2         
	//*  30   54:ldc2            #832 <String " (Linux;Android ">
	//*  31   57:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//*  32   60:pop             
	//*  33   61:aload_2         
	//*  34   62:getstatic       #835 <Field String android.os.Build$VERSION.RELEASE>
	//*  35   65:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//*  36   68:pop             
	//*  37   69:aload_2         
	//*  38   70:ldc2            #837 <String ") ">
	//*  39   73:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//*  40   76:pop             
	//*  41   77:aload_2         
	//*  42   78:ldc2            #839 <String "ExoPlayerLib/2.8.3">
	//*  43   81:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//*  44   84:pop             
	//*  45   85:aload_2         
	//*  46   86:invokevirtual   #67  <Method String StringBuilder.toString()>
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
		stringbuilder.append(") ");
		stringbuilder.append("ExoPlayerLib/2.8.3");
		return stringbuilder.toString();
	//*  48   90:astore_0        
	//*  49   91:goto            21
	}

	public static byte[] getUtf8Bytes(String s)
	{
		return s.getBytes(Charset.forName("UTF-8"));
	//    0    0:aload_0         
	//    1    1:ldc2            #501 <String "UTF-8">
	//    2    4:invokestatic    #507 <Method Charset Charset.forName(String)>
	//    3    7:invokevirtual   #844 <Method byte[] String.getBytes(Charset)>
	//    4   10:areturn         
	}

	public static int inferContentType(Uri uri)
	{
		uri = ((Uri) (uri.getPath()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #851 <Method String Uri.getPath()>
	//    2    4:astore_0        
		if(uri == null)
	//*   3    5:aload_0         
	//*   4    6:ifnonnull       11
			return 3;
	//    5    9:iconst_3        
	//    6   10:ireturn         
		else
			return inferContentType(((String) (uri)));
	//    7   11:aload_0         
	//    8   12:invokestatic    #853 <Method int inferContentType(String)>
	//    9   15:ireturn         
	}

	public static int inferContentType(Uri uri, String s)
	{
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #533 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            12
		{
			return inferContentType(uri);
	//    3    7:aload_0         
	//    4    8:invokestatic    #856 <Method int inferContentType(Uri)>
	//    5   11:ireturn         
		} else
		{
			uri = ((Uri) (new StringBuilder()));
	//    6   12:new             #51  <Class StringBuilder>
	//    7   15:dup             
	//    8   16:invokespecial   #54  <Method void StringBuilder()>
	//    9   19:astore_0        
			((StringBuilder) (uri)).append(".");
	//   10   20:aload_0         
	//   11   21:ldc2            #858 <String ".">
	//   12   24:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   13   27:pop             
			((StringBuilder) (uri)).append(s);
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   17   33:pop             
			return inferContentType(((StringBuilder) (uri)).toString());
	//   18   34:aload_0         
	//   19   35:invokevirtual   #67  <Method String StringBuilder.toString()>
	//   20   38:invokestatic    #853 <Method int inferContentType(String)>
	//   21   41:ireturn         
		}
	}

	public static int inferContentType(String s)
	{
		s = toLowerInvariant(s);
	//    0    0:aload_0         
	//    1    1:invokestatic    #623 <Method String toLowerInvariant(String)>
	//    2    4:astore_0        
		if(s.endsWith(".mpd"))
	//*   3    5:aload_0         
	//*   4    6:ldc2            #860 <String ".mpd">
	//*   5    9:invokevirtual   #863 <Method boolean String.endsWith(String)>
	//*   6   12:ifeq            17
			return 0;
	//    7   15:iconst_0        
	//    8   16:ireturn         
		if(s.endsWith(".m3u8"))
	//*   9   17:aload_0         
	//*  10   18:ldc2            #865 <String ".m3u8">
	//*  11   21:invokevirtual   #863 <Method boolean String.endsWith(String)>
	//*  12   24:ifeq            29
			return 2;
	//   13   27:iconst_2        
	//   14   28:ireturn         
		return !s.matches(".*\\.ism(l)?(/manifest(\\(.+\\))?)?") ? 3 : 1;
	//   15   29:aload_0         
	//   16   30:ldc2            #867 <String ".*\\.ism(l)?(/manifest(\\(.+\\))?)?">
	//   17   33:invokevirtual   #870 <Method boolean String.matches(String)>
	//   18   36:ifeq            41
	//   19   39:iconst_1        
	//   20   40:ireturn         
	//   21   41:iconst_3        
	//   22   42:ireturn         
	}

	public static boolean isEncodingHighResolutionIntegerPcm(int i)
	{
		return i == 0x80000000 || i == 0x40000000;
	//    0    0:iload_0         
	//    1    1:ldc2            #669 <Int 0x80000000>
	//    2    4:icmpeq          19
	//    3    7:iload_0         
	//    4    8:ldc2            #668 <Int 0x40000000>
	//    5   11:icmpne          17
	//    6   14:goto            19
	//    7   17:iconst_0        
	//    8   18:ireturn         
	//    9   19:iconst_1        
	//   10   20:ireturn         
	}

	public static boolean isEncodingPcm(int i)
	{
		return i == 3 || i == 2 || i == 0x80000000 || i == 0x40000000 || i == 4;
	//    0    0:iload_0         
	//    1    1:iconst_3        
	//    2    2:icmpeq          34
	//    3    5:iload_0         
	//    4    6:iconst_2        
	//    5    7:icmpeq          34
	//    6   10:iload_0         
	//    7   11:ldc2            #669 <Int 0x80000000>
	//    8   14:icmpeq          34
	//    9   17:iload_0         
	//   10   18:ldc2            #668 <Int 0x40000000>
	//   11   21:icmpeq          34
	//   12   24:iload_0         
	//   13   25:iconst_4        
	//   14   26:icmpne          32
	//   15   29:goto            34
	//   16   32:iconst_0        
	//   17   33:ireturn         
	//   18   34:iconst_1        
	//   19   35:ireturn         
	}

	public static boolean isLinebreak(int i)
	{
		return i == 10 || i == 13;
	//    0    0:iload_0         
	//    1    1:bipush          10
	//    2    3:icmpeq          17
	//    3    6:iload_0         
	//    4    7:bipush          13
	//    5    9:icmpne          15
	//    6   12:goto            17
	//    7   15:iconst_0        
	//    8   16:ireturn         
	//    9   17:iconst_1        
	//   10   18:ireturn         
	}

	public static boolean isLocalFileUri(Uri uri)
	{
		uri = ((Uri) (uri.getScheme()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #879 <Method String Uri.getScheme()>
	//    2    4:astore_0        
		return TextUtils.isEmpty(((CharSequence) (uri))) || "file".equals(((Object) (uri)));
	//    3    5:aload_0         
	//    4    6:invokestatic    #533 <Method boolean TextUtils.isEmpty(CharSequence)>
	//    5    9:ifne            27
	//    6   12:ldc2            #881 <String "file">
	//    7   15:aload_0         
	//    8   16:invokevirtual   #632 <Method boolean String.equals(Object)>
	//    9   19:ifeq            25
	//   10   22:goto            27
	//   11   25:iconst_0        
	//   12   26:ireturn         
	//   13   27:iconst_1        
	//   14   28:ireturn         
	}

	public static transient boolean maybeRequestReadExternalStoragePermission(Activity activity, Uri auri[])
	{
		if(SDK_INT < 23)
	//*   0    0:getstatic       #38  <Field int SDK_INT>
	//*   1    3:bipush          23
	//*   2    5:icmpge          10
			return false;
	//    3    8:iconst_0        
	//    4    9:ireturn         
		int j = auri.length;
	//    5   10:aload_1         
	//    6   11:arraylength     
	//    7   12:istore_3        
		int i = 0;
	//    8   13:iconst_0        
	//    9   14:istore_2        
		do
		{
			if(i >= j)
				break;
	//   10   15:iload_2         
	//   11   16:iload_3         
	//   12   17:icmpge          63
			if(isLocalFileUri(auri[i]))
	//*  13   20:aload_1         
	//*  14   21:iload_2         
	//*  15   22:aaload          
	//*  16   23:invokestatic    #885 <Method boolean isLocalFileUri(Uri)>
	//*  17   26:ifeq            56
			{
				if(activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0)
	//*  18   29:aload_0         
	//*  19   30:ldc2            #887 <String "android.permission.READ_EXTERNAL_STORAGE">
	//*  20   33:invokevirtual   #892 <Method int Activity.checkSelfPermission(String)>
	//*  21   36:ifeq            63
				{
					activity.requestPermissions(new String[] {
						"android.permission.READ_EXTERNAL_STORAGE"
					}, 0);
	//   22   39:aload_0         
	//   23   40:iconst_1        
	//   24   41:anewarray       String[]
	//   25   44:dup             
	//   26   45:iconst_0        
	//   27   46:ldc2            #887 <String "android.permission.READ_EXTERNAL_STORAGE">
	//   28   49:aastore         
	//   29   50:iconst_0        
	//   30   51:invokevirtual   #896 <Method void Activity.requestPermissions(String[], int)>
					return true;
	//   31   54:iconst_1        
	//   32   55:ireturn         
				}
				break;
			}
			i++;
	//   33   56:iload_2         
	//   34   57:iconst_1        
	//   35   58:iadd            
	//   36   59:istore_2        
		} while(true);
	//   37   60:goto            15
		return false;
	//   38   63:iconst_0        
	//   39   64:ireturn         
	}

	public static ExecutorService newSingleThreadExecutor(String s)
	{
		return Executors.newSingleThreadExecutor(new ThreadFactory(s) {

			public Thread newThread(Runnable runnable)
			{
				return new Thread(runnable, threadName);
			//    0    0:new             #26  <Class Thread>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aload_0         
			//    4    6:getfield        #17  <Field String val$threadName>
			//    5    9:invokespecial   #29  <Method void Thread(Runnable, String)>
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
	//    3    5:invokespecial   #901 <Method void Util$1(String)>
	//    4    8:invokestatic    #906 <Method ExecutorService Executors.newSingleThreadExecutor(ThreadFactory)>
	//    5   11:areturn         
	}

	public static String normalizeLanguageCode(String s)
	{
		MissingResourceException missingresourceexception;
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		String s1;
		try
		{
			s1 = (new Locale(s)).getISO3Language();
	//    4    6:new             #489 <Class Locale>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:invokespecial   #910 <Method void Locale(String)>
	//    8   14:invokevirtual   #913 <Method String Locale.getISO3Language()>
	//    9   17:astore_1        
		}
	//*  10   18:aload_1         
	//*  11   19:areturn         
	//*  12   20:aload_0         
	//*  13   21:invokestatic    #623 <Method String toLowerInvariant(String)>
	//*  14   24:areturn         
		// Misplaced declaration of an exception variable
		catch(MissingResourceException missingresourceexception)
		{
			return toLowerInvariant(s);
		}
		return s1;
	//*  15   25:astore_1        
	//*  16   26:goto            20
	}

	public static Object[] nullSafeArrayCopy(Object aobj[], int i)
	{
		boolean flag;
		if(i <= aobj.length)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:arraylength     
	//*   3    3:icmpgt          11
			flag = true;
	//    4    6:iconst_1        
	//    5    7:istore_2        
		else
	//*   6    8:goto            13
			flag = false;
	//    7   11:iconst_0        
	//    8   12:istore_2        
		Assertions.checkArgument(flag);
	//    9   13:iload_2         
	//   10   14:invokestatic    #660 <Method void Assertions.checkArgument(boolean)>
		return Arrays.copyOf(aobj, i);
	//   11   17:aload_0         
	//   12   18:iload_1         
	//   13   19:invokestatic    #918 <Method Object[] Arrays.copyOf(Object[], int)>
	//   14   22:areturn         
	}

	public static long parseXsDateTime(String s)
		throws ParserException
	{
		Object obj = ((Object) (XS_DATE_TIME_PATTERN.matcher(((CharSequence) (s)))));
	//    0    0:getstatic       #79  <Field Pattern XS_DATE_TIME_PATTERN>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #927 <Method Matcher Pattern.matcher(CharSequence)>
	//    3    7:astore          7
		if(!((Matcher) (obj)).matches())
	//*   4    9:aload           7
	//*   5   11:invokevirtual   #931 <Method boolean Matcher.matches()>
	//*   6   14:ifne            55
		{
			obj = ((Object) (new StringBuilder()));
	//    7   17:new             #51  <Class StringBuilder>
	//    8   20:dup             
	//    9   21:invokespecial   #54  <Method void StringBuilder()>
	//   10   24:astore          7
			((StringBuilder) (obj)).append("Invalid date/time format: ");
	//   11   26:aload           7
	//   12   28:ldc2            #933 <String "Invalid date/time format: ">
	//   13   31:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   14   34:pop             
			((StringBuilder) (obj)).append(s);
	//   15   35:aload           7
	//   16   37:aload_0         
	//   17   38:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   18   41:pop             
			throw new ParserException(((StringBuilder) (obj)).toString());
	//   19   42:new             #923 <Class ParserException>
	//   20   45:dup             
	//   21   46:aload           7
	//   22   48:invokevirtual   #67  <Method String StringBuilder.toString()>
	//   23   51:invokespecial   #934 <Method void ParserException(String)>
	//   24   54:athrow          
		}
		s = ((Matcher) (obj)).group(9);
	//   25   55:aload           7
	//   26   57:bipush          9
	//   27   59:invokevirtual   #937 <Method String Matcher.group(int)>
	//   28   62:astore_0        
		int i = 0;
	//   29   63:iconst_0        
	//   30   64:istore_1        
		if(s != null && !((Matcher) (obj)).group(9).equalsIgnoreCase("Z"))
	//*  31   65:aload_0         
	//*  32   66:ifnonnull       72
	//*  33   69:goto            138
	//*  34   72:aload           7
	//*  35   74:bipush          9
	//*  36   76:invokevirtual   #937 <Method String Matcher.group(int)>
	//*  37   79:ldc2            #939 <String "Z">
	//*  38   82:invokevirtual   #942 <Method boolean String.equalsIgnoreCase(String)>
	//*  39   85:ifeq            91
	//*  40   88:goto            138
		{
			int j = Integer.parseInt(((Matcher) (obj)).group(12)) * 60 + Integer.parseInt(((Matcher) (obj)).group(13));
	//   41   91:aload           7
	//   42   93:bipush          12
	//   43   95:invokevirtual   #937 <Method String Matcher.group(int)>
	//   44   98:invokestatic    #763 <Method int Integer.parseInt(String)>
	//   45  101:bipush          60
	//   46  103:imul            
	//   47  104:aload           7
	//   48  106:bipush          13
	//   49  108:invokevirtual   #937 <Method String Matcher.group(int)>
	//   50  111:invokestatic    #763 <Method int Integer.parseInt(String)>
	//   51  114:iadd            
	//   52  115:istore_2        
			i = j;
	//   53  116:iload_2         
	//   54  117:istore_1        
			if("-".equals(((Object) (((Matcher) (obj)).group(11)))))
	//*  55  118:ldc2            #944 <String "-">
	//*  56  121:aload           7
	//*  57  123:bipush          11
	//*  58  125:invokevirtual   #937 <Method String Matcher.group(int)>
	//*  59  128:invokevirtual   #632 <Method boolean String.equals(Object)>
	//*  60  131:ifeq            138
				i = j * -1;
	//   61  134:iload_2         
	//   62  135:iconst_m1       
	//   63  136:imul            
	//   64  137:istore_1        
		}
		s = ((String) (new GregorianCalendar(TimeZone.getTimeZone("GMT"))));
	//   65  138:new             #946 <Class GregorianCalendar>
	//   66  141:dup             
	//   67  142:ldc2            #948 <String "GMT">
	//   68  145:invokestatic    #954 <Method TimeZone TimeZone.getTimeZone(String)>
	//   69  148:invokespecial   #957 <Method void GregorianCalendar(TimeZone)>
	//   70  151:astore_0        
		((Calendar) (s)).clear();
	//   71  152:aload_0         
	//   72  153:invokevirtual   #962 <Method void Calendar.clear()>
		((Calendar) (s)).set(Integer.parseInt(((Matcher) (obj)).group(1)), Integer.parseInt(((Matcher) (obj)).group(2)) - 1, Integer.parseInt(((Matcher) (obj)).group(3)), Integer.parseInt(((Matcher) (obj)).group(4)), Integer.parseInt(((Matcher) (obj)).group(5)), Integer.parseInt(((Matcher) (obj)).group(6)));
	//   73  156:aload_0         
	//   74  157:aload           7
	//   75  159:iconst_1        
	//   76  160:invokevirtual   #937 <Method String Matcher.group(int)>
	//   77  163:invokestatic    #763 <Method int Integer.parseInt(String)>
	//   78  166:aload           7
	//   79  168:iconst_2        
	//   80  169:invokevirtual   #937 <Method String Matcher.group(int)>
	//   81  172:invokestatic    #763 <Method int Integer.parseInt(String)>
	//   82  175:iconst_1        
	//   83  176:isub            
	//   84  177:aload           7
	//   85  179:iconst_3        
	//   86  180:invokevirtual   #937 <Method String Matcher.group(int)>
	//   87  183:invokestatic    #763 <Method int Integer.parseInt(String)>
	//   88  186:aload           7
	//   89  188:iconst_4        
	//   90  189:invokevirtual   #937 <Method String Matcher.group(int)>
	//   91  192:invokestatic    #763 <Method int Integer.parseInt(String)>
	//   92  195:aload           7
	//   93  197:iconst_5        
	//   94  198:invokevirtual   #937 <Method String Matcher.group(int)>
	//   95  201:invokestatic    #763 <Method int Integer.parseInt(String)>
	//   96  204:aload           7
	//   97  206:bipush          6
	//   98  208:invokevirtual   #937 <Method String Matcher.group(int)>
	//   99  211:invokestatic    #763 <Method int Integer.parseInt(String)>
	//  100  214:invokevirtual   #966 <Method void Calendar.set(int, int, int, int, int, int)>
		if(!TextUtils.isEmpty(((CharSequence) (((Matcher) (obj)).group(8)))))
	//* 101  217:aload           7
	//* 102  219:bipush          8
	//* 103  221:invokevirtual   #937 <Method String Matcher.group(int)>
	//* 104  224:invokestatic    #533 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 105  227:ifne            286
		{
			StringBuilder stringbuilder = new StringBuilder();
	//  106  230:new             #51  <Class StringBuilder>
	//  107  233:dup             
	//  108  234:invokespecial   #54  <Method void StringBuilder()>
	//  109  237:astore          8
			stringbuilder.append("0.");
	//  110  239:aload           8
	//  111  241:ldc2            #968 <String "0.">
	//  112  244:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//  113  247:pop             
			stringbuilder.append(((Matcher) (obj)).group(8));
	//  114  248:aload           8
	//  115  250:aload           7
	//  116  252:bipush          8
	//  117  254:invokevirtual   #937 <Method String Matcher.group(int)>
	//  118  257:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//  119  260:pop             
			((Calendar) (s)).set(14, (new BigDecimal(stringbuilder.toString())).movePointRight(3).intValue());
	//  120  261:aload_0         
	//  121  262:bipush          14
	//  122  264:new             #970 <Class BigDecimal>
	//  123  267:dup             
	//  124  268:aload           8
	//  125  270:invokevirtual   #67  <Method String StringBuilder.toString()>
	//  126  273:invokespecial   #971 <Method void BigDecimal(String)>
	//  127  276:iconst_3        
	//  128  277:invokevirtual   #975 <Method BigDecimal BigDecimal.movePointRight(int)>
	//  129  280:invokevirtual   #978 <Method int BigDecimal.intValue()>
	//  130  283:invokevirtual   #980 <Method void Calendar.set(int, int)>
		}
		long l1 = ((Calendar) (s)).getTimeInMillis();
	//  131  286:aload_0         
	//  132  287:invokevirtual   #984 <Method long Calendar.getTimeInMillis()>
	//  133  290:lstore          5
		long l = l1;
	//  134  292:lload           5
	//  135  294:lstore_3        
		if(i != 0)
	//* 136  295:iload_1         
	//* 137  296:ifeq            309
			l = l1 - (long)(i * 60000);
	//  138  299:lload           5
	//  139  301:iload_1         
	//  140  302:ldc2            #985 <Int 60000>
	//  141  305:imul            
	//  142  306:i2l             
	//  143  307:lsub            
	//  144  308:lstore_3        
		return l;
	//  145  309:lload_3         
	//  146  310:lreturn         
	}

	public static long parseXsDuration(String s)
	{
		Matcher matcher = XS_DURATION_PATTERN.matcher(((CharSequence) (s)));
	//    0    0:getstatic       #83  <Field Pattern XS_DURATION_PATTERN>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #927 <Method Matcher Pattern.matcher(CharSequence)>
	//    3    7:astore          18
		if(matcher.matches())
	//*   4    9:aload           18
	//*   5   11:invokevirtual   #931 <Method boolean Matcher.matches()>
	//*   6   14:ifeq            224
		{
			boolean flag = TextUtils.isEmpty(((CharSequence) (matcher.group(1))));
	//    7   17:aload           18
	//    8   19:iconst_1        
	//    9   20:invokevirtual   #937 <Method String Matcher.group(int)>
	//   10   23:invokestatic    #533 <Method boolean TextUtils.isEmpty(CharSequence)>
	//   11   26:istore          13
			s = matcher.group(3);
	//   12   28:aload           18
	//   13   30:iconst_3        
	//   14   31:invokevirtual   #937 <Method String Matcher.group(int)>
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
	//   21   43:invokestatic    #992 <Method double Double.parseDouble(String)>
	//   22   46:ldc2w           #993 <Double 31556908D>
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
	//   30   59:invokevirtual   #937 <Method String Matcher.group(int)>
	//   31   62:astore_0        
			double d1;
			if(s != null)
	//*  32   63:aload_0         
	//*  33   64:ifnull          79
				d1 = Double.parseDouble(s) * 2629739D;
	//   34   67:aload_0         
	//   35   68:invokestatic    #992 <Method double Double.parseDouble(String)>
	//   36   71:ldc2w           #995 <Double 2629739D>
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
	//   44   85:invokevirtual   #937 <Method String Matcher.group(int)>
	//   45   88:astore_0        
			double d2;
			if(s != null)
	//*  46   89:aload_0         
	//*  47   90:ifnull          106
				d2 = Double.parseDouble(s) * 86400D;
	//   48   93:aload_0         
	//   49   94:invokestatic    #992 <Method double Double.parseDouble(String)>
	//   50   97:ldc2w           #997 <Double 86400D>
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
	//   58  113:invokevirtual   #937 <Method String Matcher.group(int)>
	//   59  116:astore_0        
			double d3;
			if(s != null)
	//*  60  117:aload_0         
	//*  61  118:ifnull          134
				d3 = 3600D * Double.parseDouble(s);
	//   62  121:ldc2w           #999 <Double 3600D>
	//   63  124:aload_0         
	//   64  125:invokestatic    #992 <Method double Double.parseDouble(String)>
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
	//   72  141:invokevirtual   #937 <Method String Matcher.group(int)>
	//   73  144:astore_0        
			double d4;
			if(s != null)
	//*  74  145:aload_0         
	//*  75  146:ifnull          162
				d4 = Double.parseDouble(s) * 60D;
	//   76  149:aload_0         
	//   77  150:invokestatic    #992 <Method double Double.parseDouble(String)>
	//   78  153:ldc2w           #1001 <Double 60D>
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
	//   86  169:invokevirtual   #937 <Method String Matcher.group(int)>
	//   87  172:astore_0        
			if(s != null)
	//*  88  173:aload_0         
	//*  89  174:ifnull          183
				d5 = Double.parseDouble(s);
	//   90  177:aload_0         
	//   91  178:invokestatic    #992 <Method double Double.parseDouble(String)>
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
	//  104  198:ldc2w           #1003 <Double 1000D>
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
	//  120  225:invokestatic    #992 <Method double Double.parseDouble(String)>
	//  121  228:ldc2w           #999 <Double 3600D>
	//  122  231:dmul            
	//  123  232:ldc2w           #1003 <Double 1000D>
	//  124  235:dmul            
	//  125  236:d2l             
	//  126  237:lreturn         
		}
	}

	public static boolean readBoolean(Parcel parcel)
	{
		return parcel.readInt() != 0;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #1011 <Method int Parcel.readInt()>
	//    2    4:ifeq            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public static void recursiveDelete(File file)
	{
		if(file.isDirectory())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #1016 <Method boolean File.isDirectory()>
	//*   2    4:ifeq            35
		{
			File afile[] = file.listFiles();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #1020 <Method File[] File.listFiles()>
	//    5   11:astore_3        
			int j = afile.length;
	//    6   12:aload_3         
	//    7   13:arraylength     
	//    8   14:istore_2        
			for(int i = 0; i < j; i++)
	//*   9   15:iconst_0        
	//*  10   16:istore_1        
	//*  11   17:iload_1         
	//*  12   18:iload_2         
	//*  13   19:icmpge          35
				recursiveDelete(afile[i]);
	//   14   22:aload_3         
	//   15   23:iload_1         
	//   16   24:aaload          
	//   17   25:invokestatic    #1022 <Method void recursiveDelete(File)>

	//   18   28:iload_1         
	//   19   29:iconst_1        
	//   20   30:iadd            
	//   21   31:istore_1        
		}
	//*  22   32:goto            17
		file.delete();
	//   23   35:aload_0         
	//   24   36:invokevirtual   #448 <Method boolean File.delete()>
	//   25   39:pop             
	//   26   40:return          
	}

	public static void removeRange(List list, int i, int j)
	{
		list.subList(i, j).clear();
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokeinterface #1028 <Method List List.subList(int, int)>
	//    4    8:invokeinterface #1029 <Method void List.clear()>
	//    5   13:return          
	}

	public static long resolveSeekPositionUs(long l, SeekParameters seekparameters, long l1, long l2)
	{
		if(SeekParameters.EXACT.equals(((Object) (seekparameters))))
	//*   0    0:getstatic       #1038 <Field SeekParameters SeekParameters.EXACT>
	//*   1    3:aload_2         
	//*   2    4:invokevirtual   #1039 <Method boolean SeekParameters.equals(Object)>
	//*   3    7:ifeq            12
			return l;
	//    4   10:lload_0         
	//    5   11:lreturn         
		long l3 = subtractWithOverflowDefault(l, seekparameters.toleranceBeforeUs, 0x0L);
	//    6   12:lload_0         
	//    7   13:aload_2         
	//    8   14:getfield        #1043 <Field long SeekParameters.toleranceBeforeUs>
	//    9   17:ldc2w           #1044 <Long 0x0L>
	//   10   20:invokestatic    #1048 <Method long subtractWithOverflowDefault(long, long, long)>
	//   11   23:lstore          10
		long l4 = addWithOverflowDefault(l, seekparameters.toleranceAfterUs, 0xffffffffL);
	//   12   25:lload_0         
	//   13   26:aload_2         
	//   14   27:getfield        #1051 <Field long SeekParameters.toleranceAfterUs>
	//   15   30:ldc2w           #1052 <Long 0xffffffffL>
	//   16   33:invokestatic    #1055 <Method long addWithOverflowDefault(long, long, long)>
	//   17   36:lstore          12
		boolean flag2 = false;
	//   18   38:iconst_0        
	//   19   39:istore          9
		boolean flag;
		if(l3 <= l1 && l1 <= l4)
	//*  20   41:lload           10
	//*  21   43:lload_3         
	//*  22   44:lcmp            
	//*  23   45:ifgt            61
	//*  24   48:lload_3         
	//*  25   49:lload           12
	//*  26   51:lcmp            
	//*  27   52:ifgt            61
			flag = true;
	//   28   55:iconst_1        
	//   29   56:istore          7
		else
	//*  30   58:goto            64
			flag = false;
	//   31   61:iconst_0        
	//   32   62:istore          7
		boolean flag1 = flag2;
	//   33   64:iload           9
	//   34   66:istore          8
		if(l3 <= l2)
	//*  35   68:lload           10
	//*  36   70:lload           5
	//*  37   72:lcmp            
	//*  38   73:ifgt            91
		{
			flag1 = flag2;
	//   39   76:iload           9
	//   40   78:istore          8
			if(l2 <= l4)
	//*  41   80:lload           5
	//*  42   82:lload           12
	//*  43   84:lcmp            
	//*  44   85:ifgt            91
				flag1 = true;
	//   45   88:iconst_1        
	//   46   89:istore          8
		}
		if(flag && flag1)
	//*  47   91:iload           7
	//*  48   93:ifeq            123
	//*  49   96:iload           8
	//*  50   98:ifeq            123
			if(Math.abs(l1 - l) <= Math.abs(l2 - l))
	//*  51  101:lload_3         
	//*  52  102:lload_0         
	//*  53  103:lsub            
	//*  54  104:invokestatic    #1059 <Method long Math.abs(long)>
	//*  55  107:lload           5
	//*  56  109:lload_0         
	//*  57  110:lsub            
	//*  58  111:invokestatic    #1059 <Method long Math.abs(long)>
	//*  59  114:lcmp            
	//*  60  115:ifgt            120
				return l1;
	//   61  118:lload_3         
	//   62  119:lreturn         
			else
				return l2;
	//   63  120:lload           5
	//   64  122:lreturn         
		if(flag)
	//*  65  123:iload           7
	//*  66  125:ifeq            130
			return l1;
	//   67  128:lload_3         
	//   68  129:lreturn         
		if(flag1)
	//*  69  130:iload           8
	//*  70  132:ifeq            138
			return l2;
	//   71  135:lload           5
	//   72  137:lreturn         
		else
			return l3;
	//   73  138:lload           10
	//   74  140:lreturn         
	}

	public static long scaleLargeTimestamp(long l, long l1, long l2)
	{
		if(l2 >= l1 && l2 % l1 == 0L)
	//*   0    0:lload           4
	//*   1    2:lload_2         
	//*   2    3:lcmp            
	//*   3    4:iflt            23
	//*   4    7:lload           4
	//*   5    9:lload_2         
	//*   6   10:lrem            
	//*   7   11:lconst_0        
	//*   8   12:lcmp            
	//*   9   13:ifne            23
			return l / (l2 / l1);
	//   10   16:lload_0         
	//   11   17:lload           4
	//   12   19:lload_2         
	//   13   20:ldiv            
	//   14   21:ldiv            
	//   15   22:lreturn         
		if(l2 < l1 && l1 % l2 == 0L)
	//*  16   23:lload           4
	//*  17   25:lload_2         
	//*  18   26:lcmp            
	//*  19   27:ifge            46
	//*  20   30:lload_2         
	//*  21   31:lload           4
	//*  22   33:lrem            
	//*  23   34:lconst_0        
	//*  24   35:lcmp            
	//*  25   36:ifne            46
		{
			return l * (l1 / l2);
	//   26   39:lload_0         
	//   27   40:lload_2         
	//   28   41:lload           4
	//   29   43:ldiv            
	//   30   44:lmul            
	//   31   45:lreturn         
		} else
		{
			double d = (double)l1 / (double)l2;
	//   32   46:lload_2         
	//   33   47:l2d             
	//   34   48:lload           4
	//   35   50:l2d             
	//   36   51:ddiv            
	//   37   52:dstore          6
			return (long)((double)l * d);
	//   38   54:lload_0         
	//   39   55:l2d             
	//   40   56:dload           6
	//   41   58:dmul            
	//   42   59:d2l             
	//   43   60:lreturn         
		}
	}

	public static long[] scaleLargeTimestamps(List list, long l, long l1)
	{
		long al[] = new long[list.size()];
	//    0    0:aload_0         
	//    1    1:invokeinterface #370 <Method int List.size()>
	//    2    6:newarray        long[]
	//    3    8:astore          10
		boolean flag = false;
	//    4   10:iconst_0        
	//    5   11:istore          8
		boolean flag1 = false;
	//    6   13:iconst_0        
	//    7   14:istore          9
		int i = 0;
	//    8   16:iconst_0        
	//    9   17:istore          7
		if(l1 >= l && l1 % l == 0L)
	//*  10   19:lload_3         
	//*  11   20:lload_1         
	//*  12   21:lcmp            
	//*  13   22:iflt            75
	//*  14   25:lload_3         
	//*  15   26:lload_1         
	//*  16   27:lrem            
	//*  17   28:lconst_0        
	//*  18   29:lcmp            
	//*  19   30:ifne            75
		{
			l = l1 / l;
	//   20   33:lload_3         
	//   21   34:lload_1         
	//   22   35:ldiv            
	//   23   36:lstore_1        
			for(; i < al.length; i++)
	//*  24   37:iload           7
	//*  25   39:aload           10
	//*  26   41:arraylength     
	//*  27   42:icmpge          187
				al[i] = ((Long)list.get(i)).longValue() / l;
	//   28   45:aload           10
	//   29   47:iload           7
	//   30   49:aload_0         
	//   31   50:iload           7
	//   32   52:invokeinterface #374 <Method Object List.get(int)>
	//   33   57:checkcast       #798 <Class Long>
	//   34   60:invokevirtual   #1065 <Method long Long.longValue()>
	//   35   63:lload_1         
	//   36   64:ldiv            
	//   37   65:lastore         

	//   38   66:iload           7
	//   39   68:iconst_1        
	//   40   69:iadd            
	//   41   70:istore          7
		} else
	//*  42   72:goto            37
		if(l1 < l && l % l1 == 0L)
	//*  43   75:lload_3         
	//*  44   76:lload_1         
	//*  45   77:lcmp            
	//*  46   78:ifge            135
	//*  47   81:lload_1         
	//*  48   82:lload_3         
	//*  49   83:lrem            
	//*  50   84:lconst_0        
	//*  51   85:lcmp            
	//*  52   86:ifne            135
		{
			l /= l1;
	//   53   89:lload_1         
	//   54   90:lload_3         
	//   55   91:ldiv            
	//   56   92:lstore_1        
			for(int j = ((int) (flag)); j < al.length; j++)
	//*  57   93:iload           8
	//*  58   95:istore          7
	//*  59   97:iload           7
	//*  60   99:aload           10
	//*  61  101:arraylength     
	//*  62  102:icmpge          187
				al[j] = ((Long)list.get(j)).longValue() * l;
	//   63  105:aload           10
	//   64  107:iload           7
	//   65  109:aload_0         
	//   66  110:iload           7
	//   67  112:invokeinterface #374 <Method Object List.get(int)>
	//   68  117:checkcast       #798 <Class Long>
	//   69  120:invokevirtual   #1065 <Method long Long.longValue()>
	//   70  123:lload_1         
	//   71  124:lmul            
	//   72  125:lastore         

	//   73  126:iload           7
	//   74  128:iconst_1        
	//   75  129:iadd            
	//   76  130:istore          7
		} else
	//*  77  132:goto            97
		{
			double d = (double)l / (double)l1;
	//   78  135:lload_1         
	//   79  136:l2d             
	//   80  137:lload_3         
	//   81  138:l2d             
	//   82  139:ddiv            
	//   83  140:dstore          5
			for(int k = ((int) (flag1)); k < al.length; k++)
	//*  84  142:iload           9
	//*  85  144:istore          7
	//*  86  146:iload           7
	//*  87  148:aload           10
	//*  88  150:arraylength     
	//*  89  151:icmpge          187
				al[k] = (long)((double)((Long)list.get(k)).longValue() * d);
	//   90  154:aload           10
	//   91  156:iload           7
	//   92  158:aload_0         
	//   93  159:iload           7
	//   94  161:invokeinterface #374 <Method Object List.get(int)>
	//   95  166:checkcast       #798 <Class Long>
	//   96  169:invokevirtual   #1065 <Method long Long.longValue()>
	//   97  172:l2d             
	//   98  173:dload           5
	//   99  175:dmul            
	//  100  176:d2l             
	//  101  177:lastore         

	//  102  178:iload           7
	//  103  180:iconst_1        
	//  104  181:iadd            
	//  105  182:istore          7
		}
	//* 106  184:goto            146
		return al;
	//  107  187:aload           10
	//  108  189:areturn         
	}

	public static void scaleLargeTimestampsInPlace(long al[], long l, long l1)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore          8
		boolean flag1 = false;
	//    2    3:iconst_0        
	//    3    4:istore          9
		int i = 0;
	//    4    6:iconst_0        
	//    5    7:istore          7
		if(l1 >= l && l1 % l == 0L)
	//*   6    9:lload_3         
	//*   7   10:lload_1         
	//*   8   11:lcmp            
	//*   9   12:iflt            53
	//*  10   15:lload_3         
	//*  11   16:lload_1         
	//*  12   17:lrem            
	//*  13   18:lconst_0        
	//*  14   19:lcmp            
	//*  15   20:ifne            53
		{
			l = l1 / l;
	//   16   23:lload_3         
	//   17   24:lload_1         
	//   18   25:ldiv            
	//   19   26:lstore_1        
			for(; i < al.length; i++)
	//*  20   27:iload           7
	//*  21   29:aload_0         
	//*  22   30:arraylength     
	//*  23   31:icmpge          141
				al[i] = al[i] / l;
	//   24   34:aload_0         
	//   25   35:iload           7
	//   26   37:aload_0         
	//   27   38:iload           7
	//   28   40:laload          
	//   29   41:lload_1         
	//   30   42:ldiv            
	//   31   43:lastore         

	//   32   44:iload           7
	//   33   46:iconst_1        
	//   34   47:iadd            
	//   35   48:istore          7
		} else
	//*  36   50:goto            27
		if(l1 < l && l % l1 == 0L)
	//*  37   53:lload_3         
	//*  38   54:lload_1         
	//*  39   55:lcmp            
	//*  40   56:ifge            101
	//*  41   59:lload_1         
	//*  42   60:lload_3         
	//*  43   61:lrem            
	//*  44   62:lconst_0        
	//*  45   63:lcmp            
	//*  46   64:ifne            101
		{
			l /= l1;
	//   47   67:lload_1         
	//   48   68:lload_3         
	//   49   69:ldiv            
	//   50   70:lstore_1        
			for(int j = ((int) (flag)); j < al.length; j++)
	//*  51   71:iload           8
	//*  52   73:istore          7
	//*  53   75:iload           7
	//*  54   77:aload_0         
	//*  55   78:arraylength     
	//*  56   79:icmpge          141
				al[j] = al[j] * l;
	//   57   82:aload_0         
	//   58   83:iload           7
	//   59   85:aload_0         
	//   60   86:iload           7
	//   61   88:laload          
	//   62   89:lload_1         
	//   63   90:lmul            
	//   64   91:lastore         

	//   65   92:iload           7
	//   66   94:iconst_1        
	//   67   95:iadd            
	//   68   96:istore          7
		} else
	//*  69   98:goto            75
		{
			double d = (double)l / (double)l1;
	//   70  101:lload_1         
	//   71  102:l2d             
	//   72  103:lload_3         
	//   73  104:l2d             
	//   74  105:ddiv            
	//   75  106:dstore          5
			for(int k = ((int) (flag1)); k < al.length; k++)
	//*  76  108:iload           9
	//*  77  110:istore          7
	//*  78  112:iload           7
	//*  79  114:aload_0         
	//*  80  115:arraylength     
	//*  81  116:icmpge          141
				al[k] = (long)((double)al[k] * d);
	//   82  119:aload_0         
	//   83  120:iload           7
	//   84  122:aload_0         
	//   85  123:iload           7
	//   86  125:laload          
	//   87  126:l2d             
	//   88  127:dload           5
	//   89  129:dmul            
	//   90  130:d2l             
	//   91  131:lastore         

	//   92  132:iload           7
	//   93  134:iconst_1        
	//   94  135:iadd            
	//   95  136:istore          7
		}
	//*  96  138:goto            112
	//   97  141:return          
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
	//    1    1:invokestatic    #1073 <Method void sneakyThrowInternal(Throwable)>
	//    2    4:return          
	}

	private static void sneakyThrowInternal(Throwable throwable)
		throws Throwable
	{
		throw throwable;
	//    0    0:aload_0         
	//    1    1:athrow          
	}

	public static String[] split(String s, String s1)
	{
		return s.split(s1, -1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_m1       
	//    3    3:invokevirtual   #1079 <Method String[] String.split(String, int)>
	//    4    6:areturn         
	}

	public static String[] splitAtFirst(String s, String s1)
	{
		return s.split(s1, 2);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_2        
	//    3    3:invokevirtual   #1079 <Method String[] String.split(String, int)>
	//    4    6:areturn         
	}

	public static ComponentName startForegroundService(Context context, Intent intent)
	{
		if(SDK_INT >= 26)
	//*   0    0:getstatic       #38  <Field int SDK_INT>
	//*   1    3:bipush          26
	//*   2    5:icmplt          14
			return context.startForegroundService(intent);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:invokevirtual   #1085 <Method ComponentName Context.startForegroundService(Intent)>
	//    6   13:areturn         
		else
			return context.startService(intent);
	//    7   14:aload_0         
	//    8   15:aload_1         
	//    9   16:invokevirtual   #1088 <Method ComponentName Context.startService(Intent)>
	//   10   19:areturn         
	}

	public static long subtractWithOverflowDefault(long l, long l1, long l2)
	{
		long l3 = l - l1;
	//    0    0:lload_0         
	//    1    1:lload_2         
	//    2    2:lsub            
	//    3    3:lstore          6
		if(((l ^ l1) & (l ^ l3)) < 0L)
	//*   4    5:lload_0         
	//*   5    6:lload_2         
	//*   6    7:lxor            
	//*   7    8:lload_0         
	//*   8    9:lload           6
	//*   9   11:lxor            
	//*  10   12:land            
	//*  11   13:lconst_0        
	//*  12   14:lcmp            
	//*  13   15:ifge            21
			return l2;
	//   14   18:lload           4
	//   15   20:lreturn         
		else
			return l3;
	//   16   21:lload           6
	//   17   23:lreturn         
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
	//    5    7:invokeinterface #370 <Method int List.size()>
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
	//   19   28:invokeinterface #374 <Method Object List.get(int)>
	//   20   33:checkcast       #478 <Class Integer>
	//   21   36:invokevirtual   #1091 <Method int Integer.intValue()>
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
	//    3    6:new             #1096 <Class ByteArrayOutputStream>
	//    4    9:dup             
	//    5   10:invokespecial   #1097 <Method void ByteArrayOutputStream()>
	//    6   13:astore_3        
		do
		{
			int i = inputstream.read(abyte0);
	//    7   14:aload_0         
	//    8   15:aload_2         
	//    9   16:invokevirtual   #1103 <Method int InputStream.read(byte[])>
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
	//   18   29:invokevirtual   #1107 <Method void ByteArrayOutputStream.write(byte[], int, int)>
			else
	//*  19   32:goto            14
				return bytearrayoutputstream.toByteArray();
	//   20   35:aload_3         
	//   21   36:invokevirtual   #1110 <Method byte[] ByteArrayOutputStream.toByteArray()>
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
	//    5    7:getstatic       #493 <Field Locale Locale.US>
	//    6   10:invokevirtual   #1114 <Method String String.toLowerCase(Locale)>
	//    7   13:areturn         
	}

	public static String toUpperInvariant(String s)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		else
			return s.toUpperCase(Locale.US);
	//    4    6:aload_0         
	//    5    7:getstatic       #493 <Field Locale Locale.US>
	//    6   10:invokevirtual   #1118 <Method String String.toUpperCase(Locale)>
	//    7   13:areturn         
	}

	public static String unescapeFileName(String s)
	{
		int i1 = s.length();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #466 <Method int String.length()>
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
	//*  16   24:invokevirtual   #37  <Method char String.charAt(int)>
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
	//   40   61:new             #51  <Class StringBuilder>
	//   41   64:dup             
	//   42   65:iload           4
	//   43   67:invokespecial   #473 <Method void StringBuilder(int)>
	//   44   70:astore          7
		Matcher matcher = ESCAPED_CHARACTER_PATTERN.matcher(((CharSequence) (s)));
	//   45   72:getstatic       #87  <Field Pattern ESCAPED_CHARACTER_PATTERN>
	//   46   75:aload_0         
	//   47   76:invokevirtual   #927 <Method Matcher Pattern.matcher(CharSequence)>
	//   48   79:astore          8
		j = ((int) (flag));
	//   49   81:iload           5
	//   50   83:istore_3        
		for(; i > 0 && matcher.find(); i--)
	//*  51   84:iload_2         
	//*  52   85:ifle            142
	//*  53   88:aload           8
	//*  54   90:invokevirtual   #1122 <Method boolean Matcher.find()>
	//*  55   93:ifeq            142
		{
			char c = (char)Integer.parseInt(matcher.group(1), 16);
	//   56   96:aload           8
	//   57   98:iconst_1        
	//   58   99:invokevirtual   #937 <Method String Matcher.group(int)>
	//   59  102:bipush          16
	//   60  104:invokestatic    #1125 <Method int Integer.parseInt(String, int)>
	//   61  107:int2char        
	//   62  108:istore_1        
			stringbuilder.append(((CharSequence) (s)), j, matcher.start());
	//   63  109:aload           7
	//   64  111:aload_0         
	//   65  112:iload_3         
	//   66  113:aload           8
	//   67  115:invokevirtual   #1128 <Method int Matcher.start()>
	//   68  118:invokevirtual   #485 <Method StringBuilder StringBuilder.append(CharSequence, int, int)>
	//   69  121:pop             
			stringbuilder.append(c);
	//   70  122:aload           7
	//   71  124:iload_1         
	//   72  125:invokevirtual   #476 <Method StringBuilder StringBuilder.append(char)>
	//   73  128:pop             
			j = matcher.end();
	//   74  129:aload           8
	//   75  131:invokevirtual   #1131 <Method int Matcher.end()>
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
	//   89  154:invokevirtual   #485 <Method StringBuilder StringBuilder.append(CharSequence, int, int)>
	//   90  157:pop             
		if(stringbuilder.length() != l)
	//*  91  158:aload           7
	//*  92  160:invokevirtual   #549 <Method int StringBuilder.length()>
	//*  93  163:iload           4
	//*  94  165:icmpeq          170
			return null;
	//   95  168:aconst_null     
	//   96  169:areturn         
		else
			return stringbuilder.toString();
	//   97  170:aload           7
	//   98  172:invokevirtual   #67  <Method String StringBuilder.toString()>
	//   99  175:areturn         
	}

	public static void writeBoolean(Parcel parcel, boolean flag)
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #620 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc2            #1135 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    7:invokespecial   #1138 <Method void Runtime(String)>
	//    4   10:athrow          
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
	public static final String DEVICE_DEBUG_INFO;
	private static final Pattern ESCAPED_CHARACTER_PATTERN = Pattern.compile("%([A-Fa-f0-9]{2})");
	public static final String MANUFACTURER;
	public static final String MODEL;
	public static final int SDK_INT;
	private static final String TAG = "Util";
	private static final Pattern XS_DATE_TIME_PATTERN = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
	private static final Pattern XS_DURATION_PATTERN = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");

	static 
	{
		int i;
		if(android.os.Build.VERSION.SDK_INT == 25 && android.os.Build.VERSION.CODENAME.charAt(0) == 'O')
	//*   0    0:getstatic       #28  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          25
	//*   2    5:icmpne          26
	//*   3    8:getstatic       #31  <Field String android.os.Build$VERSION.CODENAME>
	//*   4   11:iconst_0        
	//*   5   12:invokevirtual   #37  <Method char String.charAt(int)>
	//*   6   15:bipush          79
	//*   7   17:icmpne          26
			i = 26;
	//    8   20:bipush          26
	//    9   22:istore_0        
		else
	//*  10   23:goto            30
			i = android.os.Build.VERSION.SDK_INT;
	//   11   26:getstatic       #28  <Field int android.os.Build$VERSION.SDK_INT>
	//   12   29:istore_0        
		SDK_INT = i;
	//   13   30:iload_0         
	//   14   31:putstatic       #38  <Field int SDK_INT>
		DEVICE = Build.DEVICE;
	//   15   34:getstatic       #42  <Field String Build.DEVICE>
	//   16   37:putstatic       #43  <Field String DEVICE>
		MANUFACTURER = Build.MANUFACTURER;
	//   17   40:getstatic       #45  <Field String Build.MANUFACTURER>
	//   18   43:putstatic       #46  <Field String MANUFACTURER>
		MODEL = Build.MODEL;
	//   19   46:getstatic       #48  <Field String Build.MODEL>
	//   20   49:putstatic       #49  <Field String MODEL>
		StringBuilder stringbuilder = new StringBuilder();
	//   21   52:new             #51  <Class StringBuilder>
	//   22   55:dup             
	//   23   56:invokespecial   #54  <Method void StringBuilder()>
	//   24   59:astore_1        
		stringbuilder.append(DEVICE);
	//   25   60:aload_1         
	//   26   61:getstatic       #43  <Field String DEVICE>
	//   27   64:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   28   67:pop             
		stringbuilder.append(", ");
	//   29   68:aload_1         
	//   30   69:ldc1            #60  <String ", ">
	//   31   71:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   32   74:pop             
		stringbuilder.append(MODEL);
	//   33   75:aload_1         
	//   34   76:getstatic       #49  <Field String MODEL>
	//   35   79:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   36   82:pop             
		stringbuilder.append(", ");
	//   37   83:aload_1         
	//   38   84:ldc1            #60  <String ", ">
	//   39   86:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   40   89:pop             
		stringbuilder.append(MANUFACTURER);
	//   41   90:aload_1         
	//   42   91:getstatic       #46  <Field String MANUFACTURER>
	//   43   94:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   44   97:pop             
		stringbuilder.append(", ");
	//   45   98:aload_1         
	//   46   99:ldc1            #60  <String ", ">
	//   47  101:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   48  104:pop             
		stringbuilder.append(SDK_INT);
	//   49  105:aload_1         
	//   50  106:getstatic       #38  <Field int SDK_INT>
	//   51  109:invokevirtual   #63  <Method StringBuilder StringBuilder.append(int)>
	//   52  112:pop             
		DEVICE_DEBUG_INFO = stringbuilder.toString();
	//   53  113:aload_1         
	//   54  114:invokevirtual   #67  <Method String StringBuilder.toString()>
	//   55  117:putstatic       #69  <Field String DEVICE_DEBUG_INFO>
	//   56  120:ldc1            #71  <String "(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?">
	//   57  122:invokestatic    #77  <Method Pattern Pattern.compile(String)>
	//   58  125:putstatic       #79  <Field Pattern XS_DATE_TIME_PATTERN>
	//   59  128:ldc1            #81  <String "^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$">
	//   60  130:invokestatic    #77  <Method Pattern Pattern.compile(String)>
	//   61  133:putstatic       #83  <Field Pattern XS_DURATION_PATTERN>
	//   62  136:ldc1            #85  <String "%([A-Fa-f0-9]{2})">
	//   63  138:invokestatic    #77  <Method Pattern Pattern.compile(String)>
	//   64  141:putstatic       #87  <Field Pattern ESCAPED_CHARACTER_PATTERN>
	//   65  144:sipush          256
	//   66  147:newarray        int[]
	//   67  149:dup             
	//   68  150:iconst_0        
	//   69  151:iconst_0        
	//   70  152:iastore         
	//   71  153:dup             
	//   72  154:iconst_1        
	//   73  155:ldc1            #88  <Int 0x4c11db7>
	//   74  157:iastore         
	//   75  158:dup             
	//   76  159:iconst_2        
	//   77  160:ldc1            #89  <Int 0x9823b6e>
	//   78  162:iastore         
	//   79  163:dup             
	//   80  164:iconst_3        
	//   81  165:ldc1            #90  <Int 0xd4326d9>
	//   82  167:iastore         
	//   83  168:dup             
	//   84  169:iconst_4        
	//   85  170:ldc1            #91  <Int 0x130476dc>
	//   86  172:iastore         
	//   87  173:dup             
	//   88  174:iconst_5        
	//   89  175:ldc1            #92  <Int 0x17c56b6b>
	//   90  177:iastore         
	//   91  178:dup             
	//   92  179:bipush          6
	//   93  181:ldc1            #93  <Int 0x1a864db2>
	//   94  183:iastore         
	//   95  184:dup             
	//   96  185:bipush          7
	//   97  187:ldc1            #94  <Int 0x1e475005>
	//   98  189:iastore         
	//   99  190:dup             
	//  100  191:bipush          8
	//  101  193:ldc1            #95  <Int 0x2608edb8>
	//  102  195:iastore         
	//  103  196:dup             
	//  104  197:bipush          9
	//  105  199:ldc1            #96  <Int 0x22c9f00f>
	//  106  201:iastore         
	//  107  202:dup             
	//  108  203:bipush          10
	//  109  205:ldc1            #97  <Int 0x2f8ad6d6>
	//  110  207:iastore         
	//  111  208:dup             
	//  112  209:bipush          11
	//  113  211:ldc1            #98  <Int 0x2b4bcb61>
	//  114  213:iastore         
	//  115  214:dup             
	//  116  215:bipush          12
	//  117  217:ldc1            #99  <Int 0x350c9b64>
	//  118  219:iastore         
	//  119  220:dup             
	//  120  221:bipush          13
	//  121  223:ldc1            #100 <Int 0x31cd86d3>
	//  122  225:iastore         
	//  123  226:dup             
	//  124  227:bipush          14
	//  125  229:ldc1            #101 <Int 0x3c8ea00a>
	//  126  231:iastore         
	//  127  232:dup             
	//  128  233:bipush          15
	//  129  235:ldc1            #102 <Int 0x384fbdbd>
	//  130  237:iastore         
	//  131  238:dup             
	//  132  239:bipush          16
	//  133  241:ldc1            #103 <Int 0x4c11db70>
	//  134  243:iastore         
	//  135  244:dup             
	//  136  245:bipush          17
	//  137  247:ldc1            #104 <Int 0x48d0c6c7>
	//  138  249:iastore         
	//  139  250:dup             
	//  140  251:bipush          18
	//  141  253:ldc1            #105 <Int 0x4593e01e>
	//  142  255:iastore         
	//  143  256:dup             
	//  144  257:bipush          19
	//  145  259:ldc1            #106 <Int 0x4152fda9>
	//  146  261:iastore         
	//  147  262:dup             
	//  148  263:bipush          20
	//  149  265:ldc1            #107 <Int 0x5f15adac>
	//  150  267:iastore         
	//  151  268:dup             
	//  152  269:bipush          21
	//  153  271:ldc1            #108 <Int 0x5bd4b01b>
	//  154  273:iastore         
	//  155  274:dup             
	//  156  275:bipush          22
	//  157  277:ldc1            #109 <Int 0x569796c2>
	//  158  279:iastore         
	//  159  280:dup             
	//  160  281:bipush          23
	//  161  283:ldc1            #110 <Int 0x52568b75>
	//  162  285:iastore         
	//  163  286:dup             
	//  164  287:bipush          24
	//  165  289:ldc1            #111 <Int 0x6a1936c8>
	//  166  291:iastore         
	//  167  292:dup             
	//  168  293:bipush          25
	//  169  295:ldc1            #112 <Int 0x6ed82b7f>
	//  170  297:iastore         
	//  171  298:dup             
	//  172  299:bipush          26
	//  173  301:ldc1            #113 <Int 0x639b0da6>
	//  174  303:iastore         
	//  175  304:dup             
	//  176  305:bipush          27
	//  177  307:ldc1            #114 <Int 0x675a1011>
	//  178  309:iastore         
	//  179  310:dup             
	//  180  311:bipush          28
	//  181  313:ldc1            #115 <Int 0x791d4014>
	//  182  315:iastore         
	//  183  316:dup             
	//  184  317:bipush          29
	//  185  319:ldc1            #116 <Int 0x7ddc5da3>
	//  186  321:iastore         
	//  187  322:dup             
	//  188  323:bipush          30
	//  189  325:ldc1            #117 <Int 0x709f7b7a>
	//  190  327:iastore         
	//  191  328:dup             
	//  192  329:bipush          31
	//  193  331:ldc1            #118 <Int 0x745e66cd>
	//  194  333:iastore         
	//  195  334:dup             
	//  196  335:bipush          32
	//  197  337:ldc1            #119 <Int 0x9823b6e0>
	//  198  339:iastore         
	//  199  340:dup             
	//  200  341:bipush          33
	//  201  343:ldc1            #120 <Int 0x9ce2ab57>
	//  202  345:iastore         
	//  203  346:dup             
	//  204  347:bipush          34
	//  205  349:ldc1            #121 <Int 0x91a18d8e>
	//  206  351:iastore         
	//  207  352:dup             
	//  208  353:bipush          35
	//  209  355:ldc1            #122 <Int 0x95609039>
	//  210  357:iastore         
	//  211  358:dup             
	//  212  359:bipush          36
	//  213  361:ldc1            #123 <Int 0x8b27c03c>
	//  214  363:iastore         
	//  215  364:dup             
	//  216  365:bipush          37
	//  217  367:ldc1            #124 <Int 0x8fe6dd8b>
	//  218  369:iastore         
	//  219  370:dup             
	//  220  371:bipush          38
	//  221  373:ldc1            #125 <Int 0x82a5fb52>
	//  222  375:iastore         
	//  223  376:dup             
	//  224  377:bipush          39
	//  225  379:ldc1            #126 <Int 0x8664e6e5>
	//  226  381:iastore         
	//  227  382:dup             
	//  228  383:bipush          40
	//  229  385:ldc1            #127 <Int 0xbe2b5b58>
	//  230  387:iastore         
	//  231  388:dup             
	//  232  389:bipush          41
	//  233  391:ldc1            #128 <Int 0xbaea46ef>
	//  234  393:iastore         
	//  235  394:dup             
	//  236  395:bipush          42
	//  237  397:ldc1            #129 <Int 0xb7a96036>
	//  238  399:iastore         
	//  239  400:dup             
	//  240  401:bipush          43
	//  241  403:ldc1            #130 <Int 0xb3687d81>
	//  242  405:iastore         
	//  243  406:dup             
	//  244  407:bipush          44
	//  245  409:ldc1            #131 <Int 0xad2f2d84>
	//  246  411:iastore         
	//  247  412:dup             
	//  248  413:bipush          45
	//  249  415:ldc1            #132 <Int 0xa9ee3033>
	//  250  417:iastore         
	//  251  418:dup             
	//  252  419:bipush          46
	//  253  421:ldc1            #133 <Int 0xa4ad16ea>
	//  254  423:iastore         
	//  255  424:dup             
	//  256  425:bipush          47
	//  257  427:ldc1            #134 <Int 0xa06c0b5d>
	//  258  429:iastore         
	//  259  430:dup             
	//  260  431:bipush          48
	//  261  433:ldc1            #135 <Int 0xd4326d90>
	//  262  435:iastore         
	//  263  436:dup             
	//  264  437:bipush          49
	//  265  439:ldc1            #136 <Int 0xd0f37027>
	//  266  441:iastore         
	//  267  442:dup             
	//  268  443:bipush          50
	//  269  445:ldc1            #137 <Int 0xddb056fe>
	//  270  447:iastore         
	//  271  448:dup             
	//  272  449:bipush          51
	//  273  451:ldc1            #138 <Int 0xd9714b49>
	//  274  453:iastore         
	//  275  454:dup             
	//  276  455:bipush          52
	//  277  457:ldc1            #139 <Int 0xc7361b4c>
	//  278  459:iastore         
	//  279  460:dup             
	//  280  461:bipush          53
	//  281  463:ldc1            #140 <Int 0xc3f706fb>
	//  282  465:iastore         
	//  283  466:dup             
	//  284  467:bipush          54
	//  285  469:ldc1            #141 <Int 0xceb42022>
	//  286  471:iastore         
	//  287  472:dup             
	//  288  473:bipush          55
	//  289  475:ldc1            #142 <Int 0xca753d95>
	//  290  477:iastore         
	//  291  478:dup             
	//  292  479:bipush          56
	//  293  481:ldc1            #143 <Int 0xf23a8028>
	//  294  483:iastore         
	//  295  484:dup             
	//  296  485:bipush          57
	//  297  487:ldc1            #144 <Int 0xf6fb9d9f>
	//  298  489:iastore         
	//  299  490:dup             
	//  300  491:bipush          58
	//  301  493:ldc1            #145 <Int 0xfbb8bb46>
	//  302  495:iastore         
	//  303  496:dup             
	//  304  497:bipush          59
	//  305  499:ldc1            #146 <Int 0xff79a6f1>
	//  306  501:iastore         
	//  307  502:dup             
	//  308  503:bipush          60
	//  309  505:ldc1            #147 <Int 0xe13ef6f4>
	//  310  507:iastore         
	//  311  508:dup             
	//  312  509:bipush          61
	//  313  511:ldc1            #148 <Int 0xe5ffeb43>
	//  314  513:iastore         
	//  315  514:dup             
	//  316  515:bipush          62
	//  317  517:ldc1            #149 <Int 0xe8bccd9a>
	//  318  519:iastore         
	//  319  520:dup             
	//  320  521:bipush          63
	//  321  523:ldc1            #150 <Int 0xec7dd02d>
	//  322  525:iastore         
	//  323  526:dup             
	//  324  527:bipush          64
	//  325  529:ldc1            #151 <Int 0x34867077>
	//  326  531:iastore         
	//  327  532:dup             
	//  328  533:bipush          65
	//  329  535:ldc1            #152 <Int 0x30476dc0>
	//  330  537:iastore         
	//  331  538:dup             
	//  332  539:bipush          66
	//  333  541:ldc1            #153 <Int 0x3d044b19>
	//  334  543:iastore         
	//  335  544:dup             
	//  336  545:bipush          67
	//  337  547:ldc1            #154 <Int 0x39c556ae>
	//  338  549:iastore         
	//  339  550:dup             
	//  340  551:bipush          68
	//  341  553:ldc1            #155 <Int 0x278206ab>
	//  342  555:iastore         
	//  343  556:dup             
	//  344  557:bipush          69
	//  345  559:ldc1            #156 <Int 0x23431b1c>
	//  346  561:iastore         
	//  347  562:dup             
	//  348  563:bipush          70
	//  349  565:ldc1            #157 <Int 0x2e003dc5>
	//  350  567:iastore         
	//  351  568:dup             
	//  352  569:bipush          71
	//  353  571:ldc1            #158 <Int 0x2ac12072>
	//  354  573:iastore         
	//  355  574:dup             
	//  356  575:bipush          72
	//  357  577:ldc1            #159 <Int 0x128e9dcf>
	//  358  579:iastore         
	//  359  580:dup             
	//  360  581:bipush          73
	//  361  583:ldc1            #160 <Int 0x164f8078>
	//  362  585:iastore         
	//  363  586:dup             
	//  364  587:bipush          74
	//  365  589:ldc1            #161 <Int 0x1b0ca6a1>
	//  366  591:iastore         
	//  367  592:dup             
	//  368  593:bipush          75
	//  369  595:ldc1            #162 <Int 0x1fcdbb16>
	//  370  597:iastore         
	//  371  598:dup             
	//  372  599:bipush          76
	//  373  601:ldc1            #163 <Int 0x18aeb13>
	//  374  603:iastore         
	//  375  604:dup             
	//  376  605:bipush          77
	//  377  607:ldc1            #164 <Int 0x54bf6a4>
	//  378  609:iastore         
	//  379  610:dup             
	//  380  611:bipush          78
	//  381  613:ldc1            #165 <Int 0x808d07d>
	//  382  615:iastore         
	//  383  616:dup             
	//  384  617:bipush          79
	//  385  619:ldc1            #166 <Int 0xcc9cdca>
	//  386  621:iastore         
	//  387  622:dup             
	//  388  623:bipush          80
	//  389  625:ldc1            #167 <Int 0x7897ab07>
	//  390  627:iastore         
	//  391  628:dup             
	//  392  629:bipush          81
	//  393  631:ldc1            #168 <Int 0x7c56b6b0>
	//  394  633:iastore         
	//  395  634:dup             
	//  396  635:bipush          82
	//  397  637:ldc1            #169 <Int 0x71159069>
	//  398  639:iastore         
	//  399  640:dup             
	//  400  641:bipush          83
	//  401  643:ldc1            #170 <Int 0x75d48dde>
	//  402  645:iastore         
	//  403  646:dup             
	//  404  647:bipush          84
	//  405  649:ldc1            #171 <Int 0x6b93dddb>
	//  406  651:iastore         
	//  407  652:dup             
	//  408  653:bipush          85
	//  409  655:ldc1            #172 <Int 0x6f52c06c>
	//  410  657:iastore         
	//  411  658:dup             
	//  412  659:bipush          86
	//  413  661:ldc1            #173 <Int 0x6211e6b5>
	//  414  663:iastore         
	//  415  664:dup             
	//  416  665:bipush          87
	//  417  667:ldc1            #174 <Int 0x66d0fb02>
	//  418  669:iastore         
	//  419  670:dup             
	//  420  671:bipush          88
	//  421  673:ldc1            #175 <Int 0x5e9f46bf>
	//  422  675:iastore         
	//  423  676:dup             
	//  424  677:bipush          89
	//  425  679:ldc1            #176 <Int 0x5a5e5b08>
	//  426  681:iastore         
	//  427  682:dup             
	//  428  683:bipush          90
	//  429  685:ldc1            #177 <Int 0x571d7dd1>
	//  430  687:iastore         
	//  431  688:dup             
	//  432  689:bipush          91
	//  433  691:ldc1            #178 <Int 0x53dc6066>
	//  434  693:iastore         
	//  435  694:dup             
	//  436  695:bipush          92
	//  437  697:ldc1            #179 <Int 0x4d9b3063>
	//  438  699:iastore         
	//  439  700:dup             
	//  440  701:bipush          93
	//  441  703:ldc1            #180 <Int 0x495a2dd4>
	//  442  705:iastore         
	//  443  706:dup             
	//  444  707:bipush          94
	//  445  709:ldc1            #181 <Int 0x44190b0d>
	//  446  711:iastore         
	//  447  712:dup             
	//  448  713:bipush          95
	//  449  715:ldc1            #182 <Int 0x40d816ba>
	//  450  717:iastore         
	//  451  718:dup             
	//  452  719:bipush          96
	//  453  721:ldc1            #183 <Int 0xaca5c697>
	//  454  723:iastore         
	//  455  724:dup             
	//  456  725:bipush          97
	//  457  727:ldc1            #184 <Int 0xa864db20>
	//  458  729:iastore         
	//  459  730:dup             
	//  460  731:bipush          98
	//  461  733:ldc1            #185 <Int 0xa527fdf9>
	//  462  735:iastore         
	//  463  736:dup             
	//  464  737:bipush          99
	//  465  739:ldc1            #186 <Int 0xa1e6e04e>
	//  466  741:iastore         
	//  467  742:dup             
	//  468  743:bipush          100
	//  469  745:ldc1            #187 <Int 0xbfa1b04b>
	//  470  747:iastore         
	//  471  748:dup             
	//  472  749:bipush          101
	//  473  751:ldc1            #188 <Int 0xbb60adfc>
	//  474  753:iastore         
	//  475  754:dup             
	//  476  755:bipush          102
	//  477  757:ldc1            #189 <Int 0xb6238b25>
	//  478  759:iastore         
	//  479  760:dup             
	//  480  761:bipush          103
	//  481  763:ldc1            #190 <Int 0xb2e29692>
	//  482  765:iastore         
	//  483  766:dup             
	//  484  767:bipush          104
	//  485  769:ldc1            #191 <Int 0x8aad2b2f>
	//  486  771:iastore         
	//  487  772:dup             
	//  488  773:bipush          105
	//  489  775:ldc1            #192 <Int 0x8e6c3698>
	//  490  777:iastore         
	//  491  778:dup             
	//  492  779:bipush          106
	//  493  781:ldc1            #193 <Int 0x832f1041>
	//  494  783:iastore         
	//  495  784:dup             
	//  496  785:bipush          107
	//  497  787:ldc1            #194 <Int 0x87ee0df6>
	//  498  789:iastore         
	//  499  790:dup             
	//  500  791:bipush          108
	//  501  793:ldc1            #195 <Int 0x99a95df3>
	//  502  795:iastore         
	//  503  796:dup             
	//  504  797:bipush          109
	//  505  799:ldc1            #196 <Int 0x9d684044>
	//  506  801:iastore         
	//  507  802:dup             
	//  508  803:bipush          110
	//  509  805:ldc1            #197 <Int 0x902b669d>
	//  510  807:iastore         
	//  511  808:dup             
	//  512  809:bipush          111
	//  513  811:ldc1            #198 <Int 0x94ea7b2a>
	//  514  813:iastore         
	//  515  814:dup             
	//  516  815:bipush          112
	//  517  817:ldc1            #199 <Int 0xe0b41de7>
	//  518  819:iastore         
	//  519  820:dup             
	//  520  821:bipush          113
	//  521  823:ldc1            #200 <Int 0xe4750050>
	//  522  825:iastore         
	//  523  826:dup             
	//  524  827:bipush          114
	//  525  829:ldc1            #201 <Int 0xe9362689>
	//  526  831:iastore         
	//  527  832:dup             
	//  528  833:bipush          115
	//  529  835:ldc1            #202 <Int 0xedf73b3e>
	//  530  837:iastore         
	//  531  838:dup             
	//  532  839:bipush          116
	//  533  841:ldc1            #203 <Int 0xf3b06b3b>
	//  534  843:iastore         
	//  535  844:dup             
	//  536  845:bipush          117
	//  537  847:ldc1            #204 <Int 0xf771768c>
	//  538  849:iastore         
	//  539  850:dup             
	//  540  851:bipush          118
	//  541  853:ldc1            #205 <Int 0xfa325055>
	//  542  855:iastore         
	//  543  856:dup             
	//  544  857:bipush          119
	//  545  859:ldc1            #206 <Int 0xfef34de2>
	//  546  861:iastore         
	//  547  862:dup             
	//  548  863:bipush          120
	//  549  865:ldc1            #207 <Int 0xc6bcf05f>
	//  550  867:iastore         
	//  551  868:dup             
	//  552  869:bipush          121
	//  553  871:ldc1            #208 <Int 0xc27dede8>
	//  554  873:iastore         
	//  555  874:dup             
	//  556  875:bipush          122
	//  557  877:ldc1            #209 <Int 0xcf3ecb31>
	//  558  879:iastore         
	//  559  880:dup             
	//  560  881:bipush          123
	//  561  883:ldc1            #210 <Int 0xcbffd686>
	//  562  885:iastore         
	//  563  886:dup             
	//  564  887:bipush          124
	//  565  889:ldc1            #211 <Int 0xd5b88683>
	//  566  891:iastore         
	//  567  892:dup             
	//  568  893:bipush          125
	//  569  895:ldc1            #212 <Int 0xd1799b34>
	//  570  897:iastore         
	//  571  898:dup             
	//  572  899:bipush          126
	//  573  901:ldc1            #213 <Int 0xdc3abded>
	//  574  903:iastore         
	//  575  904:dup             
	//  576  905:bipush          127
	//  577  907:ldc1            #214 <Int 0xd8fba05a>
	//  578  909:iastore         
	//  579  910:dup             
	//  580  911:sipush          128
	//  581  914:ldc1            #215 <Int 0x690ce0ee>
	//  582  916:iastore         
	//  583  917:dup             
	//  584  918:sipush          129
	//  585  921:ldc1            #216 <Int 0x6dcdfd59>
	//  586  923:iastore         
	//  587  924:dup             
	//  588  925:sipush          130
	//  589  928:ldc1            #217 <Int 0x608edb80>
	//  590  930:iastore         
	//  591  931:dup             
	//  592  932:sipush          131
	//  593  935:ldc1            #218 <Int 0x644fc637>
	//  594  937:iastore         
	//  595  938:dup             
	//  596  939:sipush          132
	//  597  942:ldc1            #219 <Int 0x7a089632>
	//  598  944:iastore         
	//  599  945:dup             
	//  600  946:sipush          133
	//  601  949:ldc1            #220 <Int 0x7ec98b85>
	//  602  951:iastore         
	//  603  952:dup             
	//  604  953:sipush          134
	//  605  956:ldc1            #221 <Int 0x738aad5c>
	//  606  958:iastore         
	//  607  959:dup             
	//  608  960:sipush          135
	//  609  963:ldc1            #222 <Int 0x774bb0eb>
	//  610  965:iastore         
	//  611  966:dup             
	//  612  967:sipush          136
	//  613  970:ldc1            #223 <Int 0x4f040d56>
	//  614  972:iastore         
	//  615  973:dup             
	//  616  974:sipush          137
	//  617  977:ldc1            #224 <Int 0x4bc510e1>
	//  618  979:iastore         
	//  619  980:dup             
	//  620  981:sipush          138
	//  621  984:ldc1            #225 <Int 0x46863638>
	//  622  986:iastore         
	//  623  987:dup             
	//  624  988:sipush          139
	//  625  991:ldc1            #226 <Int 0x42472b8f>
	//  626  993:iastore         
	//  627  994:dup             
	//  628  995:sipush          140
	//  629  998:ldc1            #227 <Int 0x5c007b8a>
	//  630 1000:iastore         
	//  631 1001:dup             
	//  632 1002:sipush          141
	//  633 1005:ldc1            #228 <Int 0x58c1663d>
	//  634 1007:iastore         
	//  635 1008:dup             
	//  636 1009:sipush          142
	//  637 1012:ldc1            #229 <Int 0x558240e4>
	//  638 1014:iastore         
	//  639 1015:dup             
	//  640 1016:sipush          143
	//  641 1019:ldc1            #230 <Int 0x51435d53>
	//  642 1021:iastore         
	//  643 1022:dup             
	//  644 1023:sipush          144
	//  645 1026:ldc1            #231 <Int 0x251d3b9e>
	//  646 1028:iastore         
	//  647 1029:dup             
	//  648 1030:sipush          145
	//  649 1033:ldc1            #232 <Int 0x21dc2629>
	//  650 1035:iastore         
	//  651 1036:dup             
	//  652 1037:sipush          146
	//  653 1040:ldc1            #233 <Int 0x2c9f00f0>
	//  654 1042:iastore         
	//  655 1043:dup             
	//  656 1044:sipush          147
	//  657 1047:ldc1            #234 <Int 0x285e1d47>
	//  658 1049:iastore         
	//  659 1050:dup             
	//  660 1051:sipush          148
	//  661 1054:ldc1            #235 <Int 0x36194d42>
	//  662 1056:iastore         
	//  663 1057:dup             
	//  664 1058:sipush          149
	//  665 1061:ldc1            #236 <Int 0x32d850f5>
	//  666 1063:iastore         
	//  667 1064:dup             
	//  668 1065:sipush          150
	//  669 1068:ldc1            #237 <Int 0x3f9b762c>
	//  670 1070:iastore         
	//  671 1071:dup             
	//  672 1072:sipush          151
	//  673 1075:ldc1            #238 <Int 0x3b5a6b9b>
	//  674 1077:iastore         
	//  675 1078:dup             
	//  676 1079:sipush          152
	//  677 1082:ldc1            #239 <Int 0x315d626>
	//  678 1084:iastore         
	//  679 1085:dup             
	//  680 1086:sipush          153
	//  681 1089:ldc1            #240 <Int 0x7d4cb91>
	//  682 1091:iastore         
	//  683 1092:dup             
	//  684 1093:sipush          154
	//  685 1096:ldc1            #241 <Int 0xa97ed48>
	//  686 1098:iastore         
	//  687 1099:dup             
	//  688 1100:sipush          155
	//  689 1103:ldc1            #242 <Int 0xe56f0ff>
	//  690 1105:iastore         
	//  691 1106:dup             
	//  692 1107:sipush          156
	//  693 1110:ldc1            #243 <Int 0x1011a0fa>
	//  694 1112:iastore         
	//  695 1113:dup             
	//  696 1114:sipush          157
	//  697 1117:ldc1            #244 <Int 0x14d0bd4d>
	//  698 1119:iastore         
	//  699 1120:dup             
	//  700 1121:sipush          158
	//  701 1124:ldc1            #245 <Int 0x19939b94>
	//  702 1126:iastore         
	//  703 1127:dup             
	//  704 1128:sipush          159
	//  705 1131:ldc1            #246 <Int 0x1d528623>
	//  706 1133:iastore         
	//  707 1134:dup             
	//  708 1135:sipush          160
	//  709 1138:ldc1            #247 <Int 0xf12f560e>
	//  710 1140:iastore         
	//  711 1141:dup             
	//  712 1142:sipush          161
	//  713 1145:ldc1            #248 <Int 0xf5ee4bb9>
	//  714 1147:iastore         
	//  715 1148:dup             
	//  716 1149:sipush          162
	//  717 1152:ldc1            #249 <Int 0xf8ad6d60>
	//  718 1154:iastore         
	//  719 1155:dup             
	//  720 1156:sipush          163
	//  721 1159:ldc1            #250 <Int 0xfc6c70d7>
	//  722 1161:iastore         
	//  723 1162:dup             
	//  724 1163:sipush          164
	//  725 1166:ldc1            #251 <Int 0xe22b20d2>
	//  726 1168:iastore         
	//  727 1169:dup             
	//  728 1170:sipush          165
	//  729 1173:ldc1            #252 <Int 0xe6ea3d65>
	//  730 1175:iastore         
	//  731 1176:dup             
	//  732 1177:sipush          166
	//  733 1180:ldc1            #253 <Int 0xeba91bbc>
	//  734 1182:iastore         
	//  735 1183:dup             
	//  736 1184:sipush          167
	//  737 1187:ldc1            #254 <Int 0xef68060b>
	//  738 1189:iastore         
	//  739 1190:dup             
	//  740 1191:sipush          168
	//  741 1194:ldc1            #255 <Int 0xd727bbb6>
	//  742 1196:iastore         
	//  743 1197:dup             
	//  744 1198:sipush          169
	//  745 1201:ldc2            #256 <Int 0xd3e6a601>
	//  746 1204:iastore         
	//  747 1205:dup             
	//  748 1206:sipush          170
	//  749 1209:ldc2            #257 <Int 0xdea580d8>
	//  750 1212:iastore         
	//  751 1213:dup             
	//  752 1214:sipush          171
	//  753 1217:ldc2            #258 <Int 0xda649d6f>
	//  754 1220:iastore         
	//  755 1221:dup             
	//  756 1222:sipush          172
	//  757 1225:ldc2            #259 <Int 0xc423cd6a>
	//  758 1228:iastore         
	//  759 1229:dup             
	//  760 1230:sipush          173
	//  761 1233:ldc2            #260 <Int 0xc0e2d0dd>
	//  762 1236:iastore         
	//  763 1237:dup             
	//  764 1238:sipush          174
	//  765 1241:ldc2            #261 <Int 0xcda1f604>
	//  766 1244:iastore         
	//  767 1245:dup             
	//  768 1246:sipush          175
	//  769 1249:ldc2            #262 <Int 0xc960ebb3>
	//  770 1252:iastore         
	//  771 1253:dup             
	//  772 1254:sipush          176
	//  773 1257:ldc2            #263 <Int 0xbd3e8d7e>
	//  774 1260:iastore         
	//  775 1261:dup             
	//  776 1262:sipush          177
	//  777 1265:ldc2            #264 <Int 0xb9ff90c9>
	//  778 1268:iastore         
	//  779 1269:dup             
	//  780 1270:sipush          178
	//  781 1273:ldc2            #265 <Int 0xb4bcb610>
	//  782 1276:iastore         
	//  783 1277:dup             
	//  784 1278:sipush          179
	//  785 1281:ldc2            #266 <Int 0xb07daba7>
	//  786 1284:iastore         
	//  787 1285:dup             
	//  788 1286:sipush          180
	//  789 1289:ldc2            #267 <Int 0xae3afba2>
	//  790 1292:iastore         
	//  791 1293:dup             
	//  792 1294:sipush          181
	//  793 1297:ldc2            #268 <Int 0xaafbe615>
	//  794 1300:iastore         
	//  795 1301:dup             
	//  796 1302:sipush          182
	//  797 1305:ldc2            #269 <Int 0xa7b8c0cc>
	//  798 1308:iastore         
	//  799 1309:dup             
	//  800 1310:sipush          183
	//  801 1313:ldc2            #270 <Int 0xa379dd7b>
	//  802 1316:iastore         
	//  803 1317:dup             
	//  804 1318:sipush          184
	//  805 1321:ldc2            #271 <Int 0x9b3660c6>
	//  806 1324:iastore         
	//  807 1325:dup             
	//  808 1326:sipush          185
	//  809 1329:ldc2            #272 <Int 0x9ff77d71>
	//  810 1332:iastore         
	//  811 1333:dup             
	//  812 1334:sipush          186
	//  813 1337:ldc2            #273 <Int 0x92b45ba8>
	//  814 1340:iastore         
	//  815 1341:dup             
	//  816 1342:sipush          187
	//  817 1345:ldc2            #274 <Int 0x9675461f>
	//  818 1348:iastore         
	//  819 1349:dup             
	//  820 1350:sipush          188
	//  821 1353:ldc2            #275 <Int 0x8832161a>
	//  822 1356:iastore         
	//  823 1357:dup             
	//  824 1358:sipush          189
	//  825 1361:ldc2            #276 <Int 0x8cf30bad>
	//  826 1364:iastore         
	//  827 1365:dup             
	//  828 1366:sipush          190
	//  829 1369:ldc2            #277 <Int 0x81b02d74>
	//  830 1372:iastore         
	//  831 1373:dup             
	//  832 1374:sipush          191
	//  833 1377:ldc2            #278 <Int 0x857130c3>
	//  834 1380:iastore         
	//  835 1381:dup             
	//  836 1382:sipush          192
	//  837 1385:ldc2            #279 <Int 0x5d8a9099>
	//  838 1388:iastore         
	//  839 1389:dup             
	//  840 1390:sipush          193
	//  841 1393:ldc2            #280 <Int 0x594b8d2e>
	//  842 1396:iastore         
	//  843 1397:dup             
	//  844 1398:sipush          194
	//  845 1401:ldc2            #281 <Int 0x5408abf7>
	//  846 1404:iastore         
	//  847 1405:dup             
	//  848 1406:sipush          195
	//  849 1409:ldc2            #282 <Int 0x50c9b640>
	//  850 1412:iastore         
	//  851 1413:dup             
	//  852 1414:sipush          196
	//  853 1417:ldc2            #283 <Int 0x4e8ee645>
	//  854 1420:iastore         
	//  855 1421:dup             
	//  856 1422:sipush          197
	//  857 1425:ldc2            #284 <Int 0x4a4ffbf2>
	//  858 1428:iastore         
	//  859 1429:dup             
	//  860 1430:sipush          198
	//  861 1433:ldc2            #285 <Int 0x470cdd2b>
	//  862 1436:iastore         
	//  863 1437:dup             
	//  864 1438:sipush          199
	//  865 1441:ldc2            #286 <Int 0x43cdc09c>
	//  866 1444:iastore         
	//  867 1445:dup             
	//  868 1446:sipush          200
	//  869 1449:ldc2            #287 <Int 0x7b827d21>
	//  870 1452:iastore         
	//  871 1453:dup             
	//  872 1454:sipush          201
	//  873 1457:ldc2            #288 <Int 0x7f436096>
	//  874 1460:iastore         
	//  875 1461:dup             
	//  876 1462:sipush          202
	//  877 1465:ldc2            #289 <Int 0x7200464f>
	//  878 1468:iastore         
	//  879 1469:dup             
	//  880 1470:sipush          203
	//  881 1473:ldc2            #290 <Int 0x76c15bf8>
	//  882 1476:iastore         
	//  883 1477:dup             
	//  884 1478:sipush          204
	//  885 1481:ldc2            #291 <Int 0x68860bfd>
	//  886 1484:iastore         
	//  887 1485:dup             
	//  888 1486:sipush          205
	//  889 1489:ldc2            #292 <Int 0x6c47164a>
	//  890 1492:iastore         
	//  891 1493:dup             
	//  892 1494:sipush          206
	//  893 1497:ldc2            #293 <Int 0x61043093>
	//  894 1500:iastore         
	//  895 1501:dup             
	//  896 1502:sipush          207
	//  897 1505:ldc2            #294 <Int 0x65c52d24>
	//  898 1508:iastore         
	//  899 1509:dup             
	//  900 1510:sipush          208
	//  901 1513:ldc2            #295 <Int 0x119b4be9>
	//  902 1516:iastore         
	//  903 1517:dup             
	//  904 1518:sipush          209
	//  905 1521:ldc2            #296 <Int 0x155a565e>
	//  906 1524:iastore         
	//  907 1525:dup             
	//  908 1526:sipush          210
	//  909 1529:ldc2            #297 <Int 0x18197087>
	//  910 1532:iastore         
	//  911 1533:dup             
	//  912 1534:sipush          211
	//  913 1537:ldc2            #298 <Int 0x1cd86d30>
	//  914 1540:iastore         
	//  915 1541:dup             
	//  916 1542:sipush          212
	//  917 1545:ldc2            #299 <Int 0x29f3d35>
	//  918 1548:iastore         
	//  919 1549:dup             
	//  920 1550:sipush          213
	//  921 1553:ldc2            #300 <Int 0x65e2082>
	//  922 1556:iastore         
	//  923 1557:dup             
	//  924 1558:sipush          214
	//  925 1561:ldc2            #301 <Int 0xb1d065b>
	//  926 1564:iastore         
	//  927 1565:dup             
	//  928 1566:sipush          215
	//  929 1569:ldc2            #302 <Int 0xfdc1bec>
	//  930 1572:iastore         
	//  931 1573:dup             
	//  932 1574:sipush          216
	//  933 1577:ldc2            #303 <Int 0x3793a651>
	//  934 1580:iastore         
	//  935 1581:dup             
	//  936 1582:sipush          217
	//  937 1585:ldc2            #304 <Int 0x3352bbe6>
	//  938 1588:iastore         
	//  939 1589:dup             
	//  940 1590:sipush          218
	//  941 1593:ldc2            #305 <Int 0x3e119d3f>
	//  942 1596:iastore         
	//  943 1597:dup             
	//  944 1598:sipush          219
	//  945 1601:ldc2            #306 <Int 0x3ad08088>
	//  946 1604:iastore         
	//  947 1605:dup             
	//  948 1606:sipush          220
	//  949 1609:ldc2            #307 <Int 0x2497d08d>
	//  950 1612:iastore         
	//  951 1613:dup             
	//  952 1614:sipush          221
	//  953 1617:ldc2            #308 <Int 0x2056cd3a>
	//  954 1620:iastore         
	//  955 1621:dup             
	//  956 1622:sipush          222
	//  957 1625:ldc2            #309 <Int 0x2d15ebe3>
	//  958 1628:iastore         
	//  959 1629:dup             
	//  960 1630:sipush          223
	//  961 1633:ldc2            #310 <Int 0x29d4f654>
	//  962 1636:iastore         
	//  963 1637:dup             
	//  964 1638:sipush          224
	//  965 1641:ldc2            #311 <Int 0xc5a92679>
	//  966 1644:iastore         
	//  967 1645:dup             
	//  968 1646:sipush          225
	//  969 1649:ldc2            #312 <Int 0xc1683bce>
	//  970 1652:iastore         
	//  971 1653:dup             
	//  972 1654:sipush          226
	//  973 1657:ldc2            #313 <Int 0xcc2b1d17>
	//  974 1660:iastore         
	//  975 1661:dup             
	//  976 1662:sipush          227
	//  977 1665:ldc2            #314 <Int 0xc8ea00a0>
	//  978 1668:iastore         
	//  979 1669:dup             
	//  980 1670:sipush          228
	//  981 1673:ldc2            #315 <Int 0xd6ad50a5>
	//  982 1676:iastore         
	//  983 1677:dup             
	//  984 1678:sipush          229
	//  985 1681:ldc2            #316 <Int 0xd26c4d12>
	//  986 1684:iastore         
	//  987 1685:dup             
	//  988 1686:sipush          230
	//  989 1689:ldc2            #317 <Int 0xdf2f6bcb>
	//  990 1692:iastore         
	//  991 1693:dup             
	//  992 1694:sipush          231
	//  993 1697:ldc2            #318 <Int 0xdbee767c>
	//  994 1700:iastore         
	//  995 1701:dup             
	//  996 1702:sipush          232
	//  997 1705:ldc2            #319 <Int 0xe3a1cbc1>
	//  998 1708:iastore         
	//  999 1709:dup             
	// 1000 1710:sipush          233
	// 1001 1713:ldc2            #320 <Int 0xe760d676>
	// 1002 1716:iastore         
	// 1003 1717:dup             
	// 1004 1718:sipush          234
	// 1005 1721:ldc2            #321 <Int 0xea23f0af>
	// 1006 1724:iastore         
	// 1007 1725:dup             
	// 1008 1726:sipush          235
	// 1009 1729:ldc2            #322 <Int 0xeee2ed18>
	// 1010 1732:iastore         
	// 1011 1733:dup             
	// 1012 1734:sipush          236
	// 1013 1737:ldc2            #323 <Int 0xf0a5bd1d>
	// 1014 1740:iastore         
	// 1015 1741:dup             
	// 1016 1742:sipush          237
	// 1017 1745:ldc2            #324 <Int 0xf464a0aa>
	// 1018 1748:iastore         
	// 1019 1749:dup             
	// 1020 1750:sipush          238
	// 1021 1753:ldc2            #325 <Int 0xf9278673>
	// 1022 1756:iastore         
	// 1023 1757:dup             
	// 1024 1758:sipush          239
	// 1025 1761:ldc2            #326 <Int 0xfde69bc4>
	// 1026 1764:iastore         
	// 1027 1765:dup             
	// 1028 1766:sipush          240
	// 1029 1769:ldc2            #327 <Int 0x89b8fd09>
	// 1030 1772:iastore         
	// 1031 1773:dup             
	// 1032 1774:sipush          241
	// 1033 1777:ldc2            #328 <Int 0x8d79e0be>
	// 1034 1780:iastore         
	// 1035 1781:dup             
	// 1036 1782:sipush          242
	// 1037 1785:ldc2            #329 <Int 0x803ac667>
	// 1038 1788:iastore         
	// 1039 1789:dup             
	// 1040 1790:sipush          243
	// 1041 1793:ldc2            #330 <Int 0x84fbdbd0>
	// 1042 1796:iastore         
	// 1043 1797:dup             
	// 1044 1798:sipush          244
	// 1045 1801:ldc2            #331 <Int 0x9abc8bd5>
	// 1046 1804:iastore         
	// 1047 1805:dup             
	// 1048 1806:sipush          245
	// 1049 1809:ldc2            #332 <Int 0x9e7d9662>
	// 1050 1812:iastore         
	// 1051 1813:dup             
	// 1052 1814:sipush          246
	// 1053 1817:ldc2            #333 <Int 0x933eb0bb>
	// 1054 1820:iastore         
	// 1055 1821:dup             
	// 1056 1822:sipush          247
	// 1057 1825:ldc2            #334 <Int 0x97ffad0c>
	// 1058 1828:iastore         
	// 1059 1829:dup             
	// 1060 1830:sipush          248
	// 1061 1833:ldc2            #335 <Int 0xafb010b1>
	// 1062 1836:iastore         
	// 1063 1837:dup             
	// 1064 1838:sipush          249
	// 1065 1841:ldc2            #336 <Int 0xab710d06>
	// 1066 1844:iastore         
	// 1067 1845:dup             
	// 1068 1846:sipush          250
	// 1069 1849:ldc2            #337 <Int 0xa6322bdf>
	// 1070 1852:iastore         
	// 1071 1853:dup             
	// 1072 1854:sipush          251
	// 1073 1857:ldc2            #338 <Int 0xa2f33668>
	// 1074 1860:iastore         
	// 1075 1861:dup             
	// 1076 1862:sipush          252
	// 1077 1865:ldc2            #339 <Int 0xbcb4666d>
	// 1078 1868:iastore         
	// 1079 1869:dup             
	// 1080 1870:sipush          253
	// 1081 1873:ldc2            #340 <Int 0xb8757bda>
	// 1082 1876:iastore         
	// 1083 1877:dup             
	// 1084 1878:sipush          254
	// 1085 1881:ldc2            #341 <Int 0xb5365d03>
	// 1086 1884:iastore         
	// 1087 1885:dup             
	// 1088 1886:sipush          255
	// 1089 1889:ldc2            #342 <Int 0xb1f740b4>
	// 1090 1892:iastore         
	// 1091 1893:putstatic       #344 <Field int[] CRC32_BYTES_MSBF>
	//*1092 1896:return          
	}
}
