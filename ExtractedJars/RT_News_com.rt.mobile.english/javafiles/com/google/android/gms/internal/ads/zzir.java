// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbfc, zzbfg, zzbez, zzis, 
//			zzia, zzbfa, zzbfi

public final class zzir extends zzbfc
{

	public zzir()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void zzbfc()>
		zzanq = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #19  <Field String zzanq>
		zzanr = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #21  <Field Integer zzanr>
		zzant = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #23  <Field zzis zzant>
		zzebk = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #27  <Field zzbfe zzebk>
		zzebt = -1;
	//   14   24:aload_0         
	//   15   25:iconst_m1       
	//   16   26:putfield        #31  <Field int zzebt>
	//   17   29:return          
	}

	public static zzir[] zzhs()
	{
		if(zzaop == null)
	//*   0    0:getstatic       #36  <Field zzir[] zzaop>
	//*   1    3:ifnonnull       35
			synchronized(zzbfg.zzebs)
	//*   2    6:getstatic       #42  <Field Object zzbfg.zzebs>
	//*   3    9:astore_0        
	//*   4   10:aload_0         
	//*   5   11:monitorenter    
			{
				if(zzaop == null)
	//*   6   12:getstatic       #36  <Field zzir[] zzaop>
	//*   7   15:ifnonnull       25
					zzaop = new zzir[0];
	//    8   18:iconst_0        
	//    9   19:anewarray       zzir[]
	//   10   22:putstatic       #36  <Field zzir[] zzaop>
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
		return zzaop;
	//   19   35:getstatic       #36  <Field zzir[] zzaop>
	//   20   38:areturn         
	}

	private final zzir zzr(zzbez zzbez1)
		throws IOException
	{
		IllegalArgumentException illegalargumentexception;
		do
		{
			int i = zzbez1.zzabk();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #54  <Method int zzbez.zzabk()>
	//    2    4:istore_2        
			if(i == 0)
				break;
	//    3    5:iload_2         
	//    4    6:ifeq            115
			if(i != 10)
	//*   5    9:iload_2         
	//*   6   10:bipush          10
	//*   7   12:icmpeq          104
			{
				if(i != 16)
	//*   8   15:iload_2         
	//*   9   16:bipush          16
	//*  10   18:icmpeq          67
				{
					if(i != 26)
	//*  11   21:iload_2         
	//*  12   22:bipush          26
	//*  13   24:icmpeq          38
					{
						if(!super.zza(zzbez1, i))
	//*  14   27:aload_0         
	//*  15   28:aload_1         
	//*  16   29:iload_2         
	//*  17   30:invokespecial   #58  <Method boolean zzbfc.zza(zzbez, int)>
	//*  18   33:ifne            0
							return this;
	//   19   36:aload_0         
	//   20   37:areturn         
					} else
					{
						if(zzant == null)
	//*  21   38:aload_0         
	//*  22   39:getfield        #23  <Field zzis zzant>
	//*  23   42:ifnonnull       56
							zzant = new zzis();
	//   24   45:aload_0         
	//   25   46:new             #60  <Class zzis>
	//   26   49:dup             
	//   27   50:invokespecial   #61  <Method void zzis()>
	//   28   53:putfield        #23  <Field zzis zzant>
						zzbez1.zza(((zzbfi) (zzant)));
	//   29   56:aload_1         
	//   30   57:aload_0         
	//   31   58:getfield        #23  <Field zzis zzant>
	//   32   61:invokevirtual   #64  <Method void zzbez.zza(zzbfi)>
					}
				} else
	//*  33   64:goto            0
				{
					int j = zzbez1.getPosition();
	//   34   67:aload_1         
	//   35   68:invokevirtual   #67  <Method int zzbez.getPosition()>
	//   36   71:istore_3        
					try
					{
						zzanr = Integer.valueOf(zzia.zzd(zzbez1.zzacc()));
	//   37   72:aload_0         
	//   38   73:aload_1         
	//   39   74:invokevirtual   #70  <Method int zzbez.zzacc()>
	//   40   77:invokestatic    #76  <Method int zzia.zzd(int)>
	//   41   80:invokestatic    #82  <Method Integer Integer.valueOf(int)>
	//   42   83:putfield        #21  <Field Integer zzanr>
					}
	//*  43   86:goto            0
	//*  44   89:aload_1         
	//*  45   90:iload_3         
	//*  46   91:invokevirtual   #86  <Method void zzbez.zzdc(int)>
	//*  47   94:aload_0         
	//*  48   95:aload_1         
	//*  49   96:iload_2         
	//*  50   97:invokevirtual   #58  <Method boolean zzbfc.zza(zzbez, int)>
	//*  51  100:pop             
	//*  52  101:goto            0
	//*  53  104:aload_0         
	//*  54  105:aload_1         
	//*  55  106:invokevirtual   #90  <Method String zzbez.readString()>
	//*  56  109:putfield        #19  <Field String zzanq>
	//*  57  112:goto            0
	//*  58  115:aload_0         
	//*  59  116:areturn         
					// Misplaced declaration of an exception variable
					catch(IllegalArgumentException illegalargumentexception)
					{
						zzbez1.zzdc(j);
						((zzbfc)this).zza(zzbez1, i);
					}
				}
			} else
			{
				zzanq = zzbez1.readString();
			}
		} while(true);
		return this;
	//*  60  117:astore          4
	//*  61  119:goto            89
	}

	public final zzbfi zza(zzbez zzbez1)
		throws IOException
	{
		return ((zzbfi) (zzr(zzbez1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #94  <Method zzir zzr(zzbez)>
	//    3    5:areturn         
	}

	public final void zza(zzbfa zzbfa1)
		throws IOException
	{
		if(zzanq != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field String zzanq>
	//*   2    4:ifnull          16
			zzbfa1.zzf(1, zzanq);
	//    3    7:aload_1         
	//    4    8:iconst_1        
	//    5    9:aload_0         
	//    6   10:getfield        #19  <Field String zzanq>
	//    7   13:invokevirtual   #101 <Method void zzbfa.zzf(int, String)>
		if(zzanr != null)
	//*   8   16:aload_0         
	//*   9   17:getfield        #21  <Field Integer zzanr>
	//*  10   20:ifnull          35
			zzbfa1.zzm(2, zzanr.intValue());
	//   11   23:aload_1         
	//   12   24:iconst_2        
	//   13   25:aload_0         
	//   14   26:getfield        #21  <Field Integer zzanr>
	//   15   29:invokevirtual   #104 <Method int Integer.intValue()>
	//   16   32:invokevirtual   #108 <Method void zzbfa.zzm(int, int)>
		if(zzant != null)
	//*  17   35:aload_0         
	//*  18   36:getfield        #23  <Field zzis zzant>
	//*  19   39:ifnull          51
			zzbfa1.zza(3, ((zzbfi) (zzant)));
	//   20   42:aload_1         
	//   21   43:iconst_3        
	//   22   44:aload_0         
	//   23   45:getfield        #23  <Field zzis zzant>
	//   24   48:invokevirtual   #111 <Method void zzbfa.zza(int, zzbfi)>
		super.zza(zzbfa1);
	//   25   51:aload_0         
	//   26   52:aload_1         
	//   27   53:invokespecial   #113 <Method void zzbfc.zza(zzbfa)>
	//   28   56:return          
	}

	protected final int zzr()
	{
		int j = super.zzr();
	//    0    0:aload_0         
	//    1    1:invokespecial   #115 <Method int zzbfc.zzr()>
	//    2    4:istore_2        
		int i = j;
	//    3    5:iload_2         
	//    4    6:istore_1        
		if(zzanq != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #19  <Field String zzanq>
	//*   7   11:ifnull          25
			i = j + zzbfa.zzg(1, zzanq);
	//    8   14:iload_2         
	//    9   15:iconst_1        
	//   10   16:aload_0         
	//   11   17:getfield        #19  <Field String zzanq>
	//   12   20:invokestatic    #119 <Method int zzbfa.zzg(int, String)>
	//   13   23:iadd            
	//   14   24:istore_1        
		j = i;
	//   15   25:iload_1         
	//   16   26:istore_2        
		if(zzanr != null)
	//*  17   27:aload_0         
	//*  18   28:getfield        #21  <Field Integer zzanr>
	//*  19   31:ifnull          48
			j = i + zzbfa.zzq(2, zzanr.intValue());
	//   20   34:iload_1         
	//   21   35:iconst_2        
	//   22   36:aload_0         
	//   23   37:getfield        #21  <Field Integer zzanr>
	//   24   40:invokevirtual   #104 <Method int Integer.intValue()>
	//   25   43:invokestatic    #123 <Method int zzbfa.zzq(int, int)>
	//   26   46:iadd            
	//   27   47:istore_2        
		i = j;
	//   28   48:iload_2         
	//   29   49:istore_1        
		if(zzant != null)
	//*  30   50:aload_0         
	//*  31   51:getfield        #23  <Field zzis zzant>
	//*  32   54:ifnull          68
			i = j + zzbfa.zzb(3, ((zzbfi) (zzant)));
	//   33   57:iload_2         
	//   34   58:iconst_3        
	//   35   59:aload_0         
	//   36   60:getfield        #23  <Field zzis zzant>
	//   37   63:invokestatic    #127 <Method int zzbfa.zzb(int, zzbfi)>
	//   38   66:iadd            
	//   39   67:istore_1        
		return i;
	//   40   68:iload_1         
	//   41   69:ireturn         
	}

	private static volatile zzir zzaop[];
	private String zzanq;
	private Integer zzanr;
	private zzis zzant;
}
