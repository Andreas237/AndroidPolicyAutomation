// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.gmsg.zzf;
import com.google.android.gms.ads.internal.*;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzamj, zzakk, zzaqw, zzkb, 
//			zzamu, zzasc, zzaoj, zzasi, 
//			zzaji, zzaef, zzarc, zzack, 
//			zzacl, zzaql, zzaci, zzacj, 
//			zzacg, zzach, zznk, zzni, 
//			zzakb, zzci, zznx

public final class zzace
{

	public zzace(Context context, zzci zzci, zzaji zzaji1, zznx zznx, zzbc zzbc1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #4   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #35  <Method void Object()>
	//    6   12:putfield        #37  <Field Object mLock>
		zzadx = -1;
	//    7   15:aload_0         
	//    8   16:iconst_m1       
	//    9   17:putfield        #39  <Field int zzadx>
		zzady = -1;
	//   10   20:aload_0         
	//   11   21:iconst_m1       
	//   12   22:putfield        #41  <Field int zzady>
		mContext = context;
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:putfield        #43  <Field Context mContext>
		zzbjc = zzci;
	//   16   30:aload_0         
	//   17   31:aload_2         
	//   18   32:putfield        #45  <Field zzci zzbjc>
		zzbze = zzaji1;
	//   19   35:aload_0         
	//   20   36:aload_3         
	//   21   37:putfield        #47  <Field zzaji zzbze>
		zzvr = zznx;
	//   22   40:aload_0         
	//   23   41:aload           4
	//   24   43:putfield        #49  <Field zznx zzvr>
		zzcbc = zzbc1;
	//   25   46:aload_0         
	//   26   47:aload           5
	//   27   49:putfield        #51  <Field zzbc zzcbc>
		zzadz = new zzamj(200L);
	//   28   52:aload_0         
	//   29   53:new             #53  <Class zzamj>
	//   30   56:dup             
	//   31   57:ldc2w           #54  <Long 200L>
	//   32   60:invokespecial   #58  <Method void zzamj(long)>
	//   33   63:putfield        #60  <Field zzamj zzadz>
		zzbv.zzek();
	//   34   66:invokestatic    #66  <Method zzakk zzbv.zzek()>
	//   35   69:pop             
		zzagj = com.google.android.gms.internal.ads.zzakk.zza((WindowManager)context.getSystemService("window"));
	//   36   70:aload_0         
	//   37   71:aload_1         
	//   38   72:ldc1            #68  <String "window">
	//   39   74:invokevirtual   #74  <Method Object Context.getSystemService(String)>
	//   40   77:checkcast       #76  <Class WindowManager>
	//   41   80:invokestatic    #82  <Method DisplayMetrics com.google.android.gms.internal.ads.zzakk.zza(WindowManager)>
	//   42   83:putfield        #84  <Field DisplayMetrics zzagj>
	//   43   86:return          
	}

	static zzbc zza(zzace zzace1)
	{
		return zzace1.zzcbc;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field zzbc zzcbc>
	//    2    4:areturn         
	}

	static void zza(zzace zzace1, WeakReference weakreference, boolean flag)
	{
		zzace1.zza(weakreference, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #90  <Method void zza(WeakReference, boolean)>
	//    4    6:return          
	}

	private final void zza(WeakReference weakreference, boolean flag)
	{
		if(weakreference == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		weakreference = ((WeakReference) ((zzaqw)weakreference.get()));
	//    3    5:aload_1         
	//    4    6:invokevirtual   #96  <Method Object WeakReference.get()>
	//    5    9:checkcast       #98  <Class zzaqw>
	//    6   12:astore_1        
		if(weakreference != null)
	//*   7   13:aload_1         
	//*   8   14:ifnull          164
		{
			if(((zzaqw) (weakreference)).getView() == null)
	//*   9   17:aload_1         
	//*  10   18:invokeinterface #102 <Method View zzaqw.getView()>
	//*  11   23:ifnonnull       27
				return;
	//   12   26:return          
			if(flag && !zzadz.tryAcquire())
	//*  13   27:iload_2         
	//*  14   28:ifeq            42
	//*  15   31:aload_0         
	//*  16   32:getfield        #60  <Field zzamj zzadz>
	//*  17   35:invokevirtual   #106 <Method boolean zzamj.tryAcquire()>
	//*  18   38:ifne            42
				return;
	//   19   41:return          
			View view = ((zzaqw) (weakreference)).getView();
	//   20   42:aload_1         
	//   21   43:invokeinterface #102 <Method View zzaqw.getView()>
	//   22   48:astore          5
			int ai[] = new int[2];
	//   23   50:iconst_2        
	//   24   51:newarray        int[]
	//   25   53:astore          6
			view.getLocationOnScreen(ai);
	//   26   55:aload           5
	//   27   57:aload           6
	//   28   59:invokevirtual   #112 <Method void View.getLocationOnScreen(int[])>
			zzkb.zzif();
	//   29   62:invokestatic    #118 <Method zzamu zzkb.zzif()>
	//   30   65:pop             
			int i = zzamu.zzb(zzagj, ai[0]);
	//   31   66:aload_0         
	//   32   67:getfield        #84  <Field DisplayMetrics zzagj>
	//   33   70:aload           6
	//   34   72:iconst_0        
	//   35   73:iaload          
	//   36   74:invokestatic    #124 <Method int zzamu.zzb(DisplayMetrics, int)>
	//   37   77:istore_3        
			zzkb.zzif();
	//   38   78:invokestatic    #118 <Method zzamu zzkb.zzif()>
	//   39   81:pop             
			int j = zzamu.zzb(zzagj, ai[1]);
	//   40   82:aload_0         
	//   41   83:getfield        #84  <Field DisplayMetrics zzagj>
	//   42   86:aload           6
	//   43   88:iconst_1        
	//   44   89:iaload          
	//   45   90:invokestatic    #124 <Method int zzamu.zzb(DisplayMetrics, int)>
	//   46   93:istore          4
			synchronized(mLock)
	//*  47   95:aload_0         
	//*  48   96:getfield        #37  <Field Object mLock>
	//*  49   99:astore          5
	//*  50  101:aload           5
	//*  51  103:monitorenter    
			{
				if(zzadx != i || zzady != j)
	//*  52  104:aload_0         
	//*  53  105:getfield        #39  <Field int zzadx>
	//*  54  108:iload_3         
	//*  55  109:icmpne          121
	//*  56  112:aload_0         
	//*  57  113:getfield        #41  <Field int zzady>
	//*  58  116:iload           4
	//*  59  118:icmpeq          154
				{
					zzadx = i;
	//   60  121:aload_0         
	//   61  122:iload_3         
	//   62  123:putfield        #39  <Field int zzadx>
					zzady = j;
	//   63  126:aload_0         
	//   64  127:iload           4
	//   65  129:putfield        #41  <Field int zzady>
					((zzaqw) (weakreference)).zzuf().zza(zzadx, zzady, flag ^ true);
	//   66  132:aload_1         
	//   67  133:invokeinterface #128 <Method zzasc zzaqw.zzuf()>
	//   68  138:aload_0         
	//   69  139:getfield        #39  <Field int zzadx>
	//   70  142:aload_0         
	//   71  143:getfield        #41  <Field int zzady>
	//   72  146:iload_2         
	//   73  147:iconst_1        
	//   74  148:ixor            
	//   75  149:invokeinterface #133 <Method void com.google.android.gms.internal.ads.zzasc.zza(int, int, boolean)>
				}
			}
	//   76  154:aload           5
	//   77  156:monitorexit     
			return;
	//   78  157:return          
		} else
	//*  79  158:astore_1        
	//*  80  159:aload           5
	//*  81  161:monitorexit     
	//*  82  162:aload_1         
	//*  83  163:athrow          
		{
			return;
	//   84  164:return          
		}
		weakreference;
		obj;
		JVM INSTR monitorexit ;
		throw weakreference;
	}

	final void zza(zzaoj zzaoj1, zzaqw zzaqw1, boolean flag)
	{
		zzcbc.zzdw();
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field zzbc zzcbc>
	//    2    4:invokevirtual   #141 <Method void zzbc.zzdw()>
		zzaoj1.set(((Object) (zzaqw1)));
	//    3    7:aload_1         
	//    4    8:aload_2         
	//    5    9:invokevirtual   #147 <Method void zzaoj.set(Object)>
	//    6   12:return          
	}

	final void zza(JSONObject jsonobject, zzaoj zzaoj1)
	{
		try
		{
			zzbv.zzel();
	//    0    0:invokestatic    #154 <Method zzarc zzbv.zzel()>
	//    1    3:pop             
			zzaqw zzaqw1 = com.google.android.gms.internal.ads.zzarc.zza(mContext, zzasi.zzvq(), "native-video", false, false, zzbjc, zzbze.zzcgs.zzacr, zzvr, ((com.google.android.gms.ads.internal.zzbo) (null)), ((zza) (zzcbc)).zzbi(), zzbze.zzcoq);
	//    2    4:aload_0         
	//    3    5:getfield        #43  <Field Context mContext>
	//    4    8:invokestatic    #160 <Method zzasi zzasi.zzvq()>
	//    5   11:ldc1            #162 <String "native-video">
	//    6   13:iconst_0        
	//    7   14:iconst_0        
	//    8   15:aload_0         
	//    9   16:getfield        #45  <Field zzci zzbjc>
	//   10   19:aload_0         
	//   11   20:getfield        #47  <Field zzaji zzbze>
	//   12   23:getfield        #168 <Field zzaef zzaji.zzcgs>
	//   13   26:getfield        #174 <Field zzang zzaef.zzacr>
	//   14   29:aload_0         
	//   15   30:getfield        #49  <Field zznx zzvr>
	//   16   33:aconst_null     
	//   17   34:aload_0         
	//   18   35:getfield        #51  <Field zzbc zzcbc>
	//   19   38:invokevirtual   #180 <Method com.google.android.gms.ads.internal.zzw zza.zzbi()>
	//   20   41:aload_0         
	//   21   42:getfield        #47  <Field zzaji zzbze>
	//   22   45:getfield        #184 <Field zzhs zzaji.zzcoq>
	//   23   48:invokestatic    #189 <Method zzaqw com.google.android.gms.internal.ads.zzarc.zza(Context, zzasi, String, boolean, boolean, zzci, zzang, zznx, com.google.android.gms.ads.internal.zzbo, com.google.android.gms.ads.internal.zzw, zzhs)>
	//   24   51:astore_3        
			zzaqw1.zza(zzasi.zzvr());
	//   25   52:aload_3         
	//   26   53:invokestatic    #191 <Method zzasi zzasi.zzvr()>
	//   27   56:invokeinterface #194 <Method void com.google.android.gms.internal.ads.zzaqw.zza(zzasi)>
			zzcbc.zzf(zzaqw1);
	//   28   61:aload_0         
	//   29   62:getfield        #51  <Field zzbc zzcbc>
	//   30   65:aload_3         
	//   31   66:invokevirtual   #198 <Method void zzbc.zzf(zzaqw)>
			WeakReference weakreference = new WeakReference(((Object) (zzaqw1)));
	//   32   69:new             #92  <Class WeakReference>
	//   33   72:dup             
	//   34   73:aload_3         
	//   35   74:invokespecial   #200 <Method void WeakReference(Object)>
	//   36   77:astore          4
			zzasc zzasc1 = zzaqw1.zzuf();
	//   37   79:aload_3         
	//   38   80:invokeinterface #128 <Method zzasc zzaqw.zzuf()>
	//   39   85:astore          5
			if(zzcbd == null)
	//*  40   87:aload_0         
	//*  41   88:getfield        #202 <Field android.view.ViewTreeObserver$OnGlobalLayoutListener zzcbd>
	//*  42   91:ifnonnull       108
				zzcbd = ((android.view.ViewTreeObserver.OnGlobalLayoutListener) (new zzack(this, weakreference)));
	//   43   94:aload_0         
	//   44   95:new             #204 <Class zzack>
	//   45   98:dup             
	//   46   99:aload_0         
	//   47  100:aload           4
	//   48  102:invokespecial   #207 <Method void zzack(zzace, WeakReference)>
	//   49  105:putfield        #202 <Field android.view.ViewTreeObserver$OnGlobalLayoutListener zzcbd>
			android.view.ViewTreeObserver.OnGlobalLayoutListener ongloballayoutlistener = zzcbd;
	//   50  108:aload_0         
	//   51  109:getfield        #202 <Field android.view.ViewTreeObserver$OnGlobalLayoutListener zzcbd>
	//   52  112:astore          6
			if(zzcbe == null)
	//*  53  114:aload_0         
	//*  54  115:getfield        #209 <Field android.view.ViewTreeObserver$OnScrollChangedListener zzcbe>
	//*  55  118:ifnonnull       135
				zzcbe = ((android.view.ViewTreeObserver.OnScrollChangedListener) (new zzacl(this, weakreference)));
	//   56  121:aload_0         
	//   57  122:new             #211 <Class zzacl>
	//   58  125:dup             
	//   59  126:aload_0         
	//   60  127:aload           4
	//   61  129:invokespecial   #212 <Method void zzacl(zzace, WeakReference)>
	//   62  132:putfield        #209 <Field android.view.ViewTreeObserver$OnScrollChangedListener zzcbe>
			zzasc1.zza(ongloballayoutlistener, zzcbe);
	//   63  135:aload           5
	//   64  137:aload           6
	//   65  139:aload_0         
	//   66  140:getfield        #209 <Field android.view.ViewTreeObserver$OnScrollChangedListener zzcbe>
	//   67  143:invokeinterface #215 <Method void com.google.android.gms.internal.ads.zzasc.zza(android.view.ViewTreeObserver$OnGlobalLayoutListener, android.view.ViewTreeObserver$OnScrollChangedListener)>
			zzaqw1.zza("/video", zzf.zzblz);
	//   68  148:aload_3         
	//   69  149:ldc1            #217 <String "/video">
	//   70  151:getstatic       #223 <Field com.google.android.gms.ads.internal.gmsg.zzv zzf.zzblz>
	//   71  154:invokeinterface #226 <Method void com.google.android.gms.internal.ads.zzaqw.zza(String, com.google.android.gms.ads.internal.gmsg.zzv)>
			zzaqw1.zza("/videoMeta", zzf.zzbma);
	//   72  159:aload_3         
	//   73  160:ldc1            #228 <String "/videoMeta">
	//   74  162:getstatic       #231 <Field com.google.android.gms.ads.internal.gmsg.zzv zzf.zzbma>
	//   75  165:invokeinterface #226 <Method void com.google.android.gms.internal.ads.zzaqw.zza(String, com.google.android.gms.ads.internal.gmsg.zzv)>
			zzaqw1.zza("/precache", ((com.google.android.gms.ads.internal.gmsg.zzv) (new zzaql())));
	//   76  170:aload_3         
	//   77  171:ldc1            #233 <String "/precache">
	//   78  173:new             #235 <Class zzaql>
	//   79  176:dup             
	//   80  177:invokespecial   #236 <Method void zzaql()>
	//   81  180:invokeinterface #226 <Method void com.google.android.gms.internal.ads.zzaqw.zza(String, com.google.android.gms.ads.internal.gmsg.zzv)>
			zzaqw1.zza("/delayPageLoaded", zzf.zzbmd);
	//   82  185:aload_3         
	//   83  186:ldc1            #238 <String "/delayPageLoaded">
	//   84  188:getstatic       #241 <Field com.google.android.gms.ads.internal.gmsg.zzv zzf.zzbmd>
	//   85  191:invokeinterface #226 <Method void com.google.android.gms.internal.ads.zzaqw.zza(String, com.google.android.gms.ads.internal.gmsg.zzv)>
			zzaqw1.zza("/instrument", zzf.zzbmb);
	//   86  196:aload_3         
	//   87  197:ldc1            #243 <String "/instrument">
	//   88  199:getstatic       #246 <Field com.google.android.gms.ads.internal.gmsg.zzv zzf.zzbmb>
	//   89  202:invokeinterface #226 <Method void com.google.android.gms.internal.ads.zzaqw.zza(String, com.google.android.gms.ads.internal.gmsg.zzv)>
			zzaqw1.zza("/log", zzf.zzblu);
	//   90  207:aload_3         
	//   91  208:ldc1            #248 <String "/log">
	//   92  210:getstatic       #251 <Field com.google.android.gms.ads.internal.gmsg.zzv zzf.zzblu>
	//   93  213:invokeinterface #226 <Method void com.google.android.gms.internal.ads.zzaqw.zza(String, com.google.android.gms.ads.internal.gmsg.zzv)>
			zzaqw1.zza("/videoClicked", zzf.zzblv);
	//   94  218:aload_3         
	//   95  219:ldc1            #253 <String "/videoClicked">
	//   96  221:getstatic       #256 <Field com.google.android.gms.ads.internal.gmsg.zzv zzf.zzblv>
	//   97  224:invokeinterface #226 <Method void com.google.android.gms.internal.ads.zzaqw.zza(String, com.google.android.gms.ads.internal.gmsg.zzv)>
			zzaqw1.zza("/trackActiveViewUnit", ((com.google.android.gms.ads.internal.gmsg.zzv) (new zzaci(this))));
	//   98  229:aload_3         
	//   99  230:ldc2            #258 <String "/trackActiveViewUnit">
	//  100  233:new             #260 <Class zzaci>
	//  101  236:dup             
	//  102  237:aload_0         
	//  103  238:invokespecial   #263 <Method void zzaci(zzace)>
	//  104  241:invokeinterface #226 <Method void com.google.android.gms.internal.ads.zzaqw.zza(String, com.google.android.gms.ads.internal.gmsg.zzv)>
			zzaqw1.zza("/untrackActiveViewUnit", ((com.google.android.gms.ads.internal.gmsg.zzv) (new zzacj(this))));
	//  105  246:aload_3         
	//  106  247:ldc2            #265 <String "/untrackActiveViewUnit">
	//  107  250:new             #267 <Class zzacj>
	//  108  253:dup             
	//  109  254:aload_0         
	//  110  255:invokespecial   #268 <Method void zzacj(zzace)>
	//  111  258:invokeinterface #226 <Method void com.google.android.gms.internal.ads.zzaqw.zza(String, com.google.android.gms.ads.internal.gmsg.zzv)>
			zzaqw1.zzuf().zza(((zzase) (new zzacg(zzaqw1, jsonobject))));
	//  112  263:aload_3         
	//  113  264:invokeinterface #128 <Method zzasc zzaqw.zzuf()>
	//  114  269:new             #270 <Class zzacg>
	//  115  272:dup             
	//  116  273:aload_3         
	//  117  274:aload_1         
	//  118  275:invokespecial   #273 <Method void zzacg(zzaqw, JSONObject)>
	//  119  278:invokeinterface #276 <Method void com.google.android.gms.internal.ads.zzasc.zza(zzase)>
			zzaqw1.zzuf().zza(((zzasd) (new zzach(this, zzaoj1, zzaqw1))));
	//  120  283:aload_3         
	//  121  284:invokeinterface #128 <Method zzasc zzaqw.zzuf()>
	//  122  289:new             #278 <Class zzach>
	//  123  292:dup             
	//  124  293:aload_0         
	//  125  294:aload_2         
	//  126  295:aload_3         
	//  127  296:invokespecial   #281 <Method void zzach(zzace, zzaoj, zzaqw)>
	//  128  299:invokeinterface #284 <Method void com.google.android.gms.internal.ads.zzasc.zza(zzasd)>
			jsonobject = ((JSONObject) (zznk.zzbbs));
	//  129  304:getstatic       #290 <Field zzna zznk.zzbbs>
	//  130  307:astore_1        
			zzaqw1.loadUrl((String)zzkb.zzik().zzd(((zzna) (jsonobject))));
	//  131  308:aload_3         
	//  132  309:invokestatic    #294 <Method zzni zzkb.zzik()>
	//  133  312:aload_1         
	//  134  313:invokevirtual   #300 <Method Object zzni.zzd(zzna)>
	//  135  316:checkcast       #302 <Class String>
	//  136  319:invokeinterface #306 <Method void zzaqw.loadUrl(String)>
			return;
	//  137  324:return          
		}
		// Misplaced declaration of an exception variable
		catch(JSONObject jsonobject)
	//* 138  325:astore_1        
		{
			zzakb.zzc("Exception occurred while getting video view", ((Throwable) (jsonobject)));
	//  139  326:ldc2            #308 <String "Exception occurred while getting video view">
	//  140  329:aload_1         
	//  141  330:invokestatic    #314 <Method void zzakb.zzc(String, Throwable)>
		}
		zzaoj1.set(((Object) (null)));
	//  142  333:aload_2         
	//  143  334:aconst_null     
	//  144  335:invokevirtual   #147 <Method void zzaoj.set(Object)>
	//  145  338:return          
	}

	private final Context mContext;
	private final Object mLock = new Object();
	private int zzadx;
	private int zzady;
	private zzamj zzadz;
	private final DisplayMetrics zzagj;
	private final zzci zzbjc;
	private final zzaji zzbze;
	private final zzbc zzcbc;
	private android.view.ViewTreeObserver.OnGlobalLayoutListener zzcbd;
	private android.view.ViewTreeObserver.OnScrollChangedListener zzcbe;
	private final zznx zzvr;
}
