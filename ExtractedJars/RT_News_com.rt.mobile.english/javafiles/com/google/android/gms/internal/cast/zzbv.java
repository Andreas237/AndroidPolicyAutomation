// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.cast;

import com.google.android.gms.common.api.Status;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.internal.cast:
//			zzdm, zzbw, zzbu, zzbz, 
//			zzby, zzcu, zzbl

final class zzbv
	implements zzdm
{

	zzbv(zzbu zzbu1, zzbl zzbl1)
	{
		zztr = zzbu1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field zzbu zztr>
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
	//*   1    2:ifnonnull       37
		{
			zzby zzby1;
			try
			{
				zztr.setResult(((com.google.android.gms.common.api.Result) (new zzbw(new Status(i, ((String) (null)), ((android.app.PendingIntent) (null))), zzbu.zza(zztr)))));
	//    2    5:aload_0         
	//    3    6:getfield        #14  <Field zzbu zztr>
	//    4    9:new             #26  <Class zzbw>
	//    5   12:dup             
	//    6   13:new             #28  <Class Status>
	//    7   16:dup             
	//    8   17:iload_3         
	//    9   18:aconst_null     
	//   10   19:aconst_null     
	//   11   20:invokespecial   #31  <Method void Status(int, String, android.app.PendingIntent)>
	//   12   23:aload_0         
	//   13   24:getfield        #14  <Field zzbu zztr>
	//   14   27:invokestatic    #36  <Method com.google.android.gms.cast.games.GameManagerClient zzbu.zza(zzbu)>
	//   15   30:invokespecial   #39  <Method void zzbw(Status, com.google.android.gms.cast.games.GameManagerClient)>
	//   16   33:invokevirtual   #43  <Method void zzbu.setResult(com.google.android.gms.common.api.Result)>
				return;
	//   17   36:return          
			}
	//*  18   37:aload           4
	//*  19   39:checkcast       #45  <Class zzbz>
	//*  20   42:astore          4
	//*  21   44:aload           4
	//*  22   46:getfield        #49  <Field zzby zzbz.zzuj>
	//*  23   49:astore          5
	//*  24   51:aload           5
	//*  25   53:ifnull          127
	//*  26   56:ldc1            #51  <String "1.0.0">
	//*  27   58:aload           5
	//*  28   60:invokevirtual   #57  <Method String zzby.getVersion()>
	//*  29   63:invokestatic    #62  <Method boolean zzcu.zza(Object, Object)>
	//*  30   66:ifne            127
	//*  31   69:aload_0         
	//*  32   70:getfield        #14  <Field zzbu zztr>
	//*  33   73:getfield        #65  <Field zzbl zzbu.zzth>
	//*  34   76:aconst_null     
	//*  35   77:invokestatic    #70  <Method zzby zzbl.zza(zzbl, zzby)>
	//*  36   80:pop             
	//*  37   81:aload_0         
	//*  38   82:getfield        #14  <Field zzbu zztr>
	//*  39   85:new             #28  <Class Status>
	//*  40   88:dup             
	//*  41   89:sipush          2150
	//*  42   92:getstatic       #76  <Field Locale Locale.ROOT>
	//*  43   95:ldc1            #78  <String "Incorrect Game Manager SDK version. Receiver: %s Sender: %s">
	//*  44   97:iconst_2        
	//*  45   98:anewarray       Object[]
	//*  46  101:dup             
	//*  47  102:iconst_0        
	//*  48  103:aload           5
	//*  49  105:invokevirtual   #57  <Method String zzby.getVersion()>
	//*  50  108:aastore         
	//*  51  109:dup             
	//*  52  110:iconst_1        
	//*  53  111:ldc1            #51  <String "1.0.0">
	//*  54  113:aastore         
	//*  55  114:invokestatic    #84  <Method String String.format(Locale, String, Object[])>
	//*  56  117:invokespecial   #87  <Method void Status(int, String)>
	//*  57  120:invokestatic    #91  <Method com.google.android.gms.cast.games.GameManagerClient$GameManagerInstanceResult zzbu.zzc(Status)>
	//*  58  123:invokevirtual   #43  <Method void zzbu.setResult(com.google.android.gms.common.api.Result)>
	//*  59  126:return          
	//*  60  127:aload_0         
	//*  61  128:getfield        #14  <Field zzbu zztr>
	//*  62  131:new             #26  <Class zzbw>
	//*  63  134:dup             
	//*  64  135:new             #28  <Class Status>
	//*  65  138:dup             
	//*  66  139:iload_3         
	//*  67  140:aload           4
	//*  68  142:getfield        #95  <Field String zzbz.zztz>
	//*  69  145:aconst_null     
	//*  70  146:invokespecial   #31  <Method void Status(int, String, android.app.PendingIntent)>
	//*  71  149:aload_0         
	//*  72  150:getfield        #14  <Field zzbu zztr>
	//*  73  153:invokestatic    #36  <Method com.google.android.gms.cast.games.GameManagerClient zzbu.zza(zzbu)>
	//*  74  156:invokespecial   #39  <Method void zzbw(Status, com.google.android.gms.cast.games.GameManagerClient)>
	//*  75  159:invokevirtual   #43  <Method void zzbu.setResult(com.google.android.gms.common.api.Result)>
	//*  76  162:return          
	//*  77  163:aload_0         
	//*  78  164:getfield        #14  <Field zzbu zztr>
	//*  79  167:new             #28  <Class Status>
	//*  80  170:dup             
	//*  81  171:bipush          13
	//*  82  173:invokespecial   #98  <Method void Status(int)>
	//*  83  176:invokestatic    #91  <Method com.google.android.gms.cast.games.GameManagerClient$GameManagerInstanceResult zzbu.zzc(Status)>
	//*  84  179:invokevirtual   #43  <Method void zzbu.setResult(com.google.android.gms.common.api.Result)>
	//*  85  182:return          
			// Misplaced declaration of an exception variable
			catch(Object obj)
			{
				zztr.setResult(((com.google.android.gms.common.api.Result) (zzbu.zzc(new Status(13)))));
			}
			break MISSING_BLOCK_LABEL_182;
		}
		obj = ((Object) ((zzbz)obj));
		zzby1 = ((zzbz) (obj)).zzuj;
		if(zzby1 == null)
			break MISSING_BLOCK_LABEL_127;
		if(!zzcu.zza("1.0.0", ((Object) (zzby1.getVersion()))))
		{
			zzbl.zza(zztr.zzth, ((zzby) (null)));
			zztr.setResult(((com.google.android.gms.common.api.Result) (zzbu.zzc(new Status(2150, String.format(Locale.ROOT, "Incorrect Game Manager SDK version. Receiver: %s Sender: %s", new Object[] {
				zzby1.getVersion(), "1.0.0"
			}))))));
			return;
		}
		zztr.setResult(((com.google.android.gms.common.api.Result) (new zzbw(new Status(i, ((zzbz) (obj)).zztz, ((android.app.PendingIntent) (null))), zzbu.zza(zztr)))));
		return;
	//*  86  183:astore          4
	//*  87  185:goto            163
	}

	public final void zzb(long l)
	{
		zztr.setResult(((com.google.android.gms.common.api.Result) (zzbu.zzc(new Status(2103)))));
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field zzbu zztr>
	//    2    4:new             #28  <Class Status>
	//    3    7:dup             
	//    4    8:sipush          2103
	//    5   11:invokespecial   #98  <Method void Status(int)>
	//    6   14:invokestatic    #91  <Method com.google.android.gms.cast.games.GameManagerClient$GameManagerInstanceResult zzbu.zzc(Status)>
	//    7   17:invokevirtual   #43  <Method void zzbu.setResult(com.google.android.gms.common.api.Result)>
	//    8   20:return          
	}

	private final zzbl zztn;
	private final zzbu zztr;
}
