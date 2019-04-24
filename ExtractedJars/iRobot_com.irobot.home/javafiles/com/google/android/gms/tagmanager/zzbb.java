// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tagmanager;

import android.content.Context;

// Referenced classes of package com.google.android.gms.tagmanager:
//			zzbx, zzbz, zzfl, zzej, 
//			zzdi, zzby

public final class zzbb
	implements zzbx
{

	private zzbb(Context context)
	{
		this(((zzby) (zzbz.zzv(context))), ((zzej) (new zzfl())));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #29  <Method zzbz zzbz.zzv(Context)>
	//    3    5:new             #31  <Class zzfl>
	//    4    8:dup             
	//    5    9:invokespecial   #32  <Method void zzfl()>
	//    6   12:invokespecial   #35  <Method void zzbb(zzby, zzej)>
	//    7   15:return          
	}

	private zzbb(zzby zzby1, zzej zzej1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		zzbbx = zzby1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #38  <Field zzby zzbbx>
		zzbaj = zzej1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #40  <Field zzej zzbaj>
	//    8   14:return          
	}

	public static zzbx zzp(Context context)
	{
		synchronized(zzaze)
	//*   0    0:getstatic       #21  <Field Object zzaze>
	//*   1    3:astore_1        
	//*   2    4:aload_1         
	//*   3    5:monitorenter    
		{
			if(zzbbw == null)
	//*   4    6:getstatic       #45  <Field zzbb zzbbw>
	//*   5    9:ifnonnull       23
				zzbbw = new zzbb(context);
	//    6   12:new             #2   <Class zzbb>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:invokespecial   #47  <Method void zzbb(Context)>
	//   10   20:putstatic       #45  <Field zzbb zzbbw>
			context = ((Context) (zzbbw));
	//   11   23:getstatic       #45  <Field zzbb zzbbw>
	//   12   26:astore_0        
		}
	//   13   27:aload_1         
	//   14   28:monitorexit     
		return ((zzbx) (context));
	//   15   29:aload_0         
	//   16   30:areturn         
		context;
	//   17   31:astore_0        
		obj;
	//   18   32:aload_1         
		JVM INSTR monitorexit ;
	//   19   33:monitorexit     
		throw context;
	//   20   34:aload_0         
	//   21   35:athrow          
	}

	public final boolean zzdo(String s)
	{
		if(!zzbaj.zzew())
	//*   0    0:aload_0         
	//*   1    1:getfield        #40  <Field zzej zzbaj>
	//*   2    4:invokeinterface #55  <Method boolean zzej.zzew()>
	//*   3    9:ifne            19
		{
			zzdi.zzab("Too many urls sent too quickly with the TagManagerSender, rate limiting invoked.");
	//    4   12:ldc1            #57  <String "Too many urls sent too quickly with the TagManagerSender, rate limiting invoked.">
	//    5   14:invokestatic    #63  <Method void zzdi.zzab(String)>
			return false;
	//    6   17:iconst_0        
	//    7   18:ireturn         
		} else
		{
			zzbbx.zzdt(s);
	//    8   19:aload_0         
	//    9   20:getfield        #38  <Field zzby zzbbx>
	//   10   23:aload_1         
	//   11   24:invokeinterface #68  <Method void zzby.zzdt(String)>
			return true;
	//   12   29:iconst_1        
	//   13   30:ireturn         
		}
	}

	private static final Object zzaze = new Object();
	private static zzbb zzbbw;
	private zzej zzbaj;
	private zzby zzbbx;

	static 
	{
	//    0    0:new             #4   <Class Object>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void Object()>
	//    3    7:putstatic       #21  <Field Object zzaze>
	//*   4   10:return          
	}
}
