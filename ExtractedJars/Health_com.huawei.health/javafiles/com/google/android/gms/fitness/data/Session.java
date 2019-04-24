// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.fitness.data;

import android.content.Intent;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzd;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzac;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.fitness.data:
//			zzz, zzb

public class Session extends zza
{
	public static class Builder
	{

		static long zza(Builder builder)
		{
			return builder.zzafe;
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field long zzafe>
		//    2    4:lreturn         
		}

		static long zzb(Builder builder)
		{
			return builder.zzaSt;
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field long zzaSt>
		//    2    4:lreturn         
		}

		static String zzc(Builder builder)
		{
			return builder.mName;
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field String mName>
		//    2    4:areturn         
		}

		static String zzd(Builder builder)
		{
			return builder.zzaUk;
		//    0    0:aload_0         
		//    1    1:getfield        #39  <Field String zzaUk>
		//    2    4:areturn         
		}

		static String zze(Builder builder)
		{
			return builder.zzade;
		//    0    0:aload_0         
		//    1    1:getfield        #42  <Field String zzade>
		//    2    4:areturn         
		}

		static int zzf(Builder builder)
		{
			return builder.zzaSu;
		//    0    0:aload_0         
		//    1    1:getfield        #30  <Field int zzaSu>
		//    2    4:ireturn         
		}

		static Long zzg(Builder builder)
		{
			return builder.zzaUm;
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
			return new Session(this);
		//   68  135:new             #6   <Class Session>
		//   69  138:dup             
		//   70  139:aload_0         
		//   71  140:aconst_null     
		//   72  141:invokespecial   #90  <Method void Session(Session$Builder, Session$1)>
		//   73  144:areturn         
		}

		public Builder setActiveTime(long l, TimeUnit timeunit)
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

		public Builder setActivity(String s)
		{
			return zzgV(com.google.android.gms.fitness.zza.zzdU(s));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokestatic    #111 <Method int com.google.android.gms.fitness.zza.zzdU(String)>
		//    3    5:invokevirtual   #115 <Method Session$Builder zzgV(int)>
		//    4    8:areturn         
		}

		public Builder setDescription(String s)
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

		public Builder setEndTime(long l, TimeUnit timeunit)
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

		public Builder setIdentifier(String s)
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

		public Builder setName(String s)
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

		public Builder setStartTime(long l, TimeUnit timeunit)
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

		public Builder zzgV(int i)
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

		public Builder()
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


	Session(int i, long l, long l1, String s, String s1, 
			String s2, int j, zzb zzb1, Long long1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #44  <Method void zza()>
		zzaiI = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #46  <Field int zzaiI>
		zzafe = l;
	//    5    9:aload_0         
	//    6   10:lload_2         
	//    7   11:putfield        #48  <Field long zzafe>
		zzaSt = l1;
	//    8   14:aload_0         
	//    9   15:lload           4
	//   10   17:putfield        #50  <Field long zzaSt>
		mName = s;
	//   11   20:aload_0         
	//   12   21:aload           6
	//   13   23:putfield        #52  <Field String mName>
		zzaUk = s1;
	//   14   26:aload_0         
	//   15   27:aload           7
	//   16   29:putfield        #54  <Field String zzaUk>
		zzade = s2;
	//   17   32:aload_0         
	//   18   33:aload           8
	//   19   35:putfield        #56  <Field String zzade>
		zzaSu = j;
	//   20   38:aload_0         
	//   21   39:iload           9
	//   22   41:putfield        #58  <Field int zzaSu>
		zzaUl = zzb1;
	//   23   44:aload_0         
	//   24   45:aload           10
	//   25   47:putfield        #60  <Field zzb zzaUl>
		zzaUm = long1;
	//   26   50:aload_0         
	//   27   51:aload           11
	//   28   53:putfield        #62  <Field Long zzaUm>
	//   29   56:return          
	}

	public Session(long l, long l1, String s, String s1, String s2, 
			int i, zzb zzb1, Long long1)
	{
		this(3, l, l1, s, s1, s2, i, zzb1, long1);
	//    0    0:aload_0         
	//    1    1:iconst_3        
	//    2    2:lload_1         
	//    3    3:lload_3         
	//    4    4:aload           5
	//    5    6:aload           6
	//    6    8:aload           7
	//    7   10:iload           8
	//    8   12:aload           9
	//    9   14:aload           10
	//   10   16:invokespecial   #65  <Method void Session(int, long, long, String, String, String, int, zzb, Long)>
	//   11   19:return          
	}

	private Session(Builder builder)
	{
		this(com.google.android.gms.fitness.data.Builder.zza(builder), Builder.zzb(builder), Builder.zzc(builder), com.google.android.gms.fitness.data.Builder.zzd(builder), Builder.zze(builder), Builder.zzf(builder), ((zzb) (null)), Builder.zzg(builder));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #70  <Method long com.google.android.gms.fitness.data.Session$Builder.zza(Session$Builder)>
	//    3    5:aload_1         
	//    4    6:invokestatic    #73  <Method long Session$Builder.zzb(Session$Builder)>
	//    5    9:aload_1         
	//    6   10:invokestatic    #77  <Method String Session$Builder.zzc(Session$Builder)>
	//    7   13:aload_1         
	//    8   14:invokestatic    #80  <Method String com.google.android.gms.fitness.data.Session$Builder.zzd(Session$Builder)>
	//    9   17:aload_1         
	//   10   18:invokestatic    #83  <Method String Session$Builder.zze(Session$Builder)>
	//   11   21:aload_1         
	//   12   22:invokestatic    #87  <Method int Session$Builder.zzf(Session$Builder)>
	//   13   25:aconst_null     
	//   14   26:aload_1         
	//   15   27:invokestatic    #91  <Method Long Session$Builder.zzg(Session$Builder)>
	//   16   30:invokespecial   #93  <Method void Session(long, long, String, String, String, int, zzb, Long)>
	//   17   33:return          
	}


	public static Session extract(Intent intent)
	{
		if(intent == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		else
			return (Session)zzd.zza(intent, "vnd.google.fitness.session", CREATOR);
	//    4    6:aload_0         
	//    5    7:ldc1            #16  <String "vnd.google.fitness.session">
	//    6    9:getstatic       #41  <Field android.os.Parcelable$Creator CREATOR>
	//    7   12:invokestatic    #103 <Method com.google.android.gms.common.internal.safeparcel.SafeParcelable zzd.zza(Intent, String, android.os.Parcelable$Creator)>
	//    8   15:checkcast       #2   <Class Session>
	//    9   18:areturn         
	}

	public static String getMimeType(String s)
	{
		String s1 = String.valueOf("vnd.google.fitness.session/");
	//    0    0:ldc1            #19  <String "vnd.google.fitness.session/">
	//    1    2:invokestatic    #111 <Method String String.valueOf(Object)>
	//    2    5:astore_1        
		s = String.valueOf(((Object) (s)));
	//    3    6:aload_0         
	//    4    7:invokestatic    #111 <Method String String.valueOf(Object)>
	//    5   10:astore_0        
		if(s.length() != 0)
	//*   6   11:aload_0         
	//*   7   12:invokevirtual   #115 <Method int String.length()>
	//*   8   15:ifeq            24
			return s1.concat(s);
	//    9   18:aload_1         
	//   10   19:aload_0         
	//   11   20:invokevirtual   #118 <Method String String.concat(String)>
	//   12   23:areturn         
		else
			return new String(s1);
	//   13   24:new             #107 <Class String>
	//   14   27:dup             
	//   15   28:aload_1         
	//   16   29:invokespecial   #121 <Method void String(String)>
	//   17   32:areturn         
	}

	private boolean zza(Session session)
	{
		return zzafe == session.zzafe && zzaSt == session.zzaSt && zzaa.equal(((Object) (mName)), ((Object) (session.mName))) && zzaa.equal(((Object) (zzaUk)), ((Object) (session.zzaUk))) && zzaa.equal(((Object) (zzade)), ((Object) (session.zzade))) && zzaa.equal(((Object) (zzaUl)), ((Object) (session.zzaUl))) && zzaSu == session.zzaSu;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field long zzafe>
	//    2    4:aload_1         
	//    3    5:getfield        #48  <Field long zzafe>
	//    4    8:lcmp            
	//    5    9:ifne            93
	//    6   12:aload_0         
	//    7   13:getfield        #50  <Field long zzaSt>
	//    8   16:aload_1         
	//    9   17:getfield        #50  <Field long zzaSt>
	//   10   20:lcmp            
	//   11   21:ifne            93
	//   12   24:aload_0         
	//   13   25:getfield        #52  <Field String mName>
	//   14   28:aload_1         
	//   15   29:getfield        #52  <Field String mName>
	//   16   32:invokestatic    #128 <Method boolean zzaa.equal(Object, Object)>
	//   17   35:ifeq            93
	//   18   38:aload_0         
	//   19   39:getfield        #54  <Field String zzaUk>
	//   20   42:aload_1         
	//   21   43:getfield        #54  <Field String zzaUk>
	//   22   46:invokestatic    #128 <Method boolean zzaa.equal(Object, Object)>
	//   23   49:ifeq            93
	//   24   52:aload_0         
	//   25   53:getfield        #56  <Field String zzade>
	//   26   56:aload_1         
	//   27   57:getfield        #56  <Field String zzade>
	//   28   60:invokestatic    #128 <Method boolean zzaa.equal(Object, Object)>
	//   29   63:ifeq            93
	//   30   66:aload_0         
	//   31   67:getfield        #60  <Field zzb zzaUl>
	//   32   70:aload_1         
	//   33   71:getfield        #60  <Field zzb zzaUl>
	//   34   74:invokestatic    #128 <Method boolean zzaa.equal(Object, Object)>
	//   35   77:ifeq            93
	//   36   80:aload_0         
	//   37   81:getfield        #58  <Field int zzaSu>
	//   38   84:aload_1         
	//   39   85:getfield        #58  <Field int zzaSu>
	//   40   88:icmpne          93
	//   41   91:iconst_1        
	//   42   92:ireturn         
	//   43   93:iconst_0        
	//   44   94:ireturn         
	}

	public boolean equals(Object obj)
	{
		return obj == this || (obj instanceof Session) && zza((Session)obj);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:if_acmpeq       23
	//    3    5:aload_1         
	//    4    6:instanceof      #2   <Class Session>
	//    5    9:ifeq            25
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:checkcast       #2   <Class Session>
	//    9   17:invokespecial   #132 <Method boolean zza(Session)>
	//   10   20:ifeq            25
	//   11   23:iconst_1        
	//   12   24:ireturn         
	//   13   25:iconst_0        
	//   14   26:ireturn         
	}

	public long getActiveTime(TimeUnit timeunit)
	{
		boolean flag;
		if(zzaUm != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #62  <Field Long zzaUm>
	//*   2    4:ifnull          12
			flag = true;
	//    3    7:iconst_1        
	//    4    8:istore_2        
		else
	//*   5    9:goto            14
			flag = false;
	//    6   12:iconst_0        
	//    7   13:istore_2        
		zzac.zza(flag, "Active time is not set");
	//    8   14:iload_2         
	//    9   15:ldc1            #136 <String "Active time is not set">
	//   10   17:invokestatic    #141 <Method void zzac.zza(boolean, Object)>
		return timeunit.convert(zzaUm.longValue(), TimeUnit.MILLISECONDS);
	//   11   20:aload_1         
	//   12   21:aload_0         
	//   13   22:getfield        #62  <Field Long zzaUm>
	//   14   25:invokevirtual   #147 <Method long Long.longValue()>
	//   15   28:getstatic       #153 <Field TimeUnit TimeUnit.MILLISECONDS>
	//   16   31:invokevirtual   #157 <Method long TimeUnit.convert(long, TimeUnit)>
	//   17   34:lreturn         
	}

	public String getActivity()
	{
		return com.google.android.gms.fitness.zza.getName(zzaSu);
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field int zzaSu>
	//    2    4:invokestatic    #165 <Method String com.google.android.gms.fitness.zza.getName(int)>
	//    3    7:areturn         
	}

	public String getAppPackageName()
	{
		if(zzaUl == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #60  <Field zzb zzaUl>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return zzaUl.getPackageName();
	//    5    9:aload_0         
	//    6   10:getfield        #60  <Field zzb zzaUl>
	//    7   13:invokevirtual   #171 <Method String zzb.getPackageName()>
	//    8   16:areturn         
	}

	public String getDescription()
	{
		return zzade;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field String zzade>
	//    2    4:areturn         
	}

	public long getEndTime(TimeUnit timeunit)
	{
		return timeunit.convert(zzaSt, TimeUnit.MILLISECONDS);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #50  <Field long zzaSt>
	//    3    5:getstatic       #153 <Field TimeUnit TimeUnit.MILLISECONDS>
	//    4    8:invokevirtual   #157 <Method long TimeUnit.convert(long, TimeUnit)>
	//    5   11:lreturn         
	}

	public String getIdentifier()
	{
		return zzaUk;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field String zzaUk>
	//    2    4:areturn         
	}

	public String getName()
	{
		return mName;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field String mName>
	//    2    4:areturn         
	}

	public long getStartTime(TimeUnit timeunit)
	{
		return timeunit.convert(zzafe, TimeUnit.MILLISECONDS);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #48  <Field long zzafe>
	//    3    5:getstatic       #153 <Field TimeUnit TimeUnit.MILLISECONDS>
	//    4    8:invokevirtual   #157 <Method long TimeUnit.convert(long, TimeUnit)>
	//    5   11:lreturn         
	}

	int getVersionCode()
	{
		return zzaiI;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field int zzaiI>
	//    2    4:ireturn         
	}

	public boolean hasActiveTime()
	{
		return zzaUm != null;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field Long zzaUm>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public int hashCode()
	{
		return zzaa.hashCode(new Object[] {
			Long.valueOf(zzafe), Long.valueOf(zzaSt), zzaUk
		});
	//    0    0:iconst_3        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #48  <Field long zzafe>
	//    6   10:invokestatic    #184 <Method Long Long.valueOf(long)>
	//    7   13:aastore         
	//    8   14:dup             
	//    9   15:iconst_1        
	//   10   16:aload_0         
	//   11   17:getfield        #50  <Field long zzaSt>
	//   12   20:invokestatic    #184 <Method Long Long.valueOf(long)>
	//   13   23:aastore         
	//   14   24:dup             
	//   15   25:iconst_2        
	//   16   26:aload_0         
	//   17   27:getfield        #54  <Field String zzaUk>
	//   18   30:aastore         
	//   19   31:invokestatic    #187 <Method int zzaa.hashCode(Object[])>
	//   20   34:ireturn         
	}

	public boolean isOngoing()
	{
		return zzaSt == 0L;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field long zzaSt>
	//    2    4:lconst_0        
	//    3    5:lcmp            
	//    4    6:ifne            11
	//    5    9:iconst_1        
	//    6   10:ireturn         
	//    7   11:iconst_0        
	//    8   12:ireturn         
	}

	public String toString()
	{
		return zzaa.zzv(((Object) (this))).zzg("startTime", ((Object) (Long.valueOf(zzafe)))).zzg("endTime", ((Object) (Long.valueOf(zzaSt)))).zzg("name", ((Object) (mName))).zzg("identifier", ((Object) (zzaUk))).zzg("description", ((Object) (zzade))).zzg("activity", ((Object) (Integer.valueOf(zzaSu)))).zzg("application", ((Object) (zzaUl))).toString();
	//    0    0:aload_0         
	//    1    1:invokestatic    #193 <Method com.google.android.gms.common.internal.zzaa$zza zzaa.zzv(Object)>
	//    2    4:ldc1            #195 <String "startTime">
	//    3    6:aload_0         
	//    4    7:getfield        #48  <Field long zzafe>
	//    5   10:invokestatic    #184 <Method Long Long.valueOf(long)>
	//    6   13:invokevirtual   #200 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//    7   16:ldc1            #202 <String "endTime">
	//    8   18:aload_0         
	//    9   19:getfield        #50  <Field long zzaSt>
	//   10   22:invokestatic    #184 <Method Long Long.valueOf(long)>
	//   11   25:invokevirtual   #200 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//   12   28:ldc1            #204 <String "name">
	//   13   30:aload_0         
	//   14   31:getfield        #52  <Field String mName>
	//   15   34:invokevirtual   #200 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//   16   37:ldc1            #206 <String "identifier">
	//   17   39:aload_0         
	//   18   40:getfield        #54  <Field String zzaUk>
	//   19   43:invokevirtual   #200 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//   20   46:ldc1            #208 <String "description">
	//   21   48:aload_0         
	//   22   49:getfield        #56  <Field String zzade>
	//   23   52:invokevirtual   #200 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//   24   55:ldc1            #210 <String "activity">
	//   25   57:aload_0         
	//   26   58:getfield        #58  <Field int zzaSu>
	//   27   61:invokestatic    #215 <Method Integer Integer.valueOf(int)>
	//   28   64:invokevirtual   #200 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//   29   67:ldc1            #217 <String "application">
	//   30   69:aload_0         
	//   31   70:getfield        #60  <Field zzb zzaUl>
	//   32   73:invokevirtual   #200 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//   33   76:invokevirtual   #219 <Method String com.google.android.gms.common.internal.zzaa$zza.toString()>
	//   34   79:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.fitness.data.zzz.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #224 <Method void com.google.android.gms.fitness.data.zzz.zza(Session, Parcel, int)>
	//    4    6:return          
	}

	public long zzAm()
	{
		return zzaSt;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field long zzaSt>
	//    2    4:lreturn         
	}

	public int zzBW()
	{
		return zzaSu;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field int zzaSu>
	//    2    4:ireturn         
	}

	public zzb zzCi()
	{
		return zzaUl;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field zzb zzaUl>
	//    2    4:areturn         
	}

	public Long zzCy()
	{
		return zzaUm;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field Long zzaUm>
	//    2    4:areturn         
	}

	public long zzqn()
	{
		return zzafe;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field long zzafe>
	//    2    4:lreturn         
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzz();
	public static final String EXTRA_SESSION = "vnd.google.fitness.session";
	public static final String MIME_TYPE_PREFIX = "vnd.google.fitness.session/";
	private final String mName;
	private final long zzaSt;
	private final int zzaSu;
	private final String zzaUk;
	private final zzb zzaUl;
	private final Long zzaUm;
	private final String zzade;
	private final long zzafe;
	private final int zzaiI;

	static 
	{
	//    0    0:new             #36  <Class zzz>
	//    1    3:dup             
	//    2    4:invokespecial   #39  <Method void zzz()>
	//    3    7:putstatic       #41  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
