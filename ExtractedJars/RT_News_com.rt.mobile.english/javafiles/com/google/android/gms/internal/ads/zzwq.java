// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.zzaf;
import com.google.android.gms.ads.internal.gmsg.zzf;
import com.google.android.gms.ads.internal.zzbv;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzwf, zzakk, zzwt, zzwi, 
//			zzwb, zzaoj, zzakb, zzvs, 
//			zzvf, zzwr, zzws, zzaop, 
//			zzwh, zzanz

public final class zzwq
	implements zzwf
{

	zzwq(zzvf zzvf1, String s, zzwi zzwi1, zzwh zzwh)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		zzbrh = zzvf1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #26  <Field zzvf zzbrh>
		zzbrk = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #28  <Field String zzbrk>
		zzbrj = zzwi1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #30  <Field zzwi zzbrj>
		zzbri = zzwh;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #32  <Field zzwh zzbri>
	//   14   25:return          
	}

	static zzwh zza(zzwq zzwq1)
	{
		return zzwq1.zzbri;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field zzwh zzbri>
	//    2    4:areturn         
	}

	private final void zza(zzvs zzvs1, zzwb zzwb1, Object obj, zzaoj zzaoj1)
	{
		try
		{
			zzbv.zzek();
	//    0    0:invokestatic    #46  <Method zzakk zzbv.zzek()>
	//    1    3:pop             
			String s = zzakk.zzrh();
	//    2    4:invokestatic    #52  <Method String zzakk.zzrh()>
	//    3    7:astore          5
			zzf.zzbmc.zza(s, ((com.google.android.gms.ads.internal.gmsg.zzag) (new zzwt(this, zzvs1, zzaoj1))));
	//    4    9:getstatic       #58  <Field zzaf zzf.zzbmc>
	//    5   12:aload           5
	//    6   14:new             #60  <Class zzwt>
	//    7   17:dup             
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:aload           4
	//   11   22:invokespecial   #63  <Method void zzwt(zzwq, zzvs, zzaoj)>
	//   12   25:invokevirtual   #68  <Method void zzaf.zza(String, com.google.android.gms.ads.internal.gmsg.zzag)>
			JSONObject jsonobject = new JSONObject();
	//   13   28:new             #70  <Class JSONObject>
	//   14   31:dup             
	//   15   32:invokespecial   #71  <Method void JSONObject()>
	//   16   35:astore          6
			jsonobject.put("id", ((Object) (s)));
	//   17   37:aload           6
	//   18   39:ldc1            #73  <String "id">
	//   19   41:aload           5
	//   20   43:invokevirtual   #77  <Method JSONObject JSONObject.put(String, Object)>
	//   21   46:pop             
			jsonobject.put("args", ((Object) (zzbrj.zzg(obj))));
	//   22   47:aload           6
	//   23   49:ldc1            #79  <String "args">
	//   24   51:aload_0         
	//   25   52:getfield        #30  <Field zzwi zzbrj>
	//   26   55:aload_3         
	//   27   56:invokeinterface #85  <Method JSONObject zzwi.zzg(Object)>
	//   28   61:invokevirtual   #77  <Method JSONObject JSONObject.put(String, Object)>
	//   29   64:pop             
			zzwb1.zzb(zzbrk, jsonobject);
	//   30   65:aload_2         
	//   31   66:aload_0         
	//   32   67:getfield        #28  <Field String zzbrk>
	//   33   70:aload           6
	//   34   72:invokeinterface #91  <Method void zzwb.zzb(String, JSONObject)>
			return;
	//   35   77:return          
		}
		// Misplaced declaration of an exception variable
		catch(zzwb zzwb1) { }
	//   36   78:astore_2        
		zzaoj1.setException(((Throwable) (zzwb1)));
	//   37   79:aload           4
	//   38   81:aload_2         
	//   39   82:invokevirtual   #97  <Method void zzaoj.setException(Throwable)>
		zzakb.zzb("Unable to invokeJavaScript", ((Throwable) (zzwb1)));
	//   40   85:ldc1            #99  <String "Unable to invokeJavaScript">
	//   41   87:aload_2         
	//   42   88:invokestatic    #104 <Method void zzakb.zzb(String, Throwable)>
		zzvs1.release();
	//   43   91:aload_1         
	//   44   92:invokevirtual   #109 <Method void zzvs.release()>
		return;
	//   45   95:return          
		zzwb1;
	//   46   96:astore_2        
		zzvs1.release();
	//   47   97:aload_1         
	//   48   98:invokevirtual   #109 <Method void zzvs.release()>
		throw zzwb1;
	//   49  101:aload_2         
	//   50  102:athrow          
	}

	static void zza(zzwq zzwq1, zzvs zzvs1, zzwb zzwb1, Object obj, zzaoj zzaoj1)
	{
		zzwq1.zza(zzvs1, zzwb1, obj, zzaoj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokespecial   #113 <Method void zza(zzvs, zzwb, Object, zzaoj)>
	//    6    9:return          
	}

	public final zzanz zzc(Object obj)
		throws Exception
	{
		return zzf(obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #119 <Method zzanz zzf(Object)>
	//    3    5:areturn         
	}

	public final zzanz zzf(Object obj)
	{
		zzaoj zzaoj1 = new zzaoj();
	//    0    0:new             #93  <Class zzaoj>
	//    1    3:dup             
	//    2    4:invokespecial   #123 <Method void zzaoj()>
	//    3    7:astore_2        
		zzvs zzvs1 = zzbrh.zzb(((zzci) (null)));
	//    4    8:aload_0         
	//    5    9:getfield        #26  <Field zzvf zzbrh>
	//    6   12:aconst_null     
	//    7   13:invokevirtual   #128 <Method zzvs zzvf.zzb(zzci)>
	//    8   16:astore_3        
		((zzaop) (zzvs1)).zza(((zzaoo) (new zzwr(this, zzvs1, obj, zzaoj1))), ((zzaom) (new zzws(this, zzaoj1, zzvs1))));
	//    9   17:aload_3         
	//   10   18:new             #130 <Class zzwr>
	//   11   21:dup             
	//   12   22:aload_0         
	//   13   23:aload_3         
	//   14   24:aload_1         
	//   15   25:aload_2         
	//   16   26:invokespecial   #133 <Method void zzwr(zzwq, zzvs, Object, zzaoj)>
	//   17   29:new             #135 <Class zzws>
	//   18   32:dup             
	//   19   33:aload_0         
	//   20   34:aload_2         
	//   21   35:aload_3         
	//   22   36:invokespecial   #138 <Method void zzws(zzwq, zzaoj, zzvs)>
	//   23   39:invokevirtual   #143 <Method void zzaop.zza(zzaoo, zzaom)>
		return ((zzanz) (zzaoj1));
	//   24   42:aload_2         
	//   25   43:areturn         
	}

	private final zzvf zzbrh;
	private final zzwh zzbri;
	private final zzwi zzbrj;
	private final String zzbrk;
}
