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
	//    3    3:invokespecial   #20  <Method void GmsLogger(String, String)>
	//    4    6:return          
	}

	public GmsLogger(String s, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		Preconditions.checkNotNull(((Object) (s)), "log tag cannot be null");
	//    2    4:aload_1         
	//    3    5:ldc1            #24  <String "log tag cannot be null">
	//    4    7:invokestatic    #30  <Method Object Preconditions.checkNotNull(Object, Object)>
	//    5   10:pop             
		boolean flag;
		if(s.length() <= 23)
	//*   6   11:aload_1         
	//*   7   12:invokevirtual   #36  <Method int String.length()>
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
	//   16   28:ldc1            #38  <String "tag \"%s\" is longer than the %d character maximum">
	//   17   30:iconst_2        
	//   18   31:anewarray       Object[]
	//   19   34:dup             
	//   20   35:iconst_0        
	//   21   36:aload_1         
	//   22   37:aastore         
	//   23   38:dup             
	//   24   39:iconst_1        
	//   25   40:bipush          23
	//   26   42:invokestatic    #44  <Method Integer Integer.valueOf(int)>
	//   27   45:aastore         
	//   28   46:invokestatic    #48  <Method void Preconditions.checkArgument(boolean, String, Object[])>
		zzeh = s;
	//   29   49:aload_0         
	//   30   50:aload_1         
	//   31   51:putfield        #50  <Field String zzeh>
		if(s1 != null && s1.length() > 0)
	//*  32   54:aload_2         
	//*  33   55:ifnull          74
	//*  34   58:aload_2         
	//*  35   59:invokevirtual   #36  <Method int String.length()>
	//*  36   62:ifgt            68
	//*  37   65:goto            74
		{
			zzei = s1;
	//   38   68:aload_0         
	//   39   69:aload_2         
	//   40   70:putfield        #52  <Field String zzei>
			return;
	//   41   73:return          
		} else
		{
			zzei = null;
	//   42   74:aload_0         
	//   43   75:aconst_null     
	//   44   76:putfield        #52  <Field String zzei>
			return;
	//   45   79:return          
		}
	}

	private final transient String zza(String s, Object aobj[])
	{
		s = String.format(s, aobj);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #57  <Method String String.format(String, Object[])>
	//    3    5:astore_1        
		aobj = ((Object []) (zzei));
	//    4    6:aload_0         
	//    5    7:getfield        #52  <Field String zzei>
	//    6   10:astore_2        
		if(aobj == null)
	//*   7   11:aload_2         
	//*   8   12:ifnonnull       17
			return s;
	//    9   15:aload_1         
	//   10   16:areturn         
		else
			return ((String) (aobj)).concat(s);
	//   11   17:aload_2         
	//   12   18:aload_1         
	//   13   19:invokevirtual   #61  <Method String String.concat(String)>
	//   14   22:areturn         
	}

	private final String zzh(String s)
	{
		String s1 = zzei;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field String zzei>
	//    2    4:astore_2        
		if(s1 == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       11
			return s;
	//    5    9:aload_1         
	//    6   10:areturn         
		else
			return s1.concat(s);
	//    7   11:aload_2         
	//    8   12:aload_1         
	//    9   13:invokevirtual   #61  <Method String String.concat(String)>
	//   10   16:areturn         
	}

	public final boolean canLog(int j)
	{
		return Log.isLoggable(zzeh, j);
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field String zzeh>
	//    2    4:iload_1         
	//    3    5:invokestatic    #70  <Method boolean Log.isLoggable(String, int)>
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
	//*   2    2:invokevirtual   #76  <Method boolean canLog(int)>
	//*   3    5:ifeq            18
			Log.d(s, zzh(s1));
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:invokespecial   #78  <Method String zzh(String)>
	//    8   14:invokestatic    #81  <Method int Log.d(String, String)>
	//    9   17:pop             
	//   10   18:return          
	}

	public final void d(String s, String s1, Throwable throwable)
	{
		if(canLog(3))
	//*   0    0:aload_0         
	//*   1    1:iconst_3        
	//*   2    2:invokevirtual   #76  <Method boolean canLog(int)>
	//*   3    5:ifeq            19
			Log.d(s, zzh(s1), throwable);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:invokespecial   #78  <Method String zzh(String)>
	//    8   14:aload_3         
	//    9   15:invokestatic    #85  <Method int Log.d(String, String, Throwable)>
	//   10   18:pop             
	//   11   19:return          
	}

	public final void e(String s, String s1)
	{
		if(canLog(6))
	//*   0    0:aload_0         
	//*   1    1:bipush          6
	//*   2    3:invokevirtual   #76  <Method boolean canLog(int)>
	//*   3    6:ifeq            19
			Log.e(s, zzh(s1));
	//    4    9:aload_1         
	//    5   10:aload_0         
	//    6   11:aload_2         
	//    7   12:invokespecial   #78  <Method String zzh(String)>
	//    8   15:invokestatic    #88  <Method int Log.e(String, String)>
	//    9   18:pop             
	//   10   19:return          
	}

	public final void e(String s, String s1, Throwable throwable)
	{
		if(canLog(6))
	//*   0    0:aload_0         
	//*   1    1:bipush          6
	//*   2    3:invokevirtual   #76  <Method boolean canLog(int)>
	//*   3    6:ifeq            20
			Log.e(s, zzh(s1), throwable);
	//    4    9:aload_1         
	//    5   10:aload_0         
	//    6   11:aload_2         
	//    7   12:invokespecial   #78  <Method String zzh(String)>
	//    8   15:aload_3         
	//    9   16:invokestatic    #90  <Method int Log.e(String, String, Throwable)>
	//   10   19:pop             
	//   11   20:return          
	}

	public final transient void efmt(String s, String s1, Object aobj[])
	{
		if(canLog(6))
	//*   0    0:aload_0         
	//*   1    1:bipush          6
	//*   2    3:invokevirtual   #76  <Method boolean canLog(int)>
	//*   3    6:ifeq            20
			Log.e(s, zza(s1, aobj));
	//    4    9:aload_1         
	//    5   10:aload_0         
	//    6   11:aload_2         
	//    7   12:aload_3         
	//    8   13:invokespecial   #94  <Method String zza(String, Object[])>
	//    9   16:invokestatic    #88  <Method int Log.e(String, String)>
	//   10   19:pop             
	//   11   20:return          
	}

	public final void i(String s, String s1)
	{
		if(canLog(4))
	//*   0    0:aload_0         
	//*   1    1:iconst_4        
	//*   2    2:invokevirtual   #76  <Method boolean canLog(int)>
	//*   3    5:ifeq            18
			Log.i(s, zzh(s1));
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:invokespecial   #78  <Method String zzh(String)>
	//    8   14:invokestatic    #97  <Method int Log.i(String, String)>
	//    9   17:pop             
	//   10   18:return          
	}

	public final void i(String s, String s1, Throwable throwable)
	{
		if(canLog(4))
	//*   0    0:aload_0         
	//*   1    1:iconst_4        
	//*   2    2:invokevirtual   #76  <Method boolean canLog(int)>
	//*   3    5:ifeq            19
			Log.i(s, zzh(s1), throwable);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:invokespecial   #78  <Method String zzh(String)>
	//    8   14:aload_3         
	//    9   15:invokestatic    #99  <Method int Log.i(String, String, Throwable)>
	//   10   18:pop             
	//   11   19:return          
	}

	public final void pii(String s, String s1)
	{
		if(canLogPii())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #102 <Method boolean canLogPii()>
	//*   2    4:ifeq            53
		{
			s = String.valueOf(((Object) (s)));
	//    3    7:aload_1         
	//    4    8:invokestatic    #105 <Method String String.valueOf(Object)>
	//    5   11:astore_1        
			String s2 = String.valueOf(" PII_LOG");
	//    6   12:ldc1            #107 <String " PII_LOG">
	//    7   14:invokestatic    #105 <Method String String.valueOf(Object)>
	//    8   17:astore_3        
			if(s2.length() != 0)
	//*   9   18:aload_3         
	//*  10   19:invokevirtual   #36  <Method int String.length()>
	//*  11   22:ifeq            34
				s = s.concat(s2);
	//   12   25:aload_1         
	//   13   26:aload_3         
	//   14   27:invokevirtual   #61  <Method String String.concat(String)>
	//   15   30:astore_1        
			else
	//*  16   31:goto            43
				s = new String(s);
	//   17   34:new             #32  <Class String>
	//   18   37:dup             
	//   19   38:aload_1         
	//   20   39:invokespecial   #109 <Method void String(String)>
	//   21   42:astore_1        
			Log.i(s, zzh(s1));
	//   22   43:aload_1         
	//   23   44:aload_0         
	//   24   45:aload_2         
	//   25   46:invokespecial   #78  <Method String zzh(String)>
	//   26   49:invokestatic    #97  <Method int Log.i(String, String)>
	//   27   52:pop             
		}
	//   28   53:return          
	}

	public final void pii(String s, String s1, Throwable throwable)
	{
		if(canLogPii())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #102 <Method boolean canLogPii()>
	//*   2    4:ifeq            57
		{
			s = String.valueOf(((Object) (s)));
	//    3    7:aload_1         
	//    4    8:invokestatic    #105 <Method String String.valueOf(Object)>
	//    5   11:astore_1        
			String s2 = String.valueOf(" PII_LOG");
	//    6   12:ldc1            #107 <String " PII_LOG">
	//    7   14:invokestatic    #105 <Method String String.valueOf(Object)>
	//    8   17:astore          4
			if(s2.length() != 0)
	//*   9   19:aload           4
	//*  10   21:invokevirtual   #36  <Method int String.length()>
	//*  11   24:ifeq            37
				s = s.concat(s2);
	//   12   27:aload_1         
	//   13   28:aload           4
	//   14   30:invokevirtual   #61  <Method String String.concat(String)>
	//   15   33:astore_1        
			else
	//*  16   34:goto            46
				s = new String(s);
	//   17   37:new             #32  <Class String>
	//   18   40:dup             
	//   19   41:aload_1         
	//   20   42:invokespecial   #109 <Method void String(String)>
	//   21   45:astore_1        
			Log.i(s, zzh(s1), throwable);
	//   22   46:aload_1         
	//   23   47:aload_0         
	//   24   48:aload_2         
	//   25   49:invokespecial   #78  <Method String zzh(String)>
	//   26   52:aload_3         
	//   27   53:invokestatic    #99  <Method int Log.i(String, String, Throwable)>
	//   28   56:pop             
		}
	//   29   57:return          
	}

	public final void v(String s, String s1)
	{
		if(canLog(2))
	//*   0    0:aload_0         
	//*   1    1:iconst_2        
	//*   2    2:invokevirtual   #76  <Method boolean canLog(int)>
	//*   3    5:ifeq            18
			Log.v(s, zzh(s1));
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:invokespecial   #78  <Method String zzh(String)>
	//    8   14:invokestatic    #112 <Method int Log.v(String, String)>
	//    9   17:pop             
	//   10   18:return          
	}

	public final void v(String s, String s1, Throwable throwable)
	{
		if(canLog(2))
	//*   0    0:aload_0         
	//*   1    1:iconst_2        
	//*   2    2:invokevirtual   #76  <Method boolean canLog(int)>
	//*   3    5:ifeq            19
			Log.v(s, zzh(s1), throwable);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:invokespecial   #78  <Method String zzh(String)>
	//    8   14:aload_3         
	//    9   15:invokestatic    #114 <Method int Log.v(String, String, Throwable)>
	//   10   18:pop             
	//   11   19:return          
	}

	public final void w(String s, String s1)
	{
		if(canLog(5))
	//*   0    0:aload_0         
	//*   1    1:iconst_5        
	//*   2    2:invokevirtual   #76  <Method boolean canLog(int)>
	//*   3    5:ifeq            18
			Log.w(s, zzh(s1));
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:invokespecial   #78  <Method String zzh(String)>
	//    8   14:invokestatic    #117 <Method int Log.w(String, String)>
	//    9   17:pop             
	//   10   18:return          
	}

	public final void w(String s, String s1, Throwable throwable)
	{
		if(canLog(5))
	//*   0    0:aload_0         
	//*   1    1:iconst_5        
	//*   2    2:invokevirtual   #76  <Method boolean canLog(int)>
	//*   3    5:ifeq            19
			Log.w(s, zzh(s1), throwable);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:invokespecial   #78  <Method String zzh(String)>
	//    8   14:aload_3         
	//    9   15:invokestatic    #119 <Method int Log.w(String, String, Throwable)>
	//   10   18:pop             
	//   11   19:return          
	}

	public final transient void wfmt(String s, String s1, Object aobj[])
	{
		if(canLog(5))
	//*   0    0:aload_0         
	//*   1    1:iconst_5        
	//*   2    2:invokevirtual   #76  <Method boolean canLog(int)>
	//*   3    5:ifeq            22
			Log.w(zzeh, zza(s1, aobj));
	//    4    8:aload_0         
	//    5    9:getfield        #50  <Field String zzeh>
	//    6   12:aload_0         
	//    7   13:aload_2         
	//    8   14:aload_3         
	//    9   15:invokespecial   #94  <Method String zza(String, Object[])>
	//   10   18:invokestatic    #117 <Method int Log.w(String, String)>
	//   11   21:pop             
	//   12   22:return          
	}

	public final void wtf(String s, String s1, Throwable throwable)
	{
		if(canLog(7))
	//*   0    0:aload_0         
	//*   1    1:bipush          7
	//*   2    3:invokevirtual   #76  <Method boolean canLog(int)>
	//*   3    6:ifeq            31
		{
			Log.e(s, zzh(s1), throwable);
	//    4    9:aload_1         
	//    5   10:aload_0         
	//    6   11:aload_2         
	//    7   12:invokespecial   #78  <Method String zzh(String)>
	//    8   15:aload_3         
	//    9   16:invokestatic    #90  <Method int Log.e(String, String, Throwable)>
	//   10   19:pop             
			Log.wtf(s, zzh(s1), throwable);
	//   11   20:aload_1         
	//   12   21:aload_0         
	//   13   22:aload_2         
	//   14   23:invokespecial   #78  <Method String zzh(String)>
	//   15   26:aload_3         
	//   16   27:invokestatic    #123 <Method int Log.wtf(String, String, Throwable)>
	//   17   30:pop             
		}
	//   18   31:return          
	}

	private static final int zzef = 15;
	private static final String zzeg;
	private final String zzeh;
	private final String zzei;

	static 
	{
	//    0    0:return          
	}
}
