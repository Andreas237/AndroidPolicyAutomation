// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.cast;

import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal.cast:
//			zzdm, zzbx, zzbr, zzbz, 
//			zzbl

final class zzbs
	implements zzdm
{

	zzbs(zzbr zzbr1, zzbl zzbl1)
	{
		zzto = zzbr1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field zzbr zzto>
		zztn = zzbl1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #16  <Field zzbl zztn>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #19  <Method void Object()>
	//    8   14:return          
	}

	public final void zza(long l, int i, Object obj)
	{
		if(obj == null)
	//*   0    0:aload           4
	//*   1    2:ifnonnull       33
		{
			String s;
			try
			{
				zzto.setResult(((com.google.android.gms.common.api.Result) (new zzbx(new Status(i, ((String) (null)), ((android.app.PendingIntent) (null))), ((String) (null)), l, ((org.json.JSONObject) (null))))));
	//    2    5:aload_0         
	//    3    6:getfield        #14  <Field zzbr zzto>
	//    4    9:new             #26  <Class zzbx>
	//    5   12:dup             
	//    6   13:new             #28  <Class Status>
	//    7   16:dup             
	//    8   17:iload_3         
	//    9   18:aconst_null     
	//   10   19:aconst_null     
	//   11   20:invokespecial   #31  <Method void Status(int, String, android.app.PendingIntent)>
	//   12   23:aconst_null     
	//   13   24:lload_1         
	//   14   25:aconst_null     
	//   15   26:invokespecial   #34  <Method void zzbx(Status, String, long, org.json.JSONObject)>
	//   16   29:invokevirtual   #40  <Method void zzbr.setResult(com.google.android.gms.common.api.Result)>
				return;
	//   17   32:return          
			}
	//*  18   33:aload           4
	//*  19   35:checkcast       #42  <Class zzbz>
	//*  20   38:astore          4
	//*  21   40:aload           4
	//*  22   42:getfield        #46  <Field String zzbz.zzug>
	//*  23   45:astore          5
	//*  24   47:iload_3         
	//*  25   48:ifne            69
	//*  26   51:aload           5
	//*  27   53:ifnull          69
	//*  28   56:aload_0         
	//*  29   57:getfield        #14  <Field zzbr zzto>
	//*  30   60:getfield        #49  <Field zzbl zzbr.zzth>
	//*  31   63:aload           5
	//*  32   65:invokestatic    #54  <Method String zzbl.zza(zzbl, String)>
	//*  33   68:pop             
	//*  34   69:aload_0         
	//*  35   70:getfield        #14  <Field zzbr zzto>
	//*  36   73:new             #26  <Class zzbx>
	//*  37   76:dup             
	//*  38   77:new             #28  <Class Status>
	//*  39   80:dup             
	//*  40   81:iload_3         
	//*  41   82:aload           4
	//*  42   84:getfield        #57  <Field String zzbz.zztz>
	//*  43   87:aconst_null     
	//*  44   88:invokespecial   #31  <Method void Status(int, String, android.app.PendingIntent)>
	//*  45   91:aload           5
	//*  46   93:aload           4
	//*  47   95:getfield        #61  <Field long zzbz.zzuh>
	//*  48   98:aload           4
	//*  49  100:getfield        #65  <Field org.json.JSONObject zzbz.zzua>
	//*  50  103:invokespecial   #34  <Method void zzbx(Status, String, long, org.json.JSONObject)>
	//*  51  106:invokevirtual   #40  <Method void zzbr.setResult(com.google.android.gms.common.api.Result)>
	//*  52  109:return          
	//*  53  110:aload_0         
	//*  54  111:getfield        #14  <Field zzbr zzto>
	//*  55  114:new             #28  <Class Status>
	//*  56  117:dup             
	//*  57  118:bipush          13
	//*  58  120:invokespecial   #68  <Method void Status(int)>
	//*  59  123:invokestatic    #72  <Method com.google.android.gms.cast.games.GameManagerClient$GameManagerResult zzbr.zzb(Status)>
	//*  60  126:invokevirtual   #40  <Method void zzbr.setResult(com.google.android.gms.common.api.Result)>
	//*  61  129:return          
			// Misplaced declaration of an exception variable
			catch(Object obj)
			{
				zzto.setResult(((com.google.android.gms.common.api.Result) (zzbr.zzb(new Status(13)))));
			}
			break MISSING_BLOCK_LABEL_129;
		}
		obj = ((Object) ((zzbz)obj));
		s = ((zzbz) (obj)).zzug;
		if(i != 0 || s == null)
			break MISSING_BLOCK_LABEL_69;
		zzbl.zza(zzto.zzth, s);
		zzto.setResult(((com.google.android.gms.common.api.Result) (new zzbx(new Status(i, ((zzbz) (obj)).zztz, ((android.app.PendingIntent) (null))), s, ((zzbz) (obj)).zzuh, ((zzbz) (obj)).zzua))));
		return;
	//*  62  130:astore          4
	//*  63  132:goto            110
	}

	public final void zzb(long l)
	{
		zzto.setResult(((com.google.android.gms.common.api.Result) (zzbr.zzb(new Status(2103)))));
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field zzbr zzto>
	//    2    4:new             #28  <Class Status>
	//    3    7:dup             
	//    4    8:sipush          2103
	//    5   11:invokespecial   #68  <Method void Status(int)>
	//    6   14:invokestatic    #72  <Method com.google.android.gms.cast.games.GameManagerClient$GameManagerResult zzbr.zzb(Status)>
	//    7   17:invokevirtual   #40  <Method void zzbr.setResult(com.google.android.gms.common.api.Result)>
	//    8   20:return          
	}

	private final zzbl zztn;
	private final zzbr zzto;
}
