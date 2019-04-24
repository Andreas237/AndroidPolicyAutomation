// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbfc, zzbfg, zzbez, zzbfa, 
//			zzbfi

public final class zzis extends zzbfc
{

	public zzis()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void zzbfc()>
		zzaor = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #16  <Field Integer zzaor>
		zzaos = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #18  <Field Integer zzaos>
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

	public static zzis[] zzht()
	{
		if(zzaoq == null)
	//*   0    0:getstatic       #31  <Field zzis[] zzaoq>
	//*   1    3:ifnonnull       35
			synchronized(zzbfg.zzebs)
	//*   2    6:getstatic       #37  <Field Object zzbfg.zzebs>
	//*   3    9:astore_0        
	//*   4   10:aload_0         
	//*   5   11:monitorenter    
			{
				if(zzaoq == null)
	//*   6   12:getstatic       #31  <Field zzis[] zzaoq>
	//*   7   15:ifnonnull       25
					zzaoq = new zzis[0];
	//    8   18:iconst_0        
	//    9   19:anewarray       zzis[]
	//   10   22:putstatic       #31  <Field zzis[] zzaoq>
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
		return zzaoq;
	//   19   35:getstatic       #31  <Field zzis[] zzaoq>
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
	//    4    6:ifeq            60
			if(i != 8)
	//*   5    9:iload_2         
	//*   6   10:bipush          8
	//*   7   12:icmpeq          46
			{
				if(i != 16)
	//*   8   15:iload_2         
	//*   9   16:bipush          16
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
					zzaos = Integer.valueOf(zzbez1.zzacc());
	//   18   32:aload_0         
	//   19   33:aload_1         
	//   20   34:invokevirtual   #53  <Method int zzbez.zzacc()>
	//   21   37:invokestatic    #59  <Method Integer Integer.valueOf(int)>
	//   22   40:putfield        #18  <Field Integer zzaos>
				}
			} else
	//*  23   43:goto            0
			{
				zzaor = Integer.valueOf(zzbez1.zzacc());
	//   24   46:aload_0         
	//   25   47:aload_1         
	//   26   48:invokevirtual   #53  <Method int zzbez.zzacc()>
	//   27   51:invokestatic    #59  <Method Integer Integer.valueOf(int)>
	//   28   54:putfield        #16  <Field Integer zzaor>
			}
		} while(true);
	//   29   57:goto            0
		return ((zzbfi) (this));
	//   30   60:aload_0         
	//   31   61:areturn         
	}

	public final void zza(zzbfa zzbfa1)
		throws IOException
	{
		if(zzaor != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field Integer zzaor>
	//*   2    4:ifnull          19
			zzbfa1.zzm(1, zzaor.intValue());
	//    3    7:aload_1         
	//    4    8:iconst_1        
	//    5    9:aload_0         
	//    6   10:getfield        #16  <Field Integer zzaor>
	//    7   13:invokevirtual   #64  <Method int Integer.intValue()>
	//    8   16:invokevirtual   #70  <Method void zzbfa.zzm(int, int)>
		if(zzaos != null)
	//*   9   19:aload_0         
	//*  10   20:getfield        #18  <Field Integer zzaos>
	//*  11   23:ifnull          38
			zzbfa1.zzm(2, zzaos.intValue());
	//   12   26:aload_1         
	//   13   27:iconst_2        
	//   14   28:aload_0         
	//   15   29:getfield        #18  <Field Integer zzaos>
	//   16   32:invokevirtual   #64  <Method int Integer.intValue()>
	//   17   35:invokevirtual   #70  <Method void zzbfa.zzm(int, int)>
		super.zza(zzbfa1);
	//   18   38:aload_0         
	//   19   39:aload_1         
	//   20   40:invokespecial   #72  <Method void zzbfc.zza(zzbfa)>
	//   21   43:return          
	}

	protected final int zzr()
	{
		int j = super.zzr();
	//    0    0:aload_0         
	//    1    1:invokespecial   #75  <Method int zzbfc.zzr()>
	//    2    4:istore_2        
		int i = j;
	//    3    5:iload_2         
	//    4    6:istore_1        
		if(zzaor != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #16  <Field Integer zzaor>
	//*   7   11:ifnull          28
			i = j + zzbfa.zzq(1, zzaor.intValue());
	//    8   14:iload_2         
	//    9   15:iconst_1        
	//   10   16:aload_0         
	//   11   17:getfield        #16  <Field Integer zzaor>
	//   12   20:invokevirtual   #64  <Method int Integer.intValue()>
	//   13   23:invokestatic    #79  <Method int zzbfa.zzq(int, int)>
	//   14   26:iadd            
	//   15   27:istore_1        
		j = i;
	//   16   28:iload_1         
	//   17   29:istore_2        
		if(zzaos != null)
	//*  18   30:aload_0         
	//*  19   31:getfield        #18  <Field Integer zzaos>
	//*  20   34:ifnull          51
			j = i + zzbfa.zzq(2, zzaos.intValue());
	//   21   37:iload_1         
	//   22   38:iconst_2        
	//   23   39:aload_0         
	//   24   40:getfield        #18  <Field Integer zzaos>
	//   25   43:invokevirtual   #64  <Method int Integer.intValue()>
	//   26   46:invokestatic    #79  <Method int zzbfa.zzq(int, int)>
	//   27   49:iadd            
	//   28   50:istore_2        
		return j;
	//   29   51:iload_2         
	//   30   52:ireturn         
	}

	private static volatile zzis zzaoq[];
	private Integer zzaor;
	private Integer zzaos;
}
