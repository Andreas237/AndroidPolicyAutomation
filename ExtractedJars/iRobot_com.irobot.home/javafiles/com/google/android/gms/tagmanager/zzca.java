// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tagmanager;


// Referenced classes of package com.google.android.gms.tagmanager:
//			zzbz, zzfn, zzcb, zzby

final class zzca
	implements Runnable
{

	zzca(zzbz zzbz1, zzby zzby, long l, String s)
	{
		zzbcv = zzbz1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field zzbz zzbcv>
		zzbcs = zzby;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #20  <Field zzby zzbcs>
		zzbct = l;
	//    6   10:aload_0         
	//    7   11:lload_3         
	//    8   12:putfield        #22  <Field long zzbct>
		zzbcu = s;
	//    9   15:aload_0         
	//   10   16:aload           5
	//   11   18:putfield        #24  <Field String zzbcu>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #27  <Method void Object()>
	//   14   25:return          
	}

	public final void run()
	{
		if(zzbz.zza(zzbcv) == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field zzbz zzbcv>
	//*   2    4:invokestatic    #35  <Method zzcb zzbz.zza(zzbz)>
	//*   3    7:ifnonnull       41
		{
			zzfn zzfn1 = zzfn.zzqe();
	//    4   10:invokestatic    #41  <Method zzfn zzfn.zzqe()>
	//    5   13:astore_1        
			zzfn1.zza(zzbz.zzb(zzbcv), zzbcs);
	//    6   14:aload_1         
	//    7   15:aload_0         
	//    8   16:getfield        #18  <Field zzbz zzbcv>
	//    9   19:invokestatic    #45  <Method android.content.Context zzbz.zzb(zzbz)>
	//   10   22:aload_0         
	//   11   23:getfield        #20  <Field zzby zzbcs>
	//   12   26:invokevirtual   #48  <Method void zzfn.zza(android.content.Context, zzby)>
			zzbz.zza(zzbcv, zzfn1.zzqf());
	//   13   29:aload_0         
	//   14   30:getfield        #18  <Field zzbz zzbcv>
	//   15   33:aload_1         
	//   16   34:invokevirtual   #52  <Method zzcb zzfn.zzqf()>
	//   17   37:invokestatic    #55  <Method zzcb zzbz.zza(zzbz, zzcb)>
	//   18   40:pop             
		}
		zzbz.zza(zzbcv).zzb(zzbct, zzbcu);
	//   19   41:aload_0         
	//   20   42:getfield        #18  <Field zzbz zzbcv>
	//   21   45:invokestatic    #35  <Method zzcb zzbz.zza(zzbz)>
	//   22   48:aload_0         
	//   23   49:getfield        #22  <Field long zzbct>
	//   24   52:aload_0         
	//   25   53:getfield        #24  <Field String zzbcu>
	//   26   56:invokeinterface #60  <Method void zzcb.zzb(long, String)>
	//   27   61:return          
	}

	private final zzby zzbcs;
	private final long zzbct;
	private final String zzbcu;
	private final zzbz zzbcv;
}
