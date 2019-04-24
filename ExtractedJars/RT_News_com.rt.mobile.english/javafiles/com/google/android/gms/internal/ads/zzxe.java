// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzwx, zzxq, zzxa, zzxw

public final class zzxe
{

	public zzxe(int i)
	{
		this(((zzwx) (null)), ((zzxq) (null)), ((String) (null)), ((zzxa) (null)), i, ((zzxw) (null)), 0L);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aconst_null     
	//    3    3:aconst_null     
	//    4    4:aconst_null     
	//    5    5:iload_1         
	//    6    6:aconst_null     
	//    7    7:lconst_0        
	//    8    8:invokespecial   #24  <Method void zzxe(zzwx, zzxq, String, zzxa, int, zzxw, long)>
	//    9   11:return          
	}

	public zzxe(zzwx zzwx, zzxq zzxq, String s, zzxa zzxa, int i, zzxw zzxw, long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
		zzbtw = zzwx;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #30  <Field zzwx zzbtw>
		zzbtx = zzxq;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #32  <Field zzxq zzbtx>
		zzbty = s;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #34  <Field String zzbty>
		zzbtz = zzxa;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #36  <Field zzxa zzbtz>
		zzbtv = i;
	//   14   25:aload_0         
	//   15   26:iload           5
	//   16   28:putfield        #38  <Field int zzbtv>
		zzbua = zzxw;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #40  <Field zzxw zzbua>
		zzbub = l;
	//   20   37:aload_0         
	//   21   38:lload           7
	//   22   40:putfield        #42  <Field long zzbub>
	//   23   43:return          
	}

	public final int zzbtv;
	public final zzwx zzbtw;
	public final zzxq zzbtx;
	public final String zzbty;
	public final zzxa zzbtz;
	public final zzxw zzbua;
	public final long zzbub;
}
