// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.zzaa;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.wearable:
//			zze

public class Asset extends zza
	implements ReflectedParcelable
{

	Asset(byte abyte0[], String s, ParcelFileDescriptor parcelfiledescriptor, Uri uri1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void zza()>
		zzbeL = abyte0;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #31  <Field byte[] zzbeL>
		zzbSL = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #33  <Field String zzbSL>
		zzbSM = parcelfiledescriptor;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #35  <Field ParcelFileDescriptor zzbSM>
		uri = uri1;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #37  <Field Uri uri>
	//   14   25:return          
	}

	public static Asset createFromBytes(byte abyte0[])
	{
		if(abyte0 == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       14
			throw new IllegalArgumentException("Asset data cannot be null");
	//    2    4:new             #41  <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #43  <String "Asset data cannot be null">
	//    5   10:invokespecial   #46  <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		else
			return new Asset(abyte0, ((String) (null)), ((ParcelFileDescriptor) (null)), ((Uri) (null)));
	//    7   14:new             #2   <Class Asset>
	//    8   17:dup             
	//    9   18:aload_0         
	//   10   19:aconst_null     
	//   11   20:aconst_null     
	//   12   21:aconst_null     
	//   13   22:invokespecial   #48  <Method void Asset(byte[], String, ParcelFileDescriptor, Uri)>
	//   14   25:areturn         
	}

	public static Asset createFromFd(ParcelFileDescriptor parcelfiledescriptor)
	{
		if(parcelfiledescriptor == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       14
			throw new IllegalArgumentException("Asset fd cannot be null");
	//    2    4:new             #41  <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #52  <String "Asset fd cannot be null">
	//    5   10:invokespecial   #46  <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		else
			return new Asset(((byte []) (null)), ((String) (null)), parcelfiledescriptor, ((Uri) (null)));
	//    7   14:new             #2   <Class Asset>
	//    8   17:dup             
	//    9   18:aconst_null     
	//   10   19:aconst_null     
	//   11   20:aload_0         
	//   12   21:aconst_null     
	//   13   22:invokespecial   #48  <Method void Asset(byte[], String, ParcelFileDescriptor, Uri)>
	//   14   25:areturn         
	}

	public static Asset createFromRef(String s)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       14
			throw new IllegalArgumentException("Asset digest cannot be null");
	//    2    4:new             #41  <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #56  <String "Asset digest cannot be null">
	//    5   10:invokespecial   #46  <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		else
			return new Asset(((byte []) (null)), s, ((ParcelFileDescriptor) (null)), ((Uri) (null)));
	//    7   14:new             #2   <Class Asset>
	//    8   17:dup             
	//    9   18:aconst_null     
	//   10   19:aload_0         
	//   11   20:aconst_null     
	//   12   21:aconst_null     
	//   13   22:invokespecial   #48  <Method void Asset(byte[], String, ParcelFileDescriptor, Uri)>
	//   14   25:areturn         
	}

	public static Asset createFromUri(Uri uri1)
	{
		if(uri1 == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       14
			throw new IllegalArgumentException("Asset uri cannot be null");
	//    2    4:new             #41  <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #60  <String "Asset uri cannot be null">
	//    5   10:invokespecial   #46  <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		else
			return new Asset(((byte []) (null)), ((String) (null)), ((ParcelFileDescriptor) (null)), uri1);
	//    7   14:new             #2   <Class Asset>
	//    8   17:dup             
	//    9   18:aconst_null     
	//   10   19:aconst_null     
	//   11   20:aconst_null     
	//   12   21:aload_0         
	//   13   22:invokespecial   #48  <Method void Asset(byte[], String, ParcelFileDescriptor, Uri)>
	//   14   25:areturn         
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
		if(!(obj instanceof Asset))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class Asset>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((Asset)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class Asset>
	//   12   20:astore_1        
		return Arrays.equals(zzbeL, ((Asset) (obj)).zzbeL) && zzaa.equal(((Object) (zzbSL)), ((Object) (((Asset) (obj)).zzbSL))) && zzaa.equal(((Object) (zzbSM)), ((Object) (((Asset) (obj)).zzbSM))) && zzaa.equal(((Object) (uri)), ((Object) (((Asset) (obj)).uri)));
	//   13   21:aload_0         
	//   14   22:getfield        #31  <Field byte[] zzbeL>
	//   15   25:aload_1         
	//   16   26:getfield        #31  <Field byte[] zzbeL>
	//   17   29:invokestatic    #67  <Method boolean Arrays.equals(byte[], byte[])>
	//   18   32:ifeq            79
	//   19   35:aload_0         
	//   20   36:getfield        #33  <Field String zzbSL>
	//   21   39:aload_1         
	//   22   40:getfield        #33  <Field String zzbSL>
	//   23   43:invokestatic    #73  <Method boolean zzaa.equal(Object, Object)>
	//   24   46:ifeq            79
	//   25   49:aload_0         
	//   26   50:getfield        #35  <Field ParcelFileDescriptor zzbSM>
	//   27   53:aload_1         
	//   28   54:getfield        #35  <Field ParcelFileDescriptor zzbSM>
	//   29   57:invokestatic    #73  <Method boolean zzaa.equal(Object, Object)>
	//   30   60:ifeq            79
	//   31   63:aload_0         
	//   32   64:getfield        #37  <Field Uri uri>
	//   33   67:aload_1         
	//   34   68:getfield        #37  <Field Uri uri>
	//   35   71:invokestatic    #73  <Method boolean zzaa.equal(Object, Object)>
	//   36   74:ifeq            79
	//   37   77:iconst_1        
	//   38   78:ireturn         
	//   39   79:iconst_0        
	//   40   80:ireturn         
	}

	public byte[] getData()
	{
		return zzbeL;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field byte[] zzbeL>
	//    2    4:areturn         
	}

	public String getDigest()
	{
		return zzbSL;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field String zzbSL>
	//    2    4:areturn         
	}

	public ParcelFileDescriptor getFd()
	{
		return zzbSM;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field ParcelFileDescriptor zzbSM>
	//    2    4:areturn         
	}

	public Uri getUri()
	{
		return uri;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field Uri uri>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		return Arrays.deepHashCode(new Object[] {
			zzbeL, zzbSL, zzbSM, uri
		});
	//    0    0:iconst_4        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #31  <Field byte[] zzbeL>
	//    6   10:aastore         
	//    7   11:dup             
	//    8   12:iconst_1        
	//    9   13:aload_0         
	//   10   14:getfield        #33  <Field String zzbSL>
	//   11   17:aastore         
	//   12   18:dup             
	//   13   19:iconst_2        
	//   14   20:aload_0         
	//   15   21:getfield        #35  <Field ParcelFileDescriptor zzbSM>
	//   16   24:aastore         
	//   17   25:dup             
	//   18   26:iconst_3        
	//   19   27:aload_0         
	//   20   28:getfield        #37  <Field Uri uri>
	//   21   31:aastore         
	//   22   32:invokestatic    #89  <Method int Arrays.deepHashCode(Object[])>
	//   23   35:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #92  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #93  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("Asset[@");
	//    4    8:aload_1         
	//    5    9:ldc1            #95  <String "Asset[@">
	//    6   11:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(Integer.toHexString(hashCode()));
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:invokevirtual   #101 <Method int hashCode()>
	//   11   20:invokestatic    #107 <Method String Integer.toHexString(int)>
	//   12   23:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
		if(zzbSL == null)
	//*  14   27:aload_0         
	//*  15   28:getfield        #33  <Field String zzbSL>
	//*  16   31:ifnonnull       44
		{
			stringbuilder.append(", nodigest");
	//   17   34:aload_1         
	//   18   35:ldc1            #109 <String ", nodigest">
	//   19   37:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   20   40:pop             
		} else
	//*  21   41:goto            60
		{
			stringbuilder.append(", ");
	//   22   44:aload_1         
	//   23   45:ldc1            #111 <String ", ">
	//   24   47:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   25   50:pop             
			stringbuilder.append(zzbSL);
	//   26   51:aload_1         
	//   27   52:aload_0         
	//   28   53:getfield        #33  <Field String zzbSL>
	//   29   56:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   30   59:pop             
		}
		if(zzbeL != null)
	//*  31   60:aload_0         
	//*  32   61:getfield        #31  <Field byte[] zzbeL>
	//*  33   64:ifnull          84
		{
			stringbuilder.append(", size=");
	//   34   67:aload_1         
	//   35   68:ldc1            #113 <String ", size=">
	//   36   70:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   37   73:pop             
			stringbuilder.append(zzbeL.length);
	//   38   74:aload_1         
	//   39   75:aload_0         
	//   40   76:getfield        #31  <Field byte[] zzbeL>
	//   41   79:arraylength     
	//   42   80:invokevirtual   #116 <Method StringBuilder StringBuilder.append(int)>
	//   43   83:pop             
		}
		if(zzbSM != null)
	//*  44   84:aload_0         
	//*  45   85:getfield        #35  <Field ParcelFileDescriptor zzbSM>
	//*  46   88:ifnull          107
		{
			stringbuilder.append(", fd=");
	//   47   91:aload_1         
	//   48   92:ldc1            #118 <String ", fd=">
	//   49   94:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   50   97:pop             
			stringbuilder.append(((Object) (zzbSM)));
	//   51   98:aload_1         
	//   52   99:aload_0         
	//   53  100:getfield        #35  <Field ParcelFileDescriptor zzbSM>
	//   54  103:invokevirtual   #121 <Method StringBuilder StringBuilder.append(Object)>
	//   55  106:pop             
		}
		if(uri != null)
	//*  56  107:aload_0         
	//*  57  108:getfield        #37  <Field Uri uri>
	//*  58  111:ifnull          130
		{
			stringbuilder.append(", uri=");
	//   59  114:aload_1         
	//   60  115:ldc1            #123 <String ", uri=">
	//   61  117:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   62  120:pop             
			stringbuilder.append(((Object) (uri)));
	//   63  121:aload_1         
	//   64  122:aload_0         
	//   65  123:getfield        #37  <Field Uri uri>
	//   66  126:invokevirtual   #121 <Method StringBuilder StringBuilder.append(Object)>
	//   67  129:pop             
		}
		stringbuilder.append("]");
	//   68  130:aload_1         
	//   69  131:ldc1            #125 <String "]">
	//   70  133:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   71  136:pop             
		return stringbuilder.toString();
	//   72  137:aload_1         
	//   73  138:invokevirtual   #127 <Method String StringBuilder.toString()>
	//   74  141:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.wearable.zze.zza(this, parcel, i | 1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iconst_1        
	//    4    4:ior             
	//    5    5:invokestatic    #133 <Method void com.google.android.gms.wearable.zze.zza(Asset, Parcel, int)>
	//    6    8:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zze();
	public Uri uri;
	private String zzbSL;
	public ParcelFileDescriptor zzbSM;
	private byte zzbeL[];

	static 
	{
	//    0    0:new             #21  <Class zze>
	//    1    3:dup             
	//    2    4:invokespecial   #24  <Method void zze()>
	//    3    7:putstatic       #26  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
