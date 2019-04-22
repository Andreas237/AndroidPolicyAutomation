// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.identity.intents.model;

import android.content.Intent;
import android.os.Parcel;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.identity.intents.model:
//			zzb

public final class UserAddress extends AbstractSafeParcelable
	implements ReflectedParcelable
{

	UserAddress()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #60  <Method void AbstractSafeParcelable()>
	//    2    4:return          
	}

	UserAddress(String s, String s1, String s2, String s3, String s4, String s5, String s6, 
			String s7, String s8, String s9, String s10, String s11, boolean flag, String s12, 
			String s13)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #60  <Method void AbstractSafeParcelable()>
		name = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #65  <Field String name>
		zzl = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #67  <Field String zzl>
		zzm = s2;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #69  <Field String zzm>
		zzn = s3;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #71  <Field String zzn>
		zzo = s4;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #73  <Field String zzo>
		zzp = s5;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #75  <Field String zzp>
		zzq = s6;
	//   20   37:aload_0         
	//   21   38:aload           7
	//   22   40:putfield        #77  <Field String zzq>
		zzr = s7;
	//   23   43:aload_0         
	//   24   44:aload           8
	//   25   46:putfield        #79  <Field String zzr>
		zzk = s8;
	//   26   49:aload_0         
	//   27   50:aload           9
	//   28   52:putfield        #81  <Field String zzk>
		zzs = s9;
	//   29   55:aload_0         
	//   30   56:aload           10
	//   31   58:putfield        #83  <Field String zzs>
		zzt = s10;
	//   32   61:aload_0         
	//   33   62:aload           11
	//   34   64:putfield        #85  <Field String zzt>
		zzu = s11;
	//   35   67:aload_0         
	//   36   68:aload           12
	//   37   70:putfield        #87  <Field String zzu>
		zzv = flag;
	//   38   73:aload_0         
	//   39   74:iload           13
	//   40   76:putfield        #89  <Field boolean zzv>
		zzw = s12;
	//   41   79:aload_0         
	//   42   80:aload           14
	//   43   82:putfield        #91  <Field String zzw>
		zzx = s13;
	//   44   85:aload_0         
	//   45   86:aload           15
	//   46   88:putfield        #93  <Field String zzx>
	//   47   91:return          
	}

	public static UserAddress fromIntent(Intent intent)
	{
		if(intent != null && intent.hasExtra("com.google.android.gms.identity.intents.EXTRA_ADDRESS"))
	//*   0    0:aload_0         
	//*   1    1:ifnull          26
	//*   2    4:aload_0         
	//*   3    5:ldc1            #99  <String "com.google.android.gms.identity.intents.EXTRA_ADDRESS">
	//*   4    7:invokevirtual   #105 <Method boolean Intent.hasExtra(String)>
	//*   5   10:ifne            16
	//*   6   13:goto            26
			return (UserAddress)intent.getParcelableExtra("com.google.android.gms.identity.intents.EXTRA_ADDRESS");
	//    7   16:aload_0         
	//    8   17:ldc1            #99  <String "com.google.android.gms.identity.intents.EXTRA_ADDRESS">
	//    9   19:invokevirtual   #109 <Method android.os.Parcelable Intent.getParcelableExtra(String)>
	//   10   22:checkcast       #2   <Class UserAddress>
	//   11   25:areturn         
		else
			return null;
	//   12   26:aconst_null     
	//   13   27:areturn         
	}

	public final String getAddress1()
	{
		return zzl;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field String zzl>
	//    2    4:areturn         
	}

	public final String getAddress2()
	{
		return zzm;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field String zzm>
	//    2    4:areturn         
	}

	public final String getAddress3()
	{
		return zzn;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field String zzn>
	//    2    4:areturn         
	}

	public final String getAddress4()
	{
		return zzo;
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field String zzo>
	//    2    4:areturn         
	}

	public final String getAddress5()
	{
		return zzp;
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field String zzp>
	//    2    4:areturn         
	}

	public final String getAdministrativeArea()
	{
		return zzq;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field String zzq>
	//    2    4:areturn         
	}

	public final String getCompanyName()
	{
		return zzw;
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field String zzw>
	//    2    4:areturn         
	}

	public final String getCountryCode()
	{
		return zzk;
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field String zzk>
	//    2    4:areturn         
	}

	public final String getEmailAddress()
	{
		return zzx;
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field String zzx>
	//    2    4:areturn         
	}

	public final String getLocality()
	{
		return zzr;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field String zzr>
	//    2    4:areturn         
	}

	public final String getName()
	{
		return name;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field String name>
	//    2    4:areturn         
	}

	public final String getPhoneNumber()
	{
		return zzu;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field String zzu>
	//    2    4:areturn         
	}

	public final String getPostalCode()
	{
		return zzs;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field String zzs>
	//    2    4:areturn         
	}

	public final String getSortingCode()
	{
		return zzt;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field String zzt>
	//    2    4:areturn         
	}

	public final boolean isPostBox()
	{
		return zzv;
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field boolean zzv>
	//    2    4:ireturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		i = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #134 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_2        
		SafeParcelWriter.writeString(parcel, 2, name, false);
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:getfield        #65  <Field String name>
	//    7   11:iconst_0        
	//    8   12:invokestatic    #138 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeString(parcel, 3, zzl, false);
	//    9   15:aload_1         
	//   10   16:iconst_3        
	//   11   17:aload_0         
	//   12   18:getfield        #67  <Field String zzl>
	//   13   21:iconst_0        
	//   14   22:invokestatic    #138 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeString(parcel, 4, zzm, false);
	//   15   25:aload_1         
	//   16   26:iconst_4        
	//   17   27:aload_0         
	//   18   28:getfield        #69  <Field String zzm>
	//   19   31:iconst_0        
	//   20   32:invokestatic    #138 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeString(parcel, 5, zzn, false);
	//   21   35:aload_1         
	//   22   36:iconst_5        
	//   23   37:aload_0         
	//   24   38:getfield        #71  <Field String zzn>
	//   25   41:iconst_0        
	//   26   42:invokestatic    #138 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeString(parcel, 6, zzo, false);
	//   27   45:aload_1         
	//   28   46:bipush          6
	//   29   48:aload_0         
	//   30   49:getfield        #73  <Field String zzo>
	//   31   52:iconst_0        
	//   32   53:invokestatic    #138 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeString(parcel, 7, zzp, false);
	//   33   56:aload_1         
	//   34   57:bipush          7
	//   35   59:aload_0         
	//   36   60:getfield        #75  <Field String zzp>
	//   37   63:iconst_0        
	//   38   64:invokestatic    #138 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeString(parcel, 8, zzq, false);
	//   39   67:aload_1         
	//   40   68:bipush          8
	//   41   70:aload_0         
	//   42   71:getfield        #77  <Field String zzq>
	//   43   74:iconst_0        
	//   44   75:invokestatic    #138 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeString(parcel, 9, zzr, false);
	//   45   78:aload_1         
	//   46   79:bipush          9
	//   47   81:aload_0         
	//   48   82:getfield        #79  <Field String zzr>
	//   49   85:iconst_0        
	//   50   86:invokestatic    #138 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeString(parcel, 10, zzk, false);
	//   51   89:aload_1         
	//   52   90:bipush          10
	//   53   92:aload_0         
	//   54   93:getfield        #81  <Field String zzk>
	//   55   96:iconst_0        
	//   56   97:invokestatic    #138 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeString(parcel, 11, zzs, false);
	//   57  100:aload_1         
	//   58  101:bipush          11
	//   59  103:aload_0         
	//   60  104:getfield        #83  <Field String zzs>
	//   61  107:iconst_0        
	//   62  108:invokestatic    #138 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeString(parcel, 12, zzt, false);
	//   63  111:aload_1         
	//   64  112:bipush          12
	//   65  114:aload_0         
	//   66  115:getfield        #85  <Field String zzt>
	//   67  118:iconst_0        
	//   68  119:invokestatic    #138 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeString(parcel, 13, zzu, false);
	//   69  122:aload_1         
	//   70  123:bipush          13
	//   71  125:aload_0         
	//   72  126:getfield        #87  <Field String zzu>
	//   73  129:iconst_0        
	//   74  130:invokestatic    #138 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeBoolean(parcel, 14, zzv);
	//   75  133:aload_1         
	//   76  134:bipush          14
	//   77  136:aload_0         
	//   78  137:getfield        #89  <Field boolean zzv>
	//   79  140:invokestatic    #142 <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
		SafeParcelWriter.writeString(parcel, 15, zzw, false);
	//   80  143:aload_1         
	//   81  144:bipush          15
	//   82  146:aload_0         
	//   83  147:getfield        #91  <Field String zzw>
	//   84  150:iconst_0        
	//   85  151:invokestatic    #138 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeString(parcel, 16, zzx, false);
	//   86  154:aload_1         
	//   87  155:bipush          16
	//   88  157:aload_0         
	//   89  158:getfield        #93  <Field String zzx>
	//   90  161:iconst_0        
	//   91  162:invokestatic    #138 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, i);
	//   92  165:aload_1         
	//   93  166:iload_2         
	//   94  167:invokestatic    #145 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   95  170:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzb();
	private String name;
	private String zzk;
	private String zzl;
	private String zzm;
	private String zzn;
	private String zzo;
	private String zzp;
	private String zzq;
	private String zzr;
	private String zzs;
	private String zzt;
	private String zzu;
	private boolean zzv;
	private String zzw;
	private String zzx;

	static 
	{
	//    0    0:new             #53  <Class zzb>
	//    1    3:dup             
	//    2    4:invokespecial   #56  <Method void zzb()>
	//    3    7:putstatic       #58  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
