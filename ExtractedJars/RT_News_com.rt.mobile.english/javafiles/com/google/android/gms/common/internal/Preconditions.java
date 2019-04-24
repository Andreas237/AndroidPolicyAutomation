// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.content.ContentValues;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.util.ThreadUtils;

public final class Preconditions
{

	private Preconditions()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
		throw new AssertionError("Uninstantiable");
	//    2    4:new             #10  <Class AssertionError>
	//    3    7:dup             
	//    4    8:ldc1            #12  <String "Uninstantiable">
	//    5   10:invokespecial   #15  <Method void AssertionError(Object)>
	//    6   13:athrow          
	}

	public static void checkArgument(boolean flag)
	{
		if(!flag)
	//*   0    0:iload_0         
	//*   1    1:ifne            12
			throw new IllegalArgumentException();
	//    2    4:new             #20  <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:invokespecial   #21  <Method void IllegalArgumentException()>
	//    5   11:athrow          
		else
			return;
	//    6   12:return          
	}

	public static void checkArgument(boolean flag, Object obj)
	{
		if(!flag)
	//*   0    0:iload_0         
	//*   1    1:ifne            16
			throw new IllegalArgumentException(String.valueOf(obj));
	//    2    4:new             #20  <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokestatic    #28  <Method String String.valueOf(Object)>
	//    6   12:invokespecial   #31  <Method void IllegalArgumentException(String)>
	//    7   15:athrow          
		else
			return;
	//    8   16:return          
	}

	public static transient void checkArgument(boolean flag, String s, Object aobj[])
	{
		if(!flag)
	//*   0    0:iload_0         
	//*   1    1:ifne            17
			throw new IllegalArgumentException(String.format(s, aobj));
	//    2    4:new             #20  <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokestatic    #36  <Method String String.format(String, Object[])>
	//    7   13:invokespecial   #31  <Method void IllegalArgumentException(String)>
	//    8   16:athrow          
		else
			return;
	//    9   17:return          
	}

	public static int checkElementIndex(int i, int j)
	{
		return checkElementIndex(i, j, "index");
	//    0    0:iload_0         
	//    1    1:iload_1         
	//    2    2:ldc1            #40  <String "index">
	//    3    4:invokestatic    #43  <Method int checkElementIndex(int, int, String)>
	//    4    7:ireturn         
	}

	public static int checkElementIndex(int i, int j, String s)
	{
		if(i >= 0 && i < j)
	//*   0    0:iload_0         
	//*   1    1:iflt            14
	//*   2    4:iload_0         
	//*   3    5:iload_1         
	//*   4    6:icmplt          12
	//*   5    9:goto            14
			return i;
	//    6   12:iload_0         
	//    7   13:ireturn         
		if(i < 0)
	//*   8   14:iload_0         
	//*   9   15:ifge            42
		{
			s = format("%s (%s) must not be negative", new Object[] {
				s, Integer.valueOf(i)
			});
	//   10   18:ldc1            #45  <String "%s (%s) must not be negative">
	//   11   20:iconst_2        
	//   12   21:anewarray       Object[]
	//   13   24:dup             
	//   14   25:iconst_0        
	//   15   26:aload_2         
	//   16   27:aastore         
	//   17   28:dup             
	//   18   29:iconst_1        
	//   19   30:iload_0         
	//   20   31:invokestatic    #50  <Method Integer Integer.valueOf(int)>
	//   21   34:aastore         
	//   22   35:invokestatic    #51  <Method String format(String, Object[])>
	//   23   38:astore_2        
		} else
	//*  24   39:goto            109
		{
			if(j < 0)
	//*  25   42:iload_1         
	//*  26   43:ifge            81
			{
				s = ((String) (new StringBuilder(26)));
	//   27   46:new             #53  <Class StringBuilder>
	//   28   49:dup             
	//   29   50:bipush          26
	//   30   52:invokespecial   #56  <Method void StringBuilder(int)>
	//   31   55:astore_2        
				((StringBuilder) (s)).append("negative size: ");
	//   32   56:aload_2         
	//   33   57:ldc1            #58  <String "negative size: ">
	//   34   59:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   35   62:pop             
				((StringBuilder) (s)).append(j);
	//   36   63:aload_2         
	//   37   64:iload_1         
	//   38   65:invokevirtual   #65  <Method StringBuilder StringBuilder.append(int)>
	//   39   68:pop             
				throw new IllegalArgumentException(((StringBuilder) (s)).toString());
	//   40   69:new             #20  <Class IllegalArgumentException>
	//   41   72:dup             
	//   42   73:aload_2         
	//   43   74:invokevirtual   #69  <Method String StringBuilder.toString()>
	//   44   77:invokespecial   #31  <Method void IllegalArgumentException(String)>
	//   45   80:athrow          
			}
			s = format("%s (%s) must be less than size (%s)", new Object[] {
				s, Integer.valueOf(i), Integer.valueOf(j)
			});
	//   46   81:ldc1            #71  <String "%s (%s) must be less than size (%s)">
	//   47   83:iconst_3        
	//   48   84:anewarray       Object[]
	//   49   87:dup             
	//   50   88:iconst_0        
	//   51   89:aload_2         
	//   52   90:aastore         
	//   53   91:dup             
	//   54   92:iconst_1        
	//   55   93:iload_0         
	//   56   94:invokestatic    #50  <Method Integer Integer.valueOf(int)>
	//   57   97:aastore         
	//   58   98:dup             
	//   59   99:iconst_2        
	//   60  100:iload_1         
	//   61  101:invokestatic    #50  <Method Integer Integer.valueOf(int)>
	//   62  104:aastore         
	//   63  105:invokestatic    #51  <Method String format(String, Object[])>
	//   64  108:astore_2        
		}
		throw new IndexOutOfBoundsException(s);
	//   65  109:new             #73  <Class IndexOutOfBoundsException>
	//   66  112:dup             
	//   67  113:aload_2         
	//   68  114:invokespecial   #74  <Method void IndexOutOfBoundsException(String)>
	//   69  117:athrow          
	}

	public static void checkHandlerThread(Handler handler)
	{
		if(Looper.myLooper() != handler.getLooper())
	//*   0    0:invokestatic    #82  <Method Looper Looper.myLooper()>
	//*   1    3:aload_0         
	//*   2    4:invokevirtual   #87  <Method Looper Handler.getLooper()>
	//*   3    7:if_acmpeq       20
			throw new IllegalStateException("Must be called on the handler thread");
	//    4   10:new             #89  <Class IllegalStateException>
	//    5   13:dup             
	//    6   14:ldc1            #91  <String "Must be called on the handler thread">
	//    7   16:invokespecial   #92  <Method void IllegalStateException(String)>
	//    8   19:athrow          
		else
			return;
	//    9   20:return          
	}

	public static void checkMainThread(String s)
	{
		if(!ThreadUtils.isMainThread())
	//*   0    0:invokestatic    #99  <Method boolean ThreadUtils.isMainThread()>
	//*   1    3:ifne            15
			throw new IllegalStateException(s);
	//    2    6:new             #89  <Class IllegalStateException>
	//    3    9:dup             
	//    4   10:aload_0         
	//    5   11:invokespecial   #92  <Method void IllegalStateException(String)>
	//    6   14:athrow          
		else
			return;
	//    7   15:return          
	}

	public static String checkNotEmpty(String s)
	{
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #107 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            17
			throw new IllegalArgumentException("Given String is empty or null");
	//    3    7:new             #20  <Class IllegalArgumentException>
	//    4   10:dup             
	//    5   11:ldc1            #109 <String "Given String is empty or null">
	//    6   13:invokespecial   #31  <Method void IllegalArgumentException(String)>
	//    7   16:athrow          
		else
			return s;
	//    8   17:aload_0         
	//    9   18:areturn         
	}

	public static String checkNotEmpty(String s, Object obj)
	{
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #107 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            19
			throw new IllegalArgumentException(String.valueOf(obj));
	//    3    7:new             #20  <Class IllegalArgumentException>
	//    4   10:dup             
	//    5   11:aload_1         
	//    6   12:invokestatic    #28  <Method String String.valueOf(Object)>
	//    7   15:invokespecial   #31  <Method void IllegalArgumentException(String)>
	//    8   18:athrow          
		else
			return s;
	//    9   19:aload_0         
	//   10   20:areturn         
	}

	public static void checkNotMainThread()
	{
		checkNotMainThread("Must not be called on the main application thread");
	//    0    0:ldc1            #113 <String "Must not be called on the main application thread">
	//    1    2:invokestatic    #115 <Method void checkNotMainThread(String)>
	//    2    5:return          
	}

	public static void checkNotMainThread(String s)
	{
		if(ThreadUtils.isMainThread())
	//*   0    0:invokestatic    #99  <Method boolean ThreadUtils.isMainThread()>
	//*   1    3:ifeq            15
			throw new IllegalStateException(s);
	//    2    6:new             #89  <Class IllegalStateException>
	//    3    9:dup             
	//    4   10:aload_0         
	//    5   11:invokespecial   #92  <Method void IllegalStateException(String)>
	//    6   14:athrow          
		else
			return;
	//    7   15:return          
	}

	public static Object checkNotNull(Object obj)
	{
		if(obj == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       14
			throw new NullPointerException("null reference");
	//    2    4:new             #121 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:ldc1            #123 <String "null reference">
	//    5   10:invokespecial   #124 <Method void NullPointerException(String)>
	//    6   13:athrow          
		else
			return obj;
	//    7   14:aload_0         
	//    8   15:areturn         
	}

	public static Object checkNotNull(Object obj, Object obj1)
	{
		if(obj == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       16
			throw new NullPointerException(String.valueOf(obj1));
	//    2    4:new             #121 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokestatic    #28  <Method String String.valueOf(Object)>
	//    6   12:invokespecial   #124 <Method void NullPointerException(String)>
	//    7   15:athrow          
		else
			return obj;
	//    8   16:aload_0         
	//    9   17:areturn         
	}

	public static void checkNotNullIfPresent(String s, ContentValues contentvalues)
	{
		if(contentvalues.containsKey(s) && contentvalues.get(s) == null)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:invokevirtual   #138 <Method boolean ContentValues.containsKey(String)>
	//*   3    5:ifeq            33
	//*   4    8:aload_1         
	//*   5    9:aload_0         
	//*   6   10:invokevirtual   #142 <Method Object ContentValues.get(String)>
	//*   7   13:ifnonnull       33
			throw new IllegalArgumentException(String.valueOf(((Object) (s))).concat(" cannot be set to null"));
	//    8   16:new             #20  <Class IllegalArgumentException>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:invokestatic    #28  <Method String String.valueOf(Object)>
	//   12   24:ldc1            #144 <String " cannot be set to null">
	//   13   26:invokevirtual   #147 <Method String String.concat(String)>
	//   14   29:invokespecial   #31  <Method void IllegalArgumentException(String)>
	//   15   32:athrow          
		else
			return;
	//   16   33:return          
	}

	public static int checkNotZero(int i)
	{
		if(i == 0)
	//*   0    0:iload_0         
	//*   1    1:ifne            14
			throw new IllegalArgumentException("Given Integer is zero");
	//    2    4:new             #20  <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #151 <String "Given Integer is zero">
	//    5   10:invokespecial   #31  <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		else
			return i;
	//    7   14:iload_0         
	//    8   15:ireturn         
	}

	public static int checkNotZero(int i, Object obj)
	{
		if(i == 0)
	//*   0    0:iload_0         
	//*   1    1:ifne            16
			throw new IllegalArgumentException(String.valueOf(obj));
	//    2    4:new             #20  <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokestatic    #28  <Method String String.valueOf(Object)>
	//    6   12:invokespecial   #31  <Method void IllegalArgumentException(String)>
	//    7   15:athrow          
		else
			return i;
	//    8   16:iload_0         
	//    9   17:ireturn         
	}

	public static long checkNotZero(long l)
	{
		if(l == 0L)
	//*   0    0:lload_0         
	//*   1    1:lconst_0        
	//*   2    2:lcmp            
	//*   3    3:ifne            16
			throw new IllegalArgumentException("Given Long is zero");
	//    4    6:new             #20  <Class IllegalArgumentException>
	//    5    9:dup             
	//    6   10:ldc1            #155 <String "Given Long is zero">
	//    7   12:invokespecial   #31  <Method void IllegalArgumentException(String)>
	//    8   15:athrow          
		else
			return l;
	//    9   16:lload_0         
	//   10   17:lreturn         
	}

	public static long checkNotZero(long l, Object obj)
	{
		if(l == 0L)
	//*   0    0:lload_0         
	//*   1    1:lconst_0        
	//*   2    2:lcmp            
	//*   3    3:ifne            18
			throw new IllegalArgumentException(String.valueOf(obj));
	//    4    6:new             #20  <Class IllegalArgumentException>
	//    5    9:dup             
	//    6   10:aload_2         
	//    7   11:invokestatic    #28  <Method String String.valueOf(Object)>
	//    8   14:invokespecial   #31  <Method void IllegalArgumentException(String)>
	//    9   17:athrow          
		else
			return l;
	//   10   18:lload_0         
	//   11   19:lreturn         
	}

	public static int checkPositionIndex(int i, int j)
	{
		return checkPositionIndex(i, j, "index");
	//    0    0:iload_0         
	//    1    1:iload_1         
	//    2    2:ldc1            #40  <String "index">
	//    3    4:invokestatic    #159 <Method int checkPositionIndex(int, int, String)>
	//    4    7:ireturn         
	}

	public static int checkPositionIndex(int i, int j, String s)
	{
		if(i >= 0 && i <= j)
	//*   0    0:iload_0         
	//*   1    1:iflt            14
	//*   2    4:iload_0         
	//*   3    5:iload_1         
	//*   4    6:icmple          12
	//*   5    9:goto            14
			return i;
	//    6   12:iload_0         
	//    7   13:ireturn         
		else
			throw new IndexOutOfBoundsException(zza(i, j, s));
	//    8   14:new             #73  <Class IndexOutOfBoundsException>
	//    9   17:dup             
	//   10   18:iload_0         
	//   11   19:iload_1         
	//   12   20:aload_2         
	//   13   21:invokestatic    #163 <Method String zza(int, int, String)>
	//   14   24:invokespecial   #74  <Method void IndexOutOfBoundsException(String)>
	//   15   27:athrow          
	}

	public static void checkPositionIndexes(int i, int j, int k)
	{
		if(i >= 0 && j >= i && j <= k)
	//*   0    0:iload_0         
	//*   1    1:iflt            18
	//*   2    4:iload_1         
	//*   3    5:iload_0         
	//*   4    6:icmplt          18
	//*   5    9:iload_1         
	//*   6   10:iload_2         
	//*   7   11:icmple          17
	//*   8   14:goto            18
			return;
	//    9   17:return          
		String s;
		if(i >= 0 && i <= k)
	//*  10   18:iload_0         
	//*  11   19:iflt            80
	//*  12   22:iload_0         
	//*  13   23:iload_2         
	//*  14   24:icmple          30
	//*  15   27:goto            80
		{
			if(j >= 0 && j <= k)
	//*  16   30:iload_1         
	//*  17   31:iflt            69
	//*  18   34:iload_1         
	//*  19   35:iload_2         
	//*  20   36:icmple          42
	//*  21   39:goto            69
				s = format("end index (%s) must not be less than start index (%s)", new Object[] {
					Integer.valueOf(j), Integer.valueOf(i)
				});
	//   22   42:ldc1            #167 <String "end index (%s) must not be less than start index (%s)">
	//   23   44:iconst_2        
	//   24   45:anewarray       Object[]
	//   25   48:dup             
	//   26   49:iconst_0        
	//   27   50:iload_1         
	//   28   51:invokestatic    #50  <Method Integer Integer.valueOf(int)>
	//   29   54:aastore         
	//   30   55:dup             
	//   31   56:iconst_1        
	//   32   57:iload_0         
	//   33   58:invokestatic    #50  <Method Integer Integer.valueOf(int)>
	//   34   61:aastore         
	//   35   62:invokestatic    #51  <Method String format(String, Object[])>
	//   36   65:astore_3        
			else
	//*  37   66:goto            88
				s = zza(j, k, "end index");
	//   38   69:iload_1         
	//   39   70:iload_2         
	//   40   71:ldc1            #169 <String "end index">
	//   41   73:invokestatic    #163 <Method String zza(int, int, String)>
	//   42   76:astore_3        
		} else
	//*  43   77:goto            88
		{
			s = zza(i, k, "start index");
	//   44   80:iload_0         
	//   45   81:iload_2         
	//   46   82:ldc1            #171 <String "start index">
	//   47   84:invokestatic    #163 <Method String zza(int, int, String)>
	//   48   87:astore_3        
		}
		throw new IndexOutOfBoundsException(s);
	//   49   88:new             #73  <Class IndexOutOfBoundsException>
	//   50   91:dup             
	//   51   92:aload_3         
	//   52   93:invokespecial   #74  <Method void IndexOutOfBoundsException(String)>
	//   53   96:athrow          
	}

	public static void checkState(boolean flag)
	{
		if(!flag)
	//*   0    0:iload_0         
	//*   1    1:ifne            12
			throw new IllegalStateException();
	//    2    4:new             #89  <Class IllegalStateException>
	//    3    7:dup             
	//    4    8:invokespecial   #173 <Method void IllegalStateException()>
	//    5   11:athrow          
		else
			return;
	//    6   12:return          
	}

	public static void checkState(boolean flag, Object obj)
	{
		if(!flag)
	//*   0    0:iload_0         
	//*   1    1:ifne            16
			throw new IllegalStateException(String.valueOf(obj));
	//    2    4:new             #89  <Class IllegalStateException>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokestatic    #28  <Method String String.valueOf(Object)>
	//    6   12:invokespecial   #92  <Method void IllegalStateException(String)>
	//    7   15:athrow          
		else
			return;
	//    8   16:return          
	}

	public static transient void checkState(boolean flag, String s, Object aobj[])
	{
		if(!flag)
	//*   0    0:iload_0         
	//*   1    1:ifne            17
			throw new IllegalStateException(String.format(s, aobj));
	//    2    4:new             #89  <Class IllegalStateException>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokestatic    #36  <Method String String.format(String, Object[])>
	//    7   13:invokespecial   #92  <Method void IllegalStateException(String)>
	//    8   16:athrow          
		else
			return;
	//    9   17:return          
	}

	public static String checkTag(String s)
	{
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #107 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            17
			throw new IllegalArgumentException("Tag must not be empty or null");
	//    3    7:new             #20  <Class IllegalArgumentException>
	//    4   10:dup             
	//    5   11:ldc1            #176 <String "Tag must not be empty or null">
	//    6   13:invokespecial   #31  <Method void IllegalArgumentException(String)>
	//    7   16:athrow          
		if(s.length() > 23)
	//*   8   17:aload_0         
	//*   9   18:invokevirtual   #180 <Method int String.length()>
	//*  10   21:bipush          23
	//*  11   23:icmple          36
			throw new IllegalArgumentException("Tag must not be greater than 23 chars.");
	//   12   26:new             #20  <Class IllegalArgumentException>
	//   13   29:dup             
	//   14   30:ldc1            #182 <String "Tag must not be greater than 23 chars.">
	//   15   32:invokespecial   #31  <Method void IllegalArgumentException(String)>
	//   16   35:athrow          
		else
			return s;
	//   17   36:aload_0         
	//   18   37:areturn         
	}

	private static transient String format(String s, Object aobj[])
	{
		int k = s.length();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #180 <Method int String.length()>
	//    2    4:istore_3        
		int i = 0;
	//    3    5:iconst_0        
	//    4    6:istore_2        
		StringBuilder stringbuilder = new StringBuilder(k + 16 * aobj.length);
	//    5    7:new             #53  <Class StringBuilder>
	//    6   10:dup             
	//    7   11:iload_3         
	//    8   12:bipush          16
	//    9   14:aload_1         
	//   10   15:arraylength     
	//   11   16:imul            
	//   12   17:iadd            
	//   13   18:invokespecial   #56  <Method void StringBuilder(int)>
	//   14   21:astore          5
		k = 0;
	//   15   23:iconst_0        
	//   16   24:istore_3        
		do
		{
			if(i >= aobj.length)
				break;
	//   17   25:iload_2         
	//   18   26:aload_1         
	//   19   27:arraylength     
	//   20   28:icmpge          80
			int i1 = s.indexOf("%s", k);
	//   21   31:aload_0         
	//   22   32:ldc1            #184 <String "%s">
	//   23   34:iload_3         
	//   24   35:invokevirtual   #188 <Method int String.indexOf(String, int)>
	//   25   38:istore          4
			if(i1 == -1)
				break;
	//   26   40:iload           4
	//   27   42:iconst_m1       
	//   28   43:icmpeq          80
			stringbuilder.append(s.substring(k, i1));
	//   29   46:aload           5
	//   30   48:aload_0         
	//   31   49:iload_3         
	//   32   50:iload           4
	//   33   52:invokevirtual   #192 <Method String String.substring(int, int)>
	//   34   55:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   35   58:pop             
			stringbuilder.append(aobj[i]);
	//   36   59:aload           5
	//   37   61:aload_1         
	//   38   62:iload_2         
	//   39   63:aaload          
	//   40   64:invokevirtual   #195 <Method StringBuilder StringBuilder.append(Object)>
	//   41   67:pop             
			i++;
	//   42   68:iload_2         
	//   43   69:iconst_1        
	//   44   70:iadd            
	//   45   71:istore_2        
			k = i1 + 2;
	//   46   72:iload           4
	//   47   74:iconst_2        
	//   48   75:iadd            
	//   49   76:istore_3        
		} while(true);
	//   50   77:goto            25
		stringbuilder.append(s.substring(k));
	//   51   80:aload           5
	//   52   82:aload_0         
	//   53   83:iload_3         
	//   54   84:invokevirtual   #198 <Method String String.substring(int)>
	//   55   87:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   56   90:pop             
		if(i < aobj.length)
	//*  57   91:iload_2         
	//*  58   92:aload_1         
	//*  59   93:arraylength     
	//*  60   94:icmpge          158
		{
			stringbuilder.append(" [");
	//   61   97:aload           5
	//   62   99:ldc1            #200 <String " [">
	//   63  101:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   64  104:pop             
			int l = i + 1;
	//   65  105:iload_2         
	//   66  106:iconst_1        
	//   67  107:iadd            
	//   68  108:istore_3        
			stringbuilder.append(aobj[i]);
	//   69  109:aload           5
	//   70  111:aload_1         
	//   71  112:iload_2         
	//   72  113:aaload          
	//   73  114:invokevirtual   #195 <Method StringBuilder StringBuilder.append(Object)>
	//   74  117:pop             
			for(int j = l; j < aobj.length; j++)
	//*  75  118:iload_3         
	//*  76  119:istore_2        
	//*  77  120:iload_2         
	//*  78  121:aload_1         
	//*  79  122:arraylength     
	//*  80  123:icmpge          150
			{
				stringbuilder.append(", ");
	//   81  126:aload           5
	//   82  128:ldc1            #202 <String ", ">
	//   83  130:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   84  133:pop             
				stringbuilder.append(aobj[j]);
	//   85  134:aload           5
	//   86  136:aload_1         
	//   87  137:iload_2         
	//   88  138:aaload          
	//   89  139:invokevirtual   #195 <Method StringBuilder StringBuilder.append(Object)>
	//   90  142:pop             
			}

	//   91  143:iload_2         
	//   92  144:iconst_1        
	//   93  145:iadd            
	//   94  146:istore_2        
	//*  95  147:goto            120
			stringbuilder.append("]");
	//   96  150:aload           5
	//   97  152:ldc1            #204 <String "]">
	//   98  154:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   99  157:pop             
		}
		return stringbuilder.toString();
	//  100  158:aload           5
	//  101  160:invokevirtual   #69  <Method String StringBuilder.toString()>
	//  102  163:areturn         
	}

	private static String zza(int i, int j, String s)
	{
		if(i < 0)
	//*   0    0:iload_0         
	//*   1    1:ifge            25
			return format("%s (%s) must not be negative", new Object[] {
				s, Integer.valueOf(i)
			});
	//    2    4:ldc1            #45  <String "%s (%s) must not be negative">
	//    3    6:iconst_2        
	//    4    7:anewarray       Object[]
	//    5   10:dup             
	//    6   11:iconst_0        
	//    7   12:aload_2         
	//    8   13:aastore         
	//    9   14:dup             
	//   10   15:iconst_1        
	//   11   16:iload_0         
	//   12   17:invokestatic    #50  <Method Integer Integer.valueOf(int)>
	//   13   20:aastore         
	//   14   21:invokestatic    #51  <Method String format(String, Object[])>
	//   15   24:areturn         
		if(j < 0)
	//*  16   25:iload_1         
	//*  17   26:ifge            64
		{
			s = ((String) (new StringBuilder(26)));
	//   18   29:new             #53  <Class StringBuilder>
	//   19   32:dup             
	//   20   33:bipush          26
	//   21   35:invokespecial   #56  <Method void StringBuilder(int)>
	//   22   38:astore_2        
			((StringBuilder) (s)).append("negative size: ");
	//   23   39:aload_2         
	//   24   40:ldc1            #58  <String "negative size: ">
	//   25   42:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   26   45:pop             
			((StringBuilder) (s)).append(j);
	//   27   46:aload_2         
	//   28   47:iload_1         
	//   29   48:invokevirtual   #65  <Method StringBuilder StringBuilder.append(int)>
	//   30   51:pop             
			throw new IllegalArgumentException(((StringBuilder) (s)).toString());
	//   31   52:new             #20  <Class IllegalArgumentException>
	//   32   55:dup             
	//   33   56:aload_2         
	//   34   57:invokevirtual   #69  <Method String StringBuilder.toString()>
	//   35   60:invokespecial   #31  <Method void IllegalArgumentException(String)>
	//   36   63:athrow          
		} else
		{
			return format("%s (%s) must not be greater than size (%s)", new Object[] {
				s, Integer.valueOf(i), Integer.valueOf(j)
			});
	//   37   64:ldc1            #206 <String "%s (%s) must not be greater than size (%s)">
	//   38   66:iconst_3        
	//   39   67:anewarray       Object[]
	//   40   70:dup             
	//   41   71:iconst_0        
	//   42   72:aload_2         
	//   43   73:aastore         
	//   44   74:dup             
	//   45   75:iconst_1        
	//   46   76:iload_0         
	//   47   77:invokestatic    #50  <Method Integer Integer.valueOf(int)>
	//   48   80:aastore         
	//   49   81:dup             
	//   50   82:iconst_2        
	//   51   83:iload_1         
	//   52   84:invokestatic    #50  <Method Integer Integer.valueOf(int)>
	//   53   87:aastore         
	//   54   88:invokestatic    #51  <Method String format(String, Object[])>
	//   55   91:areturn         
		}
	}
}
