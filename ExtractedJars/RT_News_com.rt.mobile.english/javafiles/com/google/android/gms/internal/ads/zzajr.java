// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.Clock;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzakb, zzajm, zzakd, zznk, 
//			zzkb, zzni, zzjj

public final class zzajr
{

	public zzajr(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		zzcqd = -1L;
	//    2    4:aload_0         
	//    3    5:ldc2w           #27  <Long -1L>
	//    4    8:putfield        #30  <Field long zzcqd>
		zzcqe = -1L;
	//    5   11:aload_0         
	//    6   12:ldc2w           #27  <Long -1L>
	//    7   15:putfield        #32  <Field long zzcqe>
		zzcqf = -1;
	//    8   18:aload_0         
	//    9   19:iconst_m1       
	//   10   20:putfield        #34  <Field int zzcqf>
		zzcqg = -1;
	//   11   23:aload_0         
	//   12   24:iconst_m1       
	//   13   25:putfield        #36  <Field int zzcqg>
		zzcqh = 0L;
	//   14   28:aload_0         
	//   15   29:lconst_0        
	//   16   30:putfield        #38  <Field long zzcqh>
	//   17   33:aload_0         
	//   18   34:new             #4   <Class Object>
	//   19   37:dup             
	//   20   38:invokespecial   #26  <Method void Object()>
	//   21   41:putfield        #40  <Field Object mLock>
		zzcqi = 0;
	//   22   44:aload_0         
	//   23   45:iconst_0        
	//   24   46:putfield        #42  <Field int zzcqi>
		zzcqj = 0;
	//   25   49:aload_0         
	//   26   50:iconst_0        
	//   27   51:putfield        #44  <Field int zzcqj>
		zzasc = s;
	//   28   54:aload_0         
	//   29   55:aload_1         
	//   30   56:putfield        #46  <Field String zzasc>
	//   31   59:return          
	}

	private static boolean zzah(Context context)
	{
		int i = context.getResources().getIdentifier("Theme.Translucent", "style", "android");
	//    0    0:aload_0         
	//    1    1:invokevirtual   #57  <Method Resources Context.getResources()>
	//    2    4:ldc1            #59  <String "Theme.Translucent">
	//    3    6:ldc1            #61  <String "style">
	//    4    8:ldc1            #63  <String "android">
	//    5   10:invokevirtual   #69  <Method int Resources.getIdentifier(String, String, String)>
	//    6   13:istore_1        
		if(i != 0) goto _L2; else goto _L1
	//    7   14:iload_1         
	//    8   15:ifne            25
_L1:
		zzakb.zzdj("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
	//    9   18:ldc1            #71  <String "Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.">
	//   10   20:invokestatic    #76  <Method void zzakb.zzdj(String)>
		return false;
	//   11   23:iconst_0        
	//   12   24:ireturn         
_L2:
		ComponentName componentname = new ComponentName(context.getPackageName(), "com.google.android.gms.ads.AdActivity");
	//   13   25:new             #78  <Class ComponentName>
	//   14   28:dup             
	//   15   29:aload_0         
	//   16   30:invokevirtual   #82  <Method String Context.getPackageName()>
	//   17   33:ldc1            #84  <String "com.google.android.gms.ads.AdActivity">
	//   18   35:invokespecial   #87  <Method void ComponentName(String, String)>
	//   19   38:astore_2        
		if(i == context.getPackageManager().getActivityInfo(componentname, 0).theme)
	//*  20   39:iload_1         
	//*  21   40:aload_0         
	//*  22   41:invokevirtual   #91  <Method PackageManager Context.getPackageManager()>
	//*  23   44:aload_2         
	//*  24   45:iconst_0        
	//*  25   46:invokevirtual   #97  <Method ActivityInfo PackageManager.getActivityInfo(ComponentName, int)>
	//*  26   49:getfield        #102 <Field int ActivityInfo.theme>
	//*  27   52:icmpne          57
			return true;
	//   28   55:iconst_1        
	//   29   56:ireturn         
		zzakb.zzdj("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
	//   30   57:ldc1            #71  <String "Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.">
	//   31   59:invokestatic    #76  <Method void zzakb.zzdj(String)>
		return false;
	//   32   62:iconst_0        
	//   33   63:ireturn         
_L4:
		zzakb.zzdk("Fail to fetch AdActivity theme");
	//   34   64:ldc1            #104 <String "Fail to fetch AdActivity theme">
	//   35   66:invokestatic    #107 <Method void zzakb.zzdk(String)>
		if(true) goto _L1; else goto _L3
	//   36   69:goto            18
_L3:
		context;
	//   37   72:astore_0        
		  goto _L4
	//*  38   73:goto            64
	}

	public final void zzb(zzjj zzjj1, long l)
	{
		Object obj = mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field Object mLock>
	//    2    4:astore          10
		obj;
	//    3    6:aload           10
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		long l2;
		long l3;
		l3 = zzbv.zzeo().zzqh().zzrb();
	//    5    9:invokestatic    #115 <Method zzajm zzbv.zzeo()>
	//    6   12:invokevirtual   #121 <Method zzakd zzajm.zzqh()>
	//    7   15:invokevirtual   #127 <Method long zzakd.zzrb()>
	//    8   18:lstore          8
		l2 = zzbv.zzer().currentTimeMillis();
	//    9   20:invokestatic    #131 <Method Clock zzbv.zzer()>
	//   10   23:invokeinterface #136 <Method long Clock.currentTimeMillis()>
	//   11   28:lstore          6
		long l1 = l;
	//   12   30:lload_2         
	//   13   31:lstore          4
		if(zzcqe != -1L)
			break MISSING_BLOCK_LABEL_104;
	//   14   33:aload_0         
	//   15   34:getfield        #32  <Field long zzcqe>
	//   16   37:ldc2w           #27  <Long -1L>
	//   17   40:lcmp            
	//   18   41:ifne            104
		zzna zzna = zznk.zzayi;
	//   19   44:getstatic       #142 <Field zzna zznk.zzayi>
	//   20   47:astore          11
		if(l2 - l3 > ((Long)zzkb.zzik().zzd(zzna)).longValue())
	//*  21   49:lload           6
	//*  22   51:lload           8
	//*  23   53:lsub            
	//*  24   54:invokestatic    #148 <Method zzni zzkb.zzik()>
	//*  25   57:aload           11
	//*  26   59:invokevirtual   #154 <Method Object zzni.zzd(zzna)>
	//*  27   62:checkcast       #156 <Class Long>
	//*  28   65:invokevirtual   #159 <Method long Long.longValue()>
	//*  29   68:lcmp            
	//*  30   69:ifle            80
		{
			zzcqg = -1;
	//   31   72:aload_0         
	//   32   73:iconst_m1       
	//   33   74:putfield        #36  <Field int zzcqg>
			break MISSING_BLOCK_LABEL_93;
	//   34   77:goto            93
		}
		zzcqg = zzbv.zzeo().zzqh().zzrc();
	//   35   80:aload_0         
	//   36   81:invokestatic    #115 <Method zzajm zzbv.zzeo()>
	//   37   84:invokevirtual   #121 <Method zzakd zzajm.zzqh()>
	//   38   87:invokevirtual   #163 <Method int zzakd.zzrc()>
	//   39   90:putfield        #36  <Field int zzcqg>
		zzcqe = l;
	//   40   93:aload_0         
	//   41   94:lload_2         
	//   42   95:putfield        #32  <Field long zzcqe>
		l1 = zzcqe;
	//   43   98:aload_0         
	//   44   99:getfield        #32  <Field long zzcqe>
	//   45  102:lstore          4
		zzcqd = l1;
	//   46  104:aload_0         
	//   47  105:lload           4
	//   48  107:putfield        #30  <Field long zzcqd>
		if(zzjj1 == null)
			break MISSING_BLOCK_LABEL_139;
	//   49  110:aload_1         
	//   50  111:ifnull          139
		if(zzjj1.extras == null || zzjj1.extras.getInt("gw", 2) != 1)
			break MISSING_BLOCK_LABEL_139;
	//   51  114:aload_1         
	//   52  115:getfield        #169 <Field Bundle zzjj.extras>
	//   53  118:ifnull          139
	//   54  121:aload_1         
	//   55  122:getfield        #169 <Field Bundle zzjj.extras>
	//   56  125:ldc1            #171 <String "gw">
	//   57  127:iconst_2        
	//   58  128:invokevirtual   #177 <Method int Bundle.getInt(String, int)>
	//   59  131:iconst_1        
	//   60  132:icmpne          139
		obj;
	//   61  135:aload           10
		JVM INSTR monitorexit ;
	//   62  137:monitorexit     
		return;
	//   63  138:return          
		zzcqf = zzcqf + 1;
	//   64  139:aload_0         
	//   65  140:aload_0         
	//   66  141:getfield        #34  <Field int zzcqf>
	//   67  144:iconst_1        
	//   68  145:iadd            
	//   69  146:putfield        #34  <Field int zzcqf>
		zzcqg = zzcqg + 1;
	//   70  149:aload_0         
	//   71  150:aload_0         
	//   72  151:getfield        #36  <Field int zzcqg>
	//   73  154:iconst_1        
	//   74  155:iadd            
	//   75  156:putfield        #36  <Field int zzcqg>
		if(zzcqg == 0)
	//*  76  159:aload_0         
	//*  77  160:getfield        #36  <Field int zzcqg>
	//*  78  163:ifne            185
		{
			zzcqh = 0L;
	//   79  166:aload_0         
	//   80  167:lconst_0        
	//   81  168:putfield        #38  <Field long zzcqh>
			zzbv.zzeo().zzqh().zzk(l2);
	//   82  171:invokestatic    #115 <Method zzajm zzbv.zzeo()>
	//   83  174:invokevirtual   #121 <Method zzakd zzajm.zzqh()>
	//   84  177:lload           6
	//   85  179:invokevirtual   #181 <Method void zzakd.zzk(long)>
			break MISSING_BLOCK_LABEL_201;
	//   86  182:goto            201
		}
		zzcqh = l2 - zzbv.zzeo().zzqh().zzrd();
	//   87  185:aload_0         
	//   88  186:lload           6
	//   89  188:invokestatic    #115 <Method zzajm zzbv.zzeo()>
	//   90  191:invokevirtual   #121 <Method zzakd zzajm.zzqh()>
	//   91  194:invokevirtual   #184 <Method long zzakd.zzrd()>
	//   92  197:lsub            
	//   93  198:putfield        #38  <Field long zzcqh>
		obj;
	//   94  201:aload           10
		JVM INSTR monitorexit ;
	//   95  203:monitorexit     
		return;
	//   96  204:return          
		zzjj1;
	//   97  205:astore_1        
		obj;
	//   98  206:aload           10
		JVM INSTR monitorexit ;
	//   99  208:monitorexit     
		throw zzjj1;
	//  100  209:aload_1         
	//  101  210:athrow          
	}

	public final Bundle zzk(Context context, String s)
	{
		Bundle bundle;
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #40  <Field Object mLock>
	//*   2    4:astore_3        
	//*   3    5:aload_3         
	//*   4    6:monitorenter    
		{
			bundle = new Bundle();
	//    5    7:new             #173 <Class Bundle>
	//    6   10:dup             
	//    7   11:invokespecial   #186 <Method void Bundle()>
	//    8   14:astore          4
			bundle.putString("session_id", zzasc);
	//    9   16:aload           4
	//   10   18:ldc1            #188 <String "session_id">
	//   11   20:aload_0         
	//   12   21:getfield        #46  <Field String zzasc>
	//   13   24:invokevirtual   #191 <Method void Bundle.putString(String, String)>
			bundle.putLong("basets", zzcqe);
	//   14   27:aload           4
	//   15   29:ldc1            #193 <String "basets">
	//   16   31:aload_0         
	//   17   32:getfield        #32  <Field long zzcqe>
	//   18   35:invokevirtual   #197 <Method void Bundle.putLong(String, long)>
			bundle.putLong("currts", zzcqd);
	//   19   38:aload           4
	//   20   40:ldc1            #199 <String "currts">
	//   21   42:aload_0         
	//   22   43:getfield        #30  <Field long zzcqd>
	//   23   46:invokevirtual   #197 <Method void Bundle.putLong(String, long)>
			bundle.putString("seq_num", s);
	//   24   49:aload           4
	//   25   51:ldc1            #201 <String "seq_num">
	//   26   53:aload_2         
	//   27   54:invokevirtual   #191 <Method void Bundle.putString(String, String)>
			bundle.putInt("preqs", zzcqf);
	//   28   57:aload           4
	//   29   59:ldc1            #203 <String "preqs">
	//   30   61:aload_0         
	//   31   62:getfield        #34  <Field int zzcqf>
	//   32   65:invokevirtual   #207 <Method void Bundle.putInt(String, int)>
			bundle.putInt("preqs_in_session", zzcqg);
	//   33   68:aload           4
	//   34   70:ldc1            #209 <String "preqs_in_session">
	//   35   72:aload_0         
	//   36   73:getfield        #36  <Field int zzcqg>
	//   37   76:invokevirtual   #207 <Method void Bundle.putInt(String, int)>
			bundle.putLong("time_in_session", zzcqh);
	//   38   79:aload           4
	//   39   81:ldc1            #211 <String "time_in_session">
	//   40   83:aload_0         
	//   41   84:getfield        #38  <Field long zzcqh>
	//   42   87:invokevirtual   #197 <Method void Bundle.putLong(String, long)>
			bundle.putInt("pclick", zzcqi);
	//   43   90:aload           4
	//   44   92:ldc1            #213 <String "pclick">
	//   45   94:aload_0         
	//   46   95:getfield        #42  <Field int zzcqi>
	//   47   98:invokevirtual   #207 <Method void Bundle.putInt(String, int)>
			bundle.putInt("pimp", zzcqj);
	//   48  101:aload           4
	//   49  103:ldc1            #215 <String "pimp">
	//   50  105:aload_0         
	//   51  106:getfield        #44  <Field int zzcqj>
	//   52  109:invokevirtual   #207 <Method void Bundle.putInt(String, int)>
			bundle.putBoolean("support_transparent_background", zzah(context));
	//   53  112:aload           4
	//   54  114:ldc1            #217 <String "support_transparent_background">
	//   55  116:aload_1         
	//   56  117:invokestatic    #219 <Method boolean zzah(Context)>
	//   57  120:invokevirtual   #223 <Method void Bundle.putBoolean(String, boolean)>
		}
	//   58  123:aload_3         
	//   59  124:monitorexit     
		return bundle;
	//   60  125:aload           4
	//   61  127:areturn         
		context;
	//   62  128:astore_1        
		obj;
	//   63  129:aload_3         
		JVM INSTR monitorexit ;
	//   64  130:monitorexit     
		throw context;
	//   65  131:aload_1         
	//   66  132:athrow          
	}

	public final void zzpm()
	{
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #40  <Field Object mLock>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			zzcqj = zzcqj + 1;
	//    5    7:aload_0         
	//    6    8:aload_0         
	//    7    9:getfield        #44  <Field int zzcqj>
	//    8   12:iconst_1        
	//    9   13:iadd            
	//   10   14:putfield        #44  <Field int zzcqj>
		}
	//   11   17:aload_1         
	//   12   18:monitorexit     
		return;
	//   13   19:return          
		exception;
	//   14   20:astore_2        
		obj;
	//   15   21:aload_1         
		JVM INSTR monitorexit ;
	//   16   22:monitorexit     
		throw exception;
	//   17   23:aload_2         
	//   18   24:athrow          
	}

	public final void zzpn()
	{
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #40  <Field Object mLock>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			zzcqi = zzcqi + 1;
	//    5    7:aload_0         
	//    6    8:aload_0         
	//    7    9:getfield        #42  <Field int zzcqi>
	//    8   12:iconst_1        
	//    9   13:iadd            
	//   10   14:putfield        #42  <Field int zzcqi>
		}
	//   11   17:aload_1         
	//   12   18:monitorexit     
		return;
	//   13   19:return          
		exception;
	//   14   20:astore_2        
		obj;
	//   15   21:aload_1         
		JVM INSTR monitorexit ;
	//   16   22:monitorexit     
		throw exception;
	//   17   23:aload_2         
	//   18   24:athrow          
	}

	private final Object mLock = new Object();
	private final String zzasc;
	private long zzcqd;
	private long zzcqe;
	private int zzcqf;
	int zzcqg;
	private long zzcqh;
	private int zzcqi;
	private int zzcqj;
}
