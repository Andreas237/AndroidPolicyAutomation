// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.ads.internal.zzbv;
import java.util.concurrent.Executor;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzvr, zzvw, zzaoe, zzvg, 
//			zzvo, zzvp, zzaop, zznk, 
//			zzkb, zzni, zzuf, zzuw, 
//			zzvh, zzuu, zzvk, zzamk, 
//			zzvl, zzakk, zzvm, zzvq, 
//			zzakb, zzajm, zzvj, zzalo, 
//			zzang, zzci, zzvs

public final class zzvf
{

	public zzvf(Context context, zzang zzang, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
		mLock = new Object();
	//    2    4:aload_0         
	//    3    5:new             #4   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #28  <Method void Object()>
	//    6   12:putfield        #30  <Field Object mLock>
		zzbqb = 1;
	//    7   15:aload_0         
	//    8   16:iconst_1        
	//    9   17:putfield        #32  <Field int zzbqb>
		zzbpx = s;
	//   10   20:aload_0         
	//   11   21:aload_3         
	//   12   22:putfield        #34  <Field String zzbpx>
		mContext = context.getApplicationContext();
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:invokevirtual   #40  <Method Context Context.getApplicationContext()>
	//   16   30:putfield        #42  <Field Context mContext>
		zzyf = zzang;
	//   17   33:aload_0         
	//   18   34:aload_2         
	//   19   35:putfield        #44  <Field zzang zzyf>
		zzbpy = ((zzalo) (new zzvr()));
	//   20   38:aload_0         
	//   21   39:new             #46  <Class zzvr>
	//   22   42:dup             
	//   23   43:invokespecial   #47  <Method void zzvr()>
	//   24   46:putfield        #49  <Field zzalo zzbpy>
		zzbpz = ((zzalo) (new zzvr()));
	//   25   49:aload_0         
	//   26   50:new             #46  <Class zzvr>
	//   27   53:dup             
	//   28   54:invokespecial   #47  <Method void zzvr()>
	//   29   57:putfield        #51  <Field zzalo zzbpz>
	//   30   60:return          
	}

	public zzvf(Context context, zzang zzang, String s, zzalo zzalo, zzalo zzalo1)
	{
		this(context, zzang, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #55  <Method void zzvf(Context, zzang, String)>
		zzbpy = zzalo;
	//    5    7:aload_0         
	//    6    8:aload           4
	//    7   10:putfield        #49  <Field zzalo zzbpy>
		zzbpz = zzalo1;
	//    8   13:aload_0         
	//    9   14:aload           5
	//   10   16:putfield        #51  <Field zzalo zzbpz>
	//   11   19:return          
	}

	static int zza(zzvf zzvf1, int i)
	{
		zzvf1.zzbqb = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #32  <Field int zzbqb>
		return i;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	static zzvw zza(zzvf zzvf1, zzvw zzvw1)
	{
		zzvf1.zzbqa = zzvw1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #62  <Field zzvw zzbqa>
		return zzvw1;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	static Object zza(zzvf zzvf1)
	{
		return zzvf1.mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field Object mLock>
	//    2    4:areturn         
	}

	static zzvw zzb(zzvf zzvf1)
	{
		return zzvf1.zzbqa;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field zzvw zzbqa>
	//    2    4:areturn         
	}

	static zzalo zzc(zzvf zzvf1)
	{
		return zzvf1.zzbpy;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field zzalo zzbpy>
	//    2    4:areturn         
	}

	static int zzd(zzvf zzvf1)
	{
		return zzvf1.zzbqb;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field int zzbqb>
	//    2    4:ireturn         
	}

	protected final zzvw zza(zzci zzci)
	{
		zzvw zzvw1 = new zzvw(zzbpz);
	//    0    0:new             #72  <Class zzvw>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #51  <Field zzalo zzbpz>
	//    4    8:invokespecial   #75  <Method void zzvw(zzalo)>
	//    5   11:astore_2        
		zzaoe.zzcvy.execute(((Runnable) (new zzvg(this, zzci, zzvw1))));
	//    6   12:getstatic       #81  <Field Executor zzaoe.zzcvy>
	//    7   15:new             #83  <Class zzvg>
	//    8   18:dup             
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:aload_2         
	//   12   22:invokespecial   #86  <Method void zzvg(zzvf, zzci, zzvw)>
	//   13   25:invokeinterface #92  <Method void Executor.execute(Runnable)>
		((zzaop) (zzvw1)).zza(((zzaoo) (new zzvo(this, zzvw1))), ((zzaom) (new zzvp(this, zzvw1))));
	//   14   30:aload_2         
	//   15   31:new             #94  <Class zzvo>
	//   16   34:dup             
	//   17   35:aload_0         
	//   18   36:aload_2         
	//   19   37:invokespecial   #97  <Method void zzvo(zzvf, zzvw)>
	//   20   40:new             #99  <Class zzvp>
	//   21   43:dup             
	//   22   44:aload_0         
	//   23   45:aload_2         
	//   24   46:invokespecial   #100 <Method void zzvp(zzvf, zzvw)>
	//   25   49:invokevirtual   #105 <Method void zzaop.zza(zzaoo, zzaom)>
		return zzvw1;
	//   26   52:aload_2         
	//   27   53:areturn         
	}

	final void zza(zzci zzci, zzvw zzvw1)
	{
label0:
		{
			Object obj = ((Object) (mContext));
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field Context mContext>
	//    2    4:astore_3        
			Object obj1 = ((Object) (zzyf));
	//    3    5:aload_0         
	//    4    6:getfield        #44  <Field zzang zzyf>
	//    5    9:astore          4
			zzna zzna = zznk.zzaxz;
	//    6   11:getstatic       #115 <Field zzna zznk.zzaxz>
	//    7   14:astore          5
			if(((Boolean)zzkb.zzik().zzd(zzna)).booleanValue())
	//*   8   16:invokestatic    #121 <Method zzni zzkb.zzik()>
	//*   9   19:aload           5
	//*  10   21:invokevirtual   #126 <Method Object zzni.zzd(zzna)>
	//*  11   24:checkcast       #128 <Class Boolean>
	//*  12   27:invokevirtual   #132 <Method boolean Boolean.booleanValue()>
	//*  13   30:ifeq            47
			{
				obj = ((Object) (new zzuf(((Context) (obj)), ((zzang) (obj1)))));
	//   14   33:new             #134 <Class zzuf>
	//   15   36:dup             
	//   16   37:aload_3         
	//   17   38:aload           4
	//   18   40:invokespecial   #137 <Method void zzuf(Context, zzang)>
	//   19   43:astore_3        
				break label0;
	//   20   44:goto            60
			}
			try
			{
				obj = ((Object) (new zzuw(((Context) (obj)), ((zzang) (obj1)), zzci, ((com.google.android.gms.ads.internal.zzw) (null)))));
	//   21   47:new             #139 <Class zzuw>
	//   22   50:dup             
	//   23   51:aload_3         
	//   24   52:aload           4
	//   25   54:aload_1         
	//   26   55:aconst_null     
	//   27   56:invokespecial   #142 <Method void zzuw(Context, zzang, zzci, com.google.android.gms.ads.internal.zzw)>
	//   28   59:astore_3        
			}
	//*  29   60:aload_3         
	//*  30   61:new             #144 <Class zzvh>
	//*  31   64:dup             
	//*  32   65:aload_0         
	//*  33   66:aload_2         
	//*  34   67:aload_3         
	//*  35   68:invokespecial   #147 <Method void zzvh(zzvf, zzvw, zzuu)>
	//*  36   71:invokeinterface #152 <Method void zzuu.zza(zzuv)>
	//*  37   76:aload_3         
	//*  38   77:ldc1            #154 <String "/jsLoaded">
	//*  39   79:new             #156 <Class zzvk>
	//*  40   82:dup             
	//*  41   83:aload_0         
	//*  42   84:aload_2         
	//*  43   85:aload_3         
	//*  44   86:invokespecial   #157 <Method void zzvk(zzvf, zzvw, zzuu)>
	//*  45   89:invokeinterface #160 <Method void zzuu.zza(String, com.google.android.gms.ads.internal.gmsg.zzv)>
	//*  46   94:new             #162 <Class zzamk>
	//*  47   97:dup             
	//*  48   98:invokespecial   #163 <Method void zzamk()>
	//*  49  101:astore          4
	//*  50  103:new             #165 <Class zzvl>
	//*  51  106:dup             
	//*  52  107:aload_0         
	//*  53  108:aload_1         
	//*  54  109:aload_3         
	//*  55  110:aload           4
	//*  56  112:invokespecial   #168 <Method void zzvl(zzvf, zzci, zzuu, zzamk)>
	//*  57  115:astore_1        
	//*  58  116:aload           4
	//*  59  118:aload_1         
	//*  60  119:invokevirtual   #172 <Method void zzamk.set(Object)>
	//*  61  122:aload_3         
	//*  62  123:ldc1            #174 <String "/requestReload">
	//*  63  125:aload_1         
	//*  64  126:invokeinterface #160 <Method void zzuu.zza(String, com.google.android.gms.ads.internal.gmsg.zzv)>
	//*  65  131:aload_0         
	//*  66  132:getfield        #34  <Field String zzbpx>
	//*  67  135:ldc1            #176 <String ".js">
	//*  68  137:invokevirtual   #182 <Method boolean String.endsWith(String)>
	//*  69  140:ifeq            156
	//*  70  143:aload_3         
	//*  71  144:aload_0         
	//*  72  145:getfield        #34  <Field String zzbpx>
	//*  73  148:invokeinterface #186 <Method void zzuu.zzbb(String)>
	//*  74  153:goto            191
	//*  75  156:aload_0         
	//*  76  157:getfield        #34  <Field String zzbpx>
	//*  77  160:ldc1            #188 <String "<html>">
	//*  78  162:invokevirtual   #191 <Method boolean String.startsWith(String)>
	//*  79  165:ifeq            181
	//*  80  168:aload_3         
	//*  81  169:aload_0         
	//*  82  170:getfield        #34  <Field String zzbpx>
	//*  83  173:invokeinterface #194 <Method void zzuu.zzbc(String)>
	//*  84  178:goto            191
	//*  85  181:aload_3         
	//*  86  182:aload_0         
	//*  87  183:getfield        #34  <Field String zzbpx>
	//*  88  186:invokeinterface #197 <Method void zzuu.zzbd(String)>
	//*  89  191:getstatic       #203 <Field Handler zzakk.zzcrm>
	//*  90  194:new             #205 <Class zzvm>
	//*  91  197:dup             
	//*  92  198:aload_0         
	//*  93  199:aload_2         
	//*  94  200:aload_3         
	//*  95  201:invokespecial   #206 <Method void zzvm(zzvf, zzvw, zzuu)>
	//*  96  204:getstatic       #211 <Field int zzvq.zzbqo>
	//*  97  207:i2l             
	//*  98  208:invokevirtual   #217 <Method boolean Handler.postDelayed(Runnable, long)>
	//*  99  211:pop             
	//* 100  212:return          
			// Misplaced declaration of an exception variable
			catch(zzci zzci)
	//* 101  213:astore_1        
			{
				zzakb.zzb("Error creating webview.", ((Throwable) (zzci)));
	//  102  214:ldc1            #219 <String "Error creating webview.">
	//  103  216:aload_1         
	//  104  217:invokestatic    #224 <Method void zzakb.zzb(String, Throwable)>
				zzbv.zzeo().zza(((Throwable) (zzci)), "SdkJavascriptFactory.loadJavascriptEngine");
	//  105  220:invokestatic    #230 <Method zzajm zzbv.zzeo()>
	//  106  223:aload_1         
	//  107  224:ldc1            #232 <String "SdkJavascriptFactory.loadJavascriptEngine">
	//  108  226:invokevirtual   #237 <Method void zzajm.zza(Throwable, String)>
				((zzaop) (zzvw1)).reject();
	//  109  229:aload_2         
	//  110  230:invokevirtual   #240 <Method void zzaop.reject()>
				return;
	//  111  233:return          
			}
		}
		((zzuu) (obj)).zza(((zzuv) (new zzvh(this, zzvw1, ((zzuu) (obj))))));
		((zzuu) (obj)).zza("/jsLoaded", ((com.google.android.gms.ads.internal.gmsg.zzv) (new zzvk(this, zzvw1, ((zzuu) (obj))))));
		obj1 = ((Object) (new zzamk()));
		zzci = ((zzci) (new zzvl(this, zzci, ((zzuu) (obj)), ((zzamk) (obj1)))));
		((zzamk) (obj1)).set(((Object) (zzci)));
		((zzuu) (obj)).zza("/requestReload", ((com.google.android.gms.ads.internal.gmsg.zzv) (zzci)));
		if(zzbpx.endsWith(".js"))
			((zzuu) (obj)).zzbb(zzbpx);
		else
		if(zzbpx.startsWith("<html>"))
			((zzuu) (obj)).zzbc(zzbpx);
		else
			((zzuu) (obj)).zzbd(zzbpx);
		zzakk.zzcrm.postDelayed(((Runnable) (new zzvm(this, zzvw1, ((zzuu) (obj))))), zzvq.zzbqo);
	}

	final void zza(zzvw zzvw1, zzuu zzuu1)
	{
		Object obj = mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field Object mLock>
	//    2    4:astore_3        
		obj;
	//    3    5:aload_3         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		if(((zzaop) (zzvw1)).getStatus() == -1 || ((zzaop) (zzvw1)).getStatus() == 1)
	//*   5    7:aload_1         
	//*   6    8:invokevirtual   #245 <Method int zzaop.getStatus()>
	//*   7   11:iconst_m1       
	//*   8   12:icmpeq          58
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #245 <Method int zzaop.getStatus()>
	//*  11   19:iconst_1        
	//*  12   20:icmpne          26
			break MISSING_BLOCK_LABEL_58;
	//   13   23:goto            58
		((zzaop) (zzvw1)).reject();
	//   14   26:aload_1         
	//   15   27:invokevirtual   #240 <Method void zzaop.reject()>
		zzvw1 = ((zzvw) (zzaoe.zzcvy));
	//   16   30:getstatic       #81  <Field Executor zzaoe.zzcvy>
	//   17   33:astore_1        
		((Object) (zzuu1)).getClass();
	//   18   34:aload_2         
	//   19   35:invokevirtual   #249 <Method Class Object.getClass()>
	//   20   38:pop             
		((Executor) (zzvw1)).execute(zzvj.zza(zzuu1));
	//   21   39:aload_1         
	//   22   40:aload_2         
	//   23   41:invokestatic    #254 <Method Runnable zzvj.zza(zzuu)>
	//   24   44:invokeinterface #92  <Method void Executor.execute(Runnable)>
		zzakb.v("Could not receive loaded message in a timely manner. Rejecting.");
	//   25   49:ldc2            #256 <String "Could not receive loaded message in a timely manner. Rejecting.">
	//   26   52:invokestatic    #259 <Method void zzakb.v(String)>
		obj;
	//   27   55:aload_3         
		JVM INSTR monitorexit ;
	//   28   56:monitorexit     
		return;
	//   29   57:return          
		obj;
	//   30   58:aload_3         
		JVM INSTR monitorexit ;
	//   31   59:monitorexit     
		return;
	//   32   60:return          
		zzvw1;
	//   33   61:astore_1        
		obj;
	//   34   62:aload_3         
		JVM INSTR monitorexit ;
	//   35   63:monitorexit     
		throw zzvw1;
	//   36   64:aload_1         
	//   37   65:athrow          
	}

	public final zzvs zzb(zzci zzci)
	{
		zzci = ((zzci) (mLock));
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field Object mLock>
	//    2    4:astore_1        
		zzci;
	//    3    5:aload_1         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		if(zzbqa == null || ((zzaop) (zzbqa)).getStatus() == -1)
	//*   5    7:aload_0         
	//*   6    8:getfield        #62  <Field zzvw zzbqa>
	//*   7   11:ifnull          110
	//*   8   14:aload_0         
	//*   9   15:getfield        #62  <Field zzvw zzbqa>
	//*  10   18:invokevirtual   #245 <Method int zzaop.getStatus()>
	//*  11   21:iconst_m1       
	//*  12   22:icmpne          28
			break MISSING_BLOCK_LABEL_110;
	//   13   25:goto            110
		zzvs zzvs;
		if(zzbqb != 0)
			break MISSING_BLOCK_LABEL_47;
	//   14   28:aload_0         
	//   15   29:getfield        #32  <Field int zzbqb>
	//   16   32:ifne            47
		zzvs = zzbqa.zzlz();
	//   17   35:aload_0         
	//   18   36:getfield        #62  <Field zzvw zzbqa>
	//   19   39:invokevirtual   #264 <Method zzvs zzvw.zzlz()>
	//   20   42:astore_2        
		zzci;
	//   21   43:aload_1         
		JVM INSTR monitorexit ;
	//   22   44:monitorexit     
		return zzvs;
	//   23   45:aload_2         
	//   24   46:areturn         
		if(zzbqb != 1)
			break MISSING_BLOCK_LABEL_78;
	//   25   47:aload_0         
	//   26   48:getfield        #32  <Field int zzbqb>
	//   27   51:iconst_1        
	//   28   52:icmpne          78
		zzbqb = 2;
	//   29   55:aload_0         
	//   30   56:iconst_2        
	//   31   57:putfield        #32  <Field int zzbqb>
		zza(((zzci) (null)));
	//   32   60:aload_0         
	//   33   61:aconst_null     
	//   34   62:invokevirtual   #266 <Method zzvw zza(zzci)>
	//   35   65:pop             
		zzvs = zzbqa.zzlz();
	//   36   66:aload_0         
	//   37   67:getfield        #62  <Field zzvw zzbqa>
	//   38   70:invokevirtual   #264 <Method zzvs zzvw.zzlz()>
	//   39   73:astore_2        
		zzci;
	//   40   74:aload_1         
		JVM INSTR monitorexit ;
	//   41   75:monitorexit     
		return zzvs;
	//   42   76:aload_2         
	//   43   77:areturn         
		if(zzbqb != 2)
			break MISSING_BLOCK_LABEL_98;
	//   44   78:aload_0         
	//   45   79:getfield        #32  <Field int zzbqb>
	//   46   82:iconst_2        
	//   47   83:icmpne          98
		zzvs = zzbqa.zzlz();
	//   48   86:aload_0         
	//   49   87:getfield        #62  <Field zzvw zzbqa>
	//   50   90:invokevirtual   #264 <Method zzvs zzvw.zzlz()>
	//   51   93:astore_2        
		zzci;
	//   52   94:aload_1         
		JVM INSTR monitorexit ;
	//   53   95:monitorexit     
		return zzvs;
	//   54   96:aload_2         
	//   55   97:areturn         
		zzvs = zzbqa.zzlz();
	//   56   98:aload_0         
	//   57   99:getfield        #62  <Field zzvw zzbqa>
	//   58  102:invokevirtual   #264 <Method zzvs zzvw.zzlz()>
	//   59  105:astore_2        
		zzci;
	//   60  106:aload_1         
		JVM INSTR monitorexit ;
	//   61  107:monitorexit     
		return zzvs;
	//   62  108:aload_2         
	//   63  109:areturn         
		zzbqb = 2;
	//   64  110:aload_0         
	//   65  111:iconst_2        
	//   66  112:putfield        #32  <Field int zzbqb>
		zzbqa = zza(((zzci) (null)));
	//   67  115:aload_0         
	//   68  116:aload_0         
	//   69  117:aconst_null     
	//   70  118:invokevirtual   #266 <Method zzvw zza(zzci)>
	//   71  121:putfield        #62  <Field zzvw zzbqa>
		zzvs = zzbqa.zzlz();
	//   72  124:aload_0         
	//   73  125:getfield        #62  <Field zzvw zzbqa>
	//   74  128:invokevirtual   #264 <Method zzvs zzvw.zzlz()>
	//   75  131:astore_2        
		zzci;
	//   76  132:aload_1         
		JVM INSTR monitorexit ;
	//   77  133:monitorexit     
		return zzvs;
	//   78  134:aload_2         
	//   79  135:areturn         
		Exception exception;
		exception;
	//   80  136:astore_2        
		zzci;
	//   81  137:aload_1         
		JVM INSTR monitorexit ;
	//   82  138:monitorexit     
		throw exception;
	//   83  139:aload_2         
	//   84  140:athrow          
	}

	private final Context mContext;
	private final Object mLock;
	private final String zzbpx;
	private zzalo zzbpy;
	private zzalo zzbpz;
	private zzvw zzbqa;
	private int zzbqb;
	private final zzang zzyf;
}
