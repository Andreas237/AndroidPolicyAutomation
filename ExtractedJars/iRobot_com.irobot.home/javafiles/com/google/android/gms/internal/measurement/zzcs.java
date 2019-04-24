// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzbx, zzcr, zzat, zzcp, 
//			zzcf, zzcg, zzck

final class zzcs
{

	public zzcs(zzcr zzcr1)
	{
		zzabq = zzcr1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field zzcr zzabq>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
		zzabp = new ByteArrayOutputStream();
	//    5    9:aload_0         
	//    6   10:new             #19  <Class ByteArrayOutputStream>
	//    7   13:dup             
	//    8   14:invokespecial   #20  <Method void ByteArrayOutputStream()>
	//    9   17:putfield        #22  <Field ByteArrayOutputStream zzabp>
	//   10   20:return          
	}

	public final byte[] getPayload()
	{
		return zzabp.toByteArray();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field ByteArrayOutputStream zzabp>
	//    2    4:invokevirtual   #28  <Method byte[] ByteArrayOutputStream.toByteArray()>
	//    3    7:areturn         
	}

	public final boolean zze(zzck zzck)
	{
		Preconditions.checkNotNull(((Object) (zzck)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #38  <Method Object Preconditions.checkNotNull(Object)>
	//    2    4:pop             
		if(zzabo + 1 > zzbx.zzec())
	//*   3    5:aload_0         
	//*   4    6:getfield        #40  <Field int zzabo>
	//*   5    9:iconst_1        
	//*   6   10:iadd            
	//*   7   11:invokestatic    #46  <Method int zzbx.zzec()>
	//*   8   14:icmple          19
			return false;
	//    9   17:iconst_0        
	//   10   18:ireturn         
		String s = zzabq.zza(zzck, false);
	//   11   19:aload_0         
	//   12   20:getfield        #14  <Field zzcr zzabq>
	//   13   23:aload_1         
	//   14   24:iconst_0        
	//   15   25:invokevirtual   #52  <Method String zzcr.zza(zzck, boolean)>
	//   16   28:astore          4
		if(s == null)
	//*  17   30:aload           4
	//*  18   32:ifnonnull       50
		{
			((zzat) (zzabq)).zzby().zza(zzck, "Error formatting hit");
	//   19   35:aload_0         
	//   20   36:getfield        #14  <Field zzcr zzabq>
	//   21   39:invokevirtual   #58  <Method zzcp zzat.zzby()>
	//   22   42:aload_1         
	//   23   43:ldc1            #60  <String "Error formatting hit">
	//   24   45:invokevirtual   #65  <Method void zzcp.zza(zzck, String)>
			return true;
	//   25   48:iconst_1        
	//   26   49:ireturn         
		}
		byte abyte0[] = s.getBytes();
	//   27   50:aload           4
	//   28   52:invokevirtual   #70  <Method byte[] String.getBytes()>
	//   29   55:astore          4
		int j = abyte0.length;
	//   30   57:aload           4
	//   31   59:arraylength     
	//   32   60:istore_3        
		if(j > zzbx.zzdy())
	//*  33   61:iload_3         
	//*  34   62:invokestatic    #73  <Method int zzbx.zzdy()>
	//*  35   65:icmple          83
		{
			((zzat) (zzabq)).zzby().zza(zzck, "Hit size exceeds the maximum size limit");
	//   36   68:aload_0         
	//   37   69:getfield        #14  <Field zzcr zzabq>
	//   38   72:invokevirtual   #58  <Method zzcp zzat.zzby()>
	//   39   75:aload_1         
	//   40   76:ldc1            #75  <String "Hit size exceeds the maximum size limit">
	//   41   78:invokevirtual   #65  <Method void zzcp.zza(zzck, String)>
			return true;
	//   42   81:iconst_1        
	//   43   82:ireturn         
		}
		int i = j;
	//   44   83:iload_3         
	//   45   84:istore_2        
		if(zzabp.size() > 0)
	//*  46   85:aload_0         
	//*  47   86:getfield        #22  <Field ByteArrayOutputStream zzabp>
	//*  48   89:invokevirtual   #78  <Method int ByteArrayOutputStream.size()>
	//*  49   92:ifle            99
			i = j + 1;
	//   50   95:iload_3         
	//   51   96:iconst_1        
	//   52   97:iadd            
	//   53   98:istore_2        
		if(zzabp.size() + i > ((Integer)zzcf.zzzv.get()).intValue())
	//*  54   99:aload_0         
	//*  55  100:getfield        #22  <Field ByteArrayOutputStream zzabp>
	//*  56  103:invokevirtual   #78  <Method int ByteArrayOutputStream.size()>
	//*  57  106:iload_2         
	//*  58  107:iadd            
	//*  59  108:getstatic       #84  <Field zzcg zzcf.zzzv>
	//*  60  111:invokevirtual   #90  <Method Object zzcg.get()>
	//*  61  114:checkcast       #92  <Class Integer>
	//*  62  117:invokevirtual   #95  <Method int Integer.intValue()>
	//*  63  120:icmple          125
			return false;
	//   64  123:iconst_0        
	//   65  124:ireturn         
		try
		{
			if(zzabp.size() > 0)
	//*  66  125:aload_0         
	//*  67  126:getfield        #22  <Field ByteArrayOutputStream zzabp>
	//*  68  129:invokevirtual   #78  <Method int ByteArrayOutputStream.size()>
	//*  69  132:ifle            145
				zzabp.write(zzcr.zzfd());
	//   70  135:aload_0         
	//   71  136:getfield        #22  <Field ByteArrayOutputStream zzabp>
	//   72  139:invokestatic    #98  <Method byte[] zzcr.zzfd()>
	//   73  142:invokevirtual   #102 <Method void ByteArrayOutputStream.write(byte[])>
			zzabp.write(abyte0);
	//   74  145:aload_0         
	//   75  146:getfield        #22  <Field ByteArrayOutputStream zzabp>
	//   76  149:aload           4
	//   77  151:invokevirtual   #102 <Method void ByteArrayOutputStream.write(byte[])>
		}
	//*  78  154:aload_0         
	//*  79  155:aload_0         
	//*  80  156:getfield        #40  <Field int zzabo>
	//*  81  159:iconst_1        
	//*  82  160:iadd            
	//*  83  161:putfield        #40  <Field int zzabo>
	//*  84  164:iconst_1        
	//*  85  165:ireturn         
		// Misplaced declaration of an exception variable
		catch(zzck zzck)
	//*  86  166:astore_1        
		{
			((zzat) (zzabq)).zze("Failed to write payload when batching hits", ((Object) (zzck)));
	//   87  167:aload_0         
	//   88  168:getfield        #14  <Field zzcr zzabq>
	//   89  171:ldc1            #104 <String "Failed to write payload when batching hits">
	//   90  173:aload_1         
	//   91  174:invokevirtual   #107 <Method void zzat.zze(String, Object)>
			return true;
	//   92  177:iconst_1        
	//   93  178:ireturn         
		}
		zzabo = zzabo + 1;
		return true;
	}

	public final int zzfe()
	{
		return zzabo;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field int zzabo>
	//    2    4:ireturn         
	}

	private int zzabo;
	private ByteArrayOutputStream zzabp;
	private final zzcr zzabq;
}
