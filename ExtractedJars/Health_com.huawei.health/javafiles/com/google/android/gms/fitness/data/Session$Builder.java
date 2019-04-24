// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.fitness.data;

import android.text.TextUtils;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.fitness.zza;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.fitness.data:
//			Session

public static class Session$Builder
{

	static long zza(Session$Builder session$builder)
	{
		return session$builder.zzafe;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field long zzafe>
	//    2    4:lreturn         
	}

	static long zzb(Session$Builder session$builder)
	{
		return session$builder.zzaSt;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field long zzaSt>
	//    2    4:lreturn         
	}

	static String zzc(Session$Builder session$builder)
	{
		return session$builder.mName;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field String mName>
	//    2    4:areturn         
	}

	static String zzd(Session$Builder session$builder)
	{
		return session$builder.zzaUk;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field String zzaUk>
	//    2    4:areturn         
	}

	static String zze(Session$Builder session$builder)
	{
		return session$builder.zzade;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field String zzade>
	//    2    4:areturn         
	}

	static int zzf(Session$Builder session$builder)
	{
		return session$builder.zzaSu;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field int zzaSu>
	//    2    4:ireturn         
	}

	static Long zzg(Session$Builder session$builder)
	{
		return session$builder.zzaUm;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field Long zzaUm>
	//    2    4:areturn         
	}

	public Session build()
	{
		boolean flag;
		if(zzafe > 0L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field long zzafe>
	//*   2    4:lconst_0        
	//*   3    5:lcmp            
	//*   4    6:ifle            14
			flag = true;
	//    5    9:iconst_1        
	//    6   10:istore_1        
		else
	//*   7   11:goto            16
			flag = false;
	//    8   14:iconst_0        
	//    9   15:istore_1        
		zzac.zza(flag, "Start time should be specified.");
	//   10   16:iload_1         
	//   11   17:ldc1            #52  <String "Start time should be specified.">
	//   12   19:invokestatic    #57  <Method void zzac.zza(boolean, Object)>
		if(zzaSt == 0L || zzaSt > zzafe)
	//*  13   22:aload_0         
	//*  14   23:getfield        #26  <Field long zzaSt>
	//*  15   26:lconst_0        
	//*  16   27:lcmp            
	//*  17   28:ifeq            43
	//*  18   31:aload_0         
	//*  19   32:getfield        #26  <Field long zzaSt>
	//*  20   35:aload_0         
	//*  21   36:getfield        #24  <Field long zzafe>
	//*  22   39:lcmp            
	//*  23   40:ifle            48
			flag = true;
	//   24   43:iconst_1        
	//   25   44:istore_1        
		else
	//*  26   45:goto            50
			flag = false;
	//   27   48:iconst_0        
	//   28   49:istore_1        
		zzac.zza(flag, "End time should be later than start time.");
	//   29   50:iload_1         
	//   30   51:ldc1            #59  <String "End time should be later than start time.">
	//   31   53:invokestatic    #57  <Method void zzac.zza(boolean, Object)>
		if(zzaUk == null)
	//*  32   56:aload_0         
	//*  33   57:getfield        #39  <Field String zzaUk>
	//*  34   60:ifnonnull       122
		{
			String s;
			if(mName == null)
	//*  35   63:aload_0         
	//*  36   64:getfield        #28  <Field String mName>
	//*  37   67:ifnonnull       77
				s = "";
	//   38   70:ldc1            #61  <String "">
	//   39   72:astore          4
			else
	//*  40   74:goto            83
				s = mName;
	//   41   77:aload_0         
	//   42   78:getfield        #28  <Field String mName>
	//   43   81:astore          4
			long l = zzafe;
	//   44   83:aload_0         
	//   45   84:getfield        #24  <Field long zzafe>
	//   46   87:lstore_2        
			zzaUk = (new StringBuilder(String.valueOf(((Object) (s))).length() + 20)).append(s).append(l).toString();
	//   47   88:aload_0         
	//   48   89:new             #63  <Class StringBuilder>
	//   49   92:dup             
	//   50   93:aload           4
	//   51   95:invokestatic    #69  <Method String String.valueOf(Object)>
	//   52   98:invokevirtual   #73  <Method int String.length()>
	//   53  101:bipush          20
	//   54  103:iadd            
	//   55  104:invokespecial   #76  <Method void StringBuilder(int)>
	//   56  107:aload           4
	//   57  109:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   58  112:lload_2         
	//   59  113:invokevirtual   #83  <Method StringBuilder StringBuilder.append(long)>
	//   60  116:invokevirtual   #87  <Method String StringBuilder.toString()>
	//   61  119:putfield        #39  <Field String zzaUk>
		}
		if(zzade == null)
	//*  62  122:aload_0         
	//*  63  123:getfield        #42  <Field String zzade>
	//*  64  126:ifnonnull       135
			zzade = "";
	//   65  129:aload_0         
	//   66  130:ldc1            #61  <String "">
	//   67  132:putfield        #42  <Field String zzade>
		return new Session(this, ((Session._cls1) (null)));
	//   68  135:new             #6   <Class Session>
	//   69  138:dup             
	//   70  139:aload_0         
	//   71  140:aconst_null     
	//   72  141:invokespecial   #90  <Method void Session(Session$Builder, Session$1)>
	//   73  144:areturn         
	}

	public Session$Builder setActiveTime(long l, TimeUnit timeunit)
	{
		zzaUm = Long.valueOf(timeunit.toMillis(l));
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:lload_1         
	//    3    3:invokevirtual   #98  <Method long TimeUnit.toMillis(long)>
	//    4    6:invokestatic    #103 <Method Long Long.valueOf(long)>
	//    5    9:putfield        #48  <Field Long zzaUm>
		return this;
	//    6   12:aload_0         
	//    7   13:areturn         
	}

	public Session$Builder setActivity(String s)
	{
		return zzgV(com.google.android.gms.fitness.zza.zzdU(s));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #111 <Method int zza.zzdU(String)>
	//    3    5:invokevirtual   #115 <Method Session$Builder zzgV(int)>
	//    4    8:areturn         
	}

	public Session$Builder setDescription(String s)
	{
		boolean flag;
		if(s.length() <= 1000)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #73  <Method int String.length()>
	//*   2    4:sipush          1000
	//*   3    7:icmpgt          15
			flag = true;
	//    4   10:iconst_1        
	//    5   11:istore_2        
		else
	//*   6   12:goto            17
			flag = false;
	//    7   15:iconst_0        
	//    8   16:istore_2        
		zzac.zzb(flag, "Session description cannot exceed %d characters", new Object[] {
			Integer.valueOf(1000)
		});
	//    9   17:iload_2         
	//   10   18:ldc1            #118 <String "Session description cannot exceed %d characters">
	//   11   20:iconst_1        
	//   12   21:anewarray       Object[]
	//   13   24:dup             
	//   14   25:iconst_0        
	//   15   26:sipush          1000
	//   16   29:invokestatic    #123 <Method Integer Integer.valueOf(int)>
	//   17   32:aastore         
	//   18   33:invokestatic    #126 <Method void zzac.zzb(boolean, String, Object[])>
		zzade = s;
	//   19   36:aload_0         
	//   20   37:aload_1         
	//   21   38:putfield        #42  <Field String zzade>
		return this;
	//   22   41:aload_0         
	//   23   42:areturn         
	}

	public Session$Builder setEndTime(long l, TimeUnit timeunit)
	{
		boolean flag;
		if(l >= 0L)
	//*   0    0:lload_1         
	//*   1    1:lconst_0        
	//*   2    2:lcmp            
	//*   3    3:iflt            12
			flag = true;
	//    4    6:iconst_1        
	//    5    7:istore          4
		else
	//*   6    9:goto            15
			flag = false;
	//    7   12:iconst_0        
	//    8   13:istore          4
		zzac.zza(flag, "End time should be positive.");
	//    9   15:iload           4
	//   10   17:ldc1            #129 <String "End time should be positive.">
	//   11   19:invokestatic    #57  <Method void zzac.zza(boolean, Object)>
		zzaSt = timeunit.toMillis(l);
	//   12   22:aload_0         
	//   13   23:aload_3         
	//   14   24:lload_1         
	//   15   25:invokevirtual   #98  <Method long TimeUnit.toMillis(long)>
	//   16   28:putfield        #26  <Field long zzaSt>
		return this;
	//   17   31:aload_0         
	//   18   32:areturn         
	}

	public Session$Builder setIdentifier(String s)
	{
		boolean flag;
		if(s != null && TextUtils.getTrimmedLength(((CharSequence) (s))) > 0)
	//*   0    0:aload_1         
	//*   1    1:ifnull          16
	//*   2    4:aload_1         
	//*   3    5:invokestatic    #136 <Method int TextUtils.getTrimmedLength(CharSequence)>
	//*   4    8:ifle            16
			flag = true;
	//    5   11:iconst_1        
	//    6   12:istore_2        
		else
	//*   7   13:goto            18
			flag = false;
	//    8   16:iconst_0        
	//    9   17:istore_2        
		zzac.zzax(flag);
	//   10   18:iload_2         
	//   11   19:invokestatic    #140 <Method void zzac.zzax(boolean)>
		zzaUk = s;
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:putfield        #39  <Field String zzaUk>
		return this;
	//   15   27:aload_0         
	//   16   28:areturn         
	}

	public Session$Builder setName(String s)
	{
		boolean flag;
		if(s.length() <= 100)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #73  <Method int String.length()>
	//*   2    4:bipush          100
	//*   3    6:icmpgt          14
			flag = true;
	//    4    9:iconst_1        
	//    5   10:istore_2        
		else
	//*   6   11:goto            16
			flag = false;
	//    7   14:iconst_0        
	//    8   15:istore_2        
		zzac.zzb(flag, "Session name cannot exceed %d characters", new Object[] {
			Integer.valueOf(100)
		});
	//    9   16:iload_2         
	//   10   17:ldc1            #143 <String "Session name cannot exceed %d characters">
	//   11   19:iconst_1        
	//   12   20:anewarray       Object[]
	//   13   23:dup             
	//   14   24:iconst_0        
	//   15   25:bipush          100
	//   16   27:invokestatic    #123 <Method Integer Integer.valueOf(int)>
	//   17   30:aastore         
	//   18   31:invokestatic    #126 <Method void zzac.zzb(boolean, String, Object[])>
		mName = s;
	//   19   34:aload_0         
	//   20   35:aload_1         
	//   21   36:putfield        #28  <Field String mName>
		return this;
	//   22   39:aload_0         
	//   23   40:areturn         
	}

	public Session$Builder setStartTime(long l, TimeUnit timeunit)
	{
		boolean flag;
		if(l > 0L)
	//*   0    0:lload_1         
	//*   1    1:lconst_0        
	//*   2    2:lcmp            
	//*   3    3:ifle            12
			flag = true;
	//    4    6:iconst_1        
	//    5    7:istore          4
		else
	//*   6    9:goto            15
			flag = false;
	//    7   12:iconst_0        
	//    8   13:istore          4
		zzac.zza(flag, "Start time should be positive.");
	//    9   15:iload           4
	//   10   17:ldc1            #146 <String "Start time should be positive.">
	//   11   19:invokestatic    #57  <Method void zzac.zza(boolean, Object)>
		zzafe = timeunit.toMillis(l);
	//   12   22:aload_0         
	//   13   23:aload_3         
	//   14   24:lload_1         
	//   15   25:invokevirtual   #98  <Method long TimeUnit.toMillis(long)>
	//   16   28:putfield        #24  <Field long zzafe>
		return this;
	//   17   31:aload_0         
	//   18   32:areturn         
	}

	public Session$Builder zzgV(int i)
	{
		zzaSu = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #30  <Field int zzaSu>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	private String mName;
	private long zzaSt;
	private int zzaSu;
	private String zzaUk;
	private Long zzaUm;
	private String zzade;
	private long zzafe;

	public Session$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		zzafe = 0L;
	//    2    4:aload_0         
	//    3    5:lconst_0        
	//    4    6:putfield        #24  <Field long zzafe>
		zzaSt = 0L;
	//    5    9:aload_0         
	//    6   10:lconst_0        
	//    7   11:putfield        #26  <Field long zzaSt>
		mName = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #28  <Field String mName>
		zzaSu = 4;
	//   11   19:aload_0         
	//   12   20:iconst_4        
	//   13   21:putfield        #30  <Field int zzaSu>
	//   14   24:return          
	}
}
