// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbfc, zzbfg, zzbez, zzbfa, 
//			zzbfi

public final class zzbfo extends zzbfc
{

	public zzbfo()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void zzbfc()>
		zzecx = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #16  <Field byte[] zzecx>
		zzecy = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #18  <Field byte[] zzecy>
		zzebk = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #22  <Field zzbfe zzebk>
		zzebt = -1;
	//   11   19:aload_0         
	//   12   20:iconst_m1       
	//   13   21:putfield        #26  <Field int zzebt>
	//   14   24:return          
	}

	public static zzbfo[] zzagt()
	{
		if(zzecw == null)
	//*   0    0:getstatic       #31  <Field zzbfo[] zzecw>
	//*   1    3:ifnonnull       35
			synchronized(zzbfg.zzebs)
	//*   2    6:getstatic       #37  <Field Object zzbfg.zzebs>
	//*   3    9:astore_0        
	//*   4   10:aload_0         
	//*   5   11:monitorenter    
			{
				if(zzecw == null)
	//*   6   12:getstatic       #31  <Field zzbfo[] zzecw>
	//*   7   15:ifnonnull       25
					zzecw = new zzbfo[0];
	//    8   18:iconst_0        
	//    9   19:anewarray       zzbfo[]
	//   10   22:putstatic       #31  <Field zzbfo[] zzecw>
			}
	//   11   25:aload_0         
	//   12   26:monitorexit     
		break MISSING_BLOCK_LABEL_35;
	//   13   27:goto            35
		exception;
	//   14   30:astore_1        
		obj;
	//   15   31:aload_0         
		JVM INSTR monitorexit ;
	//   16   32:monitorexit     
		throw exception;
	//   17   33:aload_1         
	//   18   34:athrow          
		return zzecw;
	//   19   35:getstatic       #31  <Field zzbfo[] zzecw>
	//   20   38:areturn         
	}

	public final zzbfi zza(zzbez zzbez1)
		throws IOException
	{
		do
		{
			int i = zzbez1.zzabk();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #47  <Method int zzbez.zzabk()>
	//    2    4:istore_2        
			if(i == 0)
				break;
	//    3    5:iload_2         
	//    4    6:ifeq            54
			if(i != 10)
	//*   5    9:iload_2         
	//*   6   10:bipush          10
	//*   7   12:icmpeq          43
			{
				if(i != 18)
	//*   8   15:iload_2         
	//*   9   16:bipush          18
	//*  10   18:icmpeq          32
				{
					if(!super.zza(zzbez1, i))
	//*  11   21:aload_0         
	//*  12   22:aload_1         
	//*  13   23:iload_2         
	//*  14   24:invokespecial   #50  <Method boolean zzbfc.zza(zzbez, int)>
	//*  15   27:ifne            0
						return ((zzbfi) (this));
	//   16   30:aload_0         
	//   17   31:areturn         
				} else
				{
					zzecy = zzbez1.readBytes();
	//   18   32:aload_0         
	//   19   33:aload_1         
	//   20   34:invokevirtual   #54  <Method byte[] zzbez.readBytes()>
	//   21   37:putfield        #18  <Field byte[] zzecy>
				}
			} else
	//*  22   40:goto            0
			{
				zzecx = zzbez1.readBytes();
	//   23   43:aload_0         
	//   24   44:aload_1         
	//   25   45:invokevirtual   #54  <Method byte[] zzbez.readBytes()>
	//   26   48:putfield        #16  <Field byte[] zzecx>
			}
		} while(true);
	//   27   51:goto            0
		return ((zzbfi) (this));
	//   28   54:aload_0         
	//   29   55:areturn         
	}

	public final void zza(zzbfa zzbfa1)
		throws IOException
	{
		zzbfa1.zza(1, zzecx);
	//    0    0:aload_1         
	//    1    1:iconst_1        
	//    2    2:aload_0         
	//    3    3:getfield        #16  <Field byte[] zzecx>
	//    4    6:invokevirtual   #61  <Method void zzbfa.zza(int, byte[])>
		if(zzecy != null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #18  <Field byte[] zzecy>
	//*   7   13:ifnull          25
			zzbfa1.zza(2, zzecy);
	//    8   16:aload_1         
	//    9   17:iconst_2        
	//   10   18:aload_0         
	//   11   19:getfield        #18  <Field byte[] zzecy>
	//   12   22:invokevirtual   #61  <Method void zzbfa.zza(int, byte[])>
		super.zza(zzbfa1);
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:invokespecial   #63  <Method void zzbfc.zza(zzbfa)>
	//   16   30:return          
	}

	protected final int zzr()
	{
		int j = super.zzr() + zzbfa.zzb(1, zzecx);
	//    0    0:aload_0         
	//    1    1:invokespecial   #66  <Method int zzbfc.zzr()>
	//    2    4:iconst_1        
	//    3    5:aload_0         
	//    4    6:getfield        #16  <Field byte[] zzecx>
	//    5    9:invokestatic    #70  <Method int zzbfa.zzb(int, byte[])>
	//    6   12:iadd            
	//    7   13:istore_2        
		int i = j;
	//    8   14:iload_2         
	//    9   15:istore_1        
		if(zzecy != null)
	//*  10   16:aload_0         
	//*  11   17:getfield        #18  <Field byte[] zzecy>
	//*  12   20:ifnull          34
			i = j + zzbfa.zzb(2, zzecy);
	//   13   23:iload_2         
	//   14   24:iconst_2        
	//   15   25:aload_0         
	//   16   26:getfield        #18  <Field byte[] zzecy>
	//   17   29:invokestatic    #70  <Method int zzbfa.zzb(int, byte[])>
	//   18   32:iadd            
	//   19   33:istore_1        
		return i;
	//   20   34:iload_1         
	//   21   35:ireturn         
	}

	private static volatile zzbfo zzecw[];
	public byte zzecx[];
	public byte zzecy[];
}
