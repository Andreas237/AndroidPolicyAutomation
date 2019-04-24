// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tagmanager;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.PendingResult;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

// Referenced classes of package com.google.android.gms.tagmanager:
//			zzga, DataLayer, zzg, zzal, 
//			zzgc, zza, zzdi, zzgb, 
//			zzat, zzfn, zzv, zzfm, 
//			zzy, zzeh, zzgd

public class TagManager
{
	public static interface zza
	{

		public abstract zzy zza(Context context, TagManager tagmanager, Looper looper, String s, int i, zzal zzal1);
	}


	private TagManager(Context context, zza zza1, DataLayer datalayer, zzfm zzfm1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
		if(context == null)
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       18
		{
			throw new NullPointerException("context cannot be null");
	//    4    8:new             #30  <Class NullPointerException>
	//    5   11:dup             
	//    6   12:ldc1            #32  <String "context cannot be null">
	//    7   14:invokespecial   #35  <Method void NullPointerException(String)>
	//    8   17:athrow          
		} else
		{
			zzri = context.getApplicationContext();
	//    9   18:aload_0         
	//   10   19:aload_1         
	//   11   20:invokevirtual   #41  <Method Context Context.getApplicationContext()>
	//   12   23:putfield        #43  <Field Context zzri>
			zzbgq = zzfm1;
	//   13   26:aload_0         
	//   14   27:aload           4
	//   15   29:putfield        #45  <Field zzfm zzbgq>
			zzbgp = zza1;
	//   16   32:aload_0         
	//   17   33:aload_2         
	//   18   34:putfield        #47  <Field TagManager$zza zzbgp>
			zzbgr = ((ConcurrentMap) (new ConcurrentHashMap()));
	//   19   37:aload_0         
	//   20   38:new             #49  <Class ConcurrentHashMap>
	//   21   41:dup             
	//   22   42:invokespecial   #50  <Method void ConcurrentHashMap()>
	//   23   45:putfield        #52  <Field ConcurrentMap zzbgr>
			zzazr = datalayer;
	//   24   48:aload_0         
	//   25   49:aload_3         
	//   26   50:putfield        #54  <Field DataLayer zzazr>
			zzazr.zza(((DataLayer.zzb) (new zzga(this))));
	//   27   53:aload_0         
	//   28   54:getfield        #54  <Field DataLayer zzazr>
	//   29   57:new             #56  <Class zzga>
	//   30   60:dup             
	//   31   61:aload_0         
	//   32   62:invokespecial   #59  <Method void zzga(TagManager)>
	//   33   65:invokevirtual   #64  <Method void DataLayer.zza(DataLayer$zzb)>
			zzazr.zza(((DataLayer.zzb) (new zzg(zzri))));
	//   34   68:aload_0         
	//   35   69:getfield        #54  <Field DataLayer zzazr>
	//   36   72:new             #66  <Class zzg>
	//   37   75:dup             
	//   38   76:aload_0         
	//   39   77:getfield        #43  <Field Context zzri>
	//   40   80:invokespecial   #69  <Method void zzg(Context)>
	//   41   83:invokevirtual   #64  <Method void DataLayer.zza(DataLayer$zzb)>
			zzbet = new zzal();
	//   42   86:aload_0         
	//   43   87:new             #71  <Class zzal>
	//   44   90:dup             
	//   45   91:invokespecial   #72  <Method void zzal()>
	//   46   94:putfield        #74  <Field zzal zzbet>
			zzri.registerComponentCallbacks(((android.content.ComponentCallbacks) (new zzgc(this))));
	//   47   97:aload_0         
	//   48   98:getfield        #43  <Field Context zzri>
	//   49  101:new             #76  <Class zzgc>
	//   50  104:dup             
	//   51  105:aload_0         
	//   52  106:invokespecial   #77  <Method void zzgc(TagManager)>
	//   53  109:invokevirtual   #81  <Method void Context.registerComponentCallbacks(android.content.ComponentCallbacks)>
			com.google.android.gms.tagmanager.zza.zzo(zzri);
	//   54  112:aload_0         
	//   55  113:getfield        #43  <Field Context zzri>
	//   56  116:invokestatic    #87  <Method zza zza.zzo(Context)>
	//   57  119:pop             
			return;
	//   58  120:return          
		}
	}

	public static TagManager getInstance(Context context)
	{
		com/google/android/gms/tagmanager/TagManager;
	//    0    0:ldc1            #2   <Class TagManager>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		if(zzbgs != null)
			break MISSING_BLOCK_LABEL_62;
	//    2    3:getstatic       #93  <Field TagManager zzbgs>
	//    3    6:ifnonnull       62
		if(context != null)
			break MISSING_BLOCK_LABEL_26;
	//    4    9:aload_0         
	//    5   10:ifnonnull       26
		zzdi.e("TagManager.getInstance requires non-null context.");
	//    6   13:ldc1            #95  <String "TagManager.getInstance requires non-null context.">
	//    7   15:invokestatic    #100 <Method void zzdi.e(String)>
		throw new NullPointerException();
	//    8   18:new             #30  <Class NullPointerException>
	//    9   21:dup             
	//   10   22:invokespecial   #101 <Method void NullPointerException()>
	//   11   25:athrow          
		zzbgs = new TagManager(context, ((zza) (new zzgb())), new DataLayer(((DataLayer.zzc) (new zzat(context)))), ((zzfm) (zzfn.zzqe())));
	//   12   26:new             #2   <Class TagManager>
	//   13   29:dup             
	//   14   30:aload_0         
	//   15   31:new             #103 <Class zzgb>
	//   16   34:dup             
	//   17   35:invokespecial   #104 <Method void zzgb()>
	//   18   38:new             #61  <Class DataLayer>
	//   19   41:dup             
	//   20   42:new             #106 <Class zzat>
	//   21   45:dup             
	//   22   46:aload_0         
	//   23   47:invokespecial   #107 <Method void zzat(Context)>
	//   24   50:invokespecial   #110 <Method void DataLayer(DataLayer$zzc)>
	//   25   53:invokestatic    #116 <Method zzfn zzfn.zzqe()>
	//   26   56:invokespecial   #118 <Method void TagManager(Context, TagManager$zza, DataLayer, zzfm)>
	//   27   59:putstatic       #93  <Field TagManager zzbgs>
		context = ((Context) (zzbgs));
	//   28   62:getstatic       #93  <Field TagManager zzbgs>
	//   29   65:astore_0        
		com/google/android/gms/tagmanager/TagManager;
	//   30   66:ldc1            #2   <Class TagManager>
		JVM INSTR monitorexit ;
	//   31   68:monitorexit     
		return ((TagManager) (context));
	//   32   69:aload_0         
	//   33   70:areturn         
		context;
	//   34   71:astore_0        
		com/google/android/gms/tagmanager/TagManager;
	//   35   72:ldc1            #2   <Class TagManager>
		JVM INSTR monitorexit ;
	//   36   74:monitorexit     
		throw context;
	//   37   75:aload_0         
	//   38   76:athrow          
	}

	static void zza(TagManager tagmanager, String s)
	{
		tagmanager.zzeb(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #122 <Method void zzeb(String)>
	//    3    5:return          
	}

	private final void zzeb(String s)
	{
		for(Iterator iterator = zzbgr.values().iterator(); iterator.hasNext(); ((zzv)iterator.next()).zzde(s));
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field ConcurrentMap zzbgr>
	//    2    4:invokeinterface #128 <Method Collection ConcurrentMap.values()>
	//    3    9:invokeinterface #134 <Method Iterator Collection.iterator()>
	//    4   14:astore_2        
	//    5   15:aload_2         
	//    6   16:invokeinterface #140 <Method boolean Iterator.hasNext()>
	//    7   21:ifeq            40
	//    8   24:aload_2         
	//    9   25:invokeinterface #144 <Method Object Iterator.next()>
	//   10   30:checkcast       #146 <Class zzv>
	//   11   33:aload_1         
	//   12   34:invokevirtual   #149 <Method void zzv.zzde(String)>
	//*  13   37:goto            15
	//   14   40:return          
	}

	public void dispatch()
	{
		zzbgq.dispatch();
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field zzfm zzbgq>
	//    2    4:invokevirtual   #154 <Method void zzfm.dispatch()>
	//    3    7:return          
	}

	public DataLayer getDataLayer()
	{
		return zzazr;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field DataLayer zzazr>
	//    2    4:areturn         
	}

	public PendingResult loadContainerDefaultOnly(String s, int i)
	{
		s = ((String) (zzbgp.zza(zzri, this, ((Looper) (null)), s, i, zzbet)));
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field TagManager$zza zzbgp>
	//    2    4:aload_0         
	//    3    5:getfield        #43  <Field Context zzri>
	//    4    8:aload_0         
	//    5    9:aconst_null     
	//    6   10:aload_1         
	//    7   11:iload_2         
	//    8   12:aload_0         
	//    9   13:getfield        #74  <Field zzal zzbet>
	//   10   16:invokeinterface #161 <Method zzy TagManager$zza.zza(Context, TagManager, Looper, String, int, zzal)>
	//   11   21:astore_1        
		((zzy) (s)).zznt();
	//   12   22:aload_1         
	//   13   23:invokevirtual   #166 <Method void zzy.zznt()>
		return ((PendingResult) (s));
	//   14   26:aload_1         
	//   15   27:areturn         
	}

	public PendingResult loadContainerDefaultOnly(String s, int i, Handler handler)
	{
		s = ((String) (zzbgp.zza(zzri, this, handler.getLooper(), s, i, zzbet)));
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field TagManager$zza zzbgp>
	//    2    4:aload_0         
	//    3    5:getfield        #43  <Field Context zzri>
	//    4    8:aload_0         
	//    5    9:aload_3         
	//    6   10:invokevirtual   #175 <Method Looper Handler.getLooper()>
	//    7   13:aload_1         
	//    8   14:iload_2         
	//    9   15:aload_0         
	//   10   16:getfield        #74  <Field zzal zzbet>
	//   11   19:invokeinterface #161 <Method zzy TagManager$zza.zza(Context, TagManager, Looper, String, int, zzal)>
	//   12   24:astore_1        
		((zzy) (s)).zznt();
	//   13   25:aload_1         
	//   14   26:invokevirtual   #166 <Method void zzy.zznt()>
		return ((PendingResult) (s));
	//   15   29:aload_1         
	//   16   30:areturn         
	}

	public PendingResult loadContainerPreferFresh(String s, int i)
	{
		s = ((String) (zzbgp.zza(zzri, this, ((Looper) (null)), s, i, zzbet)));
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field TagManager$zza zzbgp>
	//    2    4:aload_0         
	//    3    5:getfield        #43  <Field Context zzri>
	//    4    8:aload_0         
	//    5    9:aconst_null     
	//    6   10:aload_1         
	//    7   11:iload_2         
	//    8   12:aload_0         
	//    9   13:getfield        #74  <Field zzal zzbet>
	//   10   16:invokeinterface #161 <Method zzy TagManager$zza.zza(Context, TagManager, Looper, String, int, zzal)>
	//   11   21:astore_1        
		((zzy) (s)).zznv();
	//   12   22:aload_1         
	//   13   23:invokevirtual   #180 <Method void zzy.zznv()>
		return ((PendingResult) (s));
	//   14   26:aload_1         
	//   15   27:areturn         
	}

	public PendingResult loadContainerPreferFresh(String s, int i, Handler handler)
	{
		s = ((String) (zzbgp.zza(zzri, this, handler.getLooper(), s, i, zzbet)));
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field TagManager$zza zzbgp>
	//    2    4:aload_0         
	//    3    5:getfield        #43  <Field Context zzri>
	//    4    8:aload_0         
	//    5    9:aload_3         
	//    6   10:invokevirtual   #175 <Method Looper Handler.getLooper()>
	//    7   13:aload_1         
	//    8   14:iload_2         
	//    9   15:aload_0         
	//   10   16:getfield        #74  <Field zzal zzbet>
	//   11   19:invokeinterface #161 <Method zzy TagManager$zza.zza(Context, TagManager, Looper, String, int, zzal)>
	//   12   24:astore_1        
		((zzy) (s)).zznv();
	//   13   25:aload_1         
	//   14   26:invokevirtual   #180 <Method void zzy.zznv()>
		return ((PendingResult) (s));
	//   15   29:aload_1         
	//   16   30:areturn         
	}

	public PendingResult loadContainerPreferNonDefault(String s, int i)
	{
		s = ((String) (zzbgp.zza(zzri, this, ((Looper) (null)), s, i, zzbet)));
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field TagManager$zza zzbgp>
	//    2    4:aload_0         
	//    3    5:getfield        #43  <Field Context zzri>
	//    4    8:aload_0         
	//    5    9:aconst_null     
	//    6   10:aload_1         
	//    7   11:iload_2         
	//    8   12:aload_0         
	//    9   13:getfield        #74  <Field zzal zzbet>
	//   10   16:invokeinterface #161 <Method zzy TagManager$zza.zza(Context, TagManager, Looper, String, int, zzal)>
	//   11   21:astore_1        
		((zzy) (s)).zznu();
	//   12   22:aload_1         
	//   13   23:invokevirtual   #184 <Method void zzy.zznu()>
		return ((PendingResult) (s));
	//   14   26:aload_1         
	//   15   27:areturn         
	}

	public PendingResult loadContainerPreferNonDefault(String s, int i, Handler handler)
	{
		s = ((String) (zzbgp.zza(zzri, this, handler.getLooper(), s, i, zzbet)));
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field TagManager$zza zzbgp>
	//    2    4:aload_0         
	//    3    5:getfield        #43  <Field Context zzri>
	//    4    8:aload_0         
	//    5    9:aload_3         
	//    6   10:invokevirtual   #175 <Method Looper Handler.getLooper()>
	//    7   13:aload_1         
	//    8   14:iload_2         
	//    9   15:aload_0         
	//   10   16:getfield        #74  <Field zzal zzbet>
	//   11   19:invokeinterface #161 <Method zzy TagManager$zza.zza(Context, TagManager, Looper, String, int, zzal)>
	//   12   24:astore_1        
		((zzy) (s)).zznu();
	//   13   25:aload_1         
	//   14   26:invokevirtual   #184 <Method void zzy.zznu()>
		return ((PendingResult) (s));
	//   15   29:aload_1         
	//   16   30:areturn         
	}

	public void setVerboseLoggingEnabled(boolean flag)
	{
		byte byte0;
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            9
			byte0 = 2;
	//    2    4:iconst_2        
	//    3    5:istore_2        
		else
	//*   4    6:goto            11
			byte0 = 5;
	//    5    9:iconst_5        
	//    6   10:istore_2        
		zzdi.setLogLevel(((int) (byte0)));
	//    7   11:iload_2         
	//    8   12:invokestatic    #190 <Method void zzdi.setLogLevel(int)>
	//    9   15:return          
	}

	public final int zza(zzv zzv1)
	{
		zzbgr.put(((Object) (zzv1.getContainerId())), ((Object) (zzv1)));
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field ConcurrentMap zzbgr>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #195 <Method String zzv.getContainerId()>
	//    4    8:aload_1         
	//    5    9:invokeinterface #199 <Method Object ConcurrentMap.put(Object, Object)>
	//    6   14:pop             
		return zzbgr.size();
	//    7   15:aload_0         
	//    8   16:getfield        #52  <Field ConcurrentMap zzbgr>
	//    9   19:invokeinterface #203 <Method int ConcurrentMap.size()>
	//   10   24:ireturn         
	}

	final boolean zzb(Uri uri)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		zzeh zzeh1 = zzeh.zzpm();
	//    2    2:invokestatic    #211 <Method zzeh zzeh.zzpm()>
	//    3    5:astore_3        
		if(!zzeh1.zzb(uri)) goto _L2; else goto _L1
	//    4    6:aload_3         
	//    5    7:aload_1         
	//    6    8:invokevirtual   #213 <Method boolean zzeh.zzb(Uri)>
	//    7   11:ifeq            186
_L1:
		uri = ((Uri) (zzeh1.getContainerId()));
	//    8   14:aload_3         
	//    9   15:invokevirtual   #214 <Method String zzeh.getContainerId()>
	//   10   18:astore_1        
		zzgd.zzbgu[zzeh1.zzpn().ordinal()];
	//   11   19:getstatic       #220 <Field int[] zzgd.zzbgu>
	//   12   22:aload_3         
	//   13   23:invokevirtual   #224 <Method zzeh$zza zzeh.zzpn()>
	//   14   26:invokevirtual   #229 <Method int zzeh$zza.ordinal()>
	//   15   29:iaload          
		JVM INSTR tableswitch 1 3: default 196
	//	               1 153
	//	               2 56
	//	               3 56;
	//   16   30:tableswitch     1 3: default 196
	//	               1 153
	//	               2 56
	//	               3 56
		   goto _L3 _L4 _L5 _L5
_L5:
		Iterator iterator = zzbgr.keySet().iterator();
	//   17   56:aload_0         
	//   18   57:getfield        #52  <Field ConcurrentMap zzbgr>
	//   19   60:invokeinterface #233 <Method Set ConcurrentMap.keySet()>
	//   20   65:invokeinterface #236 <Method Iterator Set.iterator()>
	//   21   70:astore          4
_L7:
		if(!iterator.hasNext()) goto _L3; else goto _L6
	//   22   72:aload           4
	//   23   74:invokeinterface #140 <Method boolean Iterator.hasNext()>
	//   24   79:ifeq            180
_L6:
		zzv zzv1;
		String s = (String)iterator.next();
	//   25   82:aload           4
	//   26   84:invokeinterface #144 <Method Object Iterator.next()>
	//   27   89:checkcast       #238 <Class String>
	//   28   92:astore          5
		zzv1 = (zzv)zzbgr.get(((Object) (s)));
	//   29   94:aload_0         
	//   30   95:getfield        #52  <Field ConcurrentMap zzbgr>
	//   31   98:aload           5
	//   32  100:invokeinterface #242 <Method Object ConcurrentMap.get(Object)>
	//   33  105:checkcast       #146 <Class zzv>
	//   34  108:astore          6
		if(!s.equals(((Object) (uri))))
			continue; /* Loop/switch isn't completed */
	//   35  110:aload           5
	//   36  112:aload_1         
	//   37  113:invokevirtual   #246 <Method boolean String.equals(Object)>
	//   38  116:ifeq            136
		zzv1.zzdf(zzeh1.zzpo());
	//   39  119:aload           6
	//   40  121:aload_3         
	//   41  122:invokevirtual   #249 <Method String zzeh.zzpo()>
	//   42  125:invokevirtual   #252 <Method void zzv.zzdf(String)>
_L9:
		zzv1.refresh();
	//   43  128:aload           6
	//   44  130:invokevirtual   #255 <Method void zzv.refresh()>
		  goto _L7
	//*  45  133:goto            72
		if(zzv1.zznq() == null) goto _L7; else goto _L8
	//   46  136:aload           6
	//   47  138:invokevirtual   #258 <Method String zzv.zznq()>
	//   48  141:ifnull          72
_L8:
		zzv1.zzdf(((String) (null)));
	//   49  144:aload           6
	//   50  146:aconst_null     
	//   51  147:invokevirtual   #252 <Method void zzv.zzdf(String)>
		  goto _L9
	//*  52  150:goto            128
_L4:
		uri = ((Uri) ((zzv)zzbgr.get(((Object) (uri)))));
	//   53  153:aload_0         
	//   54  154:getfield        #52  <Field ConcurrentMap zzbgr>
	//   55  157:aload_1         
	//   56  158:invokeinterface #242 <Method Object ConcurrentMap.get(Object)>
	//   57  163:checkcast       #146 <Class zzv>
	//   58  166:astore_1        
		if(uri == null) goto _L3; else goto _L10
	//   59  167:aload_1         
	//   60  168:ifnull          180
_L10:
		((zzv) (uri)).zzdf(((String) (null)));
	//   61  171:aload_1         
	//   62  172:aconst_null     
	//   63  173:invokevirtual   #252 <Method void zzv.zzdf(String)>
		((zzv) (uri)).refresh();
	//   64  176:aload_1         
	//   65  177:invokevirtual   #255 <Method void zzv.refresh()>
_L3:
		boolean flag = true;
	//   66  180:iconst_1        
	//   67  181:istore_2        
_L12:
		this;
	//   68  182:aload_0         
		JVM INSTR monitorexit ;
	//   69  183:monitorexit     
		return flag;
	//   70  184:iload_2         
	//   71  185:ireturn         
_L2:
		flag = false;
	//   72  186:iconst_0        
	//   73  187:istore_2        
		if(true) goto _L12; else goto _L11
	//   74  188:goto            182
_L11:
		uri;
	//   75  191:astore_1        
	//*  76  192:aload_0         
		throw uri;
	//   77  193:monitorexit     
	//   78  194:aload_1         
	//   79  195:athrow          
	//*  80  196:goto            180
	}

	public final boolean zzb(zzv zzv1)
	{
		return zzbgr.remove(((Object) (zzv1.getContainerId()))) != null;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field ConcurrentMap zzbgr>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #195 <Method String zzv.getContainerId()>
	//    4    8:invokeinterface #262 <Method Object ConcurrentMap.remove(Object)>
	//    5   13:ifnull          18
	//    6   16:iconst_1        
	//    7   17:ireturn         
	//    8   18:iconst_0        
	//    9   19:ireturn         
	}

	private static TagManager zzbgs;
	private final DataLayer zzazr;
	private final zzal zzbet;
	private final zza zzbgp;
	private final zzfm zzbgq;
	private final ConcurrentMap zzbgr;
	private final Context zzri;
}
