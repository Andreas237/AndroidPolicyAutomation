// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.*;
import android.support.v4.util.SimpleArrayMap;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.*;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.ads.internal:
//			zzbc, zzbw, zza, zzq, 
//			zzd, zzaj, zzai, zzw

public final class zzah extends zzkl
{

	zzah(Context context, String s, zzxn zzxn, zzang zzang, zzkh zzkh1, zzqw zzqw, zzrl zzrl, 
			zzqz zzqz, SimpleArrayMap simplearraymap, SimpleArrayMap simplearraymap1, zzpl zzpl, zzlg zzlg, zzw zzw, zzri zzri, 
			zzjn zzjn1, PublisherAdViewOptions publisheradviewoptions)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #53  <Method void zzkl()>
	//    2    4:aload_0         
	//    3    5:new             #55  <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #56  <Method void Object()>
	//    6   12:putfield        #58  <Field Object mLock>
		mContext = context;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #60  <Field Context mContext>
		zzye = s;
	//   10   20:aload_0         
	//   11   21:aload_2         
	//   12   22:putfield        #62  <Field String zzye>
		zzwh = zzxn;
	//   13   25:aload_0         
	//   14   26:aload_3         
	//   15   27:putfield        #64  <Field zzxn zzwh>
		zzyf = zzang;
	//   16   30:aload_0         
	//   17   31:aload           4
	//   18   33:putfield        #66  <Field zzang zzyf>
		zzxs = zzkh1;
	//   19   36:aload_0         
	//   20   37:aload           5
	//   21   39:putfield        #68  <Field zzkh zzxs>
		zzxv = zzqz;
	//   22   42:aload_0         
	//   23   43:aload           8
	//   24   45:putfield        #70  <Field zzqz zzxv>
		zzxt = zzqw;
	//   25   48:aload_0         
	//   26   49:aload           6
	//   27   51:putfield        #72  <Field zzqw zzxt>
		zzxu = zzrl;
	//   28   54:aload_0         
	//   29   55:aload           7
	//   30   57:putfield        #74  <Field zzrl zzxu>
		zzxz = simplearraymap;
	//   31   60:aload_0         
	//   32   61:aload           9
	//   33   63:putfield        #76  <Field SimpleArrayMap zzxz>
		zzya = simplearraymap1;
	//   34   66:aload_0         
	//   35   67:aload           10
	//   36   69:putfield        #78  <Field SimpleArrayMap zzya>
		zzyb = zzpl;
	//   37   72:aload_0         
	//   38   73:aload           11
	//   39   75:putfield        #80  <Field zzpl zzyb>
	//   40   78:aload_0         
	//   41   79:aload_0         
	//   42   80:invokespecial   #84  <Method List zzdg()>
	//   43   83:putfield        #86  <Field List zzyc>
		zzyd = zzlg;
	//   44   86:aload_0         
	//   45   87:aload           12
	//   46   89:putfield        #88  <Field zzlg zzyd>
		zzwc = zzw;
	//   47   92:aload_0         
	//   48   93:aload           13
	//   49   95:putfield        #90  <Field zzw zzwc>
		zzxw = zzri;
	//   50   98:aload_0         
	//   51   99:aload           14
	//   52  101:putfield        #92  <Field zzri zzxw>
		zzxx = zzjn1;
	//   53  104:aload_0         
	//   54  105:aload           15
	//   55  107:putfield        #94  <Field zzjn zzxx>
		zzxy = publisheradviewoptions;
	//   56  110:aload_0         
	//   57  111:aload           16
	//   58  113:putfield        #96  <Field PublisherAdViewOptions zzxy>
		zznk.initialize(mContext);
	//   59  116:aload_0         
	//   60  117:getfield        #60  <Field Context mContext>
	//   61  120:invokestatic    #102 <Method void zznk.initialize(Context)>
	//   62  123:return          
	}

	private static void runOnUiThread(Runnable runnable)
	{
		zzakk.zzcrm.post(runnable);
	//    0    0:getstatic       #113 <Field Handler zzakk.zzcrm>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #119 <Method boolean Handler.post(Runnable)>
	//    3    7:pop             
	//    4    8:return          
	}

	static Object zza(zzah zzah1)
	{
		return zzah1.mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field Object mLock>
	//    2    4:areturn         
	}

	static void zza(zzah zzah1, zzjj zzjj1)
	{
		zzah1.zze(zzjj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #126 <Method void zze(zzjj)>
	//    3    5:return          
	}

	static void zza(zzah zzah1, zzjj zzjj1, int i)
	{
		zzah1.zzb(zzjj1, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #131 <Method void zzb(zzjj, int)>
	//    4    6:return          
	}

	private final void zzb(zzjj zzjj1, int i)
	{
		com.google.android.gms.internal.ads.zzna zzna = zznk.zzbcg;
	//    0    0:getstatic       #135 <Field com.google.android.gms.internal.ads.zzna zznk.zzbcg>
	//    1    3:astore_3        
		if(!((Boolean)zzkb.zzik().zzd(zzna)).booleanValue() && zzxu != null)
	//*   2    4:invokestatic    #141 <Method zzni zzkb.zzik()>
	//*   3    7:aload_3         
	//*   4    8:invokevirtual   #147 <Method Object zzni.zzd(com.google.android.gms.internal.ads.zzna)>
	//*   5   11:checkcast       #149 <Class Boolean>
	//*   6   14:invokevirtual   #153 <Method boolean Boolean.booleanValue()>
	//*   7   17:ifne            33
	//*   8   20:aload_0         
	//*   9   21:getfield        #74  <Field zzrl zzxu>
	//*  10   24:ifnull          33
		{
			zzi(0);
	//   11   27:aload_0         
	//   12   28:iconst_0        
	//   13   29:invokespecial   #157 <Method void zzi(int)>
			return;
	//   14   32:return          
		} else
		{
			Object obj = ((Object) (mContext));
	//   15   33:aload_0         
	//   16   34:getfield        #60  <Field Context mContext>
	//   17   37:astore_3        
			obj = ((Object) (new zzbc(((Context) (obj)), zzwc, zzjn.zzf(((Context) (obj))), zzye, zzwh, zzyf)));
	//   18   38:new             #159 <Class zzbc>
	//   19   41:dup             
	//   20   42:aload_3         
	//   21   43:aload_0         
	//   22   44:getfield        #90  <Field zzw zzwc>
	//   23   47:aload_3         
	//   24   48:invokestatic    #165 <Method zzjn zzjn.zzf(Context)>
	//   25   51:aload_0         
	//   26   52:getfield        #62  <Field String zzye>
	//   27   55:aload_0         
	//   28   56:getfield        #64  <Field zzxn zzwh>
	//   29   59:aload_0         
	//   30   60:getfield        #66  <Field zzang zzyf>
	//   31   63:invokespecial   #168 <Method void zzbc(Context, zzw, zzjn, String, zzxn, zzang)>
	//   32   66:astore_3        
			zzyg = new WeakReference(obj);
	//   33   67:aload_0         
	//   34   68:new             #170 <Class WeakReference>
	//   35   71:dup             
	//   36   72:aload_3         
	//   37   73:invokespecial   #173 <Method void WeakReference(Object)>
	//   38   76:putfield        #175 <Field WeakReference zzyg>
			Object obj1 = ((Object) (zzxt));
	//   39   79:aload_0         
	//   40   80:getfield        #72  <Field zzqw zzxt>
	//   41   83:astore          4
			Preconditions.checkMainThread("setOnAppInstallAdLoadedListener must be called on the main UI thread.");
	//   42   85:ldc1            #177 <String "setOnAppInstallAdLoadedListener must be called on the main UI thread.">
	//   43   87:invokestatic    #183 <Method void Preconditions.checkMainThread(String)>
			((zzbc) (obj)).zzvw.zzade = ((zzqw) (obj1));
	//   44   90:aload_3         
	//   45   91:getfield        #187 <Field zzbw zzbc.zzvw>
	//   46   94:aload           4
	//   47   96:putfield        #192 <Field zzqw zzbw.zzade>
			obj1 = ((Object) (zzxu));
	//   48   99:aload_0         
	//   49  100:getfield        #74  <Field zzrl zzxu>
	//   50  103:astore          4
			Preconditions.checkMainThread("setOnUnifiedNativeAdLoadedListener must be called on the main UI thread.");
	//   51  105:ldc1            #194 <String "setOnUnifiedNativeAdLoadedListener must be called on the main UI thread.">
	//   52  107:invokestatic    #183 <Method void Preconditions.checkMainThread(String)>
			((zzbc) (obj)).zzvw.zzadg = ((zzrl) (obj1));
	//   53  110:aload_3         
	//   54  111:getfield        #187 <Field zzbw zzbc.zzvw>
	//   55  114:aload           4
	//   56  116:putfield        #197 <Field zzrl zzbw.zzadg>
			obj1 = ((Object) (zzxv));
	//   57  119:aload_0         
	//   58  120:getfield        #70  <Field zzqz zzxv>
	//   59  123:astore          4
			Preconditions.checkMainThread("setOnContentAdLoadedListener must be called on the main UI thread.");
	//   60  125:ldc1            #199 <String "setOnContentAdLoadedListener must be called on the main UI thread.">
	//   61  127:invokestatic    #183 <Method void Preconditions.checkMainThread(String)>
			((zzbc) (obj)).zzvw.zzadf = ((zzqz) (obj1));
	//   62  130:aload_3         
	//   63  131:getfield        #187 <Field zzbw zzbc.zzvw>
	//   64  134:aload           4
	//   65  136:putfield        #202 <Field zzqz zzbw.zzadf>
			obj1 = ((Object) (zzxz));
	//   66  139:aload_0         
	//   67  140:getfield        #76  <Field SimpleArrayMap zzxz>
	//   68  143:astore          4
			Preconditions.checkMainThread("setOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
	//   69  145:ldc1            #204 <String "setOnCustomTemplateAdLoadedListeners must be called on the main UI thread.">
	//   70  147:invokestatic    #183 <Method void Preconditions.checkMainThread(String)>
			((zzbc) (obj)).zzvw.zzadi = ((SimpleArrayMap) (obj1));
	//   71  150:aload_3         
	//   72  151:getfield        #187 <Field zzbw zzbc.zzvw>
	//   73  154:aload           4
	//   74  156:putfield        #207 <Field SimpleArrayMap zzbw.zzadi>
			((zza) (obj)).zza(zzxs);
	//   75  159:aload_3         
	//   76  160:aload_0         
	//   77  161:getfield        #68  <Field zzkh zzxs>
	//   78  164:invokevirtual   #212 <Method void zza.zza(zzkh)>
			obj1 = ((Object) (zzya));
	//   79  167:aload_0         
	//   80  168:getfield        #78  <Field SimpleArrayMap zzya>
	//   81  171:astore          4
			Preconditions.checkMainThread("setOnCustomClickListener must be called on the main UI thread.");
	//   82  173:ldc1            #214 <String "setOnCustomClickListener must be called on the main UI thread.">
	//   83  175:invokestatic    #183 <Method void Preconditions.checkMainThread(String)>
			((zzbc) (obj)).zzvw.zzadh = ((SimpleArrayMap) (obj1));
	//   84  178:aload_3         
	//   85  179:getfield        #187 <Field zzbw zzbc.zzvw>
	//   86  182:aload           4
	//   87  184:putfield        #217 <Field SimpleArrayMap zzbw.zzadh>
			((zzbc) (obj)).zzd(zzdg());
	//   88  187:aload_3         
	//   89  188:aload_0         
	//   90  189:invokespecial   #84  <Method List zzdg()>
	//   91  192:invokevirtual   #220 <Method void zzbc.zzd(List)>
			obj1 = ((Object) (zzyb));
	//   92  195:aload_0         
	//   93  196:getfield        #80  <Field zzpl zzyb>
	//   94  199:astore          4
			Preconditions.checkMainThread("setNativeAdOptions must be called on the main UI thread.");
	//   95  201:ldc1            #222 <String "setNativeAdOptions must be called on the main UI thread.">
	//   96  203:invokestatic    #183 <Method void Preconditions.checkMainThread(String)>
			((zzbc) (obj)).zzvw.zzadj = ((zzpl) (obj1));
	//   97  206:aload_3         
	//   98  207:getfield        #187 <Field zzbw zzbc.zzvw>
	//   99  210:aload           4
	//  100  212:putfield        #225 <Field zzpl zzbw.zzadj>
			((zza) (obj)).zza(zzyd);
	//  101  215:aload_3         
	//  102  216:aload_0         
	//  103  217:getfield        #88  <Field zzlg zzyd>
	//  104  220:invokevirtual   #228 <Method void zza.zza(zzlg)>
			((zzbc) (obj)).zzj(i);
	//  105  223:aload_3         
	//  106  224:iload_2         
	//  107  225:invokevirtual   #231 <Method void zzbc.zzj(int)>
			((zza) (obj)).zzb(zzjj1);
	//  108  228:aload_3         
	//  109  229:aload_1         
	//  110  230:invokevirtual   #234 <Method boolean zza.zzb(zzjj)>
	//  111  233:pop             
			return;
	//  112  234:return          
		}
	}

	static boolean zzb(zzah zzah1)
	{
		return zzah1.zzde();
	//    0    0:aload_0         
	//    1    1:invokespecial   #238 <Method boolean zzde()>
	//    2    4:ireturn         
	}

	private final boolean zzde()
	{
		com.google.android.gms.internal.ads.zzna zzna = zznk.zzaym;
	//    0    0:getstatic       #241 <Field com.google.android.gms.internal.ads.zzna zznk.zzaym>
	//    1    3:astore_1        
		return ((Boolean)zzkb.zzik().zzd(zzna)).booleanValue() && zzxw != null;
	//    2    4:invokestatic    #141 <Method zzni zzkb.zzik()>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #147 <Method Object zzni.zzd(com.google.android.gms.internal.ads.zzna)>
	//    5   11:checkcast       #149 <Class Boolean>
	//    6   14:invokevirtual   #153 <Method boolean Boolean.booleanValue()>
	//    7   17:ifeq            29
	//    8   20:aload_0         
	//    9   21:getfield        #92  <Field zzri zzxw>
	//   10   24:ifnull          29
	//   11   27:iconst_1        
	//   12   28:ireturn         
	//   13   29:iconst_0        
	//   14   30:ireturn         
	}

	private final boolean zzdf()
	{
		if(zzxt == null && zzxv == null && zzxu == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #72  <Field zzqw zzxt>
	//*   2    4:ifnonnull       42
	//*   3    7:aload_0         
	//*   4    8:getfield        #70  <Field zzqz zzxv>
	//*   5   11:ifnonnull       42
	//*   6   14:aload_0         
	//*   7   15:getfield        #74  <Field zzrl zzxu>
	//*   8   18:ifnonnull       42
		{
			SimpleArrayMap simplearraymap = zzxz;
	//    9   21:aload_0         
	//   10   22:getfield        #76  <Field SimpleArrayMap zzxz>
	//   11   25:astore_1        
			if(simplearraymap == null || simplearraymap.size() <= 0)
	//*  12   26:aload_1         
	//*  13   27:ifnull          40
	//*  14   30:aload_1         
	//*  15   31:invokevirtual   #248 <Method int SimpleArrayMap.size()>
	//*  16   34:ifle            40
	//*  17   37:goto            42
				return false;
	//   18   40:iconst_0        
	//   19   41:ireturn         
		}
		return true;
	//   20   42:iconst_1        
	//   21   43:ireturn         
	}

	private final List zzdg()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #250 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #251 <Method void ArrayList()>
	//    3    7:astore_1        
		if(zzxv != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #70  <Field zzqz zzxv>
	//*   6   12:ifnull          24
			((List) (arraylist)).add("1");
	//    7   15:aload_1         
	//    8   16:ldc1            #253 <String "1">
	//    9   18:invokeinterface #259 <Method boolean List.add(Object)>
	//   10   23:pop             
		if(zzxt != null)
	//*  11   24:aload_0         
	//*  12   25:getfield        #72  <Field zzqw zzxt>
	//*  13   28:ifnull          41
			((List) (arraylist)).add("2");
	//   14   31:aload_1         
	//   15   32:ldc2            #261 <String "2">
	//   16   35:invokeinterface #259 <Method boolean List.add(Object)>
	//   17   40:pop             
		if(zzxu != null)
	//*  18   41:aload_0         
	//*  19   42:getfield        #74  <Field zzrl zzxu>
	//*  20   45:ifnull          58
			((List) (arraylist)).add("6");
	//   21   48:aload_1         
	//   22   49:ldc2            #263 <String "6">
	//   23   52:invokeinterface #259 <Method boolean List.add(Object)>
	//   24   57:pop             
		if(zzxz.size() > 0)
	//*  25   58:aload_0         
	//*  26   59:getfield        #76  <Field SimpleArrayMap zzxz>
	//*  27   62:invokevirtual   #248 <Method int SimpleArrayMap.size()>
	//*  28   65:ifle            78
			((List) (arraylist)).add("3");
	//   29   68:aload_1         
	//   30   69:ldc2            #265 <String "3">
	//   31   72:invokeinterface #259 <Method boolean List.add(Object)>
	//   32   77:pop             
		return ((List) (arraylist));
	//   33   78:aload_1         
	//   34   79:areturn         
	}

	private final void zze(zzjj zzjj1)
	{
		Object obj = ((Object) (zznk.zzbcg));
	//    0    0:getstatic       #135 <Field com.google.android.gms.internal.ads.zzna zznk.zzbcg>
	//    1    3:astore_2        
		if(!((Boolean)zzkb.zzik().zzd(((com.google.android.gms.internal.ads.zzna) (obj)))).booleanValue() && zzxu != null)
	//*   2    4:invokestatic    #141 <Method zzni zzkb.zzik()>
	//*   3    7:aload_2         
	//*   4    8:invokevirtual   #147 <Method Object zzni.zzd(com.google.android.gms.internal.ads.zzna)>
	//*   5   11:checkcast       #149 <Class Boolean>
	//*   6   14:invokevirtual   #153 <Method boolean Boolean.booleanValue()>
	//*   7   17:ifne            33
	//*   8   20:aload_0         
	//*   9   21:getfield        #74  <Field zzrl zzxu>
	//*  10   24:ifnull          33
		{
			zzi(0);
	//   11   27:aload_0         
	//   12   28:iconst_0        
	//   13   29:invokespecial   #157 <Method void zzi(int)>
			return;
	//   14   32:return          
		}
		obj = ((Object) (new zzq(mContext, zzwc, zzxx, zzye, zzwh, zzyf)));
	//   15   33:new             #268 <Class zzq>
	//   16   36:dup             
	//   17   37:aload_0         
	//   18   38:getfield        #60  <Field Context mContext>
	//   19   41:aload_0         
	//   20   42:getfield        #90  <Field zzw zzwc>
	//   21   45:aload_0         
	//   22   46:getfield        #94  <Field zzjn zzxx>
	//   23   49:aload_0         
	//   24   50:getfield        #62  <Field String zzye>
	//   25   53:aload_0         
	//   26   54:getfield        #64  <Field zzxn zzwh>
	//   27   57:aload_0         
	//   28   58:getfield        #66  <Field zzang zzyf>
	//   29   61:invokespecial   #269 <Method void zzq(Context, zzw, zzjn, String, zzxn, zzang)>
	//   30   64:astore_2        
		zzyg = new WeakReference(obj);
	//   31   65:aload_0         
	//   32   66:new             #170 <Class WeakReference>
	//   33   69:dup             
	//   34   70:aload_2         
	//   35   71:invokespecial   #173 <Method void WeakReference(Object)>
	//   36   74:putfield        #175 <Field WeakReference zzyg>
		Object obj1 = ((Object) (zzxw));
	//   37   77:aload_0         
	//   38   78:getfield        #92  <Field zzri zzxw>
	//   39   81:astore_3        
		Preconditions.checkMainThread("setOnPublisherAdViewLoadedListener must be called on the main UI thread.");
	//   40   82:ldc2            #271 <String "setOnPublisherAdViewLoadedListener must be called on the main UI thread.">
	//   41   85:invokestatic    #183 <Method void Preconditions.checkMainThread(String)>
		((zzq) (obj)).zzvw.zzadm = ((zzri) (obj1));
	//   42   88:aload_2         
	//   43   89:getfield        #272 <Field zzbw zzq.zzvw>
	//   44   92:aload_3         
	//   45   93:putfield        #275 <Field zzri zzbw.zzadm>
		obj1 = ((Object) (zzxy));
	//   46   96:aload_0         
	//   47   97:getfield        #96  <Field PublisherAdViewOptions zzxy>
	//   48  100:astore_3        
		if(obj1 != null)
	//*  49  101:aload_3         
	//*  50  102:ifnull          134
		{
			if(((PublisherAdViewOptions) (obj1)).zzbg() != null)
	//*  51  105:aload_3         
	//*  52  106:invokevirtual   #281 <Method com.google.android.gms.internal.ads.zzla PublisherAdViewOptions.zzbg()>
	//*  53  109:ifnull          123
				((zza) (obj)).zza(zzxy.zzbg());
	//   54  112:aload_2         
	//   55  113:aload_0         
	//   56  114:getfield        #96  <Field PublisherAdViewOptions zzxy>
	//   57  117:invokevirtual   #281 <Method com.google.android.gms.internal.ads.zzla PublisherAdViewOptions.zzbg()>
	//   58  120:invokevirtual   #284 <Method void zza.zza(com.google.android.gms.internal.ads.zzla)>
			((zza) (obj)).setManualImpressionsEnabled(zzxy.getManualImpressionsEnabled());
	//   59  123:aload_2         
	//   60  124:aload_0         
	//   61  125:getfield        #96  <Field PublisherAdViewOptions zzxy>
	//   62  128:invokevirtual   #287 <Method boolean PublisherAdViewOptions.getManualImpressionsEnabled()>
	//   63  131:invokevirtual   #291 <Method void zza.setManualImpressionsEnabled(boolean)>
		}
		obj1 = ((Object) (zzxt));
	//   64  134:aload_0         
	//   65  135:getfield        #72  <Field zzqw zzxt>
	//   66  138:astore_3        
		Preconditions.checkMainThread("setOnAppInstallAdLoadedListener must be called on the main UI thread.");
	//   67  139:ldc1            #177 <String "setOnAppInstallAdLoadedListener must be called on the main UI thread.">
	//   68  141:invokestatic    #183 <Method void Preconditions.checkMainThread(String)>
		((zzq) (obj)).zzvw.zzade = ((zzqw) (obj1));
	//   69  144:aload_2         
	//   70  145:getfield        #272 <Field zzbw zzq.zzvw>
	//   71  148:aload_3         
	//   72  149:putfield        #192 <Field zzqw zzbw.zzade>
		obj1 = ((Object) (zzxu));
	//   73  152:aload_0         
	//   74  153:getfield        #74  <Field zzrl zzxu>
	//   75  156:astore_3        
		Preconditions.checkMainThread("setOnUnifiedNativeAdLoadedListener must be called on the main UI thread.");
	//   76  157:ldc1            #194 <String "setOnUnifiedNativeAdLoadedListener must be called on the main UI thread.">
	//   77  159:invokestatic    #183 <Method void Preconditions.checkMainThread(String)>
		((zzq) (obj)).zzvw.zzadg = ((zzrl) (obj1));
	//   78  162:aload_2         
	//   79  163:getfield        #272 <Field zzbw zzq.zzvw>
	//   80  166:aload_3         
	//   81  167:putfield        #197 <Field zzrl zzbw.zzadg>
		obj1 = ((Object) (zzxv));
	//   82  170:aload_0         
	//   83  171:getfield        #70  <Field zzqz zzxv>
	//   84  174:astore_3        
		Preconditions.checkMainThread("setOnContentAdLoadedListener must be called on the main UI thread.");
	//   85  175:ldc1            #199 <String "setOnContentAdLoadedListener must be called on the main UI thread.">
	//   86  177:invokestatic    #183 <Method void Preconditions.checkMainThread(String)>
		((zzq) (obj)).zzvw.zzadf = ((zzqz) (obj1));
	//   87  180:aload_2         
	//   88  181:getfield        #272 <Field zzbw zzq.zzvw>
	//   89  184:aload_3         
	//   90  185:putfield        #202 <Field zzqz zzbw.zzadf>
		obj1 = ((Object) (zzxz));
	//   91  188:aload_0         
	//   92  189:getfield        #76  <Field SimpleArrayMap zzxz>
	//   93  192:astore_3        
		Preconditions.checkMainThread("setOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
	//   94  193:ldc1            #204 <String "setOnCustomTemplateAdLoadedListeners must be called on the main UI thread.">
	//   95  195:invokestatic    #183 <Method void Preconditions.checkMainThread(String)>
		((zzq) (obj)).zzvw.zzadi = ((SimpleArrayMap) (obj1));
	//   96  198:aload_2         
	//   97  199:getfield        #272 <Field zzbw zzq.zzvw>
	//   98  202:aload_3         
	//   99  203:putfield        #207 <Field SimpleArrayMap zzbw.zzadi>
		obj1 = ((Object) (zzya));
	//  100  206:aload_0         
	//  101  207:getfield        #78  <Field SimpleArrayMap zzya>
	//  102  210:astore_3        
		Preconditions.checkMainThread("setOnCustomClickListener must be called on the main UI thread.");
	//  103  211:ldc1            #214 <String "setOnCustomClickListener must be called on the main UI thread.">
	//  104  213:invokestatic    #183 <Method void Preconditions.checkMainThread(String)>
		((zzq) (obj)).zzvw.zzadh = ((SimpleArrayMap) (obj1));
	//  105  216:aload_2         
	//  106  217:getfield        #272 <Field zzbw zzq.zzvw>
	//  107  220:aload_3         
	//  108  221:putfield        #217 <Field SimpleArrayMap zzbw.zzadh>
		obj1 = ((Object) (zzyb));
	//  109  224:aload_0         
	//  110  225:getfield        #80  <Field zzpl zzyb>
	//  111  228:astore_3        
		Preconditions.checkMainThread("setNativeAdOptions must be called on the main UI thread.");
	//  112  229:ldc1            #222 <String "setNativeAdOptions must be called on the main UI thread.">
	//  113  231:invokestatic    #183 <Method void Preconditions.checkMainThread(String)>
		((zzq) (obj)).zzvw.zzadj = ((zzpl) (obj1));
	//  114  234:aload_2         
	//  115  235:getfield        #272 <Field zzbw zzq.zzvw>
	//  116  238:aload_3         
	//  117  239:putfield        #225 <Field zzpl zzbw.zzadj>
		((zzq) (obj)).zzd(zzdg());
	//  118  242:aload_2         
	//  119  243:aload_0         
	//  120  244:invokespecial   #84  <Method List zzdg()>
	//  121  247:invokevirtual   #292 <Method void zzq.zzd(List)>
		((zza) (obj)).zza(zzxs);
	//  122  250:aload_2         
	//  123  251:aload_0         
	//  124  252:getfield        #68  <Field zzkh zzxs>
	//  125  255:invokevirtual   #212 <Method void zza.zza(zzkh)>
		((zza) (obj)).zza(zzyd);
	//  126  258:aload_2         
	//  127  259:aload_0         
	//  128  260:getfield        #88  <Field zzlg zzyd>
	//  129  263:invokevirtual   #228 <Method void zza.zza(zzlg)>
		obj1 = ((Object) (new ArrayList()));
	//  130  266:new             #250 <Class ArrayList>
	//  131  269:dup             
	//  132  270:invokespecial   #251 <Method void ArrayList()>
	//  133  273:astore_3        
		if(zzdf())
	//* 134  274:aload_0         
	//* 135  275:invokespecial   #294 <Method boolean zzdf()>
	//* 136  278:ifeq            292
			((List) (obj1)).add(((Object) (Integer.valueOf(1))));
	//  137  281:aload_3         
	//  138  282:iconst_1        
	//  139  283:invokestatic    #300 <Method Integer Integer.valueOf(int)>
	//  140  286:invokeinterface #259 <Method boolean List.add(Object)>
	//  141  291:pop             
		if(zzxw != null)
	//* 142  292:aload_0         
	//* 143  293:getfield        #92  <Field zzri zzxw>
	//* 144  296:ifnull          310
			((List) (obj1)).add(((Object) (Integer.valueOf(2))));
	//  145  299:aload_3         
	//  146  300:iconst_2        
	//  147  301:invokestatic    #300 <Method Integer Integer.valueOf(int)>
	//  148  304:invokeinterface #259 <Method boolean List.add(Object)>
	//  149  309:pop             
		((zzq) (obj)).zze(((List) (obj1)));
	//  150  310:aload_2         
	//  151  311:aload_3         
	//  152  312:invokevirtual   #302 <Method void zzq.zze(List)>
		if(zzdf())
	//* 153  315:aload_0         
	//* 154  316:invokespecial   #294 <Method boolean zzdf()>
	//* 155  319:ifeq            333
			zzjj1.extras.putBoolean("ina", true);
	//  156  322:aload_1         
	//  157  323:getfield        #308 <Field Bundle zzjj.extras>
	//  158  326:ldc2            #310 <String "ina">
	//  159  329:iconst_1        
	//  160  330:invokevirtual   #316 <Method void Bundle.putBoolean(String, boolean)>
		if(zzxw != null)
	//* 161  333:aload_0         
	//* 162  334:getfield        #92  <Field zzri zzxw>
	//* 163  337:ifnull          351
			zzjj1.extras.putBoolean("iba", true);
	//  164  340:aload_1         
	//  165  341:getfield        #308 <Field Bundle zzjj.extras>
	//  166  344:ldc2            #318 <String "iba">
	//  167  347:iconst_1        
	//  168  348:invokevirtual   #316 <Method void Bundle.putBoolean(String, boolean)>
		((zza) (obj)).zzb(zzjj1);
	//  169  351:aload_2         
	//  170  352:aload_1         
	//  171  353:invokevirtual   #234 <Method boolean zza.zzb(zzjj)>
	//  172  356:pop             
	//  173  357:return          
	}

	private final void zzi(int i)
	{
		zzkh zzkh1 = zzxs;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field zzkh zzxs>
	//    2    4:astore_2        
		if(zzkh1 != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          25
			try
			{
				zzkh1.onAdFailedToLoad(0);
	//    5    9:aload_2         
	//    6   10:iconst_0        
	//    7   11:invokeinterface #325 <Method void zzkh.onAdFailedToLoad(int)>
				return;
	//    8   16:return          
			}
			catch(RemoteException remoteexception)
	//*   9   17:astore_2        
			{
				zzakb.zzc("Failed calling onAdFailedToLoad.", ((Throwable) (remoteexception)));
	//   10   18:ldc2            #327 <String "Failed calling onAdFailedToLoad.">
	//   11   21:aload_2         
	//   12   22:invokestatic    #333 <Method void zzakb.zzc(String, Throwable)>
			}
	//   13   25:return          
	}

	public final String getMediationAdapterClassName()
	{
		Object obj = mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field Object mLock>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		Object obj1 = ((Object) (zzyg));
	//    5    7:aload_0         
	//    6    8:getfield        #175 <Field WeakReference zzyg>
	//    7   11:astore_3        
		String s;
		s = null;
	//    8   12:aconst_null     
	//    9   13:astore_1        
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_42;
	//   10   14:aload_3         
	//   11   15:ifnull          42
		obj1 = ((Object) ((zzd)zzyg.get()));
	//   12   18:aload_0         
	//   13   19:getfield        #175 <Field WeakReference zzyg>
	//   14   22:invokevirtual   #339 <Method Object WeakReference.get()>
	//   15   25:checkcast       #341 <Class zzd>
	//   16   28:astore_3        
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_38;
	//   17   29:aload_3         
	//   18   30:ifnull          38
		s = ((zzd) (obj1)).getMediationAdapterClassName();
	//   19   33:aload_3         
	//   20   34:invokevirtual   #343 <Method String zzd.getMediationAdapterClassName()>
	//   21   37:astore_1        
		obj;
	//   22   38:aload_2         
		JVM INSTR monitorexit ;
	//   23   39:monitorexit     
		return s;
	//   24   40:aload_1         
	//   25   41:areturn         
		obj;
	//   26   42:aload_2         
		JVM INSTR monitorexit ;
	//   27   43:monitorexit     
		return null;
	//   28   44:aconst_null     
	//   29   45:areturn         
		Exception exception;
		exception;
	//   30   46:astore_1        
		obj;
	//   31   47:aload_2         
		JVM INSTR monitorexit ;
	//   32   48:monitorexit     
		throw exception;
	//   33   49:aload_1         
	//   34   50:athrow          
	}

	public final boolean isLoading()
	{
		Object obj = mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field Object mLock>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		Object obj1 = ((Object) (zzyg));
	//    5    7:aload_0         
	//    6    8:getfield        #175 <Field WeakReference zzyg>
	//    7   11:astore_3        
		boolean flag;
		flag = false;
	//    8   12:iconst_0        
	//    9   13:istore_1        
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_42;
	//   10   14:aload_3         
	//   11   15:ifnull          42
		obj1 = ((Object) ((zzd)zzyg.get()));
	//   12   18:aload_0         
	//   13   19:getfield        #175 <Field WeakReference zzyg>
	//   14   22:invokevirtual   #339 <Method Object WeakReference.get()>
	//   15   25:checkcast       #341 <Class zzd>
	//   16   28:astore_3        
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_38;
	//   17   29:aload_3         
	//   18   30:ifnull          38
		flag = ((zza) (obj1)).isLoading();
	//   19   33:aload_3         
	//   20   34:invokevirtual   #347 <Method boolean zza.isLoading()>
	//   21   37:istore_1        
		obj;
	//   22   38:aload_2         
		JVM INSTR monitorexit ;
	//   23   39:monitorexit     
		return flag;
	//   24   40:iload_1         
	//   25   41:ireturn         
		obj;
	//   26   42:aload_2         
		JVM INSTR monitorexit ;
	//   27   43:monitorexit     
		return false;
	//   28   44:iconst_0        
	//   29   45:ireturn         
		Exception exception;
		exception;
	//   30   46:astore_3        
		obj;
	//   31   47:aload_2         
		JVM INSTR monitorexit ;
	//   32   48:monitorexit     
		throw exception;
	//   33   49:aload_3         
	//   34   50:athrow          
	}

	public final void zza(zzjj zzjj1, int i)
	{
		if(i > 0)
	//*   0    0:iload_2         
	//*   1    1:ifle            18
		{
			runOnUiThread(((Runnable) (new zzaj(this, zzjj1, i))));
	//    2    4:new             #349 <Class zzaj>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:iload_2         
	//    7   11:invokespecial   #351 <Method void zzaj(zzah, zzjj, int)>
	//    8   14:invokestatic    #353 <Method void runOnUiThread(Runnable)>
			return;
	//    9   17:return          
		} else
		{
			throw new IllegalArgumentException("Number of ads has to be more than 0");
	//   10   18:new             #355 <Class IllegalArgumentException>
	//   11   21:dup             
	//   12   22:ldc2            #357 <String "Number of ads has to be more than 0">
	//   13   25:invokespecial   #359 <Method void IllegalArgumentException(String)>
	//   14   28:athrow          
		}
	}

	public final String zzck()
	{
		Object obj = mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field Object mLock>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		Object obj1 = ((Object) (zzyg));
	//    5    7:aload_0         
	//    6    8:getfield        #175 <Field WeakReference zzyg>
	//    7   11:astore_3        
		String s;
		s = null;
	//    8   12:aconst_null     
	//    9   13:astore_1        
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_42;
	//   10   14:aload_3         
	//   11   15:ifnull          42
		obj1 = ((Object) ((zzd)zzyg.get()));
	//   12   18:aload_0         
	//   13   19:getfield        #175 <Field WeakReference zzyg>
	//   14   22:invokevirtual   #339 <Method Object WeakReference.get()>
	//   15   25:checkcast       #341 <Class zzd>
	//   16   28:astore_3        
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_38;
	//   17   29:aload_3         
	//   18   30:ifnull          38
		s = ((zzd) (obj1)).zzck();
	//   19   33:aload_3         
	//   20   34:invokevirtual   #362 <Method String zzd.zzck()>
	//   21   37:astore_1        
		obj;
	//   22   38:aload_2         
		JVM INSTR monitorexit ;
	//   23   39:monitorexit     
		return s;
	//   24   40:aload_1         
	//   25   41:areturn         
		obj;
	//   26   42:aload_2         
		JVM INSTR monitorexit ;
	//   27   43:monitorexit     
		return null;
	//   28   44:aconst_null     
	//   29   45:areturn         
		Exception exception;
		exception;
	//   30   46:astore_1        
		obj;
	//   31   47:aload_2         
		JVM INSTR monitorexit ;
	//   32   48:monitorexit     
		throw exception;
	//   33   49:aload_1         
	//   34   50:athrow          
	}

	public final void zzd(zzjj zzjj1)
	{
		runOnUiThread(((Runnable) (new zzai(this, zzjj1))));
	//    0    0:new             #364 <Class zzai>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #366 <Method void zzai(zzah, zzjj)>
	//    5    9:invokestatic    #353 <Method void runOnUiThread(Runnable)>
	//    6   12:return          
	}

	private final Context mContext;
	private final Object mLock = new Object();
	private final zzw zzwc;
	private final zzxn zzwh;
	private final zzkh zzxs;
	private final zzqw zzxt;
	private final zzrl zzxu;
	private final zzqz zzxv;
	private final zzri zzxw;
	private final zzjn zzxx;
	private final PublisherAdViewOptions zzxy;
	private final SimpleArrayMap zzxz;
	private final SimpleArrayMap zzya;
	private final zzpl zzyb;
	private final List zzyc = zzdg();
	private final zzlg zzyd;
	private final String zzye;
	private final zzang zzyf;
	private WeakReference zzyg;
}
