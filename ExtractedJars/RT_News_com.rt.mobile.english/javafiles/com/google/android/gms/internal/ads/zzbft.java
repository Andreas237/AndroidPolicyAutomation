// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbfc, zzbez, zzbfa, zzbfi

public final class zzbft extends zzbfc
{

	public zzbft()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void zzbfc()>
		zzamf = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #17  <Field Integer zzamf>
		mimeType = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #19  <Field String mimeType>
		zzedl = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #21  <Field byte[] zzedl>
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

	private final zzbft zzab(zzbez zzbez1)
		throws IOException
	{
_L2:
		int i;
		int j;
		i = zzbez1.zzabk();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #42  <Method int zzbez.zzabk()>
	//    2    4:istore_2        
		if(i == 0)
			break; /* Loop/switch isn't completed */
	//    3    5:iload_2         
	//    4    6:ifeq            149
		if(i != 8)
	//*   5    9:iload_2         
	//*   6   10:bipush          8
	//*   7   12:icmpeq          60
		{
			if(i != 18)
	//*   8   15:iload_2         
	//*   9   16:bipush          18
	//*  10   18:icmpeq          49
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
				} else
				{
					zzedl = zzbez1.readBytes();
	//   21   38:aload_0         
	//   22   39:aload_1         
	//   23   40:invokevirtual   #50  <Method byte[] zzbez.readBytes()>
	//   24   43:putfield        #21  <Field byte[] zzedl>
				}
			} else
	//*  25   46:goto            0
			{
				mimeType = zzbez1.readString();
	//   26   49:aload_0         
	//   27   50:aload_1         
	//   28   51:invokevirtual   #54  <Method String zzbez.readString()>
	//   29   54:putfield        #19  <Field String mimeType>
			}
			continue; /* Loop/switch isn't completed */
	//   30   57:goto            0
		}
		j = zzbez1.getPosition();
	//   31   60:aload_1         
	//   32   61:invokevirtual   #57  <Method int zzbez.getPosition()>
	//   33   64:istore_3        
		int k = zzbez1.zzabn();
	//   34   65:aload_1         
	//   35   66:invokevirtual   #60  <Method int zzbez.zzabn()>
	//   36   69:istore          4
		if(k < 0 || k > 1)
			break MISSING_BLOCK_LABEL_94;
	//   37   71:iload           4
	//   38   73:iflt            94
	//   39   76:iload           4
	//   40   78:iconst_1        
	//   41   79:icmpgt          94
		zzamf = Integer.valueOf(k);
	//   42   82:aload_0         
	//   43   83:iload           4
	//   44   85:invokestatic    #66  <Method Integer Integer.valueOf(int)>
	//   45   88:putfield        #17  <Field Integer zzamf>
		continue; /* Loop/switch isn't completed */
	//   46   91:goto            0
		try
		{
			StringBuilder stringbuilder = new StringBuilder(36);
	//   47   94:new             #68  <Class StringBuilder>
	//   48   97:dup             
	//   49   98:bipush          36
	//   50  100:invokespecial   #71  <Method void StringBuilder(int)>
	//   51  103:astore          5
			stringbuilder.append(k);
	//   52  105:aload           5
	//   53  107:iload           4
	//   54  109:invokevirtual   #75  <Method StringBuilder StringBuilder.append(int)>
	//   55  112:pop             
			stringbuilder.append(" is not a valid enum Type");
	//   56  113:aload           5
	//   57  115:ldc1            #77  <String " is not a valid enum Type">
	//   58  117:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   59  120:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   60  121:new             #36  <Class IllegalArgumentException>
	//   61  124:dup             
	//   62  125:aload           5
	//   63  127:invokevirtual   #83  <Method String StringBuilder.toString()>
	//   64  130:invokespecial   #86  <Method void IllegalArgumentException(String)>
	//   65  133:athrow          
		}
	//*  66  134:aload_1         
	//*  67  135:iload_3         
	//*  68  136:invokevirtual   #89  <Method void zzbez.zzdc(int)>
	//*  69  139:aload_0         
	//*  70  140:aload_1         
	//*  71  141:iload_2         
	//*  72  142:invokevirtual   #46  <Method boolean zzbfc.zza(zzbez, int)>
	//*  73  145:pop             
	//*  74  146:goto            0
	//*  75  149:aload_0         
	//*  76  150:areturn         
		// Misplaced declaration of an exception variable
		catch(IllegalArgumentException illegalargumentexception)
		{
			zzbez1.zzdc(j);
		}
		((zzbfc)this).zza(zzbez1, i);
		if(true) goto _L2; else goto _L1
_L1:
		IllegalArgumentException illegalargumentexception;
		return this;
	//*  77  151:astore          5
	//*  78  153:goto            134
	}

	public final zzbfi zza(zzbez zzbez1)
		throws IOException
	{
		return ((zzbfi) (zzab(zzbez1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #93  <Method zzbft zzab(zzbez)>
	//    3    5:areturn         
	}

	public final void zza(zzbfa zzbfa1)
		throws IOException
	{
		if(zzamf != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field Integer zzamf>
	//*   2    4:ifnull          19
			zzbfa1.zzm(1, zzamf.intValue());
	//    3    7:aload_1         
	//    4    8:iconst_1        
	//    5    9:aload_0         
	//    6   10:getfield        #17  <Field Integer zzamf>
	//    7   13:invokevirtual   #97  <Method int Integer.intValue()>
	//    8   16:invokevirtual   #103 <Method void zzbfa.zzm(int, int)>
		if(mimeType != null)
	//*   9   19:aload_0         
	//*  10   20:getfield        #19  <Field String mimeType>
	//*  11   23:ifnull          35
			zzbfa1.zzf(2, mimeType);
	//   12   26:aload_1         
	//   13   27:iconst_2        
	//   14   28:aload_0         
	//   15   29:getfield        #19  <Field String mimeType>
	//   16   32:invokevirtual   #107 <Method void zzbfa.zzf(int, String)>
		if(zzedl != null)
	//*  17   35:aload_0         
	//*  18   36:getfield        #21  <Field byte[] zzedl>
	//*  19   39:ifnull          51
			zzbfa1.zza(3, zzedl);
	//   20   42:aload_1         
	//   21   43:iconst_3        
	//   22   44:aload_0         
	//   23   45:getfield        #21  <Field byte[] zzedl>
	//   24   48:invokevirtual   #110 <Method void zzbfa.zza(int, byte[])>
		super.zza(zzbfa1);
	//   25   51:aload_0         
	//   26   52:aload_1         
	//   27   53:invokespecial   #112 <Method void zzbfc.zza(zzbfa)>
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
		if(zzamf != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #17  <Field Integer zzamf>
	//*   7   11:ifnull          28
			i = j + zzbfa.zzq(1, zzamf.intValue());
	//    8   14:iload_2         
	//    9   15:iconst_1        
	//   10   16:aload_0         
	//   11   17:getfield        #17  <Field Integer zzamf>
	//   12   20:invokevirtual   #97  <Method int Integer.intValue()>
	//   13   23:invokestatic    #119 <Method int zzbfa.zzq(int, int)>
	//   14   26:iadd            
	//   15   27:istore_1        
		j = i;
	//   16   28:iload_1         
	//   17   29:istore_2        
		if(mimeType != null)
	//*  18   30:aload_0         
	//*  19   31:getfield        #19  <Field String mimeType>
	//*  20   34:ifnull          48
			j = i + zzbfa.zzg(2, mimeType);
	//   21   37:iload_1         
	//   22   38:iconst_2        
	//   23   39:aload_0         
	//   24   40:getfield        #19  <Field String mimeType>
	//   25   43:invokestatic    #123 <Method int zzbfa.zzg(int, String)>
	//   26   46:iadd            
	//   27   47:istore_2        
		i = j;
	//   28   48:iload_2         
	//   29   49:istore_1        
		if(zzedl != null)
	//*  30   50:aload_0         
	//*  31   51:getfield        #21  <Field byte[] zzedl>
	//*  32   54:ifnull          68
			i = j + zzbfa.zzb(3, zzedl);
	//   33   57:iload_2         
	//   34   58:iconst_3        
	//   35   59:aload_0         
	//   36   60:getfield        #21  <Field byte[] zzedl>
	//   37   63:invokestatic    #127 <Method int zzbfa.zzb(int, byte[])>
	//   38   66:iadd            
	//   39   67:istore_1        
		return i;
	//   40   68:iload_1         
	//   41   69:ireturn         
	}

	public String mimeType;
	public Integer zzamf;
	public byte zzedl[];
}
