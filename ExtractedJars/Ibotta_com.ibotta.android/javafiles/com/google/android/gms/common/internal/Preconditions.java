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
		if(flag)
	//*   0    0:iload_0         
	//*   1    1:ifeq            5
			return;
	//    2    4:return          
		else
			throw new IllegalArgumentException();
	//    3    5:new             #20  <Class IllegalArgumentException>
	//    4    8:dup             
	//    5    9:invokespecial   #21  <Method void IllegalArgumentException()>
	//    6   12:athrow          
	}

	public static void checkArgument(boolean flag, Object obj)
	{
		if(flag)
	//*   0    0:iload_0         
	//*   1    1:ifeq            5
			return;
	//    2    4:return          
		else
			throw new IllegalArgumentException(String.valueOf(obj));
	//    3    5:new             #20  <Class IllegalArgumentException>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokestatic    #28  <Method String String.valueOf(Object)>
	//    7   13:invokespecial   #31  <Method void IllegalArgumentException(String)>
	//    8   16:athrow          
	}

	public static transient void checkArgument(boolean flag, String s, Object aobj[])
	{
		if(flag)
	//*   0    0:iload_0         
	//*   1    1:ifeq            5
			return;
	//    2    4:return          
		else
			throw new IllegalArgumentException(String.format(s, aobj));
	//    3    5:new             #20  <Class IllegalArgumentException>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokestatic    #36  <Method String String.format(String, Object[])>
	//    8   14:invokespecial   #31  <Method void IllegalArgumentException(String)>
	//    9   17:athrow          
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
		if(i >= 0)
	//*   8   14:iload_0         
	//*   9   15:iflt            88
		{
			if(j < 0)
	//*  10   18:iload_1         
	//*  11   19:ifge            57
			{
				s = ((String) (new StringBuilder(26)));
	//   12   22:new             #45  <Class StringBuilder>
	//   13   25:dup             
	//   14   26:bipush          26
	//   15   28:invokespecial   #48  <Method void StringBuilder(int)>
	//   16   31:astore_2        
				((StringBuilder) (s)).append("negative size: ");
	//   17   32:aload_2         
	//   18   33:ldc1            #50  <String "negative size: ">
	//   19   35:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   20   38:pop             
				((StringBuilder) (s)).append(j);
	//   21   39:aload_2         
	//   22   40:iload_1         
	//   23   41:invokevirtual   #57  <Method StringBuilder StringBuilder.append(int)>
	//   24   44:pop             
				throw new IllegalArgumentException(((StringBuilder) (s)).toString());
	//   25   45:new             #20  <Class IllegalArgumentException>
	//   26   48:dup             
	//   27   49:aload_2         
	//   28   50:invokevirtual   #61  <Method String StringBuilder.toString()>
	//   29   53:invokespecial   #31  <Method void IllegalArgumentException(String)>
	//   30   56:athrow          
			}
			s = format("%s (%s) must be less than size (%s)", new Object[] {
				s, Integer.valueOf(i), Integer.valueOf(j)
			});
	//   31   57:ldc1            #63  <String "%s (%s) must be less than size (%s)">
	//   32   59:iconst_3        
	//   33   60:anewarray       Object[]
	//   34   63:dup             
	//   35   64:iconst_0        
	//   36   65:aload_2         
	//   37   66:aastore         
	//   38   67:dup             
	//   39   68:iconst_1        
	//   40   69:iload_0         
	//   41   70:invokestatic    #68  <Method Integer Integer.valueOf(int)>
	//   42   73:aastore         
	//   43   74:dup             
	//   44   75:iconst_2        
	//   45   76:iload_1         
	//   46   77:invokestatic    #68  <Method Integer Integer.valueOf(int)>
	//   47   80:aastore         
	//   48   81:invokestatic    #69  <Method String format(String, Object[])>
	//   49   84:astore_2        
		} else
	//*  50   85:goto            109
		{
			s = format("%s (%s) must not be negative", new Object[] {
				s, Integer.valueOf(i)
			});
	//   51   88:ldc1            #71  <String "%s (%s) must not be negative">
	//   52   90:iconst_2        
	//   53   91:anewarray       Object[]
	//   54   94:dup             
	//   55   95:iconst_0        
	//   56   96:aload_2         
	//   57   97:aastore         
	//   58   98:dup             
	//   59   99:iconst_1        
	//   60  100:iload_0         
	//   61  101:invokestatic    #68  <Method Integer Integer.valueOf(int)>
	//   62  104:aastore         
	//   63  105:invokestatic    #69  <Method String format(String, Object[])>
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
		if(Looper.myLooper() == handler.getLooper())
	//*   0    0:invokestatic    #82  <Method Looper Looper.myLooper()>
	//*   1    3:aload_0         
	//*   2    4:invokevirtual   #87  <Method Looper Handler.getLooper()>
	//*   3    7:if_acmpne       11
			return;
	//    4   10:return          
		else
			throw new IllegalStateException("Must be called on the handler thread");
	//    5   11:new             #89  <Class IllegalStateException>
	//    6   14:dup             
	//    7   15:ldc1            #91  <String "Must be called on the handler thread">
	//    8   17:invokespecial   #92  <Method void IllegalStateException(String)>
	//    9   20:athrow          
	}

	public static void checkMainThread(String s)
	{
		if(ThreadUtils.isMainThread())
	//*   0    0:invokestatic    #99  <Method boolean ThreadUtils.isMainThread()>
	//*   1    3:ifeq            7
			return;
	//    2    6:return          
		else
			throw new IllegalStateException(s);
	//    3    7:new             #89  <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:invokespecial   #92  <Method void IllegalStateException(String)>
	//    7   15:athrow          
	}

	public static String checkNotEmpty(String s)
	{
		if(!TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #107 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifne            9
			return s;
	//    3    7:aload_0         
	//    4    8:areturn         
		else
			throw new IllegalArgumentException("Given String is empty or null");
	//    5    9:new             #20  <Class IllegalArgumentException>
	//    6   12:dup             
	//    7   13:ldc1            #109 <String "Given String is empty or null">
	//    8   15:invokespecial   #31  <Method void IllegalArgumentException(String)>
	//    9   18:athrow          
	}

	public static String checkNotEmpty(String s, Object obj)
	{
		if(!TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #107 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifne            9
			return s;
	//    3    7:aload_0         
	//    4    8:areturn         
		else
			throw new IllegalArgumentException(String.valueOf(obj));
	//    5    9:new             #20  <Class IllegalArgumentException>
	//    6   12:dup             
	//    7   13:aload_1         
	//    8   14:invokestatic    #28  <Method String String.valueOf(Object)>
	//    9   17:invokespecial   #31  <Method void IllegalArgumentException(String)>
	//   10   20:athrow          
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
		if(!ThreadUtils.isMainThread())
	//*   0    0:invokestatic    #99  <Method boolean ThreadUtils.isMainThread()>
	//*   1    3:ifne            7
			return;
	//    2    6:return          
		else
			throw new IllegalStateException(s);
	//    3    7:new             #89  <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:invokespecial   #92  <Method void IllegalStateException(String)>
	//    7   15:athrow          
	}

	public static Object checkNotNull(Object obj)
	{
		if(obj != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          6
			return obj;
	//    2    4:aload_0         
	//    3    5:areturn         
		else
			throw new NullPointerException("null reference");
	//    4    6:new             #121 <Class NullPointerException>
	//    5    9:dup             
	//    6   10:ldc1            #123 <String "null reference">
	//    7   12:invokespecial   #124 <Method void NullPointerException(String)>
	//    8   15:athrow          
	}

	public static Object checkNotNull(Object obj, Object obj1)
	{
		if(obj != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          6
			return obj;
	//    2    4:aload_0         
	//    3    5:areturn         
		else
			throw new NullPointerException(String.valueOf(obj1));
	//    4    6:new             #121 <Class NullPointerException>
	//    5    9:dup             
	//    6   10:aload_1         
	//    7   11:invokestatic    #28  <Method String String.valueOf(Object)>
	//    8   14:invokespecial   #124 <Method void NullPointerException(String)>
	//    9   17:athrow          
	}

	public static void checkNotNullIfPresent(String s, ContentValues contentvalues)
	{
		if(contentvalues.containsKey(s))
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:invokevirtual   #138 <Method boolean ContentValues.containsKey(String)>
	//*   3    5:ifeq            34
		{
			if(contentvalues.get(s) != null)
	//*   4    8:aload_1         
	//*   5    9:aload_0         
	//*   6   10:invokevirtual   #142 <Method Object ContentValues.get(String)>
	//*   7   13:ifnull          17
				return;
	//    8   16:return          
			else
				throw new IllegalArgumentException(String.valueOf(((Object) (s))).concat(" cannot be set to null"));
	//    9   17:new             #20  <Class IllegalArgumentException>
	//   10   20:dup             
	//   11   21:aload_0         
	//   12   22:invokestatic    #28  <Method String String.valueOf(Object)>
	//   13   25:ldc1            #144 <String " cannot be set to null">
	//   14   27:invokevirtual   #147 <Method String String.concat(String)>
	//   15   30:invokespecial   #31  <Method void IllegalArgumentException(String)>
	//   16   33:athrow          
		} else
		{
			return;
	//   17   34:return          
		}
	}

	public static int checkNotZero(int i)
	{
		if(i != 0)
	//*   0    0:iload_0         
	//*   1    1:ifeq            6
			return i;
	//    2    4:iload_0         
	//    3    5:ireturn         
		else
			throw new IllegalArgumentException("Given Integer is zero");
	//    4    6:new             #20  <Class IllegalArgumentException>
	//    5    9:dup             
	//    6   10:ldc1            #151 <String "Given Integer is zero">
	//    7   12:invokespecial   #31  <Method void IllegalArgumentException(String)>
	//    8   15:athrow          
	}

	public static int checkNotZero(int i, Object obj)
	{
		if(i != 0)
	//*   0    0:iload_0         
	//*   1    1:ifeq            6
			return i;
	//    2    4:iload_0         
	//    3    5:ireturn         
		else
			throw new IllegalArgumentException(String.valueOf(obj));
	//    4    6:new             #20  <Class IllegalArgumentException>
	//    5    9:dup             
	//    6   10:aload_1         
	//    7   11:invokestatic    #28  <Method String String.valueOf(Object)>
	//    8   14:invokespecial   #31  <Method void IllegalArgumentException(String)>
	//    9   17:athrow          
	}

	public static long checkNotZero(long l)
	{
		if(l != 0L)
	//*   0    0:lload_0         
	//*   1    1:lconst_0        
	//*   2    2:lcmp            
	//*   3    3:ifeq            8
			return l;
	//    4    6:lload_0         
	//    5    7:lreturn         
		else
			throw new IllegalArgumentException("Given Long is zero");
	//    6    8:new             #20  <Class IllegalArgumentException>
	//    7   11:dup             
	//    8   12:ldc1            #155 <String "Given Long is zero">
	//    9   14:invokespecial   #31  <Method void IllegalArgumentException(String)>
	//   10   17:athrow          
	}

	public static long checkNotZero(long l, Object obj)
	{
		if(l != 0L)
	//*   0    0:lload_0         
	//*   1    1:lconst_0        
	//*   2    2:lcmp            
	//*   3    3:ifeq            8
			return l;
	//    4    6:lload_0         
	//    5    7:lreturn         
		else
			throw new IllegalArgumentException(String.valueOf(obj));
	//    6    8:new             #20  <Class IllegalArgumentException>
	//    7   11:dup             
	//    8   12:aload_2         
	//    9   13:invokestatic    #28  <Method String String.valueOf(Object)>
	//   10   16:invokespecial   #31  <Method void IllegalArgumentException(String)>
	//   11   19:athrow          
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
	//*   1    1:iflt            11
	//*   2    4:iload_0         
	//*   3    5:iload_1         
	//*   4    6:icmpgt          11
			return i;
	//    5    9:iload_0         
	//    6   10:ireturn         
		else
			throw new IndexOutOfBoundsException(zza(i, j, s));
	//    7   11:new             #73  <Class IndexOutOfBoundsException>
	//    8   14:dup             
	//    9   15:iload_0         
	//   10   16:iload_1         
	//   11   17:aload_2         
	//   12   18:invokestatic    #163 <Method String zza(int, int, String)>
	//   13   21:invokespecial   #74  <Method void IndexOutOfBoundsException(String)>
	//   14   24:athrow          
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
	//*  11   19:iflt            77
	//*  12   22:iload_0         
	//*  13   23:iload_2         
	//*  14   24:icmpgt          77
		{
			if(j >= 0 && j <= k)
	//*  15   27:iload_1         
	//*  16   28:iflt            66
	//*  17   31:iload_1         
	//*  18   32:iload_2         
	//*  19   33:icmple          39
	//*  20   36:goto            66
				s = format("end index (%s) must not be less than start index (%s)", new Object[] {
					Integer.valueOf(j), Integer.valueOf(i)
				});
	//   21   39:ldc1            #167 <String "end index (%s) must not be less than start index (%s)">
	//   22   41:iconst_2        
	//   23   42:anewarray       Object[]
	//   24   45:dup             
	//   25   46:iconst_0        
	//   26   47:iload_1         
	//   27   48:invokestatic    #68  <Method Integer Integer.valueOf(int)>
	//   28   51:aastore         
	//   29   52:dup             
	//   30   53:iconst_1        
	//   31   54:iload_0         
	//   32   55:invokestatic    #68  <Method Integer Integer.valueOf(int)>
	//   33   58:aastore         
	//   34   59:invokestatic    #69  <Method String format(String, Object[])>
	//   35   62:astore_3        
			else
	//*  36   63:goto            85
				s = zza(j, k, "end index");
	//   37   66:iload_1         
	//   38   67:iload_2         
	//   39   68:ldc1            #169 <String "end index">
	//   40   70:invokestatic    #163 <Method String zza(int, int, String)>
	//   41   73:astore_3        
		} else
	//*  42   74:goto            85
		{
			s = zza(i, k, "start index");
	//   43   77:iload_0         
	//   44   78:iload_2         
	//   45   79:ldc1            #171 <String "start index">
	//   46   81:invokestatic    #163 <Method String zza(int, int, String)>
	//   47   84:astore_3        
		}
		throw new IndexOutOfBoundsException(s);
	//   48   85:new             #73  <Class IndexOutOfBoundsException>
	//   49   88:dup             
	//   50   89:aload_3         
	//   51   90:invokespecial   #74  <Method void IndexOutOfBoundsException(String)>
	//   52   93:athrow          
	}

	public static void checkState(boolean flag)
	{
		if(flag)
	//*   0    0:iload_0         
	//*   1    1:ifeq            5
			return;
	//    2    4:return          
		else
			throw new IllegalStateException();
	//    3    5:new             #89  <Class IllegalStateException>
	//    4    8:dup             
	//    5    9:invokespecial   #173 <Method void IllegalStateException()>
	//    6   12:athrow          
	}

	public static void checkState(boolean flag, Object obj)
	{
		if(flag)
	//*   0    0:iload_0         
	//*   1    1:ifeq            5
			return;
	//    2    4:return          
		else
			throw new IllegalStateException(String.valueOf(obj));
	//    3    5:new             #89  <Class IllegalStateException>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokestatic    #28  <Method String String.valueOf(Object)>
	//    7   13:invokespecial   #92  <Method void IllegalStateException(String)>
	//    8   16:athrow          
	}

	public static transient void checkState(boolean flag, String s, Object aobj[])
	{
		if(flag)
	//*   0    0:iload_0         
	//*   1    1:ifeq            5
			return;
	//    2    4:return          
		else
			throw new IllegalStateException(String.format(s, aobj));
	//    3    5:new             #89  <Class IllegalStateException>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokestatic    #36  <Method String String.format(String, Object[])>
	//    8   14:invokespecial   #92  <Method void IllegalStateException(String)>
	//    9   17:athrow          
	}

	public static String checkTag(String s)
	{
		if(!TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #107 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifne            28
		{
			if(s.length() <= 23)
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #178 <Method int String.length()>
	//*   5   11:bipush          23
	//*   6   13:icmpgt          18
				return s;
	//    7   16:aload_0         
	//    8   17:areturn         
			else
				throw new IllegalArgumentException("Tag must not be greater than 23 chars.");
	//    9   18:new             #20  <Class IllegalArgumentException>
	//   10   21:dup             
	//   11   22:ldc1            #180 <String "Tag must not be greater than 23 chars.">
	//   12   24:invokespecial   #31  <Method void IllegalArgumentException(String)>
	//   13   27:athrow          
		} else
		{
			throw new IllegalArgumentException("Tag must not be empty or null");
	//   14   28:new             #20  <Class IllegalArgumentException>
	//   15   31:dup             
	//   16   32:ldc1            #182 <String "Tag must not be empty or null">
	//   17   34:invokespecial   #31  <Method void IllegalArgumentException(String)>
	//   18   37:athrow          
		}
	}

	private static transient String format(String s, Object aobj[])
	{
		StringBuilder stringbuilder = new StringBuilder(s.length() + aobj.length * 16);
	//    0    0:new             #45  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #178 <Method int String.length()>
	//    4    8:aload_1         
	//    5    9:arraylength     
	//    6   10:bipush          16
	//    7   12:imul            
	//    8   13:iadd            
	//    9   14:invokespecial   #48  <Method void StringBuilder(int)>
	//   10   17:astore          5
		int i = 0;
	//   11   19:iconst_0        
	//   12   20:istore_2        
		int k = 0;
	//   13   21:iconst_0        
	//   14   22:istore_3        
		do
		{
			if(i >= aobj.length)
				break;
	//   15   23:iload_2         
	//   16   24:aload_1         
	//   17   25:arraylength     
	//   18   26:icmpge          78
			int i1 = s.indexOf("%s", k);
	//   19   29:aload_0         
	//   20   30:ldc1            #184 <String "%s">
	//   21   32:iload_3         
	//   22   33:invokevirtual   #188 <Method int String.indexOf(String, int)>
	//   23   36:istore          4
			if(i1 == -1)
				break;
	//   24   38:iload           4
	//   25   40:iconst_m1       
	//   26   41:icmpeq          78
			stringbuilder.append(s.substring(k, i1));
	//   27   44:aload           5
	//   28   46:aload_0         
	//   29   47:iload_3         
	//   30   48:iload           4
	//   31   50:invokevirtual   #192 <Method String String.substring(int, int)>
	//   32   53:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   33   56:pop             
			stringbuilder.append(aobj[i]);
	//   34   57:aload           5
	//   35   59:aload_1         
	//   36   60:iload_2         
	//   37   61:aaload          
	//   38   62:invokevirtual   #195 <Method StringBuilder StringBuilder.append(Object)>
	//   39   65:pop             
			k = i1 + 2;
	//   40   66:iload           4
	//   41   68:iconst_2        
	//   42   69:iadd            
	//   43   70:istore_3        
			i++;
	//   44   71:iload_2         
	//   45   72:iconst_1        
	//   46   73:iadd            
	//   47   74:istore_2        
		} while(true);
	//   48   75:goto            23
		stringbuilder.append(s.substring(k));
	//   49   78:aload           5
	//   50   80:aload_0         
	//   51   81:iload_3         
	//   52   82:invokevirtual   #198 <Method String String.substring(int)>
	//   53   85:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   54   88:pop             
		if(i < aobj.length)
	//*  55   89:iload_2         
	//*  56   90:aload_1         
	//*  57   91:arraylength     
	//*  58   92:icmpge          156
		{
			stringbuilder.append(" [");
	//   59   95:aload           5
	//   60   97:ldc1            #200 <String " [">
	//   61   99:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   62  102:pop             
			int l = i + 1;
	//   63  103:iload_2         
	//   64  104:iconst_1        
	//   65  105:iadd            
	//   66  106:istore_3        
			stringbuilder.append(aobj[i]);
	//   67  107:aload           5
	//   68  109:aload_1         
	//   69  110:iload_2         
	//   70  111:aaload          
	//   71  112:invokevirtual   #195 <Method StringBuilder StringBuilder.append(Object)>
	//   72  115:pop             
			for(int j = l; j < aobj.length; j++)
	//*  73  116:iload_3         
	//*  74  117:istore_2        
	//*  75  118:iload_2         
	//*  76  119:aload_1         
	//*  77  120:arraylength     
	//*  78  121:icmpge          148
			{
				stringbuilder.append(", ");
	//   79  124:aload           5
	//   80  126:ldc1            #202 <String ", ">
	//   81  128:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   82  131:pop             
				stringbuilder.append(aobj[j]);
	//   83  132:aload           5
	//   84  134:aload_1         
	//   85  135:iload_2         
	//   86  136:aaload          
	//   87  137:invokevirtual   #195 <Method StringBuilder StringBuilder.append(Object)>
	//   88  140:pop             
			}

	//   89  141:iload_2         
	//   90  142:iconst_1        
	//   91  143:iadd            
	//   92  144:istore_2        
	//*  93  145:goto            118
			stringbuilder.append("]");
	//   94  148:aload           5
	//   95  150:ldc1            #204 <String "]">
	//   96  152:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   97  155:pop             
		}
		return stringbuilder.toString();
	//   98  156:aload           5
	//   99  158:invokevirtual   #61  <Method String StringBuilder.toString()>
	//  100  161:areturn         
	}

	private static String zza(int i, int j, String s)
	{
		if(i < 0)
	//*   0    0:iload_0         
	//*   1    1:ifge            25
			return format("%s (%s) must not be negative", new Object[] {
				s, Integer.valueOf(i)
			});
	//    2    4:ldc1            #71  <String "%s (%s) must not be negative">
	//    3    6:iconst_2        
	//    4    7:anewarray       Object[]
	//    5   10:dup             
	//    6   11:iconst_0        
	//    7   12:aload_2         
	//    8   13:aastore         
	//    9   14:dup             
	//   10   15:iconst_1        
	//   11   16:iload_0         
	//   12   17:invokestatic    #68  <Method Integer Integer.valueOf(int)>
	//   13   20:aastore         
	//   14   21:invokestatic    #69  <Method String format(String, Object[])>
	//   15   24:areturn         
		if(j >= 0)
	//*  16   25:iload_1         
	//*  17   26:iflt            57
		{
			return format("%s (%s) must not be greater than size (%s)", new Object[] {
				s, Integer.valueOf(i), Integer.valueOf(j)
			});
	//   18   29:ldc1            #206 <String "%s (%s) must not be greater than size (%s)">
	//   19   31:iconst_3        
	//   20   32:anewarray       Object[]
	//   21   35:dup             
	//   22   36:iconst_0        
	//   23   37:aload_2         
	//   24   38:aastore         
	//   25   39:dup             
	//   26   40:iconst_1        
	//   27   41:iload_0         
	//   28   42:invokestatic    #68  <Method Integer Integer.valueOf(int)>
	//   29   45:aastore         
	//   30   46:dup             
	//   31   47:iconst_2        
	//   32   48:iload_1         
	//   33   49:invokestatic    #68  <Method Integer Integer.valueOf(int)>
	//   34   52:aastore         
	//   35   53:invokestatic    #69  <Method String format(String, Object[])>
	//   36   56:areturn         
		} else
		{
			s = ((String) (new StringBuilder(26)));
	//   37   57:new             #45  <Class StringBuilder>
	//   38   60:dup             
	//   39   61:bipush          26
	//   40   63:invokespecial   #48  <Method void StringBuilder(int)>
	//   41   66:astore_2        
			((StringBuilder) (s)).append("negative size: ");
	//   42   67:aload_2         
	//   43   68:ldc1            #50  <String "negative size: ">
	//   44   70:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   45   73:pop             
			((StringBuilder) (s)).append(j);
	//   46   74:aload_2         
	//   47   75:iload_1         
	//   48   76:invokevirtual   #57  <Method StringBuilder StringBuilder.append(int)>
	//   49   79:pop             
			throw new IllegalArgumentException(((StringBuilder) (s)).toString());
	//   50   80:new             #20  <Class IllegalArgumentException>
	//   51   83:dup             
	//   52   84:aload_2         
	//   53   85:invokevirtual   #61  <Method String StringBuilder.toString()>
	//   54   88:invokespecial   #31  <Method void IllegalArgumentException(String)>
	//   55   91:athrow          
		}
	}
}
