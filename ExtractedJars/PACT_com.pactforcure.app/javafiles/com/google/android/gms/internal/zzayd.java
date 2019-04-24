// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.common.stats.zze;
import com.google.android.gms.common.stats.zzg;
import com.google.android.gms.common.util.*;

public class zzayd
{

	public zzayd(Context context, int i, String s)
	{
		String s1;
		if(context == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       18
			s1 = null;
	//    2    4:aconst_null     
	//    3    5:astore          4
		else
	//*   4    7:aload_0         
	//*   5    8:aload_1         
	//*   6    9:iload_2         
	//*   7   10:aload_3         
	//*   8   11:aconst_null     
	//*   9   12:aload           4
	//*  10   14:invokespecial   #41  <Method void zzayd(Context, int, String, String, String)>
	//*  11   17:return          
			s1 = context.getPackageName();
	//   12   18:aload_1         
	//   13   19:invokevirtual   #47  <Method String Context.getPackageName()>
	//   14   22:astore          4
		this(context, i, s, ((String) (null)), s1);
	//*  15   24:goto            7
	}

	public zzayd(Context context, int i, String s, String s1, String s2)
	{
		this(context, i, s, s1, s2, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:aconst_null     
	//    7    9:invokespecial   #53  <Method void zzayd(Context, int, String, String, String, String)>
	//    8   12:return          
	}

	public zzayd(Context context, int i, String s, String s1, String s2, String s3)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #56  <Method void Object()>
		zzbCx = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #58  <Field boolean zzbCx>
		zzac.zzh(s, "Wake lock name can NOT be empty");
	//    5    9:aload_3         
	//    6   10:ldc1            #60  <String "Wake lock name can NOT be empty">
	//    7   12:invokestatic    #66  <Method String zzac.zzh(String, Object)>
	//    8   15:pop             
		zzbCv = i;
	//    9   16:aload_0         
	//   10   17:iload_2         
	//   11   18:putfield        #68  <Field int zzbCv>
		zzbCw = s1;
	//   12   21:aload_0         
	//   13   22:aload           4
	//   14   24:putfield        #70  <Field String zzbCw>
		zzaGy = s3;
	//   15   27:aload_0         
	//   16   28:aload           6
	//   17   30:putfield        #72  <Field String zzaGy>
		mContext = context.getApplicationContext();
	//   18   33:aload_0         
	//   19   34:aload_1         
	//   20   35:invokevirtual   #76  <Method Context Context.getApplicationContext()>
	//   21   38:putfield        #78  <Field Context mContext>
		if(!"com.google.android.gms".equals(((Object) (context.getPackageName()))))
	//*  22   41:ldc1            #80  <String "com.google.android.gms">
	//*  23   43:aload_1         
	//*  24   44:invokevirtual   #47  <Method String Context.getPackageName()>
	//*  25   47:invokevirtual   #86  <Method boolean String.equals(Object)>
	//*  26   50:ifne            166
		{
			s1 = String.valueOf(((Object) (zzbCt)));
	//   27   53:getstatic       #33  <Field String zzbCt>
	//   28   56:invokestatic    #90  <Method String String.valueOf(Object)>
	//   29   59:astore          4
			s3 = String.valueOf(((Object) (s)));
	//   30   61:aload_3         
	//   31   62:invokestatic    #90  <Method String String.valueOf(Object)>
	//   32   65:astore          6
			if(s3.length() != 0)
	//*  33   67:aload           6
	//*  34   69:invokevirtual   #94  <Method int String.length()>
	//*  35   72:ifeq            152
				s1 = s1.concat(s3);
	//   36   75:aload           4
	//   37   77:aload           6
	//   38   79:invokevirtual   #98  <Method String String.concat(String)>
	//   39   82:astore          4
			else
	//*  40   84:aload_0         
	//*  41   85:aload           4
	//*  42   87:putfield        #100 <Field String zzaGw>
	//*  43   90:aload_0         
	//*  44   91:aload_1         
	//*  45   92:ldc1            #102 <String "power">
	//*  46   94:invokevirtual   #106 <Method Object Context.getSystemService(String)>
	//*  47   97:checkcast       #108 <Class PowerManager>
	//*  48  100:iload_2         
	//*  49  101:aload_3         
	//*  50  102:invokevirtual   #112 <Method android.os.PowerManager$WakeLock PowerManager.newWakeLock(int, String)>
	//*  51  105:putfield        #114 <Field android.os.PowerManager$WakeLock zzbCu>
	//*  52  108:aload_0         
	//*  53  109:getfield        #78  <Field Context mContext>
	//*  54  112:invokestatic    #120 <Method boolean zzy.zzaO(Context)>
	//*  55  115:ifeq            151
	//*  56  118:aload           5
	//*  57  120:astore_3        
	//*  58  121:aload           5
	//*  59  123:invokestatic    #126 <Method boolean zzv.zzdD(String)>
	//*  60  126:ifeq            134
	//*  61  129:aload_1         
	//*  62  130:invokevirtual   #47  <Method String Context.getPackageName()>
	//*  63  133:astore_3        
	//*  64  134:aload_0         
	//*  65  135:aload_1         
	//*  66  136:aload_3         
	//*  67  137:invokestatic    #130 <Method WorkSource zzy.zzy(Context, String)>
	//*  68  140:putfield        #132 <Field WorkSource zzbiJ>
	//*  69  143:aload_0         
	//*  70  144:aload_0         
	//*  71  145:getfield        #132 <Field WorkSource zzbiJ>
	//*  72  148:invokevirtual   #136 <Method void zzc(WorkSource)>
	//*  73  151:return          
				s1 = new String(s1);
	//   74  152:new             #82  <Class String>
	//   75  155:dup             
	//   76  156:aload           4
	//   77  158:invokespecial   #139 <Method void String(String)>
	//   78  161:astore          4
			zzaGw = s1;
		} else
	//*  79  163:goto            84
		{
			zzaGw = s;
	//   80  166:aload_0         
	//   81  167:aload_3         
	//   82  168:putfield        #100 <Field String zzaGw>
		}
		zzbCu = ((PowerManager)context.getSystemService("power")).newWakeLock(i, s);
		if(zzy.zzaO(mContext))
		{
			s = s2;
			if(zzv.zzdD(s2))
				s = context.getPackageName();
			zzbiJ = zzy.zzy(context, s);
			zzc(zzbiJ);
		}
	//*  83  171:goto            90
	}

	private void zzd(WorkSource worksource)
	{
		try
		{
			zzbCu.setWorkSource(worksource);
	//    0    0:aload_0         
	//    1    1:getfield        #114 <Field android.os.PowerManager$WakeLock zzbCu>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #147 <Method void android.os.PowerManager$WakeLock.setWorkSource(WorkSource)>
			return;
	//    4    8:return          
		}
		// Misplaced declaration of an exception variable
		catch(WorkSource worksource)
	//*   5    9:astore_1        
		{
			Log.wtf(TAG, ((IllegalArgumentException) (worksource)).toString());
	//    6   10:getstatic       #29  <Field String TAG>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #150 <Method String IllegalArgumentException.toString()>
	//    9   17:invokestatic    #156 <Method int Log.wtf(String, String)>
	//   10   20:pop             
		}
	//   11   21:return          
	}

	private void zzgP(String s)
	{
		boolean flag = zzgQ(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #160 <Method boolean zzgQ(String)>
	//    3    5:istore_3        
		s = zzo(s, flag);
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:iload_3         
	//    7    9:invokespecial   #164 <Method String zzo(String, boolean)>
	//    8   12:astore_1        
		this;
	//    9   13:aload_0         
		JVM INSTR monitorenter ;
	//   10   14:monitorenter    
		int i;
		if(!zzbCx)
			break MISSING_BLOCK_LABEL_42;
	//   11   15:aload_0         
	//   12   16:getfield        #58  <Field boolean zzbCx>
	//   13   19:ifeq            42
		i = zzbCy - 1;
	//   14   22:aload_0         
	//   15   23:getfield        #166 <Field int zzbCy>
	//   16   26:iconst_1        
	//   17   27:isub            
	//   18   28:istore_2        
		zzbCy = i;
	//   19   29:aload_0         
	//   20   30:iload_2         
	//   21   31:putfield        #166 <Field int zzbCy>
		if(i == 0 || flag)
			break MISSING_BLOCK_LABEL_57;
	//   22   34:iload_2         
	//   23   35:ifeq            57
	//   24   38:iload_3         
	//   25   39:ifne            57
		if(zzbCx || zzbCz != 1)
			break MISSING_BLOCK_LABEL_107;
	//   26   42:aload_0         
	//   27   43:getfield        #58  <Field boolean zzbCx>
	//   28   46:ifne            107
	//   29   49:aload_0         
	//   30   50:getfield        #168 <Field int zzbCz>
	//   31   53:iconst_1        
	//   32   54:icmpne          107
		zzg.zzyr().zza(mContext, zze.zza(zzbCu, s), 8, zzaGw, s, zzaGy, zzbCv, zzy.zzb(zzbiJ));
	//   33   57:invokestatic    #174 <Method zzg zzg.zzyr()>
	//   34   60:aload_0         
	//   35   61:getfield        #78  <Field Context mContext>
	//   36   64:aload_0         
	//   37   65:getfield        #114 <Field android.os.PowerManager$WakeLock zzbCu>
	//   38   68:aload_1         
	//   39   69:invokestatic    #180 <Method String zze.zza(android.os.PowerManager$WakeLock, String)>
	//   40   72:bipush          8
	//   41   74:aload_0         
	//   42   75:getfield        #100 <Field String zzaGw>
	//   43   78:aload_1         
	//   44   79:aload_0         
	//   45   80:getfield        #72  <Field String zzaGy>
	//   46   83:aload_0         
	//   47   84:getfield        #68  <Field int zzbCv>
	//   48   87:aload_0         
	//   49   88:getfield        #132 <Field WorkSource zzbiJ>
	//   50   91:invokestatic    #184 <Method java.util.List zzy.zzb(WorkSource)>
	//   51   94:invokevirtual   #187 <Method void zzg.zza(Context, String, int, String, String, String, int, java.util.List)>
		zzbCz = zzbCz - 1;
	//   52   97:aload_0         
	//   53   98:aload_0         
	//   54   99:getfield        #168 <Field int zzbCz>
	//   55  102:iconst_1        
	//   56  103:isub            
	//   57  104:putfield        #168 <Field int zzbCz>
		this;
	//   58  107:aload_0         
		JVM INSTR monitorexit ;
	//   59  108:monitorexit     
		return;
	//   60  109:return          
		s;
	//   61  110:astore_1        
		this;
	//   62  111:aload_0         
		JVM INSTR monitorexit ;
	//   63  112:monitorexit     
		throw s;
	//   64  113:aload_1         
	//   65  114:athrow          
	}

	private boolean zzgQ(String s)
	{
		return !TextUtils.isEmpty(((CharSequence) (s))) && !s.equals(((Object) (zzbCw)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #193 <Method boolean TextUtils.isEmpty(CharSequence)>
	//    2    4:ifne            20
	//    3    7:aload_1         
	//    4    8:aload_0         
	//    5    9:getfield        #70  <Field String zzbCw>
	//    6   12:invokevirtual   #86  <Method boolean String.equals(Object)>
	//    7   15:ifne            20
	//    8   18:iconst_1        
	//    9   19:ireturn         
	//   10   20:iconst_0        
	//   11   21:ireturn         
	}

	private void zzm(String s, long l)
	{
		boolean flag = zzgQ(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #160 <Method boolean zzgQ(String)>
	//    3    5:istore          5
		s = zzo(s, flag);
	//    4    7:aload_0         
	//    5    8:aload_1         
	//    6    9:iload           5
	//    7   11:invokespecial   #164 <Method String zzo(String, boolean)>
	//    8   14:astore_1        
		this;
	//    9   15:aload_0         
		JVM INSTR monitorenter ;
	//   10   16:monitorenter    
		int i;
		if(!zzbCx)
			break MISSING_BLOCK_LABEL_48;
	//   11   17:aload_0         
	//   12   18:getfield        #58  <Field boolean zzbCx>
	//   13   21:ifeq            48
		i = zzbCy;
	//   14   24:aload_0         
	//   15   25:getfield        #166 <Field int zzbCy>
	//   16   28:istore          4
		zzbCy = i + 1;
	//   17   30:aload_0         
	//   18   31:iload           4
	//   19   33:iconst_1        
	//   20   34:iadd            
	//   21   35:putfield        #166 <Field int zzbCy>
		if(i == 0 || flag)
			break MISSING_BLOCK_LABEL_62;
	//   22   38:iload           4
	//   23   40:ifeq            62
	//   24   43:iload           5
	//   25   45:ifne            62
		if(zzbCx || zzbCz != 0)
			break MISSING_BLOCK_LABEL_113;
	//   26   48:aload_0         
	//   27   49:getfield        #58  <Field boolean zzbCx>
	//   28   52:ifne            113
	//   29   55:aload_0         
	//   30   56:getfield        #168 <Field int zzbCz>
	//   31   59:ifne            113
		zzg.zzyr().zza(mContext, zze.zza(zzbCu, s), 7, zzaGw, s, zzaGy, zzbCv, zzy.zzb(zzbiJ), l);
	//   32   62:invokestatic    #174 <Method zzg zzg.zzyr()>
	//   33   65:aload_0         
	//   34   66:getfield        #78  <Field Context mContext>
	//   35   69:aload_0         
	//   36   70:getfield        #114 <Field android.os.PowerManager$WakeLock zzbCu>
	//   37   73:aload_1         
	//   38   74:invokestatic    #180 <Method String zze.zza(android.os.PowerManager$WakeLock, String)>
	//   39   77:bipush          7
	//   40   79:aload_0         
	//   41   80:getfield        #100 <Field String zzaGw>
	//   42   83:aload_1         
	//   43   84:aload_0         
	//   44   85:getfield        #72  <Field String zzaGy>
	//   45   88:aload_0         
	//   46   89:getfield        #68  <Field int zzbCv>
	//   47   92:aload_0         
	//   48   93:getfield        #132 <Field WorkSource zzbiJ>
	//   49   96:invokestatic    #184 <Method java.util.List zzy.zzb(WorkSource)>
	//   50   99:lload_2         
	//   51  100:invokevirtual   #198 <Method void zzg.zza(Context, String, int, String, String, String, int, java.util.List, long)>
		zzbCz = zzbCz + 1;
	//   52  103:aload_0         
	//   53  104:aload_0         
	//   54  105:getfield        #168 <Field int zzbCz>
	//   55  108:iconst_1        
	//   56  109:iadd            
	//   57  110:putfield        #168 <Field int zzbCz>
		this;
	//   58  113:aload_0         
		JVM INSTR monitorexit ;
	//   59  114:monitorexit     
		return;
	//   60  115:return          
		s;
	//   61  116:astore_1        
		this;
	//   62  117:aload_0         
		JVM INSTR monitorexit ;
	//   63  118:monitorexit     
		throw s;
	//   64  119:aload_1         
	//   65  120:athrow          
	}

	private String zzo(String s, boolean flag)
	{
		if(zzbCx)
	//*   0    0:aload_0         
	//*   1    1:getfield        #58  <Field boolean zzbCx>
	//*   2    4:ifeq            18
		{
			if(flag)
	//*   3    7:iload_2         
	//*   4    8:ifeq            13
				return s;
	//    5   11:aload_1         
	//    6   12:areturn         
			else
				return zzbCw;
	//    7   13:aload_0         
	//    8   14:getfield        #70  <Field String zzbCw>
	//    9   17:areturn         
		} else
		{
			return zzbCw;
	//   10   18:aload_0         
	//   11   19:getfield        #70  <Field String zzbCw>
	//   12   22:areturn         
		}
	}

	public void acquire(long l)
	{
		if(!zzs.zzyA() && zzbCx)
	//*   0    0:invokestatic    #206 <Method boolean zzs.zzyA()>
	//*   1    3:ifne            47
	//*   2    6:aload_0         
	//*   3    7:getfield        #58  <Field boolean zzbCx>
	//*   4   10:ifeq            47
		{
			String s1 = TAG;
	//    5   13:getstatic       #29  <Field String TAG>
	//    6   16:astore          4
			String s = String.valueOf(((Object) (zzaGw)));
	//    7   18:aload_0         
	//    8   19:getfield        #100 <Field String zzaGw>
	//    9   22:invokestatic    #90  <Method String String.valueOf(Object)>
	//   10   25:astore_3        
			if(s.length() != 0)
	//*  11   26:aload_3         
	//*  12   27:invokevirtual   #94  <Method int String.length()>
	//*  13   30:ifeq            62
				s = "Do not acquire with timeout on reference counted WakeLocks before ICS. wakelock: ".concat(s);
	//   14   33:ldc1            #208 <String "Do not acquire with timeout on reference counted WakeLocks before ICS. wakelock: ">
	//   15   35:aload_3         
	//   16   36:invokevirtual   #98  <Method String String.concat(String)>
	//   17   39:astore_3        
			else
	//*  18   40:aload           4
	//*  19   42:aload_3         
	//*  20   43:invokestatic    #156 <Method int Log.wtf(String, String)>
	//*  21   46:pop             
	//*  22   47:aload_0         
	//*  23   48:aconst_null     
	//*  24   49:lload_1         
	//*  25   50:invokespecial   #210 <Method void zzm(String, long)>
	//*  26   53:aload_0         
	//*  27   54:getfield        #114 <Field android.os.PowerManager$WakeLock zzbCu>
	//*  28   57:lload_1         
	//*  29   58:invokevirtual   #212 <Method void android.os.PowerManager$WakeLock.acquire(long)>
	//*  30   61:return          
				s = new String("Do not acquire with timeout on reference counted WakeLocks before ICS. wakelock: ");
	//   31   62:new             #82  <Class String>
	//   32   65:dup             
	//   33   66:ldc1            #208 <String "Do not acquire with timeout on reference counted WakeLocks before ICS. wakelock: ">
	//   34   68:invokespecial   #139 <Method void String(String)>
	//   35   71:astore_3        
			Log.wtf(s1, s);
		}
		zzm(((String) (null)), l);
		zzbCu.acquire(l);
	//*  36   72:goto            40
	}

	public boolean isHeld()
	{
		return zzbCu.isHeld();
	//    0    0:aload_0         
	//    1    1:getfield        #114 <Field android.os.PowerManager$WakeLock zzbCu>
	//    2    4:invokevirtual   #215 <Method boolean android.os.PowerManager$WakeLock.isHeld()>
	//    3    7:ireturn         
	}

	public void release()
	{
		zzgP(((String) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #218 <Method void zzgP(String)>
		zzbCu.release();
	//    3    5:aload_0         
	//    4    6:getfield        #114 <Field android.os.PowerManager$WakeLock zzbCu>
	//    5    9:invokevirtual   #220 <Method void android.os.PowerManager$WakeLock.release()>
	//    6   12:return          
	}

	public void setReferenceCounted(boolean flag)
	{
		zzbCu.setReferenceCounted(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #114 <Field android.os.PowerManager$WakeLock zzbCu>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #224 <Method void android.os.PowerManager$WakeLock.setReferenceCounted(boolean)>
		zzbCx = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #58  <Field boolean zzbCx>
	//    7   13:return          
	}

	public void zzc(WorkSource worksource)
	{
		if(worksource != null && zzy.zzaO(mContext))
	//*   0    0:aload_1         
	//*   1    1:ifnull          38
	//*   2    4:aload_0         
	//*   3    5:getfield        #78  <Field Context mContext>
	//*   4    8:invokestatic    #120 <Method boolean zzy.zzaO(Context)>
	//*   5   11:ifeq            38
		{
			if(zzbiJ != null)
	//*   6   14:aload_0         
	//*   7   15:getfield        #132 <Field WorkSource zzbiJ>
	//*   8   18:ifnull          39
				zzbiJ.add(worksource);
	//    9   21:aload_0         
	//   10   22:getfield        #132 <Field WorkSource zzbiJ>
	//   11   25:aload_1         
	//   12   26:invokevirtual   #230 <Method boolean WorkSource.add(WorkSource)>
	//   13   29:pop             
			else
	//*  14   30:aload_0         
	//*  15   31:aload_0         
	//*  16   32:getfield        #132 <Field WorkSource zzbiJ>
	//*  17   35:invokespecial   #232 <Method void zzd(WorkSource)>
	//*  18   38:return          
				zzbiJ = worksource;
	//   19   39:aload_0         
	//   20   40:aload_1         
	//   21   41:putfield        #132 <Field WorkSource zzbiJ>
			zzd(zzbiJ);
		}
	//*  22   44:goto            30
	}

	private static boolean DEBUG = false;
	private static String TAG = "WakeLock";
	private static String zzbCt = "*gcore*:";
	private final Context mContext;
	private final String zzaGw;
	private final String zzaGy;
	private final android.os.PowerManager.WakeLock zzbCu;
	private final int zzbCv;
	private final String zzbCw;
	private boolean zzbCx;
	private int zzbCy;
	private int zzbCz;
	private WorkSource zzbiJ;

	static 
	{
	//    0    0:ldc1            #27  <String "WakeLock">
	//    1    2:putstatic       #29  <Field String TAG>
	//    2    5:ldc1            #31  <String "*gcore*:">
	//    3    7:putstatic       #33  <Field String zzbCt>
	//    4   10:iconst_0        
	//    5   11:putstatic       #35  <Field boolean DEBUG>
	//*   6   14:return          
	}
}
