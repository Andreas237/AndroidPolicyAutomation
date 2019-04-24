// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			zzat, zzaj, zzbd, zzav

final class zzap extends zzat
{

	public zzap(zzaj zzaj1, ArrayList arraylist)
	{
		zzhv = zzaj1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field zzaj zzhv>
		super(zzaj1, ((zzak) (null)));
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aconst_null     
	//    6    8:invokespecial   #16  <Method void zzat(zzaj, zzak)>
		zzib = arraylist;
	//    7   11:aload_0         
	//    8   12:aload_2         
	//    9   13:putfield        #18  <Field ArrayList zzib>
	//   10   16:return          
	}

	public final void zzaq()
	{
		zzaj.zzd(zzhv).zzfq.zzim = zzaj.zzg(zzhv);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field zzaj zzhv>
	//    2    4:invokestatic    #30  <Method zzbd zzaj.zzd(zzaj)>
	//    3    7:getfield        #36  <Field zzav zzbd.zzfq>
	//    4   10:aload_0         
	//    5   11:getfield        #13  <Field zzaj zzhv>
	//    6   14:invokestatic    #40  <Method java.util.Set zzaj.zzg(zzaj)>
	//    7   17:putfield        #46  <Field java.util.Set zzav.zzim>
		ArrayList arraylist = (ArrayList)zzib;
	//    8   20:aload_0         
	//    9   21:getfield        #18  <Field ArrayList zzib>
	//   10   24:checkcast       #48  <Class ArrayList>
	//   11   27:astore_3        
		int j = arraylist.size();
	//   12   28:aload_3         
	//   13   29:invokevirtual   #52  <Method int ArrayList.size()>
	//   14   32:istore_2        
		for(int i = 0; i < j;)
	//*  15   33:iconst_0        
	//*  16   34:istore_1        
	//*  17   35:iload_1         
	//*  18   36:iload_2         
	//*  19   37:icmpge          84
		{
			Object obj = arraylist.get(i);
	//   20   40:aload_3         
	//   21   41:iload_1         
	//   22   42:invokevirtual   #56  <Method Object ArrayList.get(int)>
	//   23   45:astore          4
			i++;
	//   24   47:iload_1         
	//   25   48:iconst_1        
	//   26   49:iadd            
	//   27   50:istore_1        
			((com.google.android.gms.common.api.Api.Client)obj).getRemoteService(zzaj.zzh(zzhv), zzaj.zzd(zzhv).zzfq.zzim);
	//   28   51:aload           4
	//   29   53:checkcast       #58  <Class com.google.android.gms.common.api.Api$Client>
	//   30   56:aload_0         
	//   31   57:getfield        #13  <Field zzaj zzhv>
	//   32   60:invokestatic    #62  <Method com.google.android.gms.common.internal.IAccountAccessor zzaj.zzh(zzaj)>
	//   33   63:aload_0         
	//   34   64:getfield        #13  <Field zzaj zzhv>
	//   35   67:invokestatic    #30  <Method zzbd zzaj.zzd(zzaj)>
	//   36   70:getfield        #36  <Field zzav zzbd.zzfq>
	//   37   73:getfield        #46  <Field java.util.Set zzav.zzim>
	//   38   76:invokeinterface #66  <Method void com.google.android.gms.common.api.Api$Client.getRemoteService(com.google.android.gms.common.internal.IAccountAccessor, java.util.Set)>
		}

	//*  39   81:goto            35
	//   40   84:return          
	}

	private final zzaj zzhv;
	private final ArrayList zzib;
}
