// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.location.Geofence;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.internal:
//			zzasn

public class zzasm extends zza
	implements Geofence
{

	public zzasm(String s, int i, short word0, double d, double d1, 
			float f, long l, int j, int k)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void zza()>
		zzeT(s);
	//    2    4:aload_1         
	//    3    5:invokestatic    #40  <Method void zzeT(String)>
		zzf(f);
	//    4    8:fload           8
	//    5   10:invokestatic    #44  <Method void zzf(float)>
		zza(d, d1);
	//    6   13:dload           4
	//    7   15:dload           6
	//    8   17:invokestatic    #48  <Method void zza(double, double)>
		i = zzkA(i);
	//    9   20:iload_2         
	//   10   21:invokestatic    #52  <Method int zzkA(int)>
	//   11   24:istore_2        
		zzbjF = word0;
	//   12   25:aload_0         
	//   13   26:iload_3         
	//   14   27:putfield        #54  <Field short zzbjF>
		zzOV = s;
	//   15   30:aload_0         
	//   16   31:aload_1         
	//   17   32:putfield        #56  <Field String zzOV>
		zzbjG = d;
	//   18   35:aload_0         
	//   19   36:dload           4
	//   20   38:putfield        #58  <Field double zzbjG>
		zzbjH = d1;
	//   21   41:aload_0         
	//   22   42:dload           6
	//   23   44:putfield        #60  <Field double zzbjH>
		zzbjI = f;
	//   24   47:aload_0         
	//   25   48:fload           8
	//   26   50:putfield        #62  <Field float zzbjI>
		zzbkU = l;
	//   27   53:aload_0         
	//   28   54:lload           9
	//   29   56:putfield        #64  <Field long zzbkU>
		zzbjD = i;
	//   30   59:aload_0         
	//   31   60:iload_2         
	//   32   61:putfield        #66  <Field int zzbjD>
		zzbjJ = j;
	//   33   64:aload_0         
	//   34   65:iload           11
	//   35   67:putfield        #68  <Field int zzbjJ>
		zzbjK = k;
	//   36   70:aload_0         
	//   37   71:iload           12
	//   38   73:putfield        #70  <Field int zzbjK>
	//   39   76:return          
	}

	private static void zza(double d, double d1)
	{
		if(d > 90D || d < -90D)
	//*   0    0:dload_0         
	//*   1    1:ldc2w           #71  <Double 90D>
	//*   2    4:dcmpl           
	//*   3    5:ifgt            16
	//*   4    8:dload_0         
	//*   5    9:ldc2w           #73  <Double -90D>
	//*   6   12:dcmpg           
	//*   7   13:ifge            45
			throw new IllegalArgumentException((new StringBuilder(42)).append("invalid latitude: ").append(d).toString());
	//    8   16:new             #76  <Class IllegalArgumentException>
	//    9   19:dup             
	//   10   20:new             #78  <Class StringBuilder>
	//   11   23:dup             
	//   12   24:bipush          42
	//   13   26:invokespecial   #81  <Method void StringBuilder(int)>
	//   14   29:ldc1            #83  <String "invalid latitude: ">
	//   15   31:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   16   34:dload_0         
	//   17   35:invokevirtual   #90  <Method StringBuilder StringBuilder.append(double)>
	//   18   38:invokevirtual   #94  <Method String StringBuilder.toString()>
	//   19   41:invokespecial   #96  <Method void IllegalArgumentException(String)>
	//   20   44:athrow          
		if(d1 > 180D || d1 < -180D)
	//*  21   45:dload_2         
	//*  22   46:ldc2w           #97  <Double 180D>
	//*  23   49:dcmpl           
	//*  24   50:ifgt            61
	//*  25   53:dload_2         
	//*  26   54:ldc2w           #99  <Double -180D>
	//*  27   57:dcmpg           
	//*  28   58:ifge            90
			throw new IllegalArgumentException((new StringBuilder(43)).append("invalid longitude: ").append(d1).toString());
	//   29   61:new             #76  <Class IllegalArgumentException>
	//   30   64:dup             
	//   31   65:new             #78  <Class StringBuilder>
	//   32   68:dup             
	//   33   69:bipush          43
	//   34   71:invokespecial   #81  <Method void StringBuilder(int)>
	//   35   74:ldc1            #102 <String "invalid longitude: ">
	//   36   76:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   37   79:dload_2         
	//   38   80:invokevirtual   #90  <Method StringBuilder StringBuilder.append(double)>
	//   39   83:invokevirtual   #94  <Method String StringBuilder.toString()>
	//   40   86:invokespecial   #96  <Method void IllegalArgumentException(String)>
	//   41   89:athrow          
		else
			return;
	//   42   90:return          
	}

	private static void zzeT(String s)
	{
		if(s == null || s.length() > 100)
	//*   0    0:aload_0         
	//*   1    1:ifnull          13
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #108 <Method int String.length()>
	//*   4    8:bipush          100
	//*   5   10:icmple          54
		{
			s = String.valueOf(((Object) (s)));
	//    6   13:aload_0         
	//    7   14:invokestatic    #112 <Method String String.valueOf(Object)>
	//    8   17:astore_0        
			if(s.length() != 0)
	//*   9   18:aload_0         
	//*  10   19:invokevirtual   #108 <Method int String.length()>
	//*  11   22:ifeq            35
				s = "requestId is null or too long: ".concat(s);
	//   12   25:ldc1            #114 <String "requestId is null or too long: ">
	//   13   27:aload_0         
	//   14   28:invokevirtual   #118 <Method String String.concat(String)>
	//   15   31:astore_0        
			else
	//*  16   32:goto            45
				s = new String("requestId is null or too long: ");
	//   17   35:new             #104 <Class String>
	//   18   38:dup             
	//   19   39:ldc1            #114 <String "requestId is null or too long: ">
	//   20   41:invokespecial   #119 <Method void String(String)>
	//   21   44:astore_0        
			throw new IllegalArgumentException(s);
	//   22   45:new             #76  <Class IllegalArgumentException>
	//   23   48:dup             
	//   24   49:aload_0         
	//   25   50:invokespecial   #96  <Method void IllegalArgumentException(String)>
	//   26   53:athrow          
		} else
		{
			return;
	//   27   54:return          
		}
	}

	private static void zzf(float f)
	{
		if(f <= 0.0F)
	//*   0    0:fload_0         
	//*   1    1:fconst_0        
	//*   2    2:fcmpg           
	//*   3    3:ifgt            35
			throw new IllegalArgumentException((new StringBuilder(31)).append("invalid radius: ").append(f).toString());
	//    4    6:new             #76  <Class IllegalArgumentException>
	//    5    9:dup             
	//    6   10:new             #78  <Class StringBuilder>
	//    7   13:dup             
	//    8   14:bipush          31
	//    9   16:invokespecial   #81  <Method void StringBuilder(int)>
	//   10   19:ldc1            #121 <String "invalid radius: ">
	//   11   21:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   12   24:fload_0         
	//   13   25:invokevirtual   #124 <Method StringBuilder StringBuilder.append(float)>
	//   14   28:invokevirtual   #94  <Method String StringBuilder.toString()>
	//   15   31:invokespecial   #96  <Method void IllegalArgumentException(String)>
	//   16   34:athrow          
		else
			return;
	//   17   35:return          
	}

	private static int zzkA(int i)
	{
		int j = i & 7;
	//    0    0:iload_0         
	//    1    1:bipush          7
	//    2    3:iand            
	//    3    4:istore_1        
		if(j == 0)
	//*   4    5:iload_1         
	//*   5    6:ifne            38
			throw new IllegalArgumentException((new StringBuilder(46)).append("No supported transition specified: ").append(i).toString());
	//    6    9:new             #76  <Class IllegalArgumentException>
	//    7   12:dup             
	//    8   13:new             #78  <Class StringBuilder>
	//    9   16:dup             
	//   10   17:bipush          46
	//   11   19:invokespecial   #81  <Method void StringBuilder(int)>
	//   12   22:ldc1            #126 <String "No supported transition specified: ">
	//   13   24:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   14   27:iload_0         
	//   15   28:invokevirtual   #129 <Method StringBuilder StringBuilder.append(int)>
	//   16   31:invokevirtual   #94  <Method String StringBuilder.toString()>
	//   17   34:invokespecial   #96  <Method void IllegalArgumentException(String)>
	//   18   37:athrow          
		else
			return j;
	//   19   38:iload_1         
	//   20   39:ireturn         
	}

	private static String zzkB(int i)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:lookupswitch    1: default 20
	//	               1: 23
	//*   2   20:goto            26
		case 1: // '\001'
			return "CIRCLE";
	//    3   23:ldc1            #136 <String "CIRCLE">
	//    4   25:areturn         
		}
		return null;
	//    5   26:aconst_null     
	//    6   27:areturn         
	}

	public static zzasm zzw(byte abyte0[])
	{
		Parcel parcel = Parcel.obtain();
	//    0    0:invokestatic    #145 <Method Parcel Parcel.obtain()>
	//    1    3:astore_1        
		parcel.unmarshall(abyte0, 0, abyte0.length);
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:aload_0         
	//    6    8:arraylength     
	//    7    9:invokevirtual   #149 <Method void Parcel.unmarshall(byte[], int, int)>
		parcel.setDataPosition(0);
	//    8   12:aload_1         
	//    9   13:iconst_0        
	//   10   14:invokevirtual   #152 <Method void Parcel.setDataPosition(int)>
		abyte0 = ((byte []) ((zzasm)CREATOR.createFromParcel(parcel)));
	//   11   17:getstatic       #33  <Field android.os.Parcelable$Creator CREATOR>
	//   12   20:aload_1         
	//   13   21:invokeinterface #158 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   14   26:checkcast       #2   <Class zzasm>
	//   15   29:astore_0        
		parcel.recycle();
	//   16   30:aload_1         
	//   17   31:invokevirtual   #161 <Method void Parcel.recycle()>
		return ((zzasm) (abyte0));
	//   18   34:aload_0         
	//   19   35:areturn         
	}

	public boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(obj == null)
	//*   5    7:aload_1         
	//*   6    8:ifnonnull       13
			return false;
	//    7   11:iconst_0        
	//    8   12:ireturn         
		if(!(obj instanceof zzasm))
	//*   9   13:aload_1         
	//*  10   14:instanceof      #2   <Class zzasm>
	//*  11   17:ifne            22
			return false;
	//   12   20:iconst_0        
	//   13   21:ireturn         
		obj = ((Object) ((zzasm)obj));
	//   14   22:aload_1         
	//   15   23:checkcast       #2   <Class zzasm>
	//   16   26:astore_1        
		if(zzbjI != ((zzasm) (obj)).zzbjI)
	//*  17   27:aload_0         
	//*  18   28:getfield        #62  <Field float zzbjI>
	//*  19   31:aload_1         
	//*  20   32:getfield        #62  <Field float zzbjI>
	//*  21   35:fcmpl           
	//*  22   36:ifeq            41
			return false;
	//   23   39:iconst_0        
	//   24   40:ireturn         
		if(zzbjG != ((zzasm) (obj)).zzbjG)
	//*  25   41:aload_0         
	//*  26   42:getfield        #58  <Field double zzbjG>
	//*  27   45:aload_1         
	//*  28   46:getfield        #58  <Field double zzbjG>
	//*  29   49:dcmpl           
	//*  30   50:ifeq            55
			return false;
	//   31   53:iconst_0        
	//   32   54:ireturn         
		if(zzbjH != ((zzasm) (obj)).zzbjH)
	//*  33   55:aload_0         
	//*  34   56:getfield        #60  <Field double zzbjH>
	//*  35   59:aload_1         
	//*  36   60:getfield        #60  <Field double zzbjH>
	//*  37   63:dcmpl           
	//*  38   64:ifeq            69
			return false;
	//   39   67:iconst_0        
	//   40   68:ireturn         
		return zzbjF == ((zzasm) (obj)).zzbjF;
	//   41   69:aload_0         
	//   42   70:getfield        #54  <Field short zzbjF>
	//   43   73:aload_1         
	//   44   74:getfield        #54  <Field short zzbjF>
	//   45   77:icmpeq          82
	//   46   80:iconst_0        
	//   47   81:ireturn         
	//   48   82:iconst_1        
	//   49   83:ireturn         
	}

	public long getExpirationTime()
	{
		return zzbkU;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field long zzbkU>
	//    2    4:lreturn         
	}

	public double getLatitude()
	{
		return zzbjG;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field double zzbjG>
	//    2    4:dreturn         
	}

	public double getLongitude()
	{
		return zzbjH;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field double zzbjH>
	//    2    4:dreturn         
	}

	public float getRadius()
	{
		return zzbjI;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field float zzbjI>
	//    2    4:freturn         
	}

	public String getRequestId()
	{
		return zzOV;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field String zzOV>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		long l = Double.doubleToLongBits(zzbjG);
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field double zzbjG>
	//    2    4:invokestatic    #178 <Method long Double.doubleToLongBits(double)>
	//    3    7:lstore_2        
		int i = (int)(l >>> 32 ^ l);
	//    4    8:lload_2         
	//    5    9:bipush          32
	//    6   11:lushr           
	//    7   12:lload_2         
	//    8   13:lxor            
	//    9   14:l2i             
	//   10   15:istore_1        
		l = Double.doubleToLongBits(zzbjH);
	//   11   16:aload_0         
	//   12   17:getfield        #60  <Field double zzbjH>
	//   13   20:invokestatic    #178 <Method long Double.doubleToLongBits(double)>
	//   14   23:lstore_2        
		return ((((i + 31) * 31 + (int)(l >>> 32 ^ l)) * 31 + Float.floatToIntBits(zzbjI)) * 31 + zzbjF) * 31 + zzbjD;
	//   15   24:iload_1         
	//   16   25:bipush          31
	//   17   27:iadd            
	//   18   28:bipush          31
	//   19   30:imul            
	//   20   31:lload_2         
	//   21   32:bipush          32
	//   22   34:lushr           
	//   23   35:lload_2         
	//   24   36:lxor            
	//   25   37:l2i             
	//   26   38:iadd            
	//   27   39:bipush          31
	//   28   41:imul            
	//   29   42:aload_0         
	//   30   43:getfield        #62  <Field float zzbjI>
	//   31   46:invokestatic    #184 <Method int Float.floatToIntBits(float)>
	//   32   49:iadd            
	//   33   50:bipush          31
	//   34   52:imul            
	//   35   53:aload_0         
	//   36   54:getfield        #54  <Field short zzbjF>
	//   37   57:iadd            
	//   38   58:bipush          31
	//   39   60:imul            
	//   40   61:aload_0         
	//   41   62:getfield        #66  <Field int zzbjD>
	//   42   65:iadd            
	//   43   66:ireturn         
	}

	public String toString()
	{
		return String.format(Locale.US, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", new Object[] {
			zzkB(((int) (zzbjF))), zzOV, Integer.valueOf(zzbjD), Double.valueOf(zzbjG), Double.valueOf(zzbjH), Float.valueOf(zzbjI), Integer.valueOf(zzbjJ / 1000), Integer.valueOf(zzbjK), Long.valueOf(zzbkU)
		});
	//    0    0:getstatic       #190 <Field Locale Locale.US>
	//    1    3:ldc1            #192 <String "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]">
	//    2    5:bipush          9
	//    3    7:anewarray       Object[]
	//    4   10:dup             
	//    5   11:iconst_0        
	//    6   12:aload_0         
	//    7   13:getfield        #54  <Field short zzbjF>
	//    8   16:invokestatic    #196 <Method String zzkB(int)>
	//    9   19:aastore         
	//   10   20:dup             
	//   11   21:iconst_1        
	//   12   22:aload_0         
	//   13   23:getfield        #56  <Field String zzOV>
	//   14   26:aastore         
	//   15   27:dup             
	//   16   28:iconst_2        
	//   17   29:aload_0         
	//   18   30:getfield        #66  <Field int zzbjD>
	//   19   33:invokestatic    #201 <Method Integer Integer.valueOf(int)>
	//   20   36:aastore         
	//   21   37:dup             
	//   22   38:iconst_3        
	//   23   39:aload_0         
	//   24   40:getfield        #58  <Field double zzbjG>
	//   25   43:invokestatic    #204 <Method Double Double.valueOf(double)>
	//   26   46:aastore         
	//   27   47:dup             
	//   28   48:iconst_4        
	//   29   49:aload_0         
	//   30   50:getfield        #60  <Field double zzbjH>
	//   31   53:invokestatic    #204 <Method Double Double.valueOf(double)>
	//   32   56:aastore         
	//   33   57:dup             
	//   34   58:iconst_5        
	//   35   59:aload_0         
	//   36   60:getfield        #62  <Field float zzbjI>
	//   37   63:invokestatic    #207 <Method Float Float.valueOf(float)>
	//   38   66:aastore         
	//   39   67:dup             
	//   40   68:bipush          6
	//   41   70:aload_0         
	//   42   71:getfield        #68  <Field int zzbjJ>
	//   43   74:sipush          1000
	//   44   77:idiv            
	//   45   78:invokestatic    #201 <Method Integer Integer.valueOf(int)>
	//   46   81:aastore         
	//   47   82:dup             
	//   48   83:bipush          7
	//   49   85:aload_0         
	//   50   86:getfield        #70  <Field int zzbjK>
	//   51   89:invokestatic    #201 <Method Integer Integer.valueOf(int)>
	//   52   92:aastore         
	//   53   93:dup             
	//   54   94:bipush          8
	//   55   96:aload_0         
	//   56   97:getfield        #64  <Field long zzbkU>
	//   57  100:invokestatic    #212 <Method Long Long.valueOf(long)>
	//   58  103:aastore         
	//   59  104:invokestatic    #216 <Method String String.format(Locale, String, Object[])>
	//   60  107:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.internal.zzasn.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #221 <Method void com.google.android.gms.internal.zzasn.zza(zzasm, Parcel, int)>
	//    4    6:return          
	}

	public short zzIu()
	{
		return zzbjF;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field short zzbjF>
	//    2    4:ireturn         
	}

	public int zzIv()
	{
		return zzbjD;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field int zzbjD>
	//    2    4:ireturn         
	}

	public int zzIw()
	{
		return zzbjJ;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field int zzbjJ>
	//    2    4:ireturn         
	}

	public int zzIx()
	{
		return zzbjK;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field int zzbjK>
	//    2    4:ireturn         
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzasn();
	private final String zzOV;
	private final int zzbjD;
	private final short zzbjF;
	private final double zzbjG;
	private final double zzbjH;
	private final float zzbjI;
	private final int zzbjJ;
	private final int zzbjK;
	private final long zzbkU;

	static 
	{
	//    0    0:new             #28  <Class zzasn>
	//    1    3:dup             
	//    2    4:invokespecial   #31  <Method void zzasn()>
	//    3    7:putstatic       #33  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
