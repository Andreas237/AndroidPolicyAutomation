// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.safetynet;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal.safetynet:
//			zzx

final class zzn extends zzk.zzf
{

	zzn(GoogleApiClient googleapiclient, int ai[], int i, String s, String s1)
	{
		zzaa = ai;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #15  <Field int[] zzaa>
		zzab = i;
	//    3    5:aload_0         
	//    4    6:iload_3         
	//    5    7:putfield        #17  <Field int zzab>
		zzz = s;
	//    6   10:aload_0         
	//    7   11:aload           4
	//    8   13:putfield        #19  <Field String zzz>
		zzx = s1;
	//    9   16:aload_0         
	//   10   17:aload           5
	//   11   19:putfield        #21  <Field String zzx>
		super(googleapiclient);
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:invokespecial   #24  <Method void zzk$zzf(GoogleApiClient)>
	//   15   27:return          
	}

	protected final void doExecute(com.google.android.gms.common.api.Api.AnyClient anyclient)
		throws RemoteException
	{
		anyclient = ((com.google.android.gms.common.api.Api.AnyClient) ((zzx)anyclient));
	//    0    0:aload_1         
	//    1    1:checkcast       #31  <Class zzx>
	//    2    4:astore_1        
		ArrayList arraylist = new ArrayList();
	//    3    5:new             #33  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #36  <Method void ArrayList()>
	//    6   12:astore          4
		int ai[] = zzaa;
	//    7   14:aload_0         
	//    8   15:getfield        #15  <Field int[] zzaa>
	//    9   18:astore          5
		int j = ai.length;
	//   10   20:aload           5
	//   11   22:arraylength     
	//   12   23:istore_3        
		for(int i = 0; i < j; i++)
	//*  13   24:iconst_0        
	//*  14   25:istore_2        
	//*  15   26:iload_2         
	//*  16   27:iload_3         
	//*  17   28:icmpge          53
			((List) (arraylist)).add(((Object) (Integer.valueOf(ai[i]))));
	//   18   31:aload           4
	//   19   33:aload           5
	//   20   35:iload_2         
	//   21   36:iaload          
	//   22   37:invokestatic    #42  <Method Integer Integer.valueOf(int)>
	//   23   40:invokeinterface #48  <Method boolean List.add(Object)>
	//   24   45:pop             

	//   25   46:iload_2         
	//   26   47:iconst_1        
	//   27   48:iadd            
	//   28   49:istore_2        
	//*  29   50:goto            26
		((zzx) (anyclient)).zza(zzaf, ((List) (arraylist)), zzab, zzz, zzx);
	//   30   53:aload_1         
	//   31   54:aload_0         
	//   32   55:getfield        #52  <Field zzg zzaf>
	//   33   58:aload           4
	//   34   60:aload_0         
	//   35   61:getfield        #17  <Field int zzab>
	//   36   64:aload_0         
	//   37   65:getfield        #19  <Field String zzz>
	//   38   68:aload_0         
	//   39   69:getfield        #21  <Field String zzx>
	//   40   72:invokevirtual   #56  <Method void zzx.zza(zzg, List, int, String, String)>
	//   41   75:return          
	}

	private final int zzaa[];
	private final int zzab;
	private final String zzx;
	private final String zzz;
}
