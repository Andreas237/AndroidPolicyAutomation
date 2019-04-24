// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.gmsg.*;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.*;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzajx, zzaeg, zzafi, zznk, 
//			zzvf, zzkb, zzni, zzafh, 
//			zzafg, zzuu, zzakk, zzaej, 
//			zzamu, zzafc, zzafs, zzaff, 
//			zzakb, zzaiy, zzaef, zzaji, 
//			zzafb, zzadj, zzhx, zzvs

public final class zzafa extends zzajx
{

	public zzafa(Context context, zzaeg zzaeg1, zzadj zzadj, zzhx zzhx)
	{
		super(true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokespecial   #63  <Method void zzajx(boolean)>
		zzbzh = new Object();
	//    3    5:aload_0         
	//    4    6:new             #53  <Class Object>
	//    5    9:dup             
	//    6   10:invokespecial   #56  <Method void Object()>
	//    7   13:putfield        #65  <Field Object zzbzh>
		zzccf = zzadj;
	//    8   16:aload_0         
	//    9   17:aload_3         
	//   10   18:putfield        #67  <Field zzadj zzccf>
		mContext = context;
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:putfield        #69  <Field Context mContext>
		zzccg = zzaeg1;
	//   14   26:aload_0         
	//   15   27:aload_2         
	//   16   28:putfield        #71  <Field zzaeg zzccg>
		zzcci = zzhx;
	//   17   31:aload_0         
	//   18   32:aload           4
	//   19   34:putfield        #73  <Field zzhx zzcci>
		synchronized(sLock)
	//*  20   37:getstatic       #58  <Field Object sLock>
	//*  21   40:astore_3        
	//*  22   41:aload_3         
	//*  23   42:monitorenter    
		{
			if(!zzcgd)
	//*  24   43:getstatic       #75  <Field boolean zzcgd>
	//*  25   46:ifne            149
			{
				zzcgg = new zzaa();
	//   26   49:new             #77  <Class zzaa>
	//   27   52:dup             
	//   28   53:invokespecial   #78  <Method void zzaa()>
	//   29   56:putstatic       #80  <Field zzaa zzcgg>
				zzcgf = new HttpClient(context.getApplicationContext(), zzaeg1.zzacr);
	//   30   59:new             #82  <Class HttpClient>
	//   31   62:dup             
	//   32   63:aload_1         
	//   33   64:invokevirtual   #88  <Method Context Context.getApplicationContext()>
	//   34   67:aload_2         
	//   35   68:getfield        #94  <Field zzang zzaeg.zzacr>
	//   36   71:invokespecial   #97  <Method void HttpClient(Context, zzang)>
	//   37   74:putstatic       #99  <Field HttpClient zzcgf>
				zzcgh = ((zzv) (new zzafi()));
	//   38   77:new             #101 <Class zzafi>
	//   39   80:dup             
	//   40   81:invokespecial   #102 <Method void zzafi()>
	//   41   84:putstatic       #104 <Field zzv zzcgh>
				context = mContext.getApplicationContext();
	//   42   87:aload_0         
	//   43   88:getfield        #69  <Field Context mContext>
	//   44   91:invokevirtual   #88  <Method Context Context.getApplicationContext()>
	//   45   94:astore_1        
				zzaeg1 = ((zzaeg) (zzccg.zzacr));
	//   46   95:aload_0         
	//   47   96:getfield        #71  <Field zzaeg zzccg>
	//   48   99:getfield        #94  <Field zzang zzaeg.zzacr>
	//   49  102:astore_2        
				zzhx = ((zzhx) (zznk.zzaub));
	//   50  103:getstatic       #110 <Field zzna zznk.zzaub>
	//   51  106:astore          4
				zzcge = new zzvf(context, ((zzang) (zzaeg1)), (String)zzkb.zzik().zzd(((zzna) (zzhx))), ((zzalo) (new zzafh())), ((zzalo) (new zzafg())));
	//   52  108:new             #112 <Class zzvf>
	//   53  111:dup             
	//   54  112:aload_1         
	//   55  113:aload_2         
	//   56  114:invokestatic    #118 <Method zzni zzkb.zzik()>
	//   57  117:aload           4
	//   58  119:invokevirtual   #124 <Method Object zzni.zzd(zzna)>
	//   59  122:checkcast       #126 <Class String>
	//   60  125:new             #128 <Class zzafh>
	//   61  128:dup             
	//   62  129:invokespecial   #129 <Method void zzafh()>
	//   63  132:new             #131 <Class zzafg>
	//   64  135:dup             
	//   65  136:invokespecial   #132 <Method void zzafg()>
	//   66  139:invokespecial   #135 <Method void zzvf(Context, zzang, String, zzalo, zzalo)>
	//   67  142:putstatic       #137 <Field zzvf zzcge>
				zzcgd = true;
	//   68  145:iconst_1        
	//   69  146:putstatic       #75  <Field boolean zzcgd>
			}
		}
	//   70  149:aload_3         
	//   71  150:monitorexit     
		return;
	//   72  151:return          
		context;
	//   73  152:astore_1        
		zzadj;
	//   74  153:aload_3         
		JVM INSTR monitorexit ;
	//   75  154:monitorexit     
		throw context;
	//   76  155:aload_1         
	//   77  156:athrow          
	}

	static zzadj zza(zzafa zzafa1)
	{
		return zzafa1.zzccf;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field zzadj zzccf>
	//    2    4:areturn         
	}

	static zzvs zza(zzafa zzafa1, zzvs zzvs)
	{
		zzafa1.zzcgi = zzvs;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #142 <Field zzvs zzcgi>
		return zzvs;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	private final JSONObject zza(zzaef zzaef1, String s)
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #145 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #147 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #152 <Method void Runtime(String)>
	//    4    9:athrow          
	}

	static zzvs zzb(zzafa zzafa1)
	{
		return zzafa1.zzcgi;
	//    0    0:aload_0         
	//    1    1:getfield        #142 <Field zzvs zzcgi>
	//    2    4:areturn         
	}

	protected static void zzb(zzuu zzuu1)
	{
		zzuu1.zza("/loadAd", ((zzv) (zzcgg)));
	//    0    0:aload_0         
	//    1    1:ldc1            #157 <String "/loadAd">
	//    2    3:getstatic       #80  <Field zzaa zzcgg>
	//    3    6:invokeinterface #162 <Method void zzuu.zza(String, zzv)>
		zzuu1.zza("/fetchHttpRequest", ((zzv) (zzcgf)));
	//    4   11:aload_0         
	//    5   12:ldc1            #164 <String "/fetchHttpRequest">
	//    6   14:getstatic       #99  <Field HttpClient zzcgf>
	//    7   17:invokeinterface #162 <Method void zzuu.zza(String, zzv)>
		zzuu1.zza("/invalidRequest", zzcgh);
	//    8   22:aload_0         
	//    9   23:ldc1            #166 <String "/invalidRequest">
	//   10   25:getstatic       #104 <Field zzv zzcgh>
	//   11   28:invokeinterface #162 <Method void zzuu.zza(String, zzv)>
	//   12   33:return          
	}

	private final zzaej zzc(zzaef zzaef1)
	{
		long l;
		long l1;
		long l2;
		Future future;
		zzbv.zzek();
	//    0    0:invokestatic    #182 <Method zzakk zzbv.zzek()>
	//    1    3:pop             
		String s = zzakk.zzrh();
	//    2    4:invokestatic    #188 <Method String zzakk.zzrh()>
	//    3    7:astore          8
		JSONObject jsonobject = zza(zzaef1, s);
	//    4    9:aload_0         
	//    5   10:aload_1         
	//    6   11:aload           8
	//    7   13:invokespecial   #190 <Method JSONObject zza(zzaef, String)>
	//    8   16:astore          9
		if(jsonobject == null)
	//*   9   18:aload           9
	//*  10   20:ifnonnull       32
			return new zzaej(0);
	//   11   23:new             #192 <Class zzaej>
	//   12   26:dup             
	//   13   27:iconst_0        
	//   14   28:invokespecial   #195 <Method void zzaej(int)>
	//   15   31:areturn         
		l = zzbv.zzer().elapsedRealtime();
	//   16   32:invokestatic    #199 <Method Clock zzbv.zzer()>
	//   17   35:invokeinterface #205 <Method long Clock.elapsedRealtime()>
	//   18   40:lstore_2        
		future = zzcgg.zzas(s);
	//   19   41:getstatic       #80  <Field zzaa zzcgg>
	//   20   44:aload           8
	//   21   46:invokevirtual   #209 <Method Future zzaa.zzas(String)>
	//   22   49:astore          10
		zzamu.zzsy.post(((Runnable) (new zzafc(this, jsonobject, s))));
	//   23   51:getstatic       #215 <Field Handler zzamu.zzsy>
	//   24   54:new             #217 <Class zzafc>
	//   25   57:dup             
	//   26   58:aload_0         
	//   27   59:aload           9
	//   28   61:aload           8
	//   29   63:invokespecial   #220 <Method void zzafc(zzafa, JSONObject, String)>
	//   30   66:invokevirtual   #226 <Method boolean Handler.post(Runnable)>
	//   31   69:pop             
		l1 = zzcgc;
	//   32   70:getstatic       #51  <Field long zzcgc>
	//   33   73:lstore          4
		l2 = zzbv.zzer().elapsedRealtime();
	//   34   75:invokestatic    #199 <Method Clock zzbv.zzer()>
	//   35   78:invokeinterface #205 <Method long Clock.elapsedRealtime()>
	//   36   83:lstore          6
		Object obj;
		try
		{
			obj = ((Object) ((JSONObject)future.get(l1 - (l2 - l), TimeUnit.MILLISECONDS)));
	//   37   85:aload           10
	//   38   87:lload           4
	//   39   89:lload           6
	//   40   91:lload_2         
	//   41   92:lsub            
	//   42   93:lsub            
	//   43   94:getstatic       #229 <Field TimeUnit TimeUnit.MILLISECONDS>
	//   44   97:invokeinterface #235 <Method Object Future.get(long, TimeUnit)>
	//   45  102:checkcast       #237 <Class JSONObject>
	//   46  105:astore          8
		}
	//*  47  107:aload           8
	//*  48  109:ifnonnull       121
	//*  49  112:new             #192 <Class zzaej>
	//*  50  115:dup             
	//*  51  116:iconst_m1       
	//*  52  117:invokespecial   #195 <Method void zzaej(int)>
	//*  53  120:areturn         
	//*  54  121:aload_0         
	//*  55  122:getfield        #69  <Field Context mContext>
	//*  56  125:aload_1         
	//*  57  126:aload           8
	//*  58  128:invokevirtual   #240 <Method String JSONObject.toString()>
	//*  59  131:invokestatic    #245 <Method zzaej zzafs.zza(Context, zzaef, String)>
	//*  60  134:astore          8
	//*  61  136:aload           8
	//*  62  138:astore_1        
	//*  63  139:aload           8
	//*  64  141:getfield        #249 <Field int zzaej.errorCode>
	//*  65  144:bipush          -3
	//*  66  146:icmpeq          172
	//*  67  149:aload           8
	//*  68  151:astore_1        
	//*  69  152:aload           8
	//*  70  154:getfield        #253 <Field String zzaej.zzceo>
	//*  71  157:invokestatic    #259 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  72  160:ifeq            172
	//*  73  163:new             #192 <Class zzaej>
	//*  74  166:dup             
	//*  75  167:iconst_3        
	//*  76  168:invokespecial   #195 <Method void zzaej(int)>
	//*  77  171:astore_1        
	//*  78  172:aload_1         
	//*  79  173:areturn         
	//*  80  174:new             #192 <Class zzaej>
	//*  81  177:dup             
	//*  82  178:iconst_0        
	//*  83  179:invokespecial   #195 <Method void zzaej(int)>
	//*  84  182:areturn         
	//*  85  183:new             #192 <Class zzaej>
	//*  86  186:dup             
	//*  87  187:iconst_2        
	//*  88  188:invokespecial   #195 <Method void zzaej(int)>
	//*  89  191:areturn         
	//*  90  192:new             #192 <Class zzaej>
	//*  91  195:dup             
	//*  92  196:iconst_m1       
	//*  93  197:invokespecial   #195 <Method void zzaej(int)>
	//*  94  200:areturn         
		// Misplaced declaration of an exception variable
		catch(zzaef zzaef1)
		{
			return new zzaej(-1);
		}
	//*  95  201:astore_1        
	//*  96  202:goto            192
		// Misplaced declaration of an exception variable
		catch(zzaef zzaef1)
		{
			return new zzaej(2);
		}
	//*  97  205:astore_1        
	//*  98  206:goto            183
		// Misplaced declaration of an exception variable
		catch(zzaef zzaef1)
		{
			return new zzaej(0);
		}
		if(obj == null)
			return new zzaej(-1);
		obj = ((Object) (zzafs.zza(mContext, zzaef1, ((JSONObject) (obj)).toString())));
		zzaef1 = ((zzaef) (obj));
		if(((zzaej) (obj)).errorCode != -3)
		{
			zzaef1 = ((zzaef) (obj));
			if(TextUtils.isEmpty(((CharSequence) (((zzaej) (obj)).zzceo))))
				zzaef1 = ((zzaef) (new zzaej(3)));
		}
		return ((zzaej) (zzaef1));
	//*  99  209:astore_1        
	//* 100  210:goto            174
	}

	protected static void zzc(zzuu zzuu1)
	{
		zzuu1.zzb("/loadAd", ((zzv) (zzcgg)));
	//    0    0:aload_0         
	//    1    1:ldc1            #157 <String "/loadAd">
	//    2    3:getstatic       #80  <Field zzaa zzcgg>
	//    3    6:invokeinterface #261 <Method void zzuu.zzb(String, zzv)>
		zzuu1.zzb("/fetchHttpRequest", ((zzv) (zzcgf)));
	//    4   11:aload_0         
	//    5   12:ldc1            #164 <String "/fetchHttpRequest">
	//    6   14:getstatic       #99  <Field HttpClient zzcgf>
	//    7   17:invokeinterface #261 <Method void zzuu.zzb(String, zzv)>
		zzuu1.zzb("/invalidRequest", zzcgh);
	//    8   22:aload_0         
	//    9   23:ldc1            #166 <String "/invalidRequest">
	//   10   25:getstatic       #104 <Field zzv zzcgh>
	//   11   28:invokeinterface #261 <Method void zzuu.zzb(String, zzv)>
	//   12   33:return          
	}

	static zzaa zzod()
	{
		return zzcgg;
	//    0    0:getstatic       #80  <Field zzaa zzcgg>
	//    1    3:areturn         
	}

	static zzvf zzoe()
	{
		return zzcge;
	//    0    0:getstatic       #137 <Field zzvf zzcge>
	//    1    3:areturn         
	}

	public final void onStop()
	{
		synchronized(zzbzh)
	//*   0    0:aload_0         
	//*   1    1:getfield        #65  <Field Object zzbzh>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			zzamu.zzsy.post(((Runnable) (new zzaff(this))));
	//    5    7:getstatic       #215 <Field Handler zzamu.zzsy>
	//    6   10:new             #268 <Class zzaff>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:invokespecial   #271 <Method void zzaff(zzafa)>
	//   10   18:invokevirtual   #226 <Method boolean Handler.post(Runnable)>
	//   11   21:pop             
		}
	//   12   22:aload_1         
	//   13   23:monitorexit     
		return;
	//   14   24:return          
		exception;
	//   15   25:astore_2        
		obj;
	//   16   26:aload_1         
		JVM INSTR monitorexit ;
	//   17   27:monitorexit     
		throw exception;
	//   18   28:aload_2         
	//   19   29:athrow          
	}

	public final void zzdn()
	{
		zzakb.zzck("SdkLessAdLoaderBackgroundTask started.");
	//    0    0:ldc2            #274 <String "SdkLessAdLoaderBackgroundTask started.">
	//    1    3:invokestatic    #279 <Method void zzakb.zzck(String)>
		Object obj1 = ((Object) (zzbv.zzfh().zzab(mContext)));
	//    2    6:invokestatic    #283 <Method zzaiy zzbv.zzfh()>
	//    3    9:aload_0         
	//    4   10:getfield        #69  <Field Context mContext>
	//    5   13:invokevirtual   #289 <Method String zzaiy.zzab(Context)>
	//    6   16:astore          4
		Object obj = ((Object) (new zzaef(zzccg, -1L, zzbv.zzfh().zzz(mContext), zzbv.zzfh().zzaa(mContext), ((String) (obj1)))));
	//    7   18:new             #291 <Class zzaef>
	//    8   21:dup             
	//    9   22:aload_0         
	//   10   23:getfield        #71  <Field zzaeg zzccg>
	//   11   26:ldc2w           #292 <Long -1L>
	//   12   29:invokestatic    #283 <Method zzaiy zzbv.zzfh()>
	//   13   32:aload_0         
	//   14   33:getfield        #69  <Field Context mContext>
	//   15   36:invokevirtual   #296 <Method String zzaiy.zzz(Context)>
	//   16   39:invokestatic    #283 <Method zzaiy zzbv.zzfh()>
	//   17   42:aload_0         
	//   18   43:getfield        #69  <Field Context mContext>
	//   19   46:invokevirtual   #299 <Method String com.google.android.gms.internal.ads.zzaiy.zzaa(Context)>
	//   20   49:aload           4
	//   21   51:invokespecial   #302 <Method void zzaef(zzaeg, long, String, String, String)>
	//   22   54:astore_3        
		zzbv.zzfh().zzg(mContext, ((String) (obj1)));
	//   23   55:invokestatic    #283 <Method zzaiy zzbv.zzfh()>
	//   24   58:aload_0         
	//   25   59:getfield        #69  <Field Context mContext>
	//   26   62:aload           4
	//   27   64:invokevirtual   #306 <Method void zzaiy.zzg(Context, String)>
		obj1 = ((Object) (zzc(((zzaef) (obj)))));
	//   28   67:aload_0         
	//   29   68:aload_3         
	//   30   69:invokespecial   #308 <Method zzaej zzc(zzaef)>
	//   31   72:astore          4
		long l = zzbv.zzer().elapsedRealtime();
	//   32   74:invokestatic    #199 <Method Clock zzbv.zzer()>
	//   33   77:invokeinterface #205 <Method long Clock.elapsedRealtime()>
	//   34   82:lstore_1        
		obj = ((Object) (new zzaji(((zzaef) (obj)), ((zzaej) (obj1)), ((zzwy) (null)), ((zzjn) (null)), ((zzaej) (obj1)).errorCode, l, ((zzaej) (obj1)).zzceu, ((JSONObject) (null)), zzcci)));
	//   35   83:new             #310 <Class zzaji>
	//   36   86:dup             
	//   37   87:aload_3         
	//   38   88:aload           4
	//   39   90:aconst_null     
	//   40   91:aconst_null     
	//   41   92:aload           4
	//   42   94:getfield        #249 <Field int zzaej.errorCode>
	//   43   97:lload_1         
	//   44   98:aload           4
	//   45  100:getfield        #313 <Field long zzaej.zzceu>
	//   46  103:aconst_null     
	//   47  104:aload_0         
	//   48  105:getfield        #73  <Field zzhx zzcci>
	//   49  108:invokespecial   #316 <Method void zzaji(zzaef, zzaej, zzwy, zzjn, int, long, long, JSONObject, zzhx)>
	//   50  111:astore_3        
		zzamu.zzsy.post(((Runnable) (new zzafb(this, ((zzaji) (obj))))));
	//   51  112:getstatic       #215 <Field Handler zzamu.zzsy>
	//   52  115:new             #318 <Class zzafb>
	//   53  118:dup             
	//   54  119:aload_0         
	//   55  120:aload_3         
	//   56  121:invokespecial   #321 <Method void zzafb(zzafa, zzaji)>
	//   57  124:invokevirtual   #226 <Method boolean Handler.post(Runnable)>
	//   58  127:pop             
	//   59  128:return          
	}

	private static final Object sLock = new Object();
	private static final long zzcgc;
	private static boolean zzcgd = false;
	private static zzvf zzcge;
	private static HttpClient zzcgf;
	private static zzaa zzcgg;
	private static zzv zzcgh;
	private final Context mContext;
	private final Object zzbzh;
	private final zzadj zzccf;
	private final zzaeg zzccg;
	private zzhx zzcci;
	private zzvs zzcgi;

	static 
	{
		zzcgc = TimeUnit.SECONDS.toMillis(10L);
	//    0    0:getstatic       #43  <Field TimeUnit TimeUnit.SECONDS>
	//    1    3:ldc2w           #44  <Long 10L>
	//    2    6:invokevirtual   #49  <Method long TimeUnit.toMillis(long)>
	//    3    9:putstatic       #51  <Field long zzcgc>
	//    4   12:new             #53  <Class Object>
	//    5   15:dup             
	//    6   16:invokespecial   #56  <Method void Object()>
	//    7   19:putstatic       #58  <Field Object sLock>
	//*   8   22:return          
	}
}
