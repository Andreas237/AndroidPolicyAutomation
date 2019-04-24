// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.gmsg.zzab;
import com.google.android.gms.ads.internal.gmsg.zzv;
import com.google.android.gms.ads.internal.zzbv;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzfo, zzfk, zzfl, zzfm, 
//			zzfn, zzvf, zzfg, zzfh, 
//			zzaop, zzet, zzer, zzakb, 
//			zzwb, zzaiy, zzfi, zzaon, 
//			zzfj, zzvs

public final class zzff
	implements zzfo
{

	public zzff(zzet zzet1, zzvf zzvf1, Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #30  <Class zzfk>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #33  <Method void zzfk(zzff)>
	//    7   13:putfield        #35  <Field zzv zzafs>
	//    8   16:aload_0         
	//    9   17:new             #37  <Class zzfl>
	//   10   20:dup             
	//   11   21:aload_0         
	//   12   22:invokespecial   #38  <Method void zzfl(zzff)>
	//   13   25:putfield        #40  <Field zzv zzaft>
	//   14   28:aload_0         
	//   15   29:new             #42  <Class zzfm>
	//   16   32:dup             
	//   17   33:aload_0         
	//   18   34:invokespecial   #43  <Method void zzfm(zzff)>
	//   19   37:putfield        #45  <Field zzv zzafu>
	//   20   40:aload_0         
	//   21   41:new             #47  <Class zzfn>
	//   22   44:dup             
	//   23   45:aload_0         
	//   24   46:invokespecial   #48  <Method void zzfn(zzff)>
	//   25   49:putfield        #50  <Field zzv zzafz>
		zzafq = zzet1;
	//   26   52:aload_0         
	//   27   53:aload_1         
	//   28   54:putfield        #52  <Field zzet zzafq>
		mContext = context;
	//   29   57:aload_0         
	//   30   58:aload_3         
	//   31   59:putfield        #54  <Field Context mContext>
		zzafw = new zzab(mContext);
	//   32   62:aload_0         
	//   33   63:new             #56  <Class zzab>
	//   34   66:dup             
	//   35   67:aload_0         
	//   36   68:getfield        #54  <Field Context mContext>
	//   37   71:invokespecial   #59  <Method void zzab(Context)>
	//   38   74:putfield        #61  <Field zzab zzafw>
		zzafx = zzvf1.zzb(((zzci) (null)));
	//   39   77:aload_0         
	//   40   78:aload_2         
	//   41   79:aconst_null     
	//   42   80:invokevirtual   #67  <Method zzvs zzvf.zzb(zzci)>
	//   43   83:putfield        #69  <Field zzvs zzafx>
		((zzaop) (zzafx)).zza(((zzaoo) (new zzfg(this))), ((zzaom) (new zzfh(this))));
	//   44   86:aload_0         
	//   45   87:getfield        #69  <Field zzvs zzafx>
	//   46   90:new             #71  <Class zzfg>
	//   47   93:dup             
	//   48   94:aload_0         
	//   49   95:invokespecial   #72  <Method void zzfg(zzff)>
	//   50   98:new             #74  <Class zzfh>
	//   51  101:dup             
	//   52  102:aload_0         
	//   53  103:invokespecial   #75  <Method void zzfh(zzff)>
	//   54  106:invokevirtual   #81  <Method void zzaop.zza(zzaoo, zzaom)>
		zzet1 = ((zzet) (String.valueOf(((Object) (zzafq.zzaet.zzfy())))));
	//   55  109:aload_0         
	//   56  110:getfield        #52  <Field zzet zzafq>
	//   57  113:getfield        #87  <Field zzer zzet.zzaet>
	//   58  116:invokevirtual   #93  <Method String zzer.zzfy()>
	//   59  119:invokestatic    #99  <Method String String.valueOf(Object)>
	//   60  122:astore_1        
		if(((String) (zzet1)).length() != 0)
	//*  61  123:aload_1         
	//*  62  124:invokevirtual   #103 <Method int String.length()>
	//*  63  127:ifeq            140
			zzet1 = ((zzet) ("Core JS tracking ad unit: ".concat(((String) (zzet1)))));
	//   64  130:ldc1            #105 <String "Core JS tracking ad unit: ">
	//   65  132:aload_1         
	//   66  133:invokevirtual   #109 <Method String String.concat(String)>
	//   67  136:astore_1        
		else
	//*  68  137:goto            150
			zzet1 = ((zzet) (new String("Core JS tracking ad unit: ")));
	//   69  140:new             #95  <Class String>
	//   70  143:dup             
	//   71  144:ldc1            #105 <String "Core JS tracking ad unit: ">
	//   72  146:invokespecial   #112 <Method void String(String)>
	//   73  149:astore_1        
		zzakb.zzck(((String) (zzet1)));
	//   74  150:aload_1         
	//   75  151:invokestatic    #117 <Method void zzakb.zzck(String)>
	//   76  154:return          
	}

	static zzet zza(zzff zzff1)
	{
		return zzff1.zzafq;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field zzet zzafq>
	//    2    4:areturn         
	}

	static boolean zza(zzff zzff1, boolean flag)
	{
		zzff1.zzafy = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #122 <Field boolean zzafy>
		return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
	}

	static zzab zzb(zzff zzff1)
	{
		return zzff1.zzafw;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field zzab zzafw>
	//    2    4:areturn         
	}

	final void zza(zzwb zzwb1)
	{
		zzwb1.zza("/updateActiveView", zzafs);
	//    0    0:aload_1         
	//    1    1:ldc1            #126 <String "/updateActiveView">
	//    2    3:aload_0         
	//    3    4:getfield        #35  <Field zzv zzafs>
	//    4    7:invokeinterface #131 <Method void zzwb.zza(String, zzv)>
		zzwb1.zza("/untrackActiveViewUnit", zzaft);
	//    5   12:aload_1         
	//    6   13:ldc1            #133 <String "/untrackActiveViewUnit">
	//    7   15:aload_0         
	//    8   16:getfield        #40  <Field zzv zzaft>
	//    9   19:invokeinterface #131 <Method void zzwb.zza(String, zzv)>
		zzwb1.zza("/visibilityChanged", zzafu);
	//   10   24:aload_1         
	//   11   25:ldc1            #135 <String "/visibilityChanged">
	//   12   27:aload_0         
	//   13   28:getfield        #45  <Field zzv zzafu>
	//   14   31:invokeinterface #131 <Method void zzwb.zza(String, zzv)>
		if(zzbv.zzfh().zzs(mContext))
	//*  15   36:invokestatic    #141 <Method zzaiy zzbv.zzfh()>
	//*  16   39:aload_0         
	//*  17   40:getfield        #54  <Field Context mContext>
	//*  18   43:invokevirtual   #147 <Method boolean zzaiy.zzs(Context)>
	//*  19   46:ifeq            61
			zzwb1.zza("/logScionEvent", zzafz);
	//   20   49:aload_1         
	//   21   50:ldc1            #149 <String "/logScionEvent">
	//   22   52:aload_0         
	//   23   53:getfield        #50  <Field zzv zzafz>
	//   24   56:invokeinterface #131 <Method void zzwb.zza(String, zzv)>
	//   25   61:return          
	}

	final void zzb(zzwb zzwb1)
	{
		zzwb1.zzb("/visibilityChanged", zzafu);
	//    0    0:aload_1         
	//    1    1:ldc1            #135 <String "/visibilityChanged">
	//    2    3:aload_0         
	//    3    4:getfield        #45  <Field zzv zzafu>
	//    4    7:invokeinterface #151 <Method void zzwb.zzb(String, zzv)>
		zzwb1.zzb("/untrackActiveViewUnit", zzaft);
	//    5   12:aload_1         
	//    6   13:ldc1            #133 <String "/untrackActiveViewUnit">
	//    7   15:aload_0         
	//    8   16:getfield        #40  <Field zzv zzaft>
	//    9   19:invokeinterface #151 <Method void zzwb.zzb(String, zzv)>
		zzwb1.zzb("/updateActiveView", zzafs);
	//   10   24:aload_1         
	//   11   25:ldc1            #126 <String "/updateActiveView">
	//   12   27:aload_0         
	//   13   28:getfield        #35  <Field zzv zzafs>
	//   14   31:invokeinterface #151 <Method void zzwb.zzb(String, zzv)>
		if(zzbv.zzfh().zzs(mContext))
	//*  15   36:invokestatic    #141 <Method zzaiy zzbv.zzfh()>
	//*  16   39:aload_0         
	//*  17   40:getfield        #54  <Field Context mContext>
	//*  18   43:invokevirtual   #147 <Method boolean zzaiy.zzs(Context)>
	//*  19   46:ifeq            61
			zzwb1.zzb("/logScionEvent", zzafz);
	//   20   49:aload_1         
	//   21   50:ldc1            #149 <String "/logScionEvent">
	//   22   52:aload_0         
	//   23   53:getfield        #50  <Field zzv zzafz>
	//   24   56:invokeinterface #151 <Method void zzwb.zzb(String, zzv)>
	//   25   61:return          
	}

	public final void zzb(JSONObject jsonobject, boolean flag)
	{
		((zzaop) (zzafx)).zza(((zzaoo) (new zzfi(this, jsonobject))), ((zzaom) (new zzaon())));
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field zzvs zzafx>
	//    2    4:new             #154 <Class zzfi>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #157 <Method void zzfi(zzff, JSONObject)>
	//    7   13:new             #159 <Class zzaon>
	//    8   16:dup             
	//    9   17:invokespecial   #160 <Method void zzaon()>
	//   10   20:invokevirtual   #81  <Method void zzaop.zza(zzaoo, zzaom)>
	//   11   23:return          
	}

	public final boolean zzgk()
	{
		return zzafy;
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field boolean zzafy>
	//    2    4:ireturn         
	}

	public final void zzgl()
	{
		((zzaop) (zzafx)).zza(((zzaoo) (new zzfj(this))), ((zzaom) (new zzaon())));
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field zzvs zzafx>
	//    2    4:new             #165 <Class zzfj>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokespecial   #166 <Method void zzfj(zzff)>
	//    6   12:new             #159 <Class zzaon>
	//    7   15:dup             
	//    8   16:invokespecial   #160 <Method void zzaon()>
	//    9   19:invokevirtual   #81  <Method void zzaop.zza(zzaoo, zzaom)>
		zzafx.release();
	//   10   22:aload_0         
	//   11   23:getfield        #69  <Field zzvs zzafx>
	//   12   26:invokevirtual   #171 <Method void zzvs.release()>
	//   13   29:return          
	}

	private final Context mContext;
	private final zzet zzafq;
	private final zzv zzafs = new zzfk(this);
	private final zzv zzaft = new zzfl(this);
	private final zzv zzafu = new zzfm(this);
	private final zzab zzafw;
	private zzvs zzafx;
	private boolean zzafy;
	private final zzv zzafz = new zzfn(this);
}
