// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.cast;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Locale;

public final class zzdg
{

	public zzdg(String s)
	{
		this(s, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokespecial   #21  <Method void zzdg(String, boolean)>
	//    4    6:return          
	}

	private zzdg(String s, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		Preconditions.checkNotEmpty(s, "The log tag cannot be null or empty.");
	//    2    4:aload_1         
	//    3    5:ldc1            #25  <String "The log tag cannot be null or empty.">
	//    4    7:invokestatic    #31  <Method String Preconditions.checkNotEmpty(String, Object)>
	//    5   10:pop             
		mTag = s;
	//    6   11:aload_0         
	//    7   12:aload_1         
	//    8   13:putfield        #33  <Field String mTag>
		if(s.length() <= 23)
	//*   9   16:aload_1         
	//*  10   17:invokevirtual   #39  <Method int String.length()>
	//*  11   20:bipush          23
	//*  12   22:icmpgt          30
			flag = true;
	//   13   25:iconst_1        
	//   14   26:istore_2        
		else
	//*  15   27:goto            32
			flag = false;
	//   16   30:iconst_0        
	//   17   31:istore_2        
		zzwl = flag;
	//   18   32:aload_0         
	//   19   33:iload_2         
	//   20   34:putfield        #41  <Field boolean zzwl>
		zzwm = false;
	//   21   37:aload_0         
	//   22   38:iconst_0        
	//   23   39:putfield        #43  <Field boolean zzwm>
		zzwn = false;
	//   24   42:aload_0         
	//   25   43:iconst_0        
	//   26   44:putfield        #45  <Field boolean zzwn>
	//   27   47:return          
	}

	private final transient String zza(String s, Object aobj[])
	{
		if(aobj.length != 0)
	//*   0    0:aload_2         
	//*   1    1:arraylength     
	//*   2    2:ifne            8
	//*   3    5:goto            17
			s = String.format(Locale.ROOT, s, aobj);
	//    4    8:getstatic       #53  <Field Locale Locale.ROOT>
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:invokestatic    #57  <Method String String.format(Locale, String, Object[])>
	//    8   16:astore_1        
		aobj = ((Object []) (s));
	//    9   17:aload_1         
	//   10   18:astore_2        
		if(!TextUtils.isEmpty(((CharSequence) (zzwo))))
	//*  11   19:aload_0         
	//*  12   20:getfield        #59  <Field String zzwo>
	//*  13   23:invokestatic    #65  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  14   26:ifne            64
		{
			aobj = ((Object []) (String.valueOf(((Object) (zzwo)))));
	//   15   29:aload_0         
	//   16   30:getfield        #59  <Field String zzwo>
	//   17   33:invokestatic    #69  <Method String String.valueOf(Object)>
	//   18   36:astore_2        
			s = String.valueOf(((Object) (s)));
	//   19   37:aload_1         
	//   20   38:invokestatic    #69  <Method String String.valueOf(Object)>
	//   21   41:astore_1        
			if(s.length() != 0)
	//*  22   42:aload_1         
	//*  23   43:invokevirtual   #39  <Method int String.length()>
	//*  24   46:ifeq            55
				return ((String) (aobj)).concat(s);
	//   25   49:aload_2         
	//   26   50:aload_1         
	//   27   51:invokevirtual   #73  <Method String String.concat(String)>
	//   28   54:areturn         
			aobj = ((Object []) (new String(((String) (aobj)))));
	//   29   55:new             #35  <Class String>
	//   30   58:dup             
	//   31   59:aload_2         
	//   32   60:invokespecial   #75  <Method void String(String)>
	//   33   63:astore_2        
		}
		return ((String) (aobj));
	//   34   64:aload_2         
	//   35   65:areturn         
	}

	private final boolean zzcy()
	{
		return zzwm || zzwl && Log.isLoggable(mTag, 3);
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field boolean zzwm>
	//    2    4:ifne            30
	//    3    7:aload_0         
	//    4    8:getfield        #41  <Field boolean zzwl>
	//    5   11:ifeq            28
	//    6   14:aload_0         
	//    7   15:getfield        #33  <Field String mTag>
	//    8   18:iconst_3        
	//    9   19:invokestatic    #83  <Method boolean Log.isLoggable(String, int)>
	//   10   22:ifeq            28
	//   11   25:goto            30
	//   12   28:iconst_0        
	//   13   29:ireturn         
	//   14   30:iconst_1        
	//   15   31:ireturn         
	}

	public final transient void d(String s, Object aobj[])
	{
		if(zzcy())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #87  <Method boolean zzcy()>
	//*   2    4:ifeq            21
			Log.d(mTag, zza(s, aobj));
	//    3    7:aload_0         
	//    4    8:getfield        #33  <Field String mTag>
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:aload_2         
	//    8   14:invokespecial   #89  <Method String zza(String, Object[])>
	//    9   17:invokestatic    #92  <Method int Log.d(String, String)>
	//   10   20:pop             
	//   11   21:return          
	}

	public final transient void e(String s, Object aobj[])
	{
		Log.e(mTag, zza(s, aobj));
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field String mTag>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #89  <Method String zza(String, Object[])>
	//    6   10:invokestatic    #95  <Method int Log.e(String, String)>
	//    7   13:pop             
	//    8   14:return          
	}

	public final transient void i(String s, Object aobj[])
	{
		Log.i(mTag, zza(s, aobj));
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field String mTag>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #89  <Method String zza(String, Object[])>
	//    6   10:invokestatic    #98  <Method int Log.i(String, String)>
	//    7   13:pop             
	//    8   14:return          
	}

	public final transient void w(String s, Object aobj[])
	{
		Log.w(mTag, zza(s, aobj));
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field String mTag>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #89  <Method String zza(String, Object[])>
	//    6   10:invokestatic    #101 <Method int Log.w(String, String)>
	//    7   13:pop             
	//    8   14:return          
	}

	public final transient void zza(Throwable throwable, String s, Object aobj[])
	{
		if(zzcy())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #87  <Method boolean zzcy()>
	//*   2    4:ifeq            22
			Log.d(mTag, zza(s, aobj), throwable);
	//    3    7:aload_0         
	//    4    8:getfield        #33  <Field String mTag>
	//    5   11:aload_0         
	//    6   12:aload_2         
	//    7   13:aload_3         
	//    8   14:invokespecial   #89  <Method String zza(String, Object[])>
	//    9   17:aload_1         
	//   10   18:invokestatic    #105 <Method int Log.d(String, String, Throwable)>
	//   11   21:pop             
	//   12   22:return          
	}

	public final transient void zzb(Throwable throwable, String s, Object aobj[])
	{
		Log.w(mTag, zza(s, aobj), throwable);
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field String mTag>
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokespecial   #89  <Method String zza(String, Object[])>
	//    6   10:aload_1         
	//    7   11:invokestatic    #108 <Method int Log.w(String, String, Throwable)>
	//    8   14:pop             
	//    9   15:return          
	}

	public final transient void zzc(Throwable throwable, String s, Object aobj[])
	{
		Log.e(mTag, zza(s, aobj), throwable);
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field String mTag>
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokespecial   #89  <Method String zza(String, Object[])>
	//    6   10:aload_1         
	//    7   11:invokestatic    #111 <Method int Log.e(String, String, Throwable)>
	//    8   14:pop             
	//    9   15:return          
	}

	public final void zzk(boolean flag)
	{
		zzwm = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #43  <Field boolean zzwm>
	//    3    5:return          
	}

	public final void zzt(String s)
	{
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #65  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            12
			s = null;
	//    3    7:aconst_null     
	//    4    8:astore_1        
		else
	//*   5    9:goto            26
			s = String.format("[%s] ", new Object[] {
				s
			});
	//    6   12:ldc1            #116 <String "[%s] ">
	//    7   14:iconst_1        
	//    8   15:anewarray       Object[]
	//    9   18:dup             
	//   10   19:iconst_0        
	//   11   20:aload_1         
	//   12   21:aastore         
	//   13   22:invokestatic    #118 <Method String String.format(String, Object[])>
	//   14   25:astore_1        
		zzwo = s;
	//   15   26:aload_0         
	//   16   27:aload_1         
	//   17   28:putfield        #59  <Field String zzwo>
	//   18   31:return          
	}

	private static boolean zzwk = false;
	private final String mTag;
	private final boolean zzwl;
	private boolean zzwm;
	private boolean zzwn;
	private String zzwo;

	static 
	{
	//    0    0:return          
	}
}
