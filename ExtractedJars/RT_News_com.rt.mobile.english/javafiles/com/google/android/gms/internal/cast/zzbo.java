// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.cast;

import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal.cast:
//			zzbr, zzbt, zzdm, zzbl, 
//			zzdg

final class zzbo extends zzbr
{

	zzbo(zzbl zzbl1, int i, String s, JSONObject jsonobject)
	{
		zzth = zzbl1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field zzbl zzth>
		zztj = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #18  <Field int zztj>
		zztk = s;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #20  <Field String zztk>
		zztl = jsonobject;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #22  <Field JSONObject zztl>
		super(zzbl1);
	//   12   21:aload_0         
	//   13   22:aload_1         
	//   14   23:invokespecial   #25  <Method void zzbr(zzbl)>
	//   15   26:return          
	}

	public final void execute()
	{
		byte byte0;
		switch(zztj)
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field int zztj>
		{
	//*   2    4:tableswitch     2 6: default 40
	//	               2 65
	//	               3 60
	//	               4 55
	//	               5 50
	//	               6 45
		default:
			byte0 = 0;
	//    3   40:iconst_0        
	//    4   41:istore_1        
			break;

	//*   5   42:goto            67
		case 6: // '\006'
			byte0 = 4;
	//    6   45:iconst_4        
	//    7   46:istore_1        
			break;

	//*   8   47:goto            67
		case 5: // '\005'
			byte0 = 3;
	//    9   50:iconst_3        
	//   10   51:istore_1        
			break;

	//*  11   52:goto            67
		case 4: // '\004'
			byte0 = 2;
	//   12   55:iconst_2        
	//   13   56:istore_1        
			break;

	//*  14   57:goto            67
		case 3: // '\003'
			byte0 = 1;
	//   15   60:iconst_1        
	//   16   61:istore_1        
			break;

	//*  17   62:goto            67
		case 2: // '\002'
			byte0 = 5;
	//   18   65:iconst_5        
	//   19   66:istore_1        
			break;
		}
		if(byte0 == 0)
	//*  20   67:iload_1         
	//*  21   68:ifne            110
		{
			((zzbt)this).zztp.zza(-1L, 2001, ((Object) (null)));
	//   22   71:aload_0         
	//   23   72:getfield        #34  <Field zzdm zzbt.zztp>
	//   24   75:ldc2w           #35  <Long -1L>
	//   25   78:sipush          2001
	//   26   81:aconst_null     
	//   27   82:invokeinterface #42  <Method void zzdm.zza(long, int, Object)>
			zzbl.zzcj().w("sendPlayerRequest for unsupported playerState: %d", new Object[] {
				Integer.valueOf(zztj)
			});
	//   28   87:invokestatic    #48  <Method zzdg zzbl.zzcj()>
	//   29   90:ldc1            #50  <String "sendPlayerRequest for unsupported playerState: %d">
	//   30   92:iconst_1        
	//   31   93:anewarray       Object[]
	//   32   96:dup             
	//   33   97:iconst_0        
	//   34   98:aload_0         
	//   35   99:getfield        #18  <Field int zztj>
	//   36  102:invokestatic    #58  <Method Integer Integer.valueOf(int)>
	//   37  105:aastore         
	//   38  106:invokevirtual   #64  <Method void zzdg.w(String, Object[])>
			return;
	//   39  109:return          
		} else
		{
			zzbl.zza(zzth, zztk, ((int) (byte0)), zztl, ((zzbt)this).zztp);
	//   40  110:aload_0         
	//   41  111:getfield        #16  <Field zzbl zzth>
	//   42  114:aload_0         
	//   43  115:getfield        #20  <Field String zztk>
	//   44  118:iload_1         
	//   45  119:aload_0         
	//   46  120:getfield        #22  <Field JSONObject zztl>
	//   47  123:aload_0         
	//   48  124:getfield        #34  <Field zzdm zzbt.zztp>
	//   49  127:invokestatic    #67  <Method void zzbl.zza(zzbl, String, int, JSONObject, zzdm)>
			return;
	//   50  130:return          
		}
	}

	private final zzbl zzth;
	private final int zztj;
	private final String zztk;
	private final JSONObject zztl;
}
