// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import java.io.*;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//			zzv, zzs

static class zzv$zza
{

	public static zzv$zza zzf(InputStream inputstream)
		throws IOException
	{
		zzv$zza zzv$zza1 = new zzv$zza();
	//    0    0:new             #2   <Class zzv$zza>
	//    1    3:dup             
	//    2    4:invokespecial   #56  <Method void zzv$zza()>
	//    3    7:astore_1        
		if(zzv.zzb(inputstream) != 0x20150306)
	//*   4    8:aload_0         
	//*   5    9:invokestatic    #59  <Method int zzv.zzb(InputStream)>
	//*   6   12:ldc1            #60  <Int 0x20150306>
	//*   7   14:icmpeq          25
			throw new IOException();
	//    8   17:new             #55  <Class IOException>
	//    9   20:dup             
	//   10   21:invokespecial   #61  <Method void IOException()>
	//   11   24:athrow          
		zzv$zza1.zzaA = zzv.zzd(inputstream);
	//   12   25:aload_1         
	//   13   26:aload_0         
	//   14   27:invokestatic    #64  <Method String zzv.zzd(InputStream)>
	//   15   30:putfield        #26  <Field String zzaA>
		zzv$zza1.zza = zzv.zzd(inputstream);
	//   16   33:aload_1         
	//   17   34:aload_0         
	//   18   35:invokestatic    #64  <Method String zzv.zzd(InputStream)>
	//   19   38:putfield        #37  <Field String zza>
		if(zzv$zza1.zza.equals(""))
	//*  20   41:aload_1         
	//*  21   42:getfield        #37  <Field String zza>
	//*  22   45:ldc1            #66  <String "">
	//*  23   47:invokevirtual   #72  <Method boolean String.equals(Object)>
	//*  24   50:ifeq            58
			zzv$zza1.zza = null;
	//   25   53:aload_1         
	//   26   54:aconst_null     
	//   27   55:putfield        #37  <Field String zza>
		zzv$zza1.zzb = zzv.zzc(inputstream);
	//   28   58:aload_1         
	//   29   59:aload_0         
	//   30   60:invokestatic    #75  <Method long zzv.zzc(InputStream)>
	//   31   63:putfield        #40  <Field long zzb>
		zzv$zza1.zzc = zzv.zzc(inputstream);
	//   32   66:aload_1         
	//   33   67:aload_0         
	//   34   68:invokestatic    #75  <Method long zzv.zzc(InputStream)>
	//   35   71:putfield        #43  <Field long zzc>
		zzv$zza1.zzd = zzv.zzc(inputstream);
	//   36   74:aload_1         
	//   37   75:aload_0         
	//   38   76:invokestatic    #75  <Method long zzv.zzc(InputStream)>
	//   39   79:putfield        #46  <Field long zzd>
		zzv$zza1.zze = zzv.zzc(inputstream);
	//   40   82:aload_1         
	//   41   83:aload_0         
	//   42   84:invokestatic    #75  <Method long zzv.zzc(InputStream)>
	//   43   87:putfield        #49  <Field long zze>
		zzv$zza1.zzf = zzv.zze(inputstream);
	//   44   90:aload_1         
	//   45   91:aload_0         
	//   46   92:invokestatic    #78  <Method Map zzv.zze(InputStream)>
	//   47   95:putfield        #52  <Field Map zzf>
		return zzv$zza1;
	//   48   98:aload_1         
	//   49   99:areturn         
	}

	public boolean zza(OutputStream outputstream)
	{
		zzv.zza(outputstream, 0x20150306);
	//    0    0:aload_1         
	//    1    1:ldc1            #60  <Int 0x20150306>
	//    2    3:invokestatic    #83  <Method void zzv.zza(OutputStream, int)>
		zzv.zza(outputstream, zzaA);
	//    3    6:aload_1         
	//    4    7:aload_0         
	//    5    8:getfield        #26  <Field String zzaA>
	//    6   11:invokestatic    #86  <Method void zzv.zza(OutputStream, String)>
		if(zza != null)
			break MISSING_BLOCK_LABEL_75;
	//    7   14:aload_0         
	//    8   15:getfield        #37  <Field String zza>
	//    9   18:ifnonnull       75
		String s = "";
	//   10   21:ldc1            #66  <String "">
	//   11   23:astore_2        
_L1:
		try
		{
			zzv.zza(outputstream, s);
	//   12   24:aload_1         
	//   13   25:aload_2         
	//   14   26:invokestatic    #86  <Method void zzv.zza(OutputStream, String)>
			zzv.zza(outputstream, zzb);
	//   15   29:aload_1         
	//   16   30:aload_0         
	//   17   31:getfield        #40  <Field long zzb>
	//   18   34:invokestatic    #89  <Method void zzv.zza(OutputStream, long)>
			zzv.zza(outputstream, zzc);
	//   19   37:aload_1         
	//   20   38:aload_0         
	//   21   39:getfield        #43  <Field long zzc>
	//   22   42:invokestatic    #89  <Method void zzv.zza(OutputStream, long)>
			zzv.zza(outputstream, zzd);
	//   23   45:aload_1         
	//   24   46:aload_0         
	//   25   47:getfield        #46  <Field long zzd>
	//   26   50:invokestatic    #89  <Method void zzv.zza(OutputStream, long)>
			zzv.zza(outputstream, zze);
	//   27   53:aload_1         
	//   28   54:aload_0         
	//   29   55:getfield        #49  <Field long zze>
	//   30   58:invokestatic    #89  <Method void zzv.zza(OutputStream, long)>
			zzv.zza(zzf, outputstream);
	//   31   61:aload_0         
	//   32   62:getfield        #52  <Field Map zzf>
	//   33   65:aload_1         
	//   34   66:invokestatic    #92  <Method void zzv.zza(Map, OutputStream)>
			outputstream.flush();
	//   35   69:aload_1         
	//   36   70:invokevirtual   #97  <Method void OutputStream.flush()>
		}
	//*  37   73:iconst_1        
	//*  38   74:ireturn         
	//*  39   75:aload_0         
	//*  40   76:getfield        #37  <Field String zza>
	//*  41   79:astore_2        
	//*  42   80:goto            24
		// Misplaced declaration of an exception variable
		catch(OutputStream outputstream)
	//*  43   83:astore_1        
		{
			zzs.zzb("%s", new Object[] {
				((IOException) (outputstream)).toString()
			});
	//   44   84:ldc1            #99  <String "%s">
	//   45   86:iconst_1        
	//   46   87:anewarray       Object[]
	//   47   90:dup             
	//   48   91:iconst_0        
	//   49   92:aload_1         
	//   50   93:invokevirtual   #103 <Method String IOException.toString()>
	//   51   96:aastore         
	//   52   97:invokestatic    #108 <Method void zzs.zzb(String, Object[])>
			return false;
	//   53  100:iconst_0        
	//   54  101:ireturn         
		}
		return true;
		s = zza;
		  goto _L1
	}

	public zzb$zza zzb(byte abyte0[])
	{
		zzb$zza zzb$zza1 = new zzb$zza();
	//    0    0:new             #28  <Class zzb$zza>
	//    1    3:dup             
	//    2    4:invokespecial   #110 <Method void zzb$zza()>
	//    3    7:astore_2        
		zzb$zza1.data = abyte0;
	//    4    8:aload_2         
	//    5    9:aload_1         
	//    6   10:putfield        #32  <Field byte[] zzb$zza.data>
		zzb$zza1.zza = zza;
	//    7   13:aload_2         
	//    8   14:aload_0         
	//    9   15:getfield        #37  <Field String zza>
	//   10   18:putfield        #36  <Field String zzb$zza.zza>
		zzb$zza1.zzb = zzb;
	//   11   21:aload_2         
	//   12   22:aload_0         
	//   13   23:getfield        #40  <Field long zzb>
	//   14   26:putfield        #39  <Field long zzb$zza.zzb>
		zzb$zza1.zzc = zzc;
	//   15   29:aload_2         
	//   16   30:aload_0         
	//   17   31:getfield        #43  <Field long zzc>
	//   18   34:putfield        #42  <Field long zzb$zza.zzc>
		zzb$zza1.zzd = zzd;
	//   19   37:aload_2         
	//   20   38:aload_0         
	//   21   39:getfield        #46  <Field long zzd>
	//   22   42:putfield        #45  <Field long zzb$zza.zzd>
		zzb$zza1.zze = zze;
	//   23   45:aload_2         
	//   24   46:aload_0         
	//   25   47:getfield        #49  <Field long zze>
	//   26   50:putfield        #48  <Field long zzb$zza.zze>
		zzb$zza1.zzf = zzf;
	//   27   53:aload_2         
	//   28   54:aload_0         
	//   29   55:getfield        #52  <Field Map zzf>
	//   30   58:putfield        #51  <Field Map zzb$zza.zzf>
		return zzb$zza1;
	//   31   61:aload_2         
	//   32   62:areturn         
	}

	public String zza;
	public String zzaA;
	public long zzaz;
	public long zzb;
	public long zzc;
	public long zzd;
	public long zze;
	public Map zzf;

	private zzv$zza()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
	//    2    4:return          
	}

	public zzv$zza(String s, zzb$zza zzb$zza1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		zzaA = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #26  <Field String zzaA>
		zzaz = zzb$zza1.data.length;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:getfield        #32  <Field byte[] zzb$zza.data>
	//    8   14:arraylength     
	//    9   15:i2l             
	//   10   16:putfield        #34  <Field long zzaz>
		zza = zzb$zza1.zza;
	//   11   19:aload_0         
	//   12   20:aload_2         
	//   13   21:getfield        #36  <Field String zzb$zza.zza>
	//   14   24:putfield        #37  <Field String zza>
		zzb = zzb$zza1.zzb;
	//   15   27:aload_0         
	//   16   28:aload_2         
	//   17   29:getfield        #39  <Field long zzb$zza.zzb>
	//   18   32:putfield        #40  <Field long zzb>
		zzc = zzb$zza1.zzc;
	//   19   35:aload_0         
	//   20   36:aload_2         
	//   21   37:getfield        #42  <Field long zzb$zza.zzc>
	//   22   40:putfield        #43  <Field long zzc>
		zzd = zzb$zza1.zzd;
	//   23   43:aload_0         
	//   24   44:aload_2         
	//   25   45:getfield        #45  <Field long zzb$zza.zzd>
	//   26   48:putfield        #46  <Field long zzd>
		zze = zzb$zza1.zze;
	//   27   51:aload_0         
	//   28   52:aload_2         
	//   29   53:getfield        #48  <Field long zzb$zza.zze>
	//   30   56:putfield        #49  <Field long zze>
		zzf = zzb$zza1.zzf;
	//   31   59:aload_0         
	//   32   60:aload_2         
	//   33   61:getfield        #51  <Field Map zzb$zza.zzf>
	//   34   64:putfield        #52  <Field Map zzf>
	//   35   67:return          
	}
}
