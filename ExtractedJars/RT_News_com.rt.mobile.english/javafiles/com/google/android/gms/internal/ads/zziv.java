// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbfc, zzbez, zzis, zziw, 
//			zzia, zzbfa, zzbfi

public final class zziv extends zzbfc
{

	public zziv()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void zzbfc()>
		zzanu = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #17  <Field Integer zzanu>
		zzapn = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #19  <Field zziw zzapn>
		zzapo = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #21  <Field zzis zzapo>
		zzebk = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #25  <Field zzbfe zzebk>
		zzebt = -1;
	//   14   24:aload_0         
	//   15   25:iconst_m1       
	//   16   26:putfield        #29  <Field int zzebt>
	//   17   29:return          
	}

	private final zziv zzs(zzbez zzbez1)
		throws IOException
	{
		IllegalArgumentException illegalargumentexception;
		do
		{
			int i = zzbez1.zzabk();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #42  <Method int zzbez.zzabk()>
	//    2    4:istore_2        
			if(i == 0)
				break;
	//    3    5:iload_2         
	//    4    6:ifeq            135
			if(i != 8)
	//*   5    9:iload_2         
	//*   6   10:bipush          8
	//*   7   12:icmpeq          98
			{
				Object obj;
				if(i != 18)
	//*   8   15:iload_2         
	//*   9   16:bipush          18
	//*  10   18:icmpeq          65
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
	//*  17   30:invokespecial   #46  <Method boolean zzbfc.zza(zzbez, int)>
	//*  18   33:ifne            0
							return this;
	//   19   36:aload_0         
	//   20   37:areturn         
						continue;
					}
					if(zzapo == null)
	//*  21   38:aload_0         
	//*  22   39:getfield        #21  <Field zzis zzapo>
	//*  23   42:ifnonnull       56
						zzapo = new zzis();
	//   24   45:aload_0         
	//   25   46:new             #48  <Class zzis>
	//   26   49:dup             
	//   27   50:invokespecial   #49  <Method void zzis()>
	//   28   53:putfield        #21  <Field zzis zzapo>
					obj = ((Object) (zzapo));
	//   29   56:aload_0         
	//   30   57:getfield        #21  <Field zzis zzapo>
	//   31   60:astore          4
				} else
	//*  32   62:goto            89
				{
					if(zzapn == null)
	//*  33   65:aload_0         
	//*  34   66:getfield        #19  <Field zziw zzapn>
	//*  35   69:ifnonnull       83
						zzapn = new zziw();
	//   36   72:aload_0         
	//   37   73:new             #51  <Class zziw>
	//   38   76:dup             
	//   39   77:invokespecial   #52  <Method void zziw()>
	//   40   80:putfield        #19  <Field zziw zzapn>
					obj = ((Object) (zzapn));
	//   41   83:aload_0         
	//   42   84:getfield        #19  <Field zziw zzapn>
	//   43   87:astore          4
				}
				zzbez1.zza(((zzbfi) (obj)));
	//   44   89:aload_1         
	//   45   90:aload           4
	//   46   92:invokevirtual   #55  <Method void zzbez.zza(zzbfi)>
			} else
	//*  47   95:goto            0
			{
				int j = zzbez1.getPosition();
	//   48   98:aload_1         
	//   49   99:invokevirtual   #58  <Method int zzbez.getPosition()>
	//   50  102:istore_3        
				try
				{
					zzanu = Integer.valueOf(zzia.zzd(zzbez1.zzacc()));
	//   51  103:aload_0         
	//   52  104:aload_1         
	//   53  105:invokevirtual   #61  <Method int zzbez.zzacc()>
	//   54  108:invokestatic    #67  <Method int zzia.zzd(int)>
	//   55  111:invokestatic    #73  <Method Integer Integer.valueOf(int)>
	//   56  114:putfield        #17  <Field Integer zzanu>
				}
	//*  57  117:goto            0
	//*  58  120:aload_1         
	//*  59  121:iload_3         
	//*  60  122:invokevirtual   #77  <Method void zzbez.zzdc(int)>
	//*  61  125:aload_0         
	//*  62  126:aload_1         
	//*  63  127:iload_2         
	//*  64  128:invokevirtual   #46  <Method boolean zzbfc.zza(zzbez, int)>
	//*  65  131:pop             
	//*  66  132:goto            0
	//*  67  135:aload_0         
	//*  68  136:areturn         
				// Misplaced declaration of an exception variable
				catch(IllegalArgumentException illegalargumentexception)
				{
					zzbez1.zzdc(j);
					((zzbfc)this).zza(zzbez1, i);
				}
			}
		} while(true);
		return this;
	//*  69  137:astore          4
	//*  70  139:goto            120
	}

	public final zzbfi zza(zzbez zzbez1)
		throws IOException
	{
		return ((zzbfi) (zzs(zzbez1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #81  <Method zziv zzs(zzbez)>
	//    3    5:areturn         
	}

	public final void zza(zzbfa zzbfa1)
		throws IOException
	{
		if(zzanu != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field Integer zzanu>
	//*   2    4:ifnull          19
			zzbfa1.zzm(1, zzanu.intValue());
	//    3    7:aload_1         
	//    4    8:iconst_1        
	//    5    9:aload_0         
	//    6   10:getfield        #17  <Field Integer zzanu>
	//    7   13:invokevirtual   #85  <Method int Integer.intValue()>
	//    8   16:invokevirtual   #91  <Method void zzbfa.zzm(int, int)>
		if(zzapn != null)
	//*   9   19:aload_0         
	//*  10   20:getfield        #19  <Field zziw zzapn>
	//*  11   23:ifnull          35
			zzbfa1.zza(2, ((zzbfi) (zzapn)));
	//   12   26:aload_1         
	//   13   27:iconst_2        
	//   14   28:aload_0         
	//   15   29:getfield        #19  <Field zziw zzapn>
	//   16   32:invokevirtual   #94  <Method void zzbfa.zza(int, zzbfi)>
		if(zzapo != null)
	//*  17   35:aload_0         
	//*  18   36:getfield        #21  <Field zzis zzapo>
	//*  19   39:ifnull          51
			zzbfa1.zza(3, ((zzbfi) (zzapo)));
	//   20   42:aload_1         
	//   21   43:iconst_3        
	//   22   44:aload_0         
	//   23   45:getfield        #21  <Field zzis zzapo>
	//   24   48:invokevirtual   #94  <Method void zzbfa.zza(int, zzbfi)>
		super.zza(zzbfa1);
	//   25   51:aload_0         
	//   26   52:aload_1         
	//   27   53:invokespecial   #96  <Method void zzbfc.zza(zzbfa)>
	//   28   56:return          
	}

	protected final int zzr()
	{
		int j = super.zzr();
	//    0    0:aload_0         
	//    1    1:invokespecial   #99  <Method int zzbfc.zzr()>
	//    2    4:istore_2        
		int i = j;
	//    3    5:iload_2         
	//    4    6:istore_1        
		if(zzanu != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #17  <Field Integer zzanu>
	//*   7   11:ifnull          28
			i = j + zzbfa.zzq(1, zzanu.intValue());
	//    8   14:iload_2         
	//    9   15:iconst_1        
	//   10   16:aload_0         
	//   11   17:getfield        #17  <Field Integer zzanu>
	//   12   20:invokevirtual   #85  <Method int Integer.intValue()>
	//   13   23:invokestatic    #103 <Method int zzbfa.zzq(int, int)>
	//   14   26:iadd            
	//   15   27:istore_1        
		j = i;
	//   16   28:iload_1         
	//   17   29:istore_2        
		if(zzapn != null)
	//*  18   30:aload_0         
	//*  19   31:getfield        #19  <Field zziw zzapn>
	//*  20   34:ifnull          48
			j = i + zzbfa.zzb(2, ((zzbfi) (zzapn)));
	//   21   37:iload_1         
	//   22   38:iconst_2        
	//   23   39:aload_0         
	//   24   40:getfield        #19  <Field zziw zzapn>
	//   25   43:invokestatic    #107 <Method int zzbfa.zzb(int, zzbfi)>
	//   26   46:iadd            
	//   27   47:istore_2        
		i = j;
	//   28   48:iload_2         
	//   29   49:istore_1        
		if(zzapo != null)
	//*  30   50:aload_0         
	//*  31   51:getfield        #21  <Field zzis zzapo>
	//*  32   54:ifnull          68
			i = j + zzbfa.zzb(3, ((zzbfi) (zzapo)));
	//   33   57:iload_2         
	//   34   58:iconst_3        
	//   35   59:aload_0         
	//   36   60:getfield        #21  <Field zzis zzapo>
	//   37   63:invokestatic    #107 <Method int zzbfa.zzb(int, zzbfi)>
	//   38   66:iadd            
	//   39   67:istore_1        
		return i;
	//   40   68:iload_1         
	//   41   69:ireturn         
	}

	private Integer zzanu;
	private zziw zzapn;
	private zzis zzapo;
}
