// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzpd, zzoz, zzyf, zzxz, 
//			zzyc, zzakb, zzpa, zzci, 
//			zzpb, zzro, zzaqw

public final class zzoy extends zzpd
{

	private zzoy(Context context, zzpa zzpa1, zzci zzci, zzpb zzpb)
	{
		super(context, zzpa1, ((zzacm) (null)), zzci, ((org.json.JSONObject) (null)), zzpb, ((zzang) (null)), ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:aload_3         
	//    5    5:aconst_null     
	//    6    6:aload           4
	//    7    8:aconst_null     
	//    8    9:aconst_null     
	//    9   10:invokespecial   #26  <Method void zzpd(Context, zzpa, zzacm, zzci, org.json.JSONObject, zzpb, zzang, String)>
		zzbiy = false;
	//   10   13:aload_0         
	//   11   14:iconst_0        
	//   12   15:putfield        #28  <Field boolean zzbiy>
		mLock = new Object();
	//   13   18:aload_0         
	//   14   19:new             #30  <Class Object>
	//   15   22:dup             
	//   16   23:invokespecial   #33  <Method void Object()>
	//   17   26:putfield        #35  <Field Object mLock>
		zzbiw = zzpa1;
	//   18   29:aload_0         
	//   19   30:aload_2         
	//   20   31:putfield        #37  <Field zzpa zzbiw>
	//   21   34:return          
	}

	public zzoy(Context context, zzpa zzpa1, zzci zzci, zzxz zzxz1, zzpb zzpb)
	{
		this(context, zzpa1, zzci, zzpb);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           5
	//    5    6:invokespecial   #41  <Method void zzoy(Context, zzpa, zzci, zzpb)>
		zzbit = zzxz1;
	//    6    9:aload_0         
	//    7   10:aload           4
	//    8   12:putfield        #43  <Field zzxz zzbit>
	//    9   15:return          
	}

	public zzoy(Context context, zzpa zzpa1, zzci zzci, zzyc zzyc1, zzpb zzpb)
	{
		this(context, zzpa1, zzci, zzpb);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           5
	//    5    6:invokespecial   #41  <Method void zzoy(Context, zzpa, zzci, zzpb)>
		zzbiu = zzyc1;
	//    6    9:aload_0         
	//    7   10:aload           4
	//    8   12:putfield        #46  <Field zzyc zzbiu>
	//    9   15:return          
	}

	public zzoy(Context context, zzpa zzpa1, zzci zzci, zzyf zzyf1, zzpb zzpb)
	{
		this(context, zzpa1, zzci, zzpb);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           5
	//    5    6:invokespecial   #41  <Method void zzoy(Context, zzpa, zzci, zzpb)>
		zzbiv = zzyf1;
	//    6    9:aload_0         
	//    7   10:aload           4
	//    8   12:putfield        #49  <Field zzyf zzbiv>
	//    9   15:return          
	}

	private static HashMap zzb(Map map)
	{
		HashMap hashmap;
		hashmap = new HashMap();
	//    0    0:new             #53  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #54  <Method void HashMap()>
	//    3    7:astore_1        
		if(map == null)
	//*   4    8:aload_0         
	//*   5    9:ifnonnull       14
			return hashmap;
	//    6   12:aload_1         
	//    7   13:areturn         
		map;
	//    8   14:aload_0         
		JVM INSTR monitorenter ;
	//    9   15:monitorenter    
		Iterator iterator = map.entrySet().iterator();
	//   10   16:aload_0         
	//   11   17:invokeinterface #60  <Method Set Map.entrySet()>
	//   12   22:invokeinterface #66  <Method Iterator Set.iterator()>
	//   13   27:astore_2        
_L1:
		java.util.Map.Entry entry;
		View view;
		do
		{
			if(!iterator.hasNext())
				break MISSING_BLOCK_LABEL_88;
	//   14   28:aload_2         
	//   15   29:invokeinterface #72  <Method boolean Iterator.hasNext()>
	//   16   34:ifeq            88
			entry = (java.util.Map.Entry)iterator.next();
	//   17   37:aload_2         
	//   18   38:invokeinterface #76  <Method Object Iterator.next()>
	//   19   43:checkcast       #78  <Class java.util.Map$Entry>
	//   20   46:astore_3        
			view = (View)((WeakReference)entry.getValue()).get();
	//   21   47:aload_3         
	//   22   48:invokeinterface #81  <Method Object java.util.Map$Entry.getValue()>
	//   23   53:checkcast       #83  <Class WeakReference>
	//   24   56:invokevirtual   #86  <Method Object WeakReference.get()>
	//   25   59:checkcast       #88  <Class View>
	//   26   62:astore          4
		} while(view == null);
	//   27   64:aload           4
	//   28   66:ifnull          28
		hashmap.put(((Object) ((String)entry.getKey())), ((Object) (view)));
	//   29   69:aload_1         
	//   30   70:aload_3         
	//   31   71:invokeinterface #91  <Method Object java.util.Map$Entry.getKey()>
	//   32   76:checkcast       #93  <Class String>
	//   33   79:aload           4
	//   34   81:invokevirtual   #97  <Method Object HashMap.put(Object, Object)>
	//   35   84:pop             
		  goto _L1
	//*  36   85:goto            28
		map;
	//   37   88:aload_0         
		JVM INSTR monitorexit ;
	//   38   89:monitorexit     
		return hashmap;
	//   39   90:aload_1         
	//   40   91:areturn         
		Exception exception;
		exception;
	//   41   92:astore_1        
		map;
	//   42   93:aload_0         
		JVM INSTR monitorexit ;
	//   43   94:monitorexit     
		throw exception;
	//   44   95:aload_1         
	//   45   96:athrow          
	}

	public final void cancelUnconfirmedClick()
	{
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field Object mLock>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			if(zzbix != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #102 <Field zzoz zzbix>
	//*   7   11:ifnull          23
				zzbix.cancelUnconfirmedClick();
	//    8   14:aload_0         
	//    9   15:getfield        #102 <Field zzoz zzbix>
	//   10   18:invokeinterface #106 <Method void zzoz.cancelUnconfirmedClick()>
		}
	//   11   23:aload_1         
	//   12   24:monitorexit     
		return;
	//   13   25:return          
		exception;
	//   14   26:astore_2        
		obj;
	//   15   27:aload_1         
		JVM INSTR monitorexit ;
	//   16   28:monitorexit     
		throw exception;
	//   17   29:aload_2         
	//   18   30:athrow          
	}

	public final void setClickConfirmingView(View view)
	{
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field Object mLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			if(zzbix != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #102 <Field zzoz zzbix>
	//*   7   11:ifnull          24
				zzbix.setClickConfirmingView(view);
	//    8   14:aload_0         
	//    9   15:getfield        #102 <Field zzoz zzbix>
	//   10   18:aload_1         
	//   11   19:invokeinterface #110 <Method void zzoz.setClickConfirmingView(View)>
		}
	//   12   24:aload_2         
	//   13   25:monitorexit     
		return;
	//   14   26:return          
		view;
	//   15   27:astore_1        
		obj;
	//   16   28:aload_2         
		JVM INSTR monitorexit ;
	//   17   29:monitorexit     
		throw view;
	//   18   30:aload_1         
	//   19   31:athrow          
	}

	public final View zza(android.view.View.OnClickListener onclicklistener, boolean flag)
	{
label0:
		{
			synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field Object mLock>
	//*   2    4:astore_3        
	//*   3    5:aload_3         
	//*   4    6:monitorenter    
			{
				if(zzbix == null)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #102 <Field zzoz zzbix>
	//    7   11:ifnull          30
				onclicklistener = ((android.view.View.OnClickListener) (zzbix.zza(onclicklistener, flag)));
	//    8   14:aload_0         
	//    9   15:getfield        #102 <Field zzoz zzbix>
	//   10   18:aload_1         
	//   11   19:iload_2         
	//   12   20:invokeinterface #116 <Method View zzoz.zza(android.view.View$OnClickListener, boolean)>
	//   13   25:astore_1        
			}
	//   14   26:aload_3         
	//   15   27:monitorexit     
			return ((View) (onclicklistener));
	//   16   28:aload_1         
	//   17   29:areturn         
		}
		if(zzbiv == null) goto _L2; else goto _L1
	//   18   30:aload_0         
	//   19   31:getfield        #49  <Field zzyf zzbiv>
	//   20   34:ifnull          50
_L1:
		onclicklistener = ((android.view.View.OnClickListener) (zzbiv.zzmv()));
	//   21   37:aload_0         
	//   22   38:getfield        #49  <Field zzyf zzbiv>
	//   23   41:invokeinterface #122 <Method com.google.android.gms.dynamic.IObjectWrapper zzyf.zzmv()>
	//   24   46:astore_1        
		  goto _L3
	//*  25   47:goto            100
_L2:
		if(zzbit == null) goto _L5; else goto _L4
	//   26   50:aload_0         
	//   27   51:getfield        #43  <Field zzxz zzbit>
	//   28   54:ifnull          70
_L4:
		onclicklistener = ((android.view.View.OnClickListener) (zzbit.zzmv()));
	//   29   57:aload_0         
	//   30   58:getfield        #43  <Field zzxz zzbit>
	//   31   61:invokeinterface #125 <Method com.google.android.gms.dynamic.IObjectWrapper zzxz.zzmv()>
	//   32   66:astore_1        
		  goto _L3
	//*  33   67:goto            100
_L5:
		if(zzbiu == null) goto _L7; else goto _L6
	//   34   70:aload_0         
	//   35   71:getfield        #46  <Field zzyc zzbiu>
	//   36   74:ifnull          125
_L6:
		onclicklistener = ((android.view.View.OnClickListener) (zzbiu.zzmv()));
	//   37   77:aload_0         
	//   38   78:getfield        #46  <Field zzyc zzbiu>
	//   39   81:invokeinterface #128 <Method com.google.android.gms.dynamic.IObjectWrapper zzyc.zzmv()>
	//   40   86:astore_1        
		  goto _L3
	//*  41   87:goto            100
		onclicklistener;
	//   42   90:astore_1        
		zzakb.zzc("Failed to call getAdChoicesContent", ((Throwable) (onclicklistener)));
	//   43   91:ldc1            #130 <String "Failed to call getAdChoicesContent">
	//   44   93:aload_1         
	//   45   94:invokestatic    #136 <Method void zzakb.zzc(String, Throwable)>
		  goto _L7
	//*  46   97:goto            125
_L3:
		if(onclicklistener == null)
			break MISSING_BLOCK_LABEL_116;
	//   47  100:aload_1         
	//   48  101:ifnull          116
		onclicklistener = ((android.view.View.OnClickListener) ((View)ObjectWrapper.unwrap(((com.google.android.gms.dynamic.IObjectWrapper) (onclicklistener)))));
	//   49  104:aload_1         
	//   50  105:invokestatic    #142 <Method Object ObjectWrapper.unwrap(com.google.android.gms.dynamic.IObjectWrapper)>
	//   51  108:checkcast       #88  <Class View>
	//   52  111:astore_1        
		obj;
	//   53  112:aload_3         
		JVM INSTR monitorexit ;
	//   54  113:monitorexit     
		return ((View) (onclicklistener));
	//   55  114:aload_1         
	//   56  115:areturn         
		obj;
	//   57  116:aload_3         
		JVM INSTR monitorexit ;
	//   58  117:monitorexit     
		return null;
	//   59  118:aconst_null     
	//   60  119:areturn         
		onclicklistener;
	//   61  120:astore_1        
		obj;
	//   62  121:aload_3         
		JVM INSTR monitorexit ;
	//   63  122:monitorexit     
		throw onclicklistener;
	//   64  123:aload_1         
	//   65  124:athrow          
_L7:
		onclicklistener = null;
	//   66  125:aconst_null     
	//   67  126:astore_1        
		if(true) goto _L3; else goto _L8
	//   68  127:goto            100
_L8:
	}

	public final void zza(View view, Map map)
	{
		Preconditions.checkMainThread("recordImpression must be called on the main UI thread.");
	//    0    0:ldc1            #146 <String "recordImpression must be called on the main UI thread.">
	//    1    2:invokestatic    #152 <Method void Preconditions.checkMainThread(String)>
		Object obj = mLock;
	//    2    5:aload_0         
	//    3    6:getfield        #35  <Field Object mLock>
	//    4    9:astore_3        
		obj;
	//    5   10:aload_3         
		JVM INSTR monitorenter ;
	//    6   11:monitorenter    
		super.zzbjd = true;
	//    7   12:aload_0         
	//    8   13:iconst_1        
	//    9   14:putfield        #155 <Field boolean zzpd.zzbjd>
		if(zzbix != null)
	//*  10   17:aload_0         
	//*  11   18:getfield        #102 <Field zzoz zzbix>
	//*  12   21:ifnull          47
		{
			zzbix.zza(view, map);
	//   13   24:aload_0         
	//   14   25:getfield        #102 <Field zzoz zzbix>
	//   15   28:aload_1         
	//   16   29:aload_2         
	//   17   30:invokeinterface #157 <Method void zzoz.zza(View, Map)>
			zzbiw.recordImpression();
	//   18   35:aload_0         
	//   19   36:getfield        #37  <Field zzpa zzbiw>
	//   20   39:invokeinterface #162 <Method void zzpa.recordImpression()>
			break MISSING_BLOCK_LABEL_168;
	//   21   44:goto            168
		}
		if(zzbiv == null || zzbiv.getOverrideImpressionRecording()) goto _L2; else goto _L1
	//   22   47:aload_0         
	//   23   48:getfield        #49  <Field zzyf zzbiv>
	//   24   51:ifnull          89
	//   25   54:aload_0         
	//   26   55:getfield        #49  <Field zzyf zzbiv>
	//   27   58:invokeinterface #165 <Method boolean zzyf.getOverrideImpressionRecording()>
	//   28   63:ifne            89
_L1:
		zzbiv.recordImpression();
	//   29   66:aload_0         
	//   30   67:getfield        #49  <Field zzyf zzbiv>
	//   31   70:invokeinterface #166 <Method void zzyf.recordImpression()>
		view = ((View) (zzbiw));
	//   32   75:aload_0         
	//   33   76:getfield        #37  <Field zzpa zzbiw>
	//   34   79:astore_1        
_L3:
		((zzpa) (view)).recordImpression();
	//   35   80:aload_1         
	//   36   81:invokeinterface #162 <Method void zzpa.recordImpression()>
		break MISSING_BLOCK_LABEL_168;
	//   37   86:goto            168
_L2:
label0:
		{
			if(zzbit == null || zzbit.getOverrideImpressionRecording())
				break label0;
	//   38   89:aload_0         
	//   39   90:getfield        #43  <Field zzxz zzbit>
	//   40   93:ifnull          125
	//   41   96:aload_0         
	//   42   97:getfield        #43  <Field zzxz zzbit>
	//   43  100:invokeinterface #167 <Method boolean zzxz.getOverrideImpressionRecording()>
	//   44  105:ifne            125
			zzbit.recordImpression();
	//   45  108:aload_0         
	//   46  109:getfield        #43  <Field zzxz zzbit>
	//   47  112:invokeinterface #168 <Method void zzxz.recordImpression()>
			view = ((View) (zzbiw));
	//   48  117:aload_0         
	//   49  118:getfield        #37  <Field zzpa zzbiw>
	//   50  121:astore_1        
		}
		  goto _L3
	//*  51  122:goto            80
		if(zzbiu == null || zzbiu.getOverrideImpressionRecording())
			break MISSING_BLOCK_LABEL_168;
	//   52  125:aload_0         
	//   53  126:getfield        #46  <Field zzyc zzbiu>
	//   54  129:ifnull          168
	//   55  132:aload_0         
	//   56  133:getfield        #46  <Field zzyc zzbiu>
	//   57  136:invokeinterface #169 <Method boolean zzyc.getOverrideImpressionRecording()>
	//   58  141:ifne            168
		zzbiu.recordImpression();
	//   59  144:aload_0         
	//   60  145:getfield        #46  <Field zzyc zzbiu>
	//   61  148:invokeinterface #170 <Method void zzyc.recordImpression()>
		view = ((View) (zzbiw));
	//   62  153:aload_0         
	//   63  154:getfield        #37  <Field zzpa zzbiw>
	//   64  157:astore_1        
		  goto _L3
	//*  65  158:goto            80
		view;
	//   66  161:astore_1        
		zzakb.zzc("Failed to call recordImpression", ((Throwable) (view)));
	//   67  162:ldc1            #172 <String "Failed to call recordImpression">
	//   68  164:aload_1         
	//   69  165:invokestatic    #136 <Method void zzakb.zzc(String, Throwable)>
		obj;
	//   70  168:aload_3         
		JVM INSTR monitorexit ;
	//   71  169:monitorexit     
		return;
	//   72  170:return          
		view;
	//   73  171:astore_1        
		obj;
	//   74  172:aload_3         
		JVM INSTR monitorexit ;
	//   75  173:monitorexit     
		throw view;
	//   76  174:aload_1         
	//   77  175:athrow          
	}

	public final void zza(View view, Map map, Bundle bundle, View view1)
	{
		Preconditions.checkMainThread("performClick must be called on the main UI thread.");
	//    0    0:ldc1            #176 <String "performClick must be called on the main UI thread.">
	//    1    2:invokestatic    #152 <Method void Preconditions.checkMainThread(String)>
		Object obj = mLock;
	//    2    5:aload_0         
	//    3    6:getfield        #35  <Field Object mLock>
	//    4    9:astore          5
		obj;
	//    5   11:aload           5
		JVM INSTR monitorenter ;
	//    6   13:monitorenter    
		if(zzbix != null)
	//*   7   14:aload_0         
	//*   8   15:getfield        #102 <Field zzoz zzbix>
	//*   9   18:ifnull          47
		{
			zzbix.zza(view, map, bundle, view1);
	//   10   21:aload_0         
	//   11   22:getfield        #102 <Field zzoz zzbix>
	//   12   25:aload_1         
	//   13   26:aload_2         
	//   14   27:aload_3         
	//   15   28:aload           4
	//   16   30:invokeinterface #178 <Method void zzoz.zza(View, Map, Bundle, View)>
			zzbiw.onAdClicked();
	//   17   35:aload_0         
	//   18   36:getfield        #37  <Field zzpa zzbiw>
	//   19   39:invokeinterface #181 <Method void zzpa.onAdClicked()>
			break MISSING_BLOCK_LABEL_180;
	//   20   44:goto            180
		}
		if(zzbiv == null || zzbiv.getOverrideClickHandling()) goto _L2; else goto _L1
	//   21   47:aload_0         
	//   22   48:getfield        #49  <Field zzyf zzbiv>
	//   23   51:ifnull          93
	//   24   54:aload_0         
	//   25   55:getfield        #49  <Field zzyf zzbiv>
	//   26   58:invokeinterface #184 <Method boolean zzyf.getOverrideClickHandling()>
	//   27   63:ifne            93
_L1:
		zzbiv.zzj(ObjectWrapper.wrap(((Object) (view))));
	//   28   66:aload_0         
	//   29   67:getfield        #49  <Field zzyf zzbiv>
	//   30   70:aload_1         
	//   31   71:invokestatic    #188 <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//   32   74:invokeinterface #192 <Method void zzyf.zzj(com.google.android.gms.dynamic.IObjectWrapper)>
		view = ((View) (zzbiw));
	//   33   79:aload_0         
	//   34   80:getfield        #37  <Field zzpa zzbiw>
	//   35   83:astore_1        
_L3:
		((zzpa) (view)).onAdClicked();
	//   36   84:aload_1         
	//   37   85:invokeinterface #181 <Method void zzpa.onAdClicked()>
		break MISSING_BLOCK_LABEL_180;
	//   38   90:goto            180
_L2:
label0:
		{
			if(zzbit == null || zzbit.getOverrideClickHandling())
				break label0;
	//   39   93:aload_0         
	//   40   94:getfield        #43  <Field zzxz zzbit>
	//   41   97:ifnull          133
	//   42  100:aload_0         
	//   43  101:getfield        #43  <Field zzxz zzbit>
	//   44  104:invokeinterface #193 <Method boolean zzxz.getOverrideClickHandling()>
	//   45  109:ifne            133
			zzbit.zzj(ObjectWrapper.wrap(((Object) (view))));
	//   46  112:aload_0         
	//   47  113:getfield        #43  <Field zzxz zzbit>
	//   48  116:aload_1         
	//   49  117:invokestatic    #188 <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//   50  120:invokeinterface #194 <Method void zzxz.zzj(com.google.android.gms.dynamic.IObjectWrapper)>
			view = ((View) (zzbiw));
	//   51  125:aload_0         
	//   52  126:getfield        #37  <Field zzpa zzbiw>
	//   53  129:astore_1        
		}
		  goto _L3
	//*  54  130:goto            84
		if(zzbiu == null || zzbiu.getOverrideClickHandling())
			break MISSING_BLOCK_LABEL_180;
	//   55  133:aload_0         
	//   56  134:getfield        #46  <Field zzyc zzbiu>
	//   57  137:ifnull          180
	//   58  140:aload_0         
	//   59  141:getfield        #46  <Field zzyc zzbiu>
	//   60  144:invokeinterface #195 <Method boolean zzyc.getOverrideClickHandling()>
	//   61  149:ifne            180
		zzbiu.zzj(ObjectWrapper.wrap(((Object) (view))));
	//   62  152:aload_0         
	//   63  153:getfield        #46  <Field zzyc zzbiu>
	//   64  156:aload_1         
	//   65  157:invokestatic    #188 <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//   66  160:invokeinterface #196 <Method void zzyc.zzj(com.google.android.gms.dynamic.IObjectWrapper)>
		view = ((View) (zzbiw));
	//   67  165:aload_0         
	//   68  166:getfield        #37  <Field zzpa zzbiw>
	//   69  169:astore_1        
		  goto _L3
	//*  70  170:goto            84
		view;
	//   71  173:astore_1        
		zzakb.zzc("Failed to call performClick", ((Throwable) (view)));
	//   72  174:ldc1            #198 <String "Failed to call performClick">
	//   73  176:aload_1         
	//   74  177:invokestatic    #136 <Method void zzakb.zzc(String, Throwable)>
		obj;
	//   75  180:aload           5
		JVM INSTR monitorexit ;
	//   76  182:monitorexit     
		return;
	//   77  183:return          
		view;
	//   78  184:astore_1        
		obj;
	//   79  185:aload           5
		JVM INSTR monitorexit ;
	//   80  187:monitorexit     
		throw view;
	//   81  188:aload_1         
	//   82  189:athrow          
	}

	public final void zza(View view, Map map, Map map1, android.view.View.OnTouchListener ontouchlistener, android.view.View.OnClickListener onclicklistener)
	{
		ontouchlistener = ((android.view.View.OnTouchListener) (mLock));
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field Object mLock>
	//    2    4:astore          4
		ontouchlistener;
	//    3    6:aload           4
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		zzbiy = true;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #28  <Field boolean zzbiy>
		map = ((Map) (zzb(map)));
	//    8   14:aload_2         
	//    9   15:invokestatic    #202 <Method HashMap zzb(Map)>
	//   10   18:astore_2        
		map1 = ((Map) (zzb(map1)));
	//   11   19:aload_3         
	//   12   20:invokestatic    #202 <Method HashMap zzb(Map)>
	//   13   23:astore_3        
		if(zzbiv != null)
	//*  14   24:aload_0         
	//*  15   25:getfield        #49  <Field zzyf zzbiv>
	//*  16   28:ifnull          55
		{
			zzbiv.zzb(ObjectWrapper.wrap(((Object) (view))), ObjectWrapper.wrap(((Object) (map))), ObjectWrapper.wrap(((Object) (map1))));
	//   17   31:aload_0         
	//   18   32:getfield        #49  <Field zzyf zzbiv>
	//   19   35:aload_1         
	//   20   36:invokestatic    #188 <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//   21   39:aload_2         
	//   22   40:invokestatic    #188 <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//   23   43:aload_3         
	//   24   44:invokestatic    #188 <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//   25   47:invokeinterface #205 <Method void zzyf.zzb(com.google.android.gms.dynamic.IObjectWrapper, com.google.android.gms.dynamic.IObjectWrapper, com.google.android.gms.dynamic.IObjectWrapper)>
			break MISSING_BLOCK_LABEL_150;
	//   26   52:goto            150
		}
		if(zzbit != null)
	//*  27   55:aload_0         
	//*  28   56:getfield        #43  <Field zzxz zzbit>
	//*  29   59:ifnull          99
		{
			zzbit.zzb(ObjectWrapper.wrap(((Object) (view))), ObjectWrapper.wrap(((Object) (map))), ObjectWrapper.wrap(((Object) (map1))));
	//   30   62:aload_0         
	//   31   63:getfield        #43  <Field zzxz zzbit>
	//   32   66:aload_1         
	//   33   67:invokestatic    #188 <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//   34   70:aload_2         
	//   35   71:invokestatic    #188 <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//   36   74:aload_3         
	//   37   75:invokestatic    #188 <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//   38   78:invokeinterface #206 <Method void zzxz.zzb(com.google.android.gms.dynamic.IObjectWrapper, com.google.android.gms.dynamic.IObjectWrapper, com.google.android.gms.dynamic.IObjectWrapper)>
			zzbit.zzk(ObjectWrapper.wrap(((Object) (view))));
	//   39   83:aload_0         
	//   40   84:getfield        #43  <Field zzxz zzbit>
	//   41   87:aload_1         
	//   42   88:invokestatic    #188 <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//   43   91:invokeinterface #209 <Method void zzxz.zzk(com.google.android.gms.dynamic.IObjectWrapper)>
			break MISSING_BLOCK_LABEL_150;
	//   44   96:goto            150
		}
		try
		{
			if(zzbiu != null)
	//*  45   99:aload_0         
	//*  46  100:getfield        #46  <Field zzyc zzbiu>
	//*  47  103:ifnull          150
			{
				zzbiu.zzb(ObjectWrapper.wrap(((Object) (view))), ObjectWrapper.wrap(((Object) (map))), ObjectWrapper.wrap(((Object) (map1))));
	//   48  106:aload_0         
	//   49  107:getfield        #46  <Field zzyc zzbiu>
	//   50  110:aload_1         
	//   51  111:invokestatic    #188 <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//   52  114:aload_2         
	//   53  115:invokestatic    #188 <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//   54  118:aload_3         
	//   55  119:invokestatic    #188 <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//   56  122:invokeinterface #210 <Method void zzyc.zzb(com.google.android.gms.dynamic.IObjectWrapper, com.google.android.gms.dynamic.IObjectWrapper, com.google.android.gms.dynamic.IObjectWrapper)>
				zzbiu.zzk(ObjectWrapper.wrap(((Object) (view))));
	//   57  127:aload_0         
	//   58  128:getfield        #46  <Field zzyc zzbiu>
	//   59  131:aload_1         
	//   60  132:invokestatic    #188 <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//   61  135:invokeinterface #211 <Method void zzyc.zzk(com.google.android.gms.dynamic.IObjectWrapper)>
			}
			break MISSING_BLOCK_LABEL_150;
	//   62  140:goto            150
		}
		// Misplaced declaration of an exception variable
		catch(View view) { }
	//   63  143:astore_1        
		zzakb.zzc("Failed to call prepareAd", ((Throwable) (view)));
	//   64  144:ldc1            #213 <String "Failed to call prepareAd">
	//   65  146:aload_1         
	//   66  147:invokestatic    #136 <Method void zzakb.zzc(String, Throwable)>
		zzbiy = false;
	//   67  150:aload_0         
	//   68  151:iconst_0        
	//   69  152:putfield        #28  <Field boolean zzbiy>
		ontouchlistener;
	//   70  155:aload           4
		JVM INSTR monitorexit ;
	//   71  157:monitorexit     
		return;
	//   72  158:return          
		view;
	//   73  159:astore_1        
		ontouchlistener;
	//   74  160:aload           4
		JVM INSTR monitorexit ;
	//   75  162:monitorexit     
		throw view;
	//   76  163:aload_1         
	//   77  164:athrow          
	}

	public final void zza(zzro zzro)
	{
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field Object mLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			if(zzbix != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #102 <Field zzoz zzbix>
	//*   7   11:ifnull          24
				zzbix.zza(zzro);
	//    8   14:aload_0         
	//    9   15:getfield        #102 <Field zzoz zzbix>
	//   10   18:aload_1         
	//   11   19:invokeinterface #218 <Method void zzoz.zza(zzro)>
		}
	//   12   24:aload_2         
	//   13   25:monitorexit     
		return;
	//   14   26:return          
		zzro;
	//   15   27:astore_1        
		obj;
	//   16   28:aload_2         
		JVM INSTR monitorexit ;
	//   17   29:monitorexit     
		throw zzro;
	//   18   30:aload_1         
	//   19   31:athrow          
	}

	public final void zzb(View view, Map map)
	{
		map = ((Map) (mLock));
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field Object mLock>
	//    2    4:astore_2        
		map;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		if(zzbiv != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #49  <Field zzyf zzbiv>
	//*   7   11:ifnull          30
		{
			zzbiv.zzl(ObjectWrapper.wrap(((Object) (view))));
	//    8   14:aload_0         
	//    9   15:getfield        #49  <Field zzyf zzbiv>
	//   10   18:aload_1         
	//   11   19:invokestatic    #188 <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//   12   22:invokeinterface #221 <Method void zzyf.zzl(com.google.android.gms.dynamic.IObjectWrapper)>
			break MISSING_BLOCK_LABEL_87;
	//   13   27:goto            87
		}
		if(zzbit != null)
	//*  14   30:aload_0         
	//*  15   31:getfield        #43  <Field zzxz zzbit>
	//*  16   34:ifnull          53
		{
			zzbit.zzl(ObjectWrapper.wrap(((Object) (view))));
	//   17   37:aload_0         
	//   18   38:getfield        #43  <Field zzxz zzbit>
	//   19   41:aload_1         
	//   20   42:invokestatic    #188 <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//   21   45:invokeinterface #222 <Method void zzxz.zzl(com.google.android.gms.dynamic.IObjectWrapper)>
			break MISSING_BLOCK_LABEL_87;
	//   22   50:goto            87
		}
		try
		{
			if(zzbiu != null)
	//*  23   53:aload_0         
	//*  24   54:getfield        #46  <Field zzyc zzbiu>
	//*  25   57:ifnull          87
				zzbiu.zzl(ObjectWrapper.wrap(((Object) (view))));
	//   26   60:aload_0         
	//   27   61:getfield        #46  <Field zzyc zzbiu>
	//   28   64:aload_1         
	//   29   65:invokestatic    #188 <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//   30   68:invokeinterface #223 <Method void zzyc.zzl(com.google.android.gms.dynamic.IObjectWrapper)>
			break MISSING_BLOCK_LABEL_87;
	//   31   73:goto            87
		}
	//*  32   76:astore_1        
	//*  33   77:goto            90
		// Misplaced declaration of an exception variable
		catch(View view) { }
	//   34   80:astore_1        
		break MISSING_BLOCK_LABEL_81;
		view;
		break MISSING_BLOCK_LABEL_90;
		zzakb.zzc("Failed to call untrackView", ((Throwable) (view)));
	//   35   81:ldc1            #225 <String "Failed to call untrackView">
	//   36   83:aload_1         
	//   37   84:invokestatic    #136 <Method void zzakb.zzc(String, Throwable)>
		map;
	//   38   87:aload_2         
		JVM INSTR monitorexit ;
	//   39   88:monitorexit     
		return;
	//   40   89:return          
		map;
	//   41   90:aload_2         
		JVM INSTR monitorexit ;
	//   42   91:monitorexit     
		throw view;
	//   43   92:aload_1         
	//   44   93:athrow          
	}

	public final void zzc(zzoz zzoz1)
	{
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field Object mLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			zzbix = zzoz1;
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:putfield        #102 <Field zzoz zzbix>
		}
	//    8   12:aload_2         
	//    9   13:monitorexit     
		return;
	//   10   14:return          
		zzoz1;
	//   11   15:astore_1        
		obj;
	//   12   16:aload_2         
		JVM INSTR monitorexit ;
	//   13   17:monitorexit     
		throw zzoz1;
	//   14   18:aload_1         
	//   15   19:athrow          
	}

	public final void zzcr()
	{
		if(zzbix != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #102 <Field zzoz zzbix>
	//*   2    4:ifnull          16
			zzbix.zzcr();
	//    3    7:aload_0         
	//    4    8:getfield        #102 <Field zzoz zzbix>
	//    5   11:invokeinterface #229 <Method void zzoz.zzcr()>
	//    6   16:return          
	}

	public final void zzcs()
	{
		if(zzbix != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #102 <Field zzoz zzbix>
	//*   2    4:ifnull          16
			zzbix.zzcs();
	//    3    7:aload_0         
	//    4    8:getfield        #102 <Field zzoz zzbix>
	//    5   11:invokeinterface #232 <Method void zzoz.zzcs()>
	//    6   16:return          
	}

	public final boolean zzkj()
	{
label0:
		{
			boolean flag;
			synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field Object mLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
			{
				if(zzbix == null)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #102 <Field zzoz zzbix>
	//    7   11:ifnull          28
				flag = zzbix.zzkj();
	//    8   14:aload_0         
	//    9   15:getfield        #102 <Field zzoz zzbix>
	//   10   18:invokeinterface #235 <Method boolean zzoz.zzkj()>
	//   11   23:istore_1        
			}
	//   12   24:aload_2         
	//   13   25:monitorexit     
			return flag;
	//   14   26:iload_1         
	//   15   27:ireturn         
		}
		boolean flag1 = zzbiw.zzcu();
	//   16   28:aload_0         
	//   17   29:getfield        #37  <Field zzpa zzbiw>
	//   18   32:invokeinterface #238 <Method boolean zzpa.zzcu()>
	//   19   37:istore_1        
		obj;
	//   20   38:aload_2         
		JVM INSTR monitorexit ;
	//   21   39:monitorexit     
		return flag1;
	//   22   40:iload_1         
	//   23   41:ireturn         
		exception;
	//   24   42:astore_3        
		obj;
	//   25   43:aload_2         
		JVM INSTR monitorexit ;
	//   26   44:monitorexit     
		throw exception;
	//   27   45:aload_3         
	//   28   46:athrow          
	}

	public final boolean zzkk()
	{
label0:
		{
			boolean flag;
			synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field Object mLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
			{
				if(zzbix == null)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #102 <Field zzoz zzbix>
	//    7   11:ifnull          28
				flag = zzbix.zzkk();
	//    8   14:aload_0         
	//    9   15:getfield        #102 <Field zzoz zzbix>
	//   10   18:invokeinterface #241 <Method boolean zzoz.zzkk()>
	//   11   23:istore_1        
			}
	//   12   24:aload_2         
	//   13   25:monitorexit     
			return flag;
	//   14   26:iload_1         
	//   15   27:ireturn         
		}
		boolean flag1 = zzbiw.zzcv();
	//   16   28:aload_0         
	//   17   29:getfield        #37  <Field zzpa zzbiw>
	//   18   32:invokeinterface #244 <Method boolean zzpa.zzcv()>
	//   19   37:istore_1        
		obj;
	//   20   38:aload_2         
		JVM INSTR monitorexit ;
	//   21   39:monitorexit     
		return flag1;
	//   22   40:iload_1         
	//   23   41:ireturn         
		exception;
	//   24   42:astore_3        
		obj;
	//   25   43:aload_2         
		JVM INSTR monitorexit ;
	//   26   44:monitorexit     
		throw exception;
	//   27   45:aload_3         
	//   28   46:athrow          
	}

	public final void zzkl()
	{
		Preconditions.checkMainThread("recordDownloadedImpression must be called on main UI thread.");
	//    0    0:ldc1            #247 <String "recordDownloadedImpression must be called on main UI thread.">
	//    1    2:invokestatic    #152 <Method void Preconditions.checkMainThread(String)>
		synchronized(mLock)
	//*   2    5:aload_0         
	//*   3    6:getfield        #35  <Field Object mLock>
	//*   4    9:astore_1        
	//*   5   10:aload_1         
	//*   6   11:monitorenter    
		{
			zzbje = true;
	//    7   12:aload_0         
	//    8   13:iconst_1        
	//    9   14:putfield        #250 <Field boolean zzbje>
			if(zzbix != null)
	//*  10   17:aload_0         
	//*  11   18:getfield        #102 <Field zzoz zzbix>
	//*  12   21:ifnull          33
				zzbix.zzkl();
	//   13   24:aload_0         
	//   14   25:getfield        #102 <Field zzoz zzbix>
	//   15   28:invokeinterface #252 <Method void zzoz.zzkl()>
		}
	//   16   33:aload_1         
	//   17   34:monitorexit     
		return;
	//   18   35:return          
		exception;
	//   19   36:astore_2        
		obj;
	//   20   37:aload_1         
		JVM INSTR monitorexit ;
	//   21   38:monitorexit     
		throw exception;
	//   22   39:aload_2         
	//   23   40:athrow          
	}

	public final boolean zzkm()
	{
		boolean flag;
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field Object mLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			flag = zzbiy;
	//    5    7:aload_0         
	//    6    8:getfield        #28  <Field boolean zzbiy>
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

	public final zzoz zzkn()
	{
		zzoz zzoz1;
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field Object mLock>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			zzoz1 = zzbix;
	//    5    7:aload_0         
	//    6    8:getfield        #102 <Field zzoz zzbix>
	//    7   11:astore_2        
		}
	//    8   12:aload_1         
	//    9   13:monitorexit     
		return zzoz1;
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

	public final zzaqw zzko()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public final void zzkp()
	{
	//    0    0:return          
	}

	public final void zzkq()
	{
	//    0    0:return          
	}

	private Object mLock;
	private zzxz zzbit;
	private zzyc zzbiu;
	private zzyf zzbiv;
	private final zzpa zzbiw;
	private zzoz zzbix;
	private boolean zzbiy;
}
