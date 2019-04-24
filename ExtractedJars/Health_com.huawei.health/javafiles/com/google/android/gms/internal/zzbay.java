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
import com.google.android.gms.common.stats.zzc;
import com.google.android.gms.common.stats.zze;
import com.google.android.gms.common.util.*;

public class zzbay
{

	public zzbay(Context context, int i, String s)
	{
		String s1;
		if(context == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       10
			s1 = null;
	//    2    4:aconst_null     
	//    3    5:astore          4
		else
	//*   4    7:goto            16
			s1 = context.getPackageName();
	//    5   10:aload_1         
	//    6   11:invokevirtual   #44  <Method String Context.getPackageName()>
	//    7   14:astore          4
		this(context, i, s, ((String) (null)), s1);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:iload_2         
	//   11   19:aload_3         
	//   12   20:aconst_null     
	//   13   21:aload           4
	//   14   23:invokespecial   #47  <Method void zzbay(Context, int, String, String, String)>
	//   15   26:return          
	}

	public zzbay(Context context, int i, String s, String s1, String s2)
	{
		this(context, i, s, s1, s2, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:aconst_null     
	//    7    9:invokespecial   #53  <Method void zzbay(Context, int, String, String, String, String)>
	//    8   12:return          
	}

	public zzbay(Context context, int i, String s, String s1, String s2, String s3)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #56  <Method void Object()>
		zzbEz = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #58  <Field boolean zzbEz>
		zzac.zzh(s, "Wake lock name can NOT be empty");
	//    5    9:aload_3         
	//    6   10:ldc1            #60  <String "Wake lock name can NOT be empty">
	//    7   12:invokestatic    #66  <Method String zzac.zzh(String, Object)>
	//    8   15:pop             
		zzbEx = i;
	//    9   16:aload_0         
	//   10   17:iload_2         
	//   11   18:putfield        #68  <Field int zzbEx>
		zzbEy = s1;
	//   12   21:aload_0         
	//   13   22:aload           4
	//   14   24:putfield        #70  <Field String zzbEy>
		zzaHH = s3;
	//   15   27:aload_0         
	//   16   28:aload           6
	//   17   30:putfield        #72  <Field String zzaHH>
		mContext = context.getApplicationContext();
	//   18   33:aload_0         
	//   19   34:aload_1         
	//   20   35:invokevirtual   #76  <Method Context Context.getApplicationContext()>
	//   21   38:putfield        #78  <Field Context mContext>
		if(!"com.google.android.gms".equals(((Object) (context.getPackageName()))))
	//*  22   41:ldc1            #80  <String "com.google.android.gms">
	//*  23   43:aload_1         
	//*  24   44:invokevirtual   #44  <Method String Context.getPackageName()>
	//*  25   47:invokevirtual   #86  <Method boolean String.equals(Object)>
	//*  26   50:ifne            107
		{
			s1 = String.valueOf(((Object) (zzbEv)));
	//   27   53:getstatic       #33  <Field String zzbEv>
	//   28   56:invokestatic    #90  <Method String String.valueOf(Object)>
	//   29   59:astore          4
			s3 = String.valueOf(((Object) (s)));
	//   30   61:aload_3         
	//   31   62:invokestatic    #90  <Method String String.valueOf(Object)>
	//   32   65:astore          6
			if(s3.length() != 0)
	//*  33   67:aload           6
	//*  34   69:invokevirtual   #94  <Method int String.length()>
	//*  35   72:ifeq            87
				s1 = s1.concat(s3);
	//   36   75:aload           4
	//   37   77:aload           6
	//   38   79:invokevirtual   #98  <Method String String.concat(String)>
	//   39   82:astore          4
			else
	//*  40   84:goto            98
				s1 = new String(s1);
	//   41   87:new             #82  <Class String>
	//   42   90:dup             
	//   43   91:aload           4
	//   44   93:invokespecial   #101 <Method void String(String)>
	//   45   96:astore          4
			zzaHF = s1;
	//   46   98:aload_0         
	//   47   99:aload           4
	//   48  101:putfield        #103 <Field String zzaHF>
		} else
	//*  49  104:goto            112
		{
			zzaHF = s;
	//   50  107:aload_0         
	//   51  108:aload_3         
	//   52  109:putfield        #103 <Field String zzaHF>
		}
		zzbEw = ((PowerManager)context.getSystemService("power")).newWakeLock(i, s);
	//   53  112:aload_0         
	//   54  113:aload_1         
	//   55  114:ldc1            #105 <String "power">
	//   56  116:invokevirtual   #109 <Method Object Context.getSystemService(String)>
	//   57  119:checkcast       #111 <Class PowerManager>
	//   58  122:iload_2         
	//   59  123:aload_3         
	//   60  124:invokevirtual   #115 <Method android.os.PowerManager$WakeLock PowerManager.newWakeLock(int, String)>
	//   61  127:putfield        #117 <Field android.os.PowerManager$WakeLock zzbEw>
		if(zzz.zzbf(mContext))
	//*  62  130:aload_0         
	//*  63  131:getfield        #78  <Field Context mContext>
	//*  64  134:invokestatic    #123 <Method boolean zzz.zzbf(Context)>
	//*  65  137:ifeq            175
		{
			if(zzw.zzdz(s2))
	//*  66  140:aload           5
	//*  67  142:invokestatic    #129 <Method boolean zzw.zzdz(String)>
	//*  68  145:ifeq            157
				s2 = context.getPackageName();
	//   69  148:aload_1         
	//   70  149:invokevirtual   #44  <Method String Context.getPackageName()>
	//   71  152:astore          5
	//*  72  154:goto            157
			zzbjm = zzz.zzF(context, s2);
	//   73  157:aload_0         
	//   74  158:aload_1         
	//   75  159:aload           5
	//   76  161:invokestatic    #133 <Method WorkSource zzz.zzF(Context, String)>
	//   77  164:putfield        #135 <Field WorkSource zzbjm>
			zzc(zzbjm);
	//   78  167:aload_0         
	//   79  168:aload_0         
	//   80  169:getfield        #135 <Field WorkSource zzbjm>
	//   81  172:invokevirtual   #139 <Method void zzc(WorkSource)>
		}
	//   82  175:return          
	}

	private void zzd(WorkSource worksource)
	{
		try
		{
			zzbEw.setWorkSource(worksource);
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field android.os.PowerManager$WakeLock zzbEw>
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

	private void zzgM(String s)
	{
		boolean flag = zzgN(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #160 <Method boolean zzgN(String)>
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
		if(!zzbEz)
			break MISSING_BLOCK_LABEL_42;
	//   11   15:aload_0         
	//   12   16:getfield        #58  <Field boolean zzbEz>
	//   13   19:ifeq            42
		i = zzbEA - 1;
	//   14   22:aload_0         
	//   15   23:getfield        #166 <Field int zzbEA>
	//   16   26:iconst_1        
	//   17   27:isub            
	//   18   28:istore_2        
		zzbEA = i;
	//   19   29:aload_0         
	//   20   30:iload_2         
	//   21   31:putfield        #166 <Field int zzbEA>
		if(i == 0 || flag)
			break MISSING_BLOCK_LABEL_57;
	//   22   34:iload_2         
	//   23   35:ifeq            57
	//   24   38:iload_3         
	//   25   39:ifne            57
		if(zzbEz || zzbEB != 1)
			break MISSING_BLOCK_LABEL_107;
	//   26   42:aload_0         
	//   27   43:getfield        #58  <Field boolean zzbEz>
	//   28   46:ifne            107
	//   29   49:aload_0         
	//   30   50:getfield        #168 <Field int zzbEB>
	//   31   53:iconst_1        
	//   32   54:icmpne          107
		zze.zzyX().zza(mContext, com.google.android.gms.common.stats.zzc.zza(zzbEw, s), 8, zzaHF, s, zzaHH, zzbEx, zzz.zzb(zzbjm));
	//   33   57:invokestatic    #174 <Method zze zze.zzyX()>
	//   34   60:aload_0         
	//   35   61:getfield        #78  <Field Context mContext>
	//   36   64:aload_0         
	//   37   65:getfield        #117 <Field android.os.PowerManager$WakeLock zzbEw>
	//   38   68:aload_1         
	//   39   69:invokestatic    #180 <Method String zzc.zza(android.os.PowerManager$WakeLock, String)>
	//   40   72:bipush          8
	//   41   74:aload_0         
	//   42   75:getfield        #103 <Field String zzaHF>
	//   43   78:aload_1         
	//   44   79:aload_0         
	//   45   80:getfield        #72  <Field String zzaHH>
	//   46   83:aload_0         
	//   47   84:getfield        #68  <Field int zzbEx>
	//   48   87:aload_0         
	//   49   88:getfield        #135 <Field WorkSource zzbjm>
	//   50   91:invokestatic    #184 <Method java.util.List zzz.zzb(WorkSource)>
	//   51   94:invokevirtual   #187 <Method void zze.zza(Context, String, int, String, String, String, int, java.util.List)>
		zzbEB = zzbEB - 1;
	//   52   97:aload_0         
	//   53   98:aload_0         
	//   54   99:getfield        #168 <Field int zzbEB>
	//   55  102:iconst_1        
	//   56  103:isub            
	//   57  104:putfield        #168 <Field int zzbEB>
		this;
	//   58  107:aload_0         
		JVM INSTR monitorexit ;
	//   59  108:monitorexit     
		return;
	//   60  109:return          
		s;
	//   61  110:astore_1        
	//*  62  111:aload_0         
		throw s;
	//   63  112:monitorexit     
	//   64  113:aload_1         
	//   65  114:athrow          
	}

	private boolean zzgN(String s)
	{
		return !TextUtils.isEmpty(((CharSequence) (s))) && !s.equals(((Object) (zzbEy)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #193 <Method boolean TextUtils.isEmpty(CharSequence)>
	//    2    4:ifne            20
	//    3    7:aload_1         
	//    4    8:aload_0         
	//    5    9:getfield        #70  <Field String zzbEy>
	//    6   12:invokevirtual   #86  <Method boolean String.equals(Object)>
	//    7   15:ifne            20
	//    8   18:iconst_1        
	//    9   19:ireturn         
	//   10   20:iconst_0        
	//   11   21:ireturn         
	}

	private String zzo(String s, boolean flag)
	{
		if(zzbEz)
	//*   0    0:aload_0         
	//*   1    1:getfield        #58  <Field boolean zzbEz>
	//*   2    4:ifeq            18
		{
			if(flag)
	//*   3    7:iload_2         
	//*   4    8:ifeq            13
				return s;
	//    5   11:aload_1         
	//    6   12:areturn         
			else
				return zzbEy;
	//    7   13:aload_0         
	//    8   14:getfield        #70  <Field String zzbEy>
	//    9   17:areturn         
		} else
		{
			return zzbEy;
	//   10   18:aload_0         
	//   11   19:getfield        #70  <Field String zzbEy>
	//   12   22:areturn         
		}
	}

	private void zzo(String s, long l)
	{
		boolean flag = zzgN(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #160 <Method boolean zzgN(String)>
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
		if(!zzbEz)
			break MISSING_BLOCK_LABEL_48;
	//   11   17:aload_0         
	//   12   18:getfield        #58  <Field boolean zzbEz>
	//   13   21:ifeq            48
		i = zzbEA;
	//   14   24:aload_0         
	//   15   25:getfield        #166 <Field int zzbEA>
	//   16   28:istore          4
		zzbEA = i + 1;
	//   17   30:aload_0         
	//   18   31:iload           4
	//   19   33:iconst_1        
	//   20   34:iadd            
	//   21   35:putfield        #166 <Field int zzbEA>
		if(i == 0 || flag)
			break MISSING_BLOCK_LABEL_62;
	//   22   38:iload           4
	//   23   40:ifeq            62
	//   24   43:iload           5
	//   25   45:ifne            62
		if(zzbEz || zzbEB != 0)
			break MISSING_BLOCK_LABEL_113;
	//   26   48:aload_0         
	//   27   49:getfield        #58  <Field boolean zzbEz>
	//   28   52:ifne            113
	//   29   55:aload_0         
	//   30   56:getfield        #168 <Field int zzbEB>
	//   31   59:ifne            113
		zze.zzyX().zza(mContext, com.google.android.gms.common.stats.zzc.zza(zzbEw, s), 7, zzaHF, s, zzaHH, zzbEx, zzz.zzb(zzbjm), l);
	//   32   62:invokestatic    #174 <Method zze zze.zzyX()>
	//   33   65:aload_0         
	//   34   66:getfield        #78  <Field Context mContext>
	//   35   69:aload_0         
	//   36   70:getfield        #117 <Field android.os.PowerManager$WakeLock zzbEw>
	//   37   73:aload_1         
	//   38   74:invokestatic    #180 <Method String zzc.zza(android.os.PowerManager$WakeLock, String)>
	//   39   77:bipush          7
	//   40   79:aload_0         
	//   41   80:getfield        #103 <Field String zzaHF>
	//   42   83:aload_1         
	//   43   84:aload_0         
	//   44   85:getfield        #72  <Field String zzaHH>
	//   45   88:aload_0         
	//   46   89:getfield        #68  <Field int zzbEx>
	//   47   92:aload_0         
	//   48   93:getfield        #135 <Field WorkSource zzbjm>
	//   49   96:invokestatic    #184 <Method java.util.List zzz.zzb(WorkSource)>
	//   50   99:lload_2         
	//   51  100:invokevirtual   #197 <Method void zze.zza(Context, String, int, String, String, String, int, java.util.List, long)>
		zzbEB = zzbEB + 1;
	//   52  103:aload_0         
	//   53  104:aload_0         
	//   54  105:getfield        #168 <Field int zzbEB>
	//   55  108:iconst_1        
	//   56  109:iadd            
	//   57  110:putfield        #168 <Field int zzbEB>
		this;
	//   58  113:aload_0         
		JVM INSTR monitorexit ;
	//   59  114:monitorexit     
		return;
	//   60  115:return          
		s;
	//   61  116:astore_1        
	//*  62  117:aload_0         
		throw s;
	//   63  118:monitorexit     
	//   64  119:aload_1         
	//   65  120:athrow          
	}

	public void acquire(long l)
	{
		zzt.zzzg();
	//    0    0:invokestatic    #205 <Method boolean zzt.zzzg()>
	//    1    3:pop             
		zzo(((String) (null)), l);
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:lload_1         
	//    5    7:invokespecial   #207 <Method void zzo(String, long)>
		zzbEw.acquire(l);
	//    6   10:aload_0         
	//    7   11:getfield        #117 <Field android.os.PowerManager$WakeLock zzbEw>
	//    8   14:lload_1         
	//    9   15:invokevirtual   #209 <Method void android.os.PowerManager$WakeLock.acquire(long)>
	//   10   18:return          
	}

	public boolean isHeld()
	{
		return zzbEw.isHeld();
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field android.os.PowerManager$WakeLock zzbEw>
	//    2    4:invokevirtual   #212 <Method boolean android.os.PowerManager$WakeLock.isHeld()>
	//    3    7:ireturn         
	}

	public void release()
	{
		zzgM(((String) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #215 <Method void zzgM(String)>
		zzbEw.release();
	//    3    5:aload_0         
	//    4    6:getfield        #117 <Field android.os.PowerManager$WakeLock zzbEw>
	//    5    9:invokevirtual   #217 <Method void android.os.PowerManager$WakeLock.release()>
	//    6   12:return          
	}

	public void setReferenceCounted(boolean flag)
	{
		zzbEw.setReferenceCounted(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field android.os.PowerManager$WakeLock zzbEw>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #221 <Method void android.os.PowerManager$WakeLock.setReferenceCounted(boolean)>
		zzbEz = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #58  <Field boolean zzbEz>
	//    7   13:return          
	}

	public void zzc(WorkSource worksource)
	{
		if(worksource != null && zzz.zzbf(mContext))
	//*   0    0:aload_1         
	//*   1    1:ifnull          46
	//*   2    4:aload_0         
	//*   3    5:getfield        #78  <Field Context mContext>
	//*   4    8:invokestatic    #123 <Method boolean zzz.zzbf(Context)>
	//*   5   11:ifeq            46
		{
			if(zzbjm != null)
	//*   6   14:aload_0         
	//*   7   15:getfield        #135 <Field WorkSource zzbjm>
	//*   8   18:ifnull          33
				zzbjm.add(worksource);
	//    9   21:aload_0         
	//   10   22:getfield        #135 <Field WorkSource zzbjm>
	//   11   25:aload_1         
	//   12   26:invokevirtual   #227 <Method boolean WorkSource.add(WorkSource)>
	//   13   29:pop             
			else
	//*  14   30:goto            38
				zzbjm = worksource;
	//   15   33:aload_0         
	//   16   34:aload_1         
	//   17   35:putfield        #135 <Field WorkSource zzbjm>
			zzd(zzbjm);
	//   18   38:aload_0         
	//   19   39:aload_0         
	//   20   40:getfield        #135 <Field WorkSource zzbjm>
	//   21   43:invokespecial   #229 <Method void zzd(WorkSource)>
		}
	//   22   46:return          
	}

	private static boolean DEBUG = false;
	private static String TAG = "WakeLock";
	private static String zzbEv = "*gcore*:";
	private final Context mContext;
	private final String zzaHF;
	private final String zzaHH;
	private int zzbEA;
	private int zzbEB;
	private final android.os.PowerManager.WakeLock zzbEw;
	private final int zzbEx;
	private final String zzbEy;
	private boolean zzbEz;
	private WorkSource zzbjm;

	static 
	{
	//    0    0:ldc1            #27  <String "WakeLock">
	//    1    2:putstatic       #29  <Field String TAG>
	//    2    5:ldc1            #31  <String "*gcore*:">
	//    3    7:putstatic       #33  <Field String zzbEv>
	//    4   10:iconst_0        
	//    5   11:putstatic       #35  <Field boolean DEBUG>
	//*   6   14:return          
	}
}
