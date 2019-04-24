// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//			zzbxn, zzbxz, zzbxr, zzbxm, 
//			zzbxl, zzbxt

public static final class zzbxz$zza extends zzbxn
{

	public static zzbxz$zza[] zzafi()
	{
		if(zzcvO != null)
			break MISSING_BLOCK_LABEL_35;
	//    0    0:getstatic       #25  <Field zzbxz$zza[] zzcvO>
	//    1    3:ifnonnull       35
		Object obj = zzbxr.zzcuQ;
	//    2    6:getstatic       #31  <Field Object zzbxr.zzcuQ>
	//    3    9:astore_0        
		obj;
	//    4   10:aload_0         
		JVM INSTR monitorenter ;
	//    5   11:monitorenter    
		if(zzcvO == null)
	//*   6   12:getstatic       #25  <Field zzbxz$zza[] zzcvO>
	//*   7   15:ifnonnull       25
			zzcvO = new zzbxz$zza[0];
	//    8   18:iconst_0        
	//    9   19:anewarray       zzbxz$zza[]
	//   10   22:putstatic       #25  <Field zzbxz$zza[] zzcvO>
		obj;
	//   11   25:aload_0         
		JVM INSTR monitorexit ;
	//   12   26:monitorexit     
		break MISSING_BLOCK_LABEL_35;
	//   13   27:goto            35
		Exception exception;
		exception;
	//   14   30:astore_1        
	//*  15   31:aload_0         
		throw exception;
	//   16   32:monitorexit     
	//   17   33:aload_1         
	//   18   34:athrow          
		return zzcvO;
	//   19   35:getstatic       #25  <Field zzbxz$zza[] zzcvO>
	//   20   38:areturn         
	}

	public void zza(zzbxm zzbxm1)
		throws IOException
	{
		if(zzcvP != null && !zzcvP.equals(""))
	//*   0    0:aload_0         
	//*   1    1:getfield        #36  <Field String zzcvP>
	//*   2    4:ifnull          28
	//*   3    7:aload_0         
	//*   4    8:getfield        #36  <Field String zzcvP>
	//*   5   11:ldc1            #38  <String "">
	//*   6   13:invokevirtual   #44  <Method boolean String.equals(Object)>
	//*   7   16:ifne            28
			zzbxm1.zzq(1, zzcvP);
	//    8   19:aload_1         
	//    9   20:iconst_1        
	//   10   21:aload_0         
	//   11   22:getfield        #36  <Field String zzcvP>
	//   12   25:invokevirtual   #50  <Method void zzbxm.zzq(int, String)>
		super.zza(zzbxm1);
	//   13   28:aload_0         
	//   14   29:aload_1         
	//   15   30:invokespecial   #52  <Method void zzbxn.zza(zzbxm)>
	//   16   33:return          
	}

	public zzbxz$zza zzaV(zzbxl zzbxl1)
		throws IOException
	{
		do
		{
			int i = zzbxl1.zzaeo();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #61  <Method int zzbxl.zzaeo()>
	//    2    4:istore_2        
			switch(i)
	//*   3    5:iload_2         
			{
	//*   4    6:lookupswitch    2: default 32
	//	               0: 35
	//	               10: 48
	//*   5   32:goto            37
			case 0: // '\0'
				return this;
	//    6   35:aload_0         
	//    7   36:areturn         

			default:
				if(!super.zza(zzbxl1, i))
	//*   8   37:aload_0         
	//*   9   38:aload_1         
	//*  10   39:iload_2         
	//*  11   40:invokespecial   #64  <Method boolean zzbxn.zza(zzbxl, int)>
	//*  12   43:ifne            56
					return this;
	//   13   46:aload_0         
	//   14   47:areturn         
				break;

			case 10: // '\n'
				zzcvP = zzbxl1.readString();
	//   15   48:aload_0         
	//   16   49:aload_1         
	//   17   50:invokevirtual   #68  <Method String zzbxl.readString()>
	//   18   53:putfield        #36  <Field String zzcvP>
				break;
			}
		} while(true);
	//   19   56:goto            0
	}

	public zzbxz$zza zzafj()
	{
		zzcvP = "";
	//    0    0:aload_0         
	//    1    1:ldc1            #38  <String "">
	//    2    3:putfield        #36  <Field String zzcvP>
		zzcuI = null;
	//    3    6:aload_0         
	//    4    7:aconst_null     
	//    5    8:putfield        #72  <Field zzbxp zzcuI>
		zzcuR = -1;
	//    6   11:aload_0         
	//    7   12:iconst_m1       
	//    8   13:putfield        #76  <Field int zzcuR>
		return this;
	//    9   16:aload_0         
	//   10   17:areturn         
	}

	public zzbxt zzb(zzbxl zzbxl1)
		throws IOException
	{
		return ((zzbxt) (zzaV(zzbxl1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #80  <Method zzbxz$zza zzaV(zzbxl)>
	//    3    5:areturn         
	}

	protected int zzu()
	{
		int j = super.zzu();
	//    0    0:aload_0         
	//    1    1:invokespecial   #83  <Method int zzbxn.zzu()>
	//    2    4:istore_2        
		int i = j;
	//    3    5:iload_2         
	//    4    6:istore_1        
		if(zzcvP != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #36  <Field String zzcvP>
	//*   7   11:ifnull          39
		{
			i = j;
	//    8   14:iload_2         
	//    9   15:istore_1        
			if(!zzcvP.equals(""))
	//*  10   16:aload_0         
	//*  11   17:getfield        #36  <Field String zzcvP>
	//*  12   20:ldc1            #38  <String "">
	//*  13   22:invokevirtual   #44  <Method boolean String.equals(Object)>
	//*  14   25:ifne            39
				i = j + zzbxm.zzr(1, zzcvP);
	//   15   28:iload_2         
	//   16   29:iconst_1        
	//   17   30:aload_0         
	//   18   31:getfield        #36  <Field String zzcvP>
	//   19   34:invokestatic    #87  <Method int zzbxm.zzr(int, String)>
	//   20   37:iadd            
	//   21   38:istore_1        
		}
		return i;
	//   22   39:iload_1         
	//   23   40:ireturn         
	}

	private static volatile zzbxz$zza zzcvO[];
	public String zzcvP;

	public zzbxz$zza()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void zzbxn()>
		zzafj();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #20  <Method zzbxz$zza zzafj()>
	//    4    8:pop             
	//    5    9:return          
	}
}
