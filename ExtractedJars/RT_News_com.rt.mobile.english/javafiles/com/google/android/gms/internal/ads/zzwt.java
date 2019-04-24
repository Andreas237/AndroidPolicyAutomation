// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.zzag;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzwe, zzaoj, zzvs, zzwq, 
//			zzwh

final class zzwt
	implements zzag
{

	public zzwt(zzwq zzwq1, zzvs zzvs1, zzaoj zzaoj1)
	{
		zzbro = zzwq1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field zzwq zzbro>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
		zzbrp = zzvs1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #21  <Field zzvs zzbrp>
		zzbrq = zzaoj1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #23  <Field zzaoj zzbrq>
	//   11   19:return          
	}

	public final void zzau(String s)
	{
		if(s != null)
			break MISSING_BLOCK_LABEL_21;
	//    0    0:aload_1         
	//    1    1:ifnonnull       21
		try
		{
			zzbrq.setException(((Throwable) (new zzwe())));
	//    2    4:aload_0         
	//    3    5:getfield        #23  <Field zzaoj zzbrq>
	//    4    8:new             #31  <Class zzwe>
	//    5   11:dup             
	//    6   12:invokespecial   #32  <Method void zzwe()>
	//    7   15:invokevirtual   #38  <Method void zzaoj.setException(Throwable)>
		}
	//*   8   18:goto            36
	//*   9   21:aload_0         
	//*  10   22:getfield        #23  <Field zzaoj zzbrq>
	//*  11   25:new             #31  <Class zzwe>
	//*  12   28:dup             
	//*  13   29:aload_1         
	//*  14   30:invokespecial   #40  <Method void zzwe(String)>
	//*  15   33:invokevirtual   #38  <Method void zzaoj.setException(Throwable)>
	//*  16   36:aload_0         
	//*  17   37:getfield        #21  <Field zzvs zzbrp>
	//*  18   40:invokevirtual   #45  <Method void zzvs.release()>
	//*  19   43:return          
	//*  20   44:aload_0         
	//*  21   45:getfield        #21  <Field zzvs zzbrp>
	//*  22   48:invokevirtual   #45  <Method void zzvs.release()>
	//*  23   51:aload_1         
	//*  24   52:athrow          
		// Misplaced declaration of an exception variable
		catch(String s) { }
	//   25   53:astore_1        
		break MISSING_BLOCK_LABEL_36;
	//   26   54:goto            36
		zzbrq.setException(((Throwable) (new zzwe(s))));
		zzbrp.release();
		return;
_L2:
		zzbrp.release();
		throw s;
		s;
	//   27   57:astore_1        
		if(true) goto _L2; else goto _L1
_L1:
	//*  28   58:goto            44
	}

	public final void zzd(JSONObject jsonobject)
	{
		zzbrq.set(zzwq.zza(zzbro).zze(jsonobject));
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field zzaoj zzbrq>
	//    2    4:aload_0         
	//    3    5:getfield        #16  <Field zzwq zzbro>
	//    4    8:invokestatic    #56  <Method zzwh zzwq.zza(zzwq)>
	//    5   11:aload_1         
	//    6   12:invokeinterface #62  <Method Object zzwh.zze(JSONObject)>
	//    7   17:invokevirtual   #66  <Method void zzaoj.set(Object)>
_L2:
		zzbrp.release();
	//    8   20:aload_0         
	//    9   21:getfield        #21  <Field zzvs zzbrp>
	//   10   24:invokevirtual   #45  <Method void zzvs.release()>
		return;
	//   11   27:return          
		jsonobject;
	//   12   28:astore_1        
		break MISSING_BLOCK_LABEL_44;
	//   13   29:goto            44
		jsonobject;
	//   14   32:astore_1        
		zzbrq.set(((Object) (jsonobject)));
	//   15   33:aload_0         
	//   16   34:getfield        #23  <Field zzaoj zzbrq>
	//   17   37:aload_1         
	//   18   38:invokevirtual   #66  <Method void zzaoj.set(Object)>
		continue; /* Loop/switch isn't completed */
	//   19   41:goto            20
		zzbrp.release();
	//   20   44:aload_0         
	//   21   45:getfield        #21  <Field zzvs zzbrp>
	//   22   48:invokevirtual   #45  <Method void zzvs.release()>
		throw jsonobject;
	//   23   51:aload_1         
	//   24   52:athrow          
		jsonobject;
	//   25   53:astore_1        
		if(true) goto _L2; else goto _L1
_L1:
	//*  26   54:goto            20
	}

	private final zzwq zzbro;
	private final zzvs zzbrp;
	private final zzaoj zzbrq;
}
