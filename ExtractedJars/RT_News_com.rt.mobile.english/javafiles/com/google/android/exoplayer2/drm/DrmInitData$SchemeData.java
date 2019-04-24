// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.drm;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;
import java.util.UUID;

// Referenced classes of package com.google.android.exoplayer2.drm:
//			DrmInitData

public static final class DrmInitData$SchemeData
	implements Parcelable
{

	public boolean canReplace(DrmInitData$SchemeData drminitdata$schemedata)
	{
		return hasData() && !drminitdata$schemedata.hasData() && matches(drminitdata$schemedata.uuid);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #93  <Method boolean hasData()>
	//    2    4:ifeq            27
	//    3    7:aload_1         
	//    4    8:invokevirtual   #93  <Method boolean hasData()>
	//    5   11:ifne            27
	//    6   14:aload_0         
	//    7   15:aload_1         
	//    8   16:getfield        #49  <Field UUID uuid>
	//    9   19:invokevirtual   #97  <Method boolean matches(UUID)>
	//   10   22:ifeq            27
	//   11   25:iconst_1        
	//   12   26:ireturn         
	//   13   27:iconst_0        
	//   14   28:ireturn         
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean equals(Object obj)
	{
		if(!(obj instanceof DrmInitData$SchemeData))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class DrmInitData$SchemeData>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		if(obj == this)
	//*   5    9:aload_1         
	//*   6   10:aload_0         
	//*   7   11:if_acmpne       16
			return true;
	//    8   14:iconst_1        
	//    9   15:ireturn         
		obj = ((Object) ((DrmInitData$SchemeData)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class DrmInitData$SchemeData>
	//   12   20:astore_1        
		return Util.areEqual(((Object) (licenseServerUrl)), ((Object) (((DrmInitData$SchemeData) (obj)).licenseServerUrl))) && Util.areEqual(((Object) (mimeType)), ((Object) (((DrmInitData$SchemeData) (obj)).mimeType))) && Util.areEqual(((Object) (uuid)), ((Object) (((DrmInitData$SchemeData) (obj)).uuid))) && Arrays.equals(data, ((DrmInitData$SchemeData) (obj)).data);
	//   13   21:aload_0         
	//   14   22:getfield        #55  <Field String licenseServerUrl>
	//   15   25:aload_1         
	//   16   26:getfield        #55  <Field String licenseServerUrl>
	//   17   29:invokestatic    #107 <Method boolean Util.areEqual(Object, Object)>
	//   18   32:ifeq            79
	//   19   35:aload_0         
	//   20   36:getfield        #57  <Field String mimeType>
	//   21   39:aload_1         
	//   22   40:getfield        #57  <Field String mimeType>
	//   23   43:invokestatic    #107 <Method boolean Util.areEqual(Object, Object)>
	//   24   46:ifeq            79
	//   25   49:aload_0         
	//   26   50:getfield        #49  <Field UUID uuid>
	//   27   53:aload_1         
	//   28   54:getfield        #49  <Field UUID uuid>
	//   29   57:invokestatic    #107 <Method boolean Util.areEqual(Object, Object)>
	//   30   60:ifeq            79
	//   31   63:aload_0         
	//   32   64:getfield        #63  <Field byte[] data>
	//   33   67:aload_1         
	//   34   68:getfield        #63  <Field byte[] data>
	//   35   71:invokestatic    #112 <Method boolean Arrays.equals(byte[], byte[])>
	//   36   74:ifeq            79
	//   37   77:iconst_1        
	//   38   78:ireturn         
	//   39   79:iconst_0        
	//   40   80:ireturn         
	}

	public boolean hasData()
	{
		return data != null;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field byte[] data>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public int hashCode()
	{
		if(hashCode == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #114 <Field int hashCode>
	//*   2    4:ifne            67
		{
			int j = uuid.hashCode();
	//    3    7:aload_0         
	//    4    8:getfield        #49  <Field UUID uuid>
	//    5   11:invokevirtual   #116 <Method int UUID.hashCode()>
	//    6   14:istore_2        
			int i;
			if(licenseServerUrl == null)
	//*   7   15:aload_0         
	//*   8   16:getfield        #55  <Field String licenseServerUrl>
	//*   9   19:ifnonnull       27
				i = 0;
	//   10   22:iconst_0        
	//   11   23:istore_1        
			else
	//*  12   24:goto            35
				i = licenseServerUrl.hashCode();
	//   13   27:aload_0         
	//   14   28:getfield        #55  <Field String licenseServerUrl>
	//   15   31:invokevirtual   #117 <Method int String.hashCode()>
	//   16   34:istore_1        
			hashCode = 31 * ((j * 31 + i) * 31 + mimeType.hashCode()) + Arrays.hashCode(data);
	//   17   35:aload_0         
	//   18   36:bipush          31
	//   19   38:iload_2         
	//   20   39:bipush          31
	//   21   41:imul            
	//   22   42:iload_1         
	//   23   43:iadd            
	//   24   44:bipush          31
	//   25   46:imul            
	//   26   47:aload_0         
	//   27   48:getfield        #57  <Field String mimeType>
	//   28   51:invokevirtual   #117 <Method int String.hashCode()>
	//   29   54:iadd            
	//   30   55:imul            
	//   31   56:aload_0         
	//   32   57:getfield        #63  <Field byte[] data>
	//   33   60:invokestatic    #120 <Method int Arrays.hashCode(byte[])>
	//   34   63:iadd            
	//   35   64:putfield        #114 <Field int hashCode>
		}
		return hashCode;
	//   36   67:aload_0         
	//   37   68:getfield        #114 <Field int hashCode>
	//   38   71:ireturn         
	}

	public boolean matches(UUID uuid1)
	{
		return C.UUID_NIL.equals(((Object) (uuid))) || uuid1.equals(((Object) (uuid)));
	//    0    0:getstatic       #125 <Field UUID C.UUID_NIL>
	//    1    3:aload_0         
	//    2    4:getfield        #49  <Field UUID uuid>
	//    3    7:invokevirtual   #127 <Method boolean UUID.equals(Object)>
	//    4   10:ifne            29
	//    5   13:aload_1         
	//    6   14:aload_0         
	//    7   15:getfield        #49  <Field UUID uuid>
	//    8   18:invokevirtual   #127 <Method boolean UUID.equals(Object)>
	//    9   21:ifeq            27
	//   10   24:goto            29
	//   11   27:iconst_0        
	//   12   28:ireturn         
	//   13   29:iconst_1        
	//   14   30:ireturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeLong(uuid.getMostSignificantBits());
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #49  <Field UUID uuid>
	//    3    5:invokevirtual   #132 <Method long UUID.getMostSignificantBits()>
	//    4    8:invokevirtual   #136 <Method void Parcel.writeLong(long)>
		parcel.writeLong(uuid.getLeastSignificantBits());
	//    5   11:aload_1         
	//    6   12:aload_0         
	//    7   13:getfield        #49  <Field UUID uuid>
	//    8   16:invokevirtual   #139 <Method long UUID.getLeastSignificantBits()>
	//    9   19:invokevirtual   #136 <Method void Parcel.writeLong(long)>
		parcel.writeString(licenseServerUrl);
	//   10   22:aload_1         
	//   11   23:aload_0         
	//   12   24:getfield        #55  <Field String licenseServerUrl>
	//   13   27:invokevirtual   #143 <Method void Parcel.writeString(String)>
		parcel.writeString(mimeType);
	//   14   30:aload_1         
	//   15   31:aload_0         
	//   16   32:getfield        #57  <Field String mimeType>
	//   17   35:invokevirtual   #143 <Method void Parcel.writeString(String)>
		parcel.writeByteArray(data);
	//   18   38:aload_1         
	//   19   39:aload_0         
	//   20   40:getfield        #63  <Field byte[] data>
	//   21   43:invokevirtual   #147 <Method void Parcel.writeByteArray(byte[])>
		parcel.writeByte((byte)requiresSecureDecryption);
	//   22   46:aload_1         
	//   23   47:aload_0         
	//   24   48:getfield        #69  <Field boolean requiresSecureDecryption>
	//   25   51:int2byte        
	//   26   52:invokevirtual   #151 <Method void Parcel.writeByte(byte)>
	//   27   55:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public DrmInitData.SchemeData createFromParcel(Parcel parcel)
		{
			return new DrmInitData.SchemeData(parcel);
		//    0    0:new             #9   <Class DrmInitData$SchemeData>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #22  <Method void DrmInitData$SchemeData(Parcel)>
		//    4    8:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #25  <Method DrmInitData$SchemeData createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public DrmInitData.SchemeData[] newArray(int i)
		{
			return new DrmInitData.SchemeData[i];
		//    0    0:iload_1         
		//    1    1:anewarray       DrmInitData.SchemeData[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #30  <Method DrmInitData$SchemeData[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	public final byte data[];
	private int hashCode;
	public final String licenseServerUrl;
	public final String mimeType;
	public final boolean requiresSecureDecryption;
	private final UUID uuid;

	static 
	{
	//    0    0:new             #11  <Class DrmInitData$SchemeData$1>
	//    1    3:dup             
	//    2    4:invokespecial   #31  <Method void DrmInitData$SchemeData$1()>
	//    3    7:putstatic       #33  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}


/*
	static UUID access$000(DrmInitData$SchemeData drminitdata$schemedata)
	{
		return drminitdata$schemedata.uuid;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field UUID uuid>
	//    2    4:areturn         
	}

*/

	DrmInitData$SchemeData(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void Object()>
		uuid = new UUID(parcel.readLong(), parcel.readLong());
	//    2    4:aload_0         
	//    3    5:new             #38  <Class UUID>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokevirtual   #44  <Method long Parcel.readLong()>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #44  <Method long Parcel.readLong()>
	//    9   17:invokespecial   #47  <Method void UUID(long, long)>
	//   10   20:putfield        #49  <Field UUID uuid>
		licenseServerUrl = parcel.readString();
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:invokevirtual   #53  <Method String Parcel.readString()>
	//   14   28:putfield        #55  <Field String licenseServerUrl>
		mimeType = parcel.readString();
	//   15   31:aload_0         
	//   16   32:aload_1         
	//   17   33:invokevirtual   #53  <Method String Parcel.readString()>
	//   18   36:putfield        #57  <Field String mimeType>
		data = parcel.createByteArray();
	//   19   39:aload_0         
	//   20   40:aload_1         
	//   21   41:invokevirtual   #61  <Method byte[] Parcel.createByteArray()>
	//   22   44:putfield        #63  <Field byte[] data>
		boolean flag;
		if(parcel.readByte() != 0)
	//*  23   47:aload_1         
	//*  24   48:invokevirtual   #67  <Method byte Parcel.readByte()>
	//*  25   51:ifeq            59
			flag = true;
	//   26   54:iconst_1        
	//   27   55:istore_2        
		else
	//*  28   56:goto            61
			flag = false;
	//   29   59:iconst_0        
	//   30   60:istore_2        
		requiresSecureDecryption = flag;
	//   31   61:aload_0         
	//   32   62:iload_2         
	//   33   63:putfield        #69  <Field boolean requiresSecureDecryption>
	//   34   66:return          
	}

	public DrmInitData$SchemeData(UUID uuid1, String s, String s1, byte abyte0[], boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void Object()>
		uuid = (UUID)Assertions.checkNotNull(((Object) (uuid1)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #76  <Method Object Assertions.checkNotNull(Object)>
	//    5    9:checkcast       #38  <Class UUID>
	//    6   12:putfield        #49  <Field UUID uuid>
		licenseServerUrl = s;
	//    7   15:aload_0         
	//    8   16:aload_2         
	//    9   17:putfield        #55  <Field String licenseServerUrl>
		mimeType = (String)Assertions.checkNotNull(((Object) (s1)));
	//   10   20:aload_0         
	//   11   21:aload_3         
	//   12   22:invokestatic    #76  <Method Object Assertions.checkNotNull(Object)>
	//   13   25:checkcast       #78  <Class String>
	//   14   28:putfield        #57  <Field String mimeType>
		data = abyte0;
	//   15   31:aload_0         
	//   16   32:aload           4
	//   17   34:putfield        #63  <Field byte[] data>
		requiresSecureDecryption = flag;
	//   18   37:aload_0         
	//   19   38:iload           5
	//   20   40:putfield        #69  <Field boolean requiresSecureDecryption>
	//   21   43:return          
	}

	public DrmInitData$SchemeData(UUID uuid1, String s, byte abyte0[])
	{
		this(uuid1, s, abyte0, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iconst_0        
	//    5    5:invokespecial   #83  <Method void DrmInitData$SchemeData(UUID, String, byte[], boolean)>
	//    6    8:return          
	}

	public DrmInitData$SchemeData(UUID uuid1, String s, byte abyte0[], boolean flag)
	{
		this(uuid1, ((String) (null)), s, abyte0, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:aload_2         
	//    4    4:aload_3         
	//    5    5:iload           4
	//    6    7:invokespecial   #85  <Method void DrmInitData$SchemeData(UUID, String, String, byte[], boolean)>
	//    7   10:return          
	}
}
