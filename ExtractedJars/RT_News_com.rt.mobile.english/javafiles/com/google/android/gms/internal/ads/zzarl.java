// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.util.CollectionUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzlp, zzaoe, zzarm, zzapw, 
//			zzarn, zzlr, zzakb, zzmu

public final class zzarl extends zzlp
{

	public zzarl(zzapw zzapw1, float f, boolean flag, boolean flag1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void zzlp()>
	//    2    4:aload_0         
	//    3    5:new             #34  <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #35  <Method void Object()>
	//    6   12:putfield        #37  <Field Object lock>
		zzdei = true;
	//    7   15:aload_0         
	//    8   16:iconst_1        
	//    9   17:putfield        #39  <Field boolean zzdei>
		zzato = true;
	//   10   20:aload_0         
	//   11   21:iconst_1        
	//   12   22:putfield        #41  <Field boolean zzato>
		zzcyg = zzapw1;
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:putfield        #43  <Field zzapw zzcyg>
		zzdef = f;
	//   16   30:aload_0         
	//   17   31:fload_2         
	//   18   32:putfield        #45  <Field float zzdef>
		zzded = flag;
	//   19   35:aload_0         
	//   20   36:iload_3         
	//   21   37:putfield        #47  <Field boolean zzded>
		zzdee = flag1;
	//   22   40:aload_0         
	//   23   41:iload           4
	//   24   43:putfield        #49  <Field boolean zzdee>
	//   25   46:return          
	}

	private final void zzf(String s, Map map)
	{
		if(map == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       15
			map = ((Map) (new HashMap()));
	//    2    4:new             #55  <Class HashMap>
	//    3    7:dup             
	//    4    8:invokespecial   #56  <Method void HashMap()>
	//    5   11:astore_2        
		else
	//*   6   12:goto            24
			map = ((Map) (new HashMap(map)));
	//    7   15:new             #55  <Class HashMap>
	//    8   18:dup             
	//    9   19:aload_2         
	//   10   20:invokespecial   #59  <Method void HashMap(Map)>
	//   11   23:astore_2        
		map.put("action", ((Object) (s)));
	//   12   24:aload_2         
	//   13   25:ldc1            #61  <String "action">
	//   14   27:aload_1         
	//   15   28:invokeinterface #67  <Method Object Map.put(Object, Object)>
	//   16   33:pop             
		zzaoe.zzcvy.execute(((Runnable) (new zzarm(this, map))));
	//   17   34:getstatic       #73  <Field Executor zzaoe.zzcvy>
	//   18   37:new             #75  <Class zzarm>
	//   19   40:dup             
	//   20   41:aload_0         
	//   21   42:aload_2         
	//   22   43:invokespecial   #78  <Method void zzarm(zzarl, Map)>
	//   23   46:invokeinterface #84  <Method void Executor.execute(Runnable)>
	//   24   51:return          
	}

	public final float getAspectRatio()
	{
		float f;
		synchronized(lock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #37  <Field Object lock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			f = zzdek;
	//    5    7:aload_0         
	//    6    8:getfield        #91  <Field float zzdek>
	//    7   11:fstore_1        
		}
	//    8   12:aload_2         
	//    9   13:monitorexit     
		return f;
	//   10   14:fload_1         
	//   11   15:freturn         
		exception;
	//   12   16:astore_3        
		obj;
	//   13   17:aload_2         
		JVM INSTR monitorexit ;
	//   14   18:monitorexit     
		throw exception;
	//   15   19:aload_3         
	//   16   20:athrow          
	}

	public final int getPlaybackState()
	{
		int i;
		synchronized(lock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #37  <Field Object lock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			i = zzdeg;
	//    5    7:aload_0         
	//    6    8:getfield        #95  <Field int zzdeg>
	//    7   11:istore_1        
		}
	//    8   12:aload_2         
	//    9   13:monitorexit     
		return i;
	//   10   14:iload_1         
	//   11   15:ireturn         
		exception;
	//   12   16:astore_3        
		obj;
	//   13   17:aload_2         
		JVM INSTR monitorexit ;
	//   14   18:monitorexit     
		throw exception;
	//   15   19:aload_3         
	//   16   20:athrow          
	}

	public final boolean isClickToExpandEnabled()
	{
		boolean flag = isCustomControlsEnabled();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #100 <Method boolean isCustomControlsEnabled()>
	//    2    4:istore_1        
		Object obj = lock;
	//    3    5:aload_0         
	//    4    6:getfield        #37  <Field Object lock>
	//    5    9:astore_2        
		obj;
	//    6   10:aload_2         
		JVM INSTR monitorenter ;
	//    7   11:monitorenter    
		if(flag) goto _L2; else goto _L1
	//    8   12:iload_1         
	//    9   13:ifne            47
_L1:
		if(!zzatq || !zzdee) goto _L2; else goto _L3
	//   10   16:aload_0         
	//   11   17:getfield        #102 <Field boolean zzatq>
	//   12   20:ifeq            47
	//   13   23:aload_0         
	//   14   24:getfield        #49  <Field boolean zzdee>
	//   15   27:ifeq            47
_L3:
		flag = true;
	//   16   30:iconst_1        
	//   17   31:istore_1        
	//*  18   32:goto            35
_L6:
		obj;
	//   19   35:aload_2         
		JVM INSTR monitorexit ;
	//   20   36:monitorexit     
		return flag;
	//   21   37:iload_1         
	//   22   38:ireturn         
_L4:
		obj;
	//   23   39:aload_2         
		JVM INSTR monitorexit ;
	//   24   40:monitorexit     
		Exception exception;
		throw exception;
	//   25   41:aload_3         
	//   26   42:athrow          
		exception;
	//   27   43:astore_3        
		if(true) goto _L4; else goto _L2
	//   28   44:goto            39
_L2:
		flag = false;
	//   29   47:iconst_0        
	//   30   48:istore_1        
		if(true) goto _L6; else goto _L5
	//   31   49:goto            35
_L5:
	}

	public final boolean isCustomControlsEnabled()
	{
		Object obj = lock;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field Object lock>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		boolean flag;
		Exception exception;
		if(zzded && zzatp)
	//*   5    7:aload_0         
	//*   6    8:getfield        #47  <Field boolean zzded>
	//*   7   11:ifeq            35
	//*   8   14:aload_0         
	//*   9   15:getfield        #104 <Field boolean zzatp>
	//*  10   18:ifeq            35
			flag = true;
	//   11   21:iconst_1        
	//   12   22:istore_1        
		else
	//*  13   23:goto            26
	//*  14   26:aload_2         
	//*  15   27:monitorexit     
	//*  16   28:iload_1         
	//*  17   29:ireturn         
	//*  18   30:astore_3        
	//*  19   31:aload_2         
	//*  20   32:monitorexit     
	//*  21   33:aload_3         
	//*  22   34:athrow          
			flag = false;
	//   23   35:iconst_0        
	//   24   36:istore_1        
		obj;
		JVM INSTR monitorexit ;
		return flag;
		exception;
		obj;
		JVM INSTR monitorexit ;
		throw exception;
	//*  25   37:goto            26
	}

	public final boolean isMuted()
	{
		boolean flag;
		synchronized(lock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #37  <Field Object lock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			flag = zzdei;
	//    5    7:aload_0         
	//    6    8:getfield        #39  <Field boolean zzdei>
	//    7   11:istore_1        
		}
	//    8   12:aload_2         
	//    9   13:monitorexit     
		return flag;
	//   10   14:iload_1         
	//   11   15:ireturn         
		exception;
	//   12   16:astore_3        
		obj;
	//   13   17:aload_2         
		JVM INSTR monitorexit ;
	//   14   18:monitorexit     
		throw exception;
	//   15   19:aload_3         
	//   16   20:athrow          
	}

	public final void mute(boolean flag)
	{
		String s;
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            10
			s = "mute";
	//    2    4:ldc1            #108 <String "mute">
	//    3    6:astore_2        
		else
	//*   4    7:goto            13
			s = "unmute";
	//    5   10:ldc1            #110 <String "unmute">
	//    6   12:astore_2        
		zzf(s, ((Map) (null)));
	//    7   13:aload_0         
	//    8   14:aload_2         
	//    9   15:aconst_null     
	//   10   16:invokespecial   #112 <Method void zzf(String, Map)>
	//   11   19:return          
	}

	public final void pause()
	{
		zzf("pause", ((Map) (null)));
	//    0    0:aload_0         
	//    1    1:ldc1            #114 <String "pause">
	//    2    3:aconst_null     
	//    3    4:invokespecial   #112 <Method void zzf(String, Map)>
	//    4    7:return          
	}

	public final void play()
	{
		zzf("play", ((Map) (null)));
	//    0    0:aload_0         
	//    1    1:ldc1            #116 <String "play">
	//    2    3:aconst_null     
	//    3    4:invokespecial   #112 <Method void zzf(String, Map)>
	//    4    7:return          
	}

	public final void zza(float f, int i, boolean flag, float f1)
	{
		int j;
		boolean flag1;
		synchronized(lock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #37  <Field Object lock>
	//*   2    4:astore          7
	//*   3    6:aload           7
	//*   4    8:monitorenter    
		{
			zzdej = f;
	//    5    9:aload_0         
	//    6   10:fload_1         
	//    7   11:putfield        #120 <Field float zzdej>
			flag1 = zzdei;
	//    8   14:aload_0         
	//    9   15:getfield        #39  <Field boolean zzdei>
	//   10   18:istore          6
			zzdei = flag;
	//   11   20:aload_0         
	//   12   21:iload_3         
	//   13   22:putfield        #39  <Field boolean zzdei>
			j = zzdeg;
	//   14   25:aload_0         
	//   15   26:getfield        #95  <Field int zzdeg>
	//   16   29:istore          5
			zzdeg = i;
	//   17   31:aload_0         
	//   18   32:iload_2         
	//   19   33:putfield        #95  <Field int zzdeg>
			f = zzdek;
	//   20   36:aload_0         
	//   21   37:getfield        #91  <Field float zzdek>
	//   22   40:fstore_1        
			zzdek = f1;
	//   23   41:aload_0         
	//   24   42:fload           4
	//   25   44:putfield        #91  <Field float zzdek>
			if(Math.abs(zzdek - f) > 0.0001F)
	//*  26   47:aload_0         
	//*  27   48:getfield        #91  <Field float zzdek>
	//*  28   51:fload_1         
	//*  29   52:fsub            
	//*  30   53:invokestatic    #126 <Method float Math.abs(float)>
	//*  31   56:ldc1            #127 <Float 0.0001F>
	//*  32   58:fcmpl           
	//*  33   59:ifle            74
				zzcyg.getView().invalidate();
	//   34   62:aload_0         
	//   35   63:getfield        #43  <Field zzapw zzcyg>
	//   36   66:invokeinterface #133 <Method View zzapw.getView()>
	//   37   71:invokevirtual   #138 <Method void View.invalidate()>
		}
	//   38   74:aload           7
	//   39   76:monitorexit     
		zzaoe.zzcvy.execute(((Runnable) (new zzarn(this, j, i, flag1, flag))));
	//   40   77:getstatic       #73  <Field Executor zzaoe.zzcvy>
	//   41   80:new             #140 <Class zzarn>
	//   42   83:dup             
	//   43   84:aload_0         
	//   44   85:iload           5
	//   45   87:iload_2         
	//   46   88:iload           6
	//   47   90:iload_3         
	//   48   91:invokespecial   #143 <Method void zzarn(zzarl, int, int, boolean, boolean)>
	//   49   94:invokeinterface #84  <Method void Executor.execute(Runnable)>
		return;
	//   50   99:return          
		exception;
	//   51  100:astore          8
		obj;
	//   52  102:aload           7
		JVM INSTR monitorexit ;
	//   53  104:monitorexit     
		throw exception;
	//   54  105:aload           8
	//   55  107:athrow          
	}

	final void zza(int i, int j, boolean flag, boolean flag1)
	{
		Object obj = lock;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field Object lock>
	//    2    4:astore          9
		obj;
	//    3    6:aload           9
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		boolean flag3;
		boolean flag5;
		flag5 = false;
	//    5    9:iconst_0        
	//    6   10:istore          8
		if(i != j)
	//*   7   12:iload_1         
	//*   8   13:iload_2         
	//*   9   14:icmpeq          23
			flag3 = true;
	//   10   17:iconst_1        
	//   11   18:istore          6
		else
	//*  12   20:goto            26
			flag3 = false;
	//   13   23:iconst_0        
	//   14   24:istore          6
		break MISSING_BLOCK_LABEL_26;
	//*  15   26:aload_0         
	//*  16   27:getfield        #148 <Field boolean zzdeh>
	//*  17   30:ifne            218
	//*  18   33:iload_2         
	//*  19   34:iconst_1        
	//*  20   35:icmpne          218
	//*  21   38:iconst_1        
	//*  22   39:istore_1        
	//*  23   40:goto            220
_L4:
		if(zzdeh)
			break MISSING_BLOCK_LABEL_293;
	//   24   43:aload_0         
	//   25   44:getfield        #148 <Field boolean zzdeh>
	//   26   47:ifne            293
		flag = flag5;
	//   27   50:iload           8
	//   28   52:istore_3        
		if(i != 0)
	//*  29   53:iload_1         
	//*  30   54:ifeq            60
			break MISSING_BLOCK_LABEL_293;
	//   31   57:goto            293
_L2:
		zzdeh = flag;
	//   32   60:aload_0         
	//   33   61:iload_3         
	//   34   62:putfield        #148 <Field boolean zzdeh>
		if(zzbuq != null)
			break MISSING_BLOCK_LABEL_76;
	//   35   65:aload_0         
	//   36   66:getfield        #150 <Field zzlr zzbuq>
	//   37   69:ifnonnull       76
		obj;
	//   38   72:aload           9
		JVM INSTR monitorexit ;
	//   39   74:monitorexit     
		return;
	//   40   75:return          
		if(i == 0)
			break MISSING_BLOCK_LABEL_101;
	//   41   76:iload_1         
	//   42   77:ifeq            101
		zzbuq.onVideoStart();
	//   43   80:aload_0         
	//   44   81:getfield        #150 <Field zzlr zzbuq>
	//   45   84:invokeinterface #155 <Method void zzlr.onVideoStart()>
		break MISSING_BLOCK_LABEL_101;
	//   46   89:goto            101
		obj1;
	//   47   92:astore          10
		zzakb.zzc("Unable to call onVideoStart()", ((Throwable) (obj1)));
	//   48   94:ldc1            #157 <String "Unable to call onVideoStart()">
	//   49   96:aload           10
	//   50   98:invokestatic    #163 <Method void zzakb.zzc(String, Throwable)>
		if(!flag2)
			break MISSING_BLOCK_LABEL_127;
	//   51  101:iload           5
	//   52  103:ifeq            127
		zzbuq.onVideoPlay();
	//   53  106:aload_0         
	//   54  107:getfield        #150 <Field zzlr zzbuq>
	//   55  110:invokeinterface #166 <Method void zzlr.onVideoPlay()>
		break MISSING_BLOCK_LABEL_127;
	//   56  115:goto            127
		obj1;
	//   57  118:astore          10
		zzakb.zzc("Unable to call onVideoPlay()", ((Throwable) (obj1)));
	//   58  120:ldc1            #168 <String "Unable to call onVideoPlay()">
	//   59  122:aload           10
	//   60  124:invokestatic    #163 <Method void zzakb.zzc(String, Throwable)>
		if(!flag4)
			break MISSING_BLOCK_LABEL_153;
	//   61  127:iload           7
	//   62  129:ifeq            153
		zzbuq.onVideoPause();
	//   63  132:aload_0         
	//   64  133:getfield        #150 <Field zzlr zzbuq>
	//   65  136:invokeinterface #171 <Method void zzlr.onVideoPause()>
		break MISSING_BLOCK_LABEL_153;
	//   66  141:goto            153
		obj1;
	//   67  144:astore          10
		zzakb.zzc("Unable to call onVideoPause()", ((Throwable) (obj1)));
	//   68  146:ldc1            #173 <String "Unable to call onVideoPause()">
	//   69  148:aload           10
	//   70  150:invokestatic    #163 <Method void zzakb.zzc(String, Throwable)>
		if(j == 0)
			break MISSING_BLOCK_LABEL_178;
	//   71  153:iload_2         
	//   72  154:ifeq            178
		zzbuq.onVideoEnd();
	//   73  157:aload_0         
	//   74  158:getfield        #150 <Field zzlr zzbuq>
	//   75  161:invokeinterface #176 <Method void zzlr.onVideoEnd()>
		break MISSING_BLOCK_LABEL_178;
	//   76  166:goto            178
		obj1;
	//   77  169:astore          10
		zzakb.zzc("Unable to call onVideoEnd()", ((Throwable) (obj1)));
	//   78  171:ldc1            #178 <String "Unable to call onVideoEnd()">
	//   79  173:aload           10
	//   80  175:invokestatic    #163 <Method void zzakb.zzc(String, Throwable)>
		if(!flag3)
			break MISSING_BLOCK_LABEL_206;
	//   81  178:iload           6
	//   82  180:ifeq            206
		zzbuq.onVideoMute(flag1);
	//   83  183:aload_0         
	//   84  184:getfield        #150 <Field zzlr zzbuq>
	//   85  187:iload           4
	//   86  189:invokeinterface #181 <Method void zzlr.onVideoMute(boolean)>
		break MISSING_BLOCK_LABEL_206;
	//   87  194:goto            206
		obj1;
	//   88  197:astore          10
		zzakb.zzc("Unable to call onVideoMute()", ((Throwable) (obj1)));
	//   89  199:ldc1            #183 <String "Unable to call onVideoMute()">
	//   90  201:aload           10
	//   91  203:invokestatic    #163 <Method void zzakb.zzc(String, Throwable)>
		obj;
	//   92  206:aload           9
		JVM INSTR monitorexit ;
	//   93  208:monitorexit     
		return;
	//   94  209:return          
		obj1;
	//   95  210:astore          10
		obj;
	//   96  212:aload           9
		JVM INSTR monitorexit ;
	//   97  214:monitorexit     
		throw obj1;
	//   98  215:aload           10
	//   99  217:athrow          
		{
			boolean flag2;
			boolean flag4;
			Object obj1;
			if(!zzdeh && j == 1)
				i = 1;
			else
				i = 0;
	//  100  218:iconst_0        
	//  101  219:istore_1        
			if(flag3 && j == 1)
	//* 102  220:iload           6
	//* 103  222:ifeq            236
	//* 104  225:iload_2         
	//* 105  226:iconst_1        
	//* 106  227:icmpne          236
				flag2 = true;
	//  107  230:iconst_1        
	//  108  231:istore          5
			else
	//* 109  233:goto            239
				flag2 = false;
	//  110  236:iconst_0        
	//  111  237:istore          5
			if(flag3 && j == 2)
	//* 112  239:iload           6
	//* 113  241:ifeq            255
	//* 114  244:iload_2         
	//* 115  245:iconst_2        
	//* 116  246:icmpne          255
				flag4 = true;
	//  117  249:iconst_1        
	//  118  250:istore          7
			else
	//* 119  252:goto            258
				flag4 = false;
	//  120  255:iconst_0        
	//  121  256:istore          7
			if(flag3 && j == 3)
	//* 122  258:iload           6
	//* 123  260:ifeq            273
	//* 124  263:iload_2         
	//* 125  264:iconst_3        
	//* 126  265:icmpne          273
				j = 1;
	//  127  268:iconst_1        
	//  128  269:istore_2        
			else
	//* 129  270:goto            275
				j = 0;
	//  130  273:iconst_0        
	//  131  274:istore_2        
			if(flag != flag1)
	//* 132  275:iload_3         
	//* 133  276:iload           4
	//* 134  278:icmpeq          287
				flag3 = true;
	//  135  281:iconst_1        
	//  136  282:istore          6
			else
	//* 137  284:goto            43
				flag3 = false;
	//  138  287:iconst_0        
	//  139  288:istore          6
		}
		if(true)
			continue; /* Loop/switch isn't completed */
	//  140  290:goto            43
		flag = true;
	//  141  293:iconst_1        
	//  142  294:istore_3        
		if(true) goto _L2; else goto _L1
_L1:
		if(true) goto _L4; else goto _L3
_L3:
	//* 143  295:goto            60
	}

	public final void zza(zzlr zzlr1)
	{
		synchronized(lock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #37  <Field Object lock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			zzbuq = zzlr1;
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:putfield        #150 <Field zzlr zzbuq>
		}
	//    8   12:aload_2         
	//    9   13:monitorexit     
		return;
	//   10   14:return          
		zzlr1;
	//   11   15:astore_1        
		obj;
	//   12   16:aload_2         
		JVM INSTR monitorexit ;
	//   13   17:monitorexit     
		throw zzlr1;
	//   14   18:aload_1         
	//   15   19:athrow          
	}

	public final void zzb(zzmu zzmu1)
	{
		synchronized(lock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #37  <Field Object lock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			zzato = zzmu1.zzato;
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:getfield        #189 <Field boolean zzmu.zzato>
	//    8   12:putfield        #41  <Field boolean zzato>
			zzatp = zzmu1.zzatp;
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:getfield        #190 <Field boolean zzmu.zzatp>
	//   12   20:putfield        #104 <Field boolean zzatp>
			zzatq = zzmu1.zzatq;
	//   13   23:aload_0         
	//   14   24:aload_1         
	//   15   25:getfield        #191 <Field boolean zzmu.zzatq>
	//   16   28:putfield        #102 <Field boolean zzatq>
		}
	//   17   31:aload_2         
	//   18   32:monitorexit     
		if(zzmu1.zzato)
	//*  19   33:aload_1         
	//*  20   34:getfield        #189 <Field boolean zzmu.zzato>
	//*  21   37:ifeq            46
			obj = "1";
	//   22   40:ldc1            #193 <String "1">
	//   23   42:astore_2        
		else
	//*  24   43:goto            49
			obj = "0";
	//   25   46:ldc1            #195 <String "0">
	//   26   48:astore_2        
		String s;
		if(zzmu1.zzatp)
	//*  27   49:aload_1         
	//*  28   50:getfield        #190 <Field boolean zzmu.zzatp>
	//*  29   53:ifeq            62
			s = "1";
	//   30   56:ldc1            #193 <String "1">
	//   31   58:astore_3        
		else
	//*  32   59:goto            65
			s = "0";
	//   33   62:ldc1            #195 <String "0">
	//   34   64:astore_3        
		if(zzmu1.zzatq)
	//*  35   65:aload_1         
	//*  36   66:getfield        #191 <Field boolean zzmu.zzatq>
	//*  37   69:ifeq            78
			zzmu1 = "1";
	//   38   72:ldc1            #193 <String "1">
	//   39   74:astore_1        
		else
	//*  40   75:goto            84
			zzmu1 = "0";
	//   41   78:ldc1            #195 <String "0">
	//   42   80:astore_1        
	//*  43   81:goto            75
		zzf("initialState", CollectionUtils.mapOf("muteStart", obj, "customControlsRequested", ((Object) (s)), "clickToExpandRequested", ((Object) (zzmu1))));
	//   44   84:aload_0         
	//   45   85:ldc1            #197 <String "initialState">
	//   46   87:ldc1            #199 <String "muteStart">
	//   47   89:aload_2         
	//   48   90:ldc1            #201 <String "customControlsRequested">
	//   49   92:aload_3         
	//   50   93:ldc1            #203 <String "clickToExpandRequested">
	//   51   95:aload_1         
	//   52   96:invokestatic    #209 <Method Map CollectionUtils.mapOf(Object, Object, Object, Object, Object, Object)>
	//   53   99:invokespecial   #112 <Method void zzf(String, Map)>
		return;
	//   54  102:return          
		zzmu1;
	//   55  103:astore_1        
		obj;
	//   56  104:aload_2         
		JVM INSTR monitorexit ;
	//   57  105:monitorexit     
		throw zzmu1;
	//   58  106:aload_1         
	//   59  107:athrow          
	}

	public final float zzim()
	{
		return zzdef;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field float zzdef>
	//    2    4:freturn         
	}

	public final float zzin()
	{
		float f;
		synchronized(lock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #37  <Field Object lock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			f = zzdej;
	//    5    7:aload_0         
	//    6    8:getfield        #120 <Field float zzdej>
	//    7   11:fstore_1        
		}
	//    8   12:aload_2         
	//    9   13:monitorexit     
		return f;
	//   10   14:fload_1         
	//   11   15:freturn         
		exception;
	//   12   16:astore_3        
		obj;
	//   13   17:aload_2         
		JVM INSTR monitorexit ;
	//   14   18:monitorexit     
		throw exception;
	//   15   19:aload_3         
	//   16   20:athrow          
	}

	public final zzlr zzio()
		throws RemoteException
	{
		zzlr zzlr1;
		synchronized(lock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #37  <Field Object lock>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			zzlr1 = zzbuq;
	//    5    7:aload_0         
	//    6    8:getfield        #150 <Field zzlr zzbuq>
	//    7   11:astore_2        
		}
	//    8   12:aload_1         
	//    9   13:monitorexit     
		return zzlr1;
	//   10   14:aload_2         
	//   11   15:areturn         
		exception;
	//   12   16:astore_2        
		obj;
	//   13   17:aload_1         
		JVM INSTR monitorexit ;
	//   14   18:monitorexit     
		throw exception;
	//   15   19:aload_2         
	//   16   20:athrow          
	}

	final void zzo(Map map)
	{
		zzcyg.zza("pubVideoCmd", map);
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field zzapw zzcyg>
	//    2    4:ldc1            #217 <String "pubVideoCmd">
	//    3    6:aload_1         
	//    4    7:invokeinterface #219 <Method void zzapw.zza(String, Map)>
	//    5   12:return          
	}

	private final Object lock = new Object();
	private boolean zzato;
	private boolean zzatp;
	private boolean zzatq;
	private zzlr zzbuq;
	private final zzapw zzcyg;
	private final boolean zzded;
	private final boolean zzdee;
	private final float zzdef;
	private int zzdeg;
	private boolean zzdeh;
	private boolean zzdei;
	private float zzdej;
	private float zzdek;
}
