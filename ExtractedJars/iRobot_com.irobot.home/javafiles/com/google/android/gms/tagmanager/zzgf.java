// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.Tracker;

// Referenced classes of package com.google.android.gms.tagmanager:
//			zzgg

public final class zzgf
{

	public zzgf(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		zzri = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field Context zzri>
	//    5    9:return          
	}

	private final void zzed(String s)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(zzrk == null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #23  <Field GoogleAnalytics zzrk>
	//*   4    6:ifnonnull       46
		{
			zzrk = GoogleAnalytics.getInstance(zzri);
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:getfield        #18  <Field Context zzri>
	//    8   14:invokestatic    #29  <Method GoogleAnalytics GoogleAnalytics.getInstance(Context)>
	//    9   17:putfield        #23  <Field GoogleAnalytics zzrk>
			zzrk.setLogger(((com.google.android.gms.analytics.Logger) (new zzgg())));
	//   10   20:aload_0         
	//   11   21:getfield        #23  <Field GoogleAnalytics zzrk>
	//   12   24:new             #31  <Class zzgg>
	//   13   27:dup             
	//   14   28:invokespecial   #32  <Method void zzgg()>
	//   15   31:invokevirtual   #36  <Method void GoogleAnalytics.setLogger(com.google.android.gms.analytics.Logger)>
			zzrh = zzrk.newTracker(s);
	//   16   34:aload_0         
	//   17   35:aload_0         
	//   18   36:getfield        #23  <Field GoogleAnalytics zzrk>
	//   19   39:aload_1         
	//   20   40:invokevirtual   #40  <Method Tracker GoogleAnalytics.newTracker(String)>
	//   21   43:putfield        #42  <Field Tracker zzrh>
		}
		this;
	//   22   46:aload_0         
		JVM INSTR monitorexit ;
	//   23   47:monitorexit     
		return;
	//   24   48:return          
		s;
	//   25   49:astore_1        
	//*  26   50:aload_0         
		throw s;
	//   27   51:monitorexit     
	//   28   52:aload_1         
	//   29   53:athrow          
	}

	public final Tracker zzec(String s)
	{
		zzed(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #45  <Method void zzed(String)>
		return zzrh;
	//    3    5:aload_0         
	//    4    6:getfield        #42  <Field Tracker zzrh>
	//    5    9:areturn         
	}

	private Tracker zzrh;
	private Context zzri;
	private GoogleAnalytics zzrk;
}
