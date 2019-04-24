// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.zzv;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzfo, zzfc, zzfd, zzfe, 
//			zzaqw, zzet, zzer, zzakb

public final class zzfb
	implements zzfo
{

	public zzfb(zzet zzet1, zzaqw zzaqw1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #23  <Class zzfc>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #26  <Method void zzfc(zzfb)>
	//    7   13:putfield        #28  <Field zzv zzafs>
	//    8   16:aload_0         
	//    9   17:new             #30  <Class zzfd>
	//   10   20:dup             
	//   11   21:aload_0         
	//   12   22:invokespecial   #31  <Method void zzfd(zzfb)>
	//   13   25:putfield        #33  <Field zzv zzaft>
	//   14   28:aload_0         
	//   15   29:new             #35  <Class zzfe>
	//   16   32:dup             
	//   17   33:aload_0         
	//   18   34:invokespecial   #36  <Method void zzfe(zzfb)>
	//   19   37:putfield        #38  <Field zzv zzafu>
		zzafq = zzet1;
	//   20   40:aload_0         
	//   21   41:aload_1         
	//   22   42:putfield        #40  <Field zzet zzafq>
		zzafr = zzaqw1;
	//   23   45:aload_0         
	//   24   46:aload_2         
	//   25   47:putfield        #42  <Field zzaqw zzafr>
		zzet1 = ((zzet) (zzafr));
	//   26   50:aload_0         
	//   27   51:getfield        #42  <Field zzaqw zzafr>
	//   28   54:astore_1        
		((zzaqw) (zzet1)).zza("/updateActiveView", zzafs);
	//   29   55:aload_1         
	//   30   56:ldc1            #44  <String "/updateActiveView">
	//   31   58:aload_0         
	//   32   59:getfield        #28  <Field zzv zzafs>
	//   33   62:invokeinterface #50  <Method void zzaqw.zza(String, zzv)>
		((zzaqw) (zzet1)).zza("/untrackActiveViewUnit", zzaft);
	//   34   67:aload_1         
	//   35   68:ldc1            #52  <String "/untrackActiveViewUnit">
	//   36   70:aload_0         
	//   37   71:getfield        #33  <Field zzv zzaft>
	//   38   74:invokeinterface #50  <Method void zzaqw.zza(String, zzv)>
		((zzaqw) (zzet1)).zza("/visibilityChanged", zzafu);
	//   39   79:aload_1         
	//   40   80:ldc1            #54  <String "/visibilityChanged">
	//   41   82:aload_0         
	//   42   83:getfield        #38  <Field zzv zzafu>
	//   43   86:invokeinterface #50  <Method void zzaqw.zza(String, zzv)>
		zzet1 = ((zzet) (String.valueOf(((Object) (zzafq.zzaet.zzfy())))));
	//   44   91:aload_0         
	//   45   92:getfield        #40  <Field zzet zzafq>
	//   46   95:getfield        #60  <Field zzer zzet.zzaet>
	//   47   98:invokevirtual   #66  <Method String zzer.zzfy()>
	//   48  101:invokestatic    #72  <Method String String.valueOf(Object)>
	//   49  104:astore_1        
		if(((String) (zzet1)).length() != 0)
	//*  50  105:aload_1         
	//*  51  106:invokevirtual   #76  <Method int String.length()>
	//*  52  109:ifeq            122
			zzet1 = ((zzet) ("Custom JS tracking ad unit: ".concat(((String) (zzet1)))));
	//   53  112:ldc1            #78  <String "Custom JS tracking ad unit: ">
	//   54  114:aload_1         
	//   55  115:invokevirtual   #82  <Method String String.concat(String)>
	//   56  118:astore_1        
		else
	//*  57  119:goto            132
			zzet1 = ((zzet) (new String("Custom JS tracking ad unit: ")));
	//   58  122:new             #68  <Class String>
	//   59  125:dup             
	//   60  126:ldc1            #78  <String "Custom JS tracking ad unit: ">
	//   61  128:invokespecial   #85  <Method void String(String)>
	//   62  131:astore_1        
		zzakb.zzck(((String) (zzet1)));
	//   63  132:aload_1         
	//   64  133:invokestatic    #90  <Method void zzakb.zzck(String)>
	//   65  136:return          
	}

	static zzet zza(zzfb zzfb1)
	{
		return zzfb1.zzafq;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field zzet zzafq>
	//    2    4:areturn         
	}

	public final void zzb(JSONObject jsonobject, boolean flag)
	{
		if(!flag)
	//*   0    0:iload_2         
	//*   1    1:ifne            17
		{
			zzafr.zzb("AFMA_updateActiveView", jsonobject);
	//    2    4:aload_0         
	//    3    5:getfield        #42  <Field zzaqw zzafr>
	//    4    8:ldc1            #96  <String "AFMA_updateActiveView">
	//    5   10:aload_1         
	//    6   11:invokeinterface #99  <Method void zzaqw.zzb(String, JSONObject)>
			return;
	//    7   16:return          
		} else
		{
			zzafq.zzb(((zzfo) (this)));
	//    8   17:aload_0         
	//    9   18:getfield        #40  <Field zzet zzafq>
	//   10   21:aload_0         
	//   11   22:invokevirtual   #102 <Method void zzet.zzb(zzfo)>
			return;
	//   12   25:return          
		}
	}

	public final boolean zzgk()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public final void zzgl()
	{
		zzaqw zzaqw1 = zzafr;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field zzaqw zzafr>
	//    2    4:astore_1        
		zzaqw1.zzb("/visibilityChanged", zzafu);
	//    3    5:aload_1         
	//    4    6:ldc1            #54  <String "/visibilityChanged">
	//    5    8:aload_0         
	//    6    9:getfield        #38  <Field zzv zzafu>
	//    7   12:invokeinterface #107 <Method void zzaqw.zzb(String, zzv)>
		zzaqw1.zzb("/untrackActiveViewUnit", zzaft);
	//    8   17:aload_1         
	//    9   18:ldc1            #52  <String "/untrackActiveViewUnit">
	//   10   20:aload_0         
	//   11   21:getfield        #33  <Field zzv zzaft>
	//   12   24:invokeinterface #107 <Method void zzaqw.zzb(String, zzv)>
		zzaqw1.zzb("/updateActiveView", zzafs);
	//   13   29:aload_1         
	//   14   30:ldc1            #44  <String "/updateActiveView">
	//   15   32:aload_0         
	//   16   33:getfield        #28  <Field zzv zzafs>
	//   17   36:invokeinterface #107 <Method void zzaqw.zzb(String, zzv)>
	//   18   41:return          
	}

	private final zzet zzafq;
	private final zzaqw zzafr;
	private final zzv zzafs = new zzfc(this);
	private final zzv zzaft = new zzfd(this);
	private final zzv zzafu = new zzfe(this);
}
