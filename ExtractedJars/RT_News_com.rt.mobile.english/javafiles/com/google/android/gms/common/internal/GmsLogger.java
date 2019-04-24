// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.util.Log;

// Referenced classes of package com.google.android.gms.common.internal:
//			Preconditions

public final class GmsLogger
{

	public GmsLogger(String s)
	{
		this(s, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #21  <Method void GmsLogger(String, String)>
	//    4    6:return          
	}

	public GmsLogger(String s, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		Preconditions.checkNotNull(((Object) (s)), "log tag cannot be null");
	//    2    4:aload_1         
	//    3    5:ldc1            #25  <String "log tag cannot be null">
	//    4    7:invokestatic    #31  <Method Object Preconditions.checkNotNull(Object, Object)>
	//    5   10:pop             
		boolean flag;
		if(s.length() <= 23)
	//*   6   11:aload_1         
	//*   7   12:invokevirtual   #37  <Method int String.length()>
	//*   8   15:bipush          23
	//*   9   17:icmpgt          25
			flag = true;
	//   10   20:iconst_1        
	//   11   21:istore_3        
		else
	//*  12   22:goto            27
			flag = false;
	//   13   25:iconst_0        
	//   14   26:istore_3        
		Preconditions.checkArgument(flag, "tag \"%s\" is longer than the %d character maximum", new Object[] {
			s, Integer.valueOf(23)
		});
	//   15   27:iload_3         
	//   16   28:ldc1            #39  <String "tag \"%s\" is longer than the %d character maximum">
	//   17   30:iconst_2        
	//   18   31:anewarray       Object[]
	//   19   34:dup             
	//   20   35:iconst_0        
	//   21   36:aload_1         
	//   22   37:aastore         
	//   23   38:dup             
	//   24   39:iconst_1        
	//   25   40:bipush          23
	//   26   42:invokestatic    #45  <Method Integer Integer.valueOf(int)>
	//   27   45:aastore         
	//   28   46:invokestatic    #49  <Method void Preconditions.checkArgument(boolean, String, Object[])>
		zzuc = s;
	//   29   49:aload_0         
	//   30   50:aload_1         
	//   31   51:putfield        #51  <Field String zzuc>
		if(s1 != null && s1.length() > 0)
	//*  32   54:aload_2         
	//*  33   55:ifnull          74
	//*  34   58:aload_2         
	//*  35   59:invokevirtual   #37  <Method int String.length()>
	//*  36   62:ifgt            68
	//*  37   65:goto            74
		{
			zzud = s1;
	//   38   68:aload_0         
	//   39   69:aload_2         
	//   40   70:putfield        #53  <Field String zzud>
			return;
	//   41   73:return          
		} else
		{
			zzud = null;
	//   42   74:aload_0         
	//   43   75:aconst_null     
	//   44   76:putfield        #53  <Field String zzud>
			return;
	//   45   79:return          
		}
	}

	public static boolean isBuildPiiEnabled()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	private final transient String zza(String s, Object aobj[])
	{
		s = String.format(s, aobj);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #60  <Method String String.format(String, Object[])>
	//    3    5:astore_1        
		if(zzud == null)
	//*   4    6:aload_0         
	//*   5    7:getfield        #53  <Field String zzud>
	//*   6   10:ifnonnull       15
			return s;
	//    7   13:aload_1         
	//    8   14:areturn         
		else
			return zzud.concat(s);
	//    9   15:aload_0         
	//   10   16:getfield        #53  <Field String zzud>
	//   11   19:aload_1         
	//   12   20:invokevirtual   #64  <Method String String.concat(String)>
	//   13   23:areturn         
	}

	private final String zzl(String s)
	{
		if(zzud == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #53  <Field String zzud>
	//*   2    4:ifnonnull       9
			return s;
	//    3    7:aload_1         
	//    4    8:areturn         
		else
			return zzud.concat(s);
	//    5    9:aload_0         
	//    6   10:getfield        #53  <Field String zzud>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #64  <Method String String.concat(String)>
	//    9   17:areturn         
	}

	public final boolean canLog(int j)
	{
		return Log.isLoggable(zzuc, j);
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field String zzuc>
	//    2    4:iload_1         
	//    3    5:invokestatic    #73  <Method boolean Log.isLoggable(String, int)>
	//    4    8:ireturn         
	}

	public final boolean canLogPii()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public final void d(String s, String s1)
	{
		if(canLog(3))
	//*   0    0:aload_0         
	//*   1    1:iconst_3        
	//*   2    2:invokevirtual   #77  <Method boolean canLog(int)>
	//*   3    5:ifeq            18
			Log.d(s, zzl(s1));
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:invokespecial   #79  <Method String zzl(String)>
	//    8   14:invokestatic    #82  <Method int Log.d(String, String)>
	//    9   17:pop             
	//   10   18:return          
	}

	public final void d(String s, String s1, Throwable throwable)
	{
		if(canLog(3))
	//*   0    0:aload_0         
	//*   1    1:iconst_3        
	//*   2    2:invokevirtual   #77  <Method boolean canLog(int)>
	//*   3    5:ifeq            19
			Log.d(s, zzl(s1), throwable);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:invokespecial   #79  <Method String zzl(String)>
	//    8   14:aload_3         
	//    9   15:invokestatic    #86  <Method int Log.d(String, String, Throwable)>
	//   10   18:pop             
	//   11   19:return          
	}

	public final transient void dfmt(String s, String s1, Object aobj[])
	{
		if(canLog(3))
	//*   0    0:aload_0         
	//*   1    1:iconst_3        
	//*   2    2:invokevirtual   #77  <Method boolean canLog(int)>
	//*   3    5:ifeq            19
			Log.d(s, zza(s1, aobj));
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:aload_3         
	//    8   12:invokespecial   #90  <Method String zza(String, Object[])>
	//    9   15:invokestatic    #82  <Method int Log.d(String, String)>
	//   10   18:pop             
	//   11   19:return          
	}

	public final void e(String s, String s1)
	{
		if(canLog(6))
	//*   0    0:aload_0         
	//*   1    1:bipush          6
	//*   2    3:invokevirtual   #77  <Method boolean canLog(int)>
	//*   3    6:ifeq            19
			Log.e(s, zzl(s1));
	//    4    9:aload_1         
	//    5   10:aload_0         
	//    6   11:aload_2         
	//    7   12:invokespecial   #79  <Method String zzl(String)>
	//    8   15:invokestatic    #93  <Method int Log.e(String, String)>
	//    9   18:pop             
	//   10   19:return          
	}

	public final void e(String s, String s1, Throwable throwable)
	{
		if(canLog(6))
	//*   0    0:aload_0         
	//*   1    1:bipush          6
	//*   2    3:invokevirtual   #77  <Method boolean canLog(int)>
	//*   3    6:ifeq            20
			Log.e(s, zzl(s1), throwable);
	//    4    9:aload_1         
	//    5   10:aload_0         
	//    6   11:aload_2         
	//    7   12:invokespecial   #79  <Method String zzl(String)>
	//    8   15:aload_3         
	//    9   16:invokestatic    #95  <Method int Log.e(String, String, Throwable)>
	//   10   19:pop             
	//   11   20:return          
	}

	public final transient void efmt(String s, String s1, Object aobj[])
	{
		if(canLog(6))
	//*   0    0:aload_0         
	//*   1    1:bipush          6
	//*   2    3:invokevirtual   #77  <Method boolean canLog(int)>
	//*   3    6:ifeq            20
			Log.e(s, zza(s1, aobj));
	//    4    9:aload_1         
	//    5   10:aload_0         
	//    6   11:aload_2         
	//    7   12:aload_3         
	//    8   13:invokespecial   #90  <Method String zza(String, Object[])>
	//    9   16:invokestatic    #93  <Method int Log.e(String, String)>
	//   10   19:pop             
	//   11   20:return          
	}

	public final String getTag()
	{
		return zzuc;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field String zzuc>
	//    2    4:areturn         
	}

	public final void i(String s, String s1)
	{
		if(canLog(4))
	//*   0    0:aload_0         
	//*   1    1:iconst_4        
	//*   2    2:invokevirtual   #77  <Method boolean canLog(int)>
	//*   3    5:ifeq            18
			Log.i(s, zzl(s1));
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:invokespecial   #79  <Method String zzl(String)>
	//    8   14:invokestatic    #101 <Method int Log.i(String, String)>
	//    9   17:pop             
	//   10   18:return          
	}

	public final void i(String s, String s1, Throwable throwable)
	{
		if(canLog(4))
	//*   0    0:aload_0         
	//*   1    1:iconst_4        
	//*   2    2:invokevirtual   #77  <Method boolean canLog(int)>
	//*   3    5:ifeq            19
			Log.i(s, zzl(s1), throwable);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:invokespecial   #79  <Method String zzl(String)>
	//    8   14:aload_3         
	//    9   15:invokestatic    #103 <Method int Log.i(String, String, Throwable)>
	//   10   18:pop             
	//   11   19:return          
	}

	public final transient void ifmt(String s, String s1, Object aobj[])
	{
		if(canLog(4))
	//*   0    0:aload_0         
	//*   1    1:iconst_4        
	//*   2    2:invokevirtual   #77  <Method boolean canLog(int)>
	//*   3    5:ifeq            19
			Log.i(s, zza(s1, aobj));
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:aload_3         
	//    8   12:invokespecial   #90  <Method String zza(String, Object[])>
	//    9   15:invokestatic    #101 <Method int Log.i(String, String)>
	//   10   18:pop             
	//   11   19:return          
	}

	public final void pii(String s, String s1)
	{
		if(canLogPii())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #107 <Method boolean canLogPii()>
	//*   2    4:ifeq            53
		{
			s = String.valueOf(((Object) (s)));
	//    3    7:aload_1         
	//    4    8:invokestatic    #110 <Method String String.valueOf(Object)>
	//    5   11:astore_1        
			String s2 = String.valueOf(" PII_LOG");
	//    6   12:ldc1            #112 <String " PII_LOG">
	//    7   14:invokestatic    #110 <Method String String.valueOf(Object)>
	//    8   17:astore_3        
			if(s2.length() != 0)
	//*   9   18:aload_3         
	//*  10   19:invokevirtual   #37  <Method int String.length()>
	//*  11   22:ifeq            34
				s = s.concat(s2);
	//   12   25:aload_1         
	//   13   26:aload_3         
	//   14   27:invokevirtual   #64  <Method String String.concat(String)>
	//   15   30:astore_1        
			else
	//*  16   31:goto            43
				s = new String(s);
	//   17   34:new             #33  <Class String>
	//   18   37:dup             
	//   19   38:aload_1         
	//   20   39:invokespecial   #114 <Method void String(String)>
	//   21   42:astore_1        
			Log.i(s, zzl(s1));
	//   22   43:aload_1         
	//   23   44:aload_0         
	//   24   45:aload_2         
	//   25   46:invokespecial   #79  <Method String zzl(String)>
	//   26   49:invokestatic    #101 <Method int Log.i(String, String)>
	//   27   52:pop             
		}
	//   28   53:return          
	}

	public final void pii(String s, String s1, Throwable throwable)
	{
		if(canLogPii())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #107 <Method boolean canLogPii()>
	//*   2    4:ifeq            57
		{
			s = String.valueOf(((Object) (s)));
	//    3    7:aload_1         
	//    4    8:invokestatic    #110 <Method String String.valueOf(Object)>
	//    5   11:astore_1        
			String s2 = String.valueOf(" PII_LOG");
	//    6   12:ldc1            #112 <String " PII_LOG">
	//    7   14:invokestatic    #110 <Method String String.valueOf(Object)>
	//    8   17:astore          4
			if(s2.length() != 0)
	//*   9   19:aload           4
	//*  10   21:invokevirtual   #37  <Method int String.length()>
	//*  11   24:ifeq            37
				s = s.concat(s2);
	//   12   27:aload_1         
	//   13   28:aload           4
	//   14   30:invokevirtual   #64  <Method String String.concat(String)>
	//   15   33:astore_1        
			else
	//*  16   34:goto            46
				s = new String(s);
	//   17   37:new             #33  <Class String>
	//   18   40:dup             
	//   19   41:aload_1         
	//   20   42:invokespecial   #114 <Method void String(String)>
	//   21   45:astore_1        
			Log.i(s, zzl(s1), throwable);
	//   22   46:aload_1         
	//   23   47:aload_0         
	//   24   48:aload_2         
	//   25   49:invokespecial   #79  <Method String zzl(String)>
	//   26   52:aload_3         
	//   27   53:invokestatic    #103 <Method int Log.i(String, String, Throwable)>
	//   28   56:pop             
		}
	//   29   57:return          
	}

	public final transient void piifmt(String s, String s1, Object aobj[])
	{
		if(canLogPii())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #107 <Method boolean canLogPii()>
	//*   2    4:ifeq            57
		{
			s = String.valueOf(((Object) (s)));
	//    3    7:aload_1         
	//    4    8:invokestatic    #110 <Method String String.valueOf(Object)>
	//    5   11:astore_1        
			String s2 = String.valueOf(" PII_LOG");
	//    6   12:ldc1            #112 <String " PII_LOG">
	//    7   14:invokestatic    #110 <Method String String.valueOf(Object)>
	//    8   17:astore          4
			if(s2.length() != 0)
	//*   9   19:aload           4
	//*  10   21:invokevirtual   #37  <Method int String.length()>
	//*  11   24:ifeq            37
				s = s.concat(s2);
	//   12   27:aload_1         
	//   13   28:aload           4
	//   14   30:invokevirtual   #64  <Method String String.concat(String)>
	//   15   33:astore_1        
			else
	//*  16   34:goto            46
				s = new String(s);
	//   17   37:new             #33  <Class String>
	//   18   40:dup             
	//   19   41:aload_1         
	//   20   42:invokespecial   #114 <Method void String(String)>
	//   21   45:astore_1        
			Log.i(s, zza(s1, aobj));
	//   22   46:aload_1         
	//   23   47:aload_0         
	//   24   48:aload_2         
	//   25   49:aload_3         
	//   26   50:invokespecial   #90  <Method String zza(String, Object[])>
	//   27   53:invokestatic    #101 <Method int Log.i(String, String)>
	//   28   56:pop             
		}
	//   29   57:return          
	}

	public final void v(String s, String s1)
	{
		if(canLog(2))
	//*   0    0:aload_0         
	//*   1    1:iconst_2        
	//*   2    2:invokevirtual   #77  <Method boolean canLog(int)>
	//*   3    5:ifeq            18
			Log.v(s, zzl(s1));
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:invokespecial   #79  <Method String zzl(String)>
	//    8   14:invokestatic    #118 <Method int Log.v(String, String)>
	//    9   17:pop             
	//   10   18:return          
	}

	public final void v(String s, String s1, Throwable throwable)
	{
		if(canLog(2))
	//*   0    0:aload_0         
	//*   1    1:iconst_2        
	//*   2    2:invokevirtual   #77  <Method boolean canLog(int)>
	//*   3    5:ifeq            19
			Log.v(s, zzl(s1), throwable);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:invokespecial   #79  <Method String zzl(String)>
	//    8   14:aload_3         
	//    9   15:invokestatic    #120 <Method int Log.v(String, String, Throwable)>
	//   10   18:pop             
	//   11   19:return          
	}

	public final transient void vfmt(String s, String s1, Object aobj[])
	{
		if(canLog(2))
	//*   0    0:aload_0         
	//*   1    1:iconst_2        
	//*   2    2:invokevirtual   #77  <Method boolean canLog(int)>
	//*   3    5:ifeq            19
			Log.v(s, zza(s1, aobj));
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:aload_3         
	//    8   12:invokespecial   #90  <Method String zza(String, Object[])>
	//    9   15:invokestatic    #118 <Method int Log.v(String, String)>
	//   10   18:pop             
	//   11   19:return          
	}

	public final void w(String s, String s1)
	{
		if(canLog(5))
	//*   0    0:aload_0         
	//*   1    1:iconst_5        
	//*   2    2:invokevirtual   #77  <Method boolean canLog(int)>
	//*   3    5:ifeq            18
			Log.w(s, zzl(s1));
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:invokespecial   #79  <Method String zzl(String)>
	//    8   14:invokestatic    #124 <Method int Log.w(String, String)>
	//    9   17:pop             
	//   10   18:return          
	}

	public final void w(String s, String s1, Throwable throwable)
	{
		if(canLog(5))
	//*   0    0:aload_0         
	//*   1    1:iconst_5        
	//*   2    2:invokevirtual   #77  <Method boolean canLog(int)>
	//*   3    5:ifeq            19
			Log.w(s, zzl(s1), throwable);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:invokespecial   #79  <Method String zzl(String)>
	//    8   14:aload_3         
	//    9   15:invokestatic    #126 <Method int Log.w(String, String, Throwable)>
	//   10   18:pop             
	//   11   19:return          
	}

	public final transient void wfmt(String s, String s1, Object aobj[])
	{
		if(canLog(5))
	//*   0    0:aload_0         
	//*   1    1:iconst_5        
	//*   2    2:invokevirtual   #77  <Method boolean canLog(int)>
	//*   3    5:ifeq            22
			Log.w(zzuc, zza(s1, aobj));
	//    4    8:aload_0         
	//    5    9:getfield        #51  <Field String zzuc>
	//    6   12:aload_0         
	//    7   13:aload_2         
	//    8   14:aload_3         
	//    9   15:invokespecial   #90  <Method String zza(String, Object[])>
	//   10   18:invokestatic    #124 <Method int Log.w(String, String)>
	//   11   21:pop             
	//   12   22:return          
	}

	public final GmsLogger withMessagePrefix(String s)
	{
		return new GmsLogger(zzuc, s);
	//    0    0:new             #2   <Class GmsLogger>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #51  <Field String zzuc>
	//    4    8:aload_1         
	//    5    9:invokespecial   #21  <Method void GmsLogger(String, String)>
	//    6   12:areturn         
	}

	public final void wtf(String s, String s1, Throwable throwable)
	{
		if(canLog(7))
	//*   0    0:aload_0         
	//*   1    1:bipush          7
	//*   2    3:invokevirtual   #77  <Method boolean canLog(int)>
	//*   3    6:ifeq            31
		{
			Log.e(s, zzl(s1), throwable);
	//    4    9:aload_1         
	//    5   10:aload_0         
	//    6   11:aload_2         
	//    7   12:invokespecial   #79  <Method String zzl(String)>
	//    8   15:aload_3         
	//    9   16:invokestatic    #95  <Method int Log.e(String, String, Throwable)>
	//   10   19:pop             
			Log.wtf(s, zzl(s1), throwable);
	//   11   20:aload_1         
	//   12   21:aload_0         
	//   13   22:aload_2         
	//   14   23:invokespecial   #79  <Method String zzl(String)>
	//   15   26:aload_3         
	//   16   27:invokestatic    #132 <Method int Log.wtf(String, String, Throwable)>
	//   17   30:pop             
		}
	//   18   31:return          
	}

	public static final int MAX_PII_TAG_LENGTH = 15;
	public static final int MAX_TAG_LENGTH = 23;
	private static final String zzub;
	private final String zzuc;
	private final String zzud;

	static 
	{
	//    0    0:return          
	}
}
