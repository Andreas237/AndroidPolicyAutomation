// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.drm;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.*;

public final class DrmInitData
	implements Comparator, Parcelable
{
	public static final class SchemeData
		implements Parcelable
	{

		public boolean canReplace(SchemeData schemedata)
		{
			return hasData() && !schemedata.hasData() && matches(schemedata.uuid);
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
			if(!(obj instanceof SchemeData))
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
			obj = ((Object) ((SchemeData)obj));
		//   10   16:aload_1         
		//   11   17:checkcast       #2   <Class DrmInitData$SchemeData>
		//   12   20:astore_1        
			return Util.areEqual(((Object) (licenseServerUrl)), ((Object) (((SchemeData) (obj)).licenseServerUrl))) && Util.areEqual(((Object) (mimeType)), ((Object) (((SchemeData) (obj)).mimeType))) && Util.areEqual(((Object) (uuid)), ((Object) (((SchemeData) (obj)).uuid))) && Arrays.equals(data, ((SchemeData) (obj)).data);
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

			public SchemeData createFromParcel(Parcel parcel)
			{
				return new SchemeData(parcel);
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

			public SchemeData[] newArray(int i)
			{
				return new SchemeData[i];
			//    0    0:iload_1         
			//    1    1:anewarray       SchemeData[]
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
		static UUID access$000(SchemeData schemedata)
		{
			return schemedata.uuid;
		//    0    0:aload_0         
		//    1    1:getfield        #49  <Field UUID uuid>
		//    2    4:areturn         
		}

*/

		SchemeData(Parcel parcel)
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

		public SchemeData(UUID uuid1, String s, String s1, byte abyte0[], boolean flag)
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

		public SchemeData(UUID uuid1, String s, byte abyte0[])
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

		public SchemeData(UUID uuid1, String s, byte abyte0[], boolean flag)
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


	DrmInitData(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void Object()>
		schemeType = parcel.readString();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #43  <Method String Parcel.readString()>
	//    5    9:putfield        #45  <Field String schemeType>
		schemeDatas = (SchemeData[])parcel.createTypedArray(SchemeData.CREATOR);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:getstatic       #46  <Field android.os.Parcelable$Creator DrmInitData$SchemeData.CREATOR>
	//    9   17:invokevirtual   #50  <Method Object[] Parcel.createTypedArray(android.os.Parcelable$Creator)>
	//   10   20:checkcast       #51  <Class DrmInitData$SchemeData[]>
	//   11   23:putfield        #53  <Field DrmInitData$SchemeData[] schemeDatas>
		schemeDataCount = schemeDatas.length;
	//   12   26:aload_0         
	//   13   27:aload_0         
	//   14   28:getfield        #53  <Field DrmInitData$SchemeData[] schemeDatas>
	//   15   31:arraylength     
	//   16   32:putfield        #55  <Field int schemeDataCount>
	//   17   35:return          
	}

	public DrmInitData(String s, List list)
	{
		this(s, false, (SchemeData[])list.toArray(((Object []) (new SchemeData[list.size()]))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:aload_2         
	//    4    4:aload_2         
	//    5    5:invokeinterface #62  <Method int List.size()>
	//    6   10:anewarray       SchemeData[]
	//    7   13:invokeinterface #66  <Method Object[] List.toArray(Object[])>
	//    8   18:checkcast       #51  <Class DrmInitData$SchemeData[]>
	//    9   21:invokespecial   #69  <Method void DrmInitData(String, boolean, DrmInitData$SchemeData[])>
	//   10   24:return          
	}

	private transient DrmInitData(String s, boolean flag, SchemeData aschemedata[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void Object()>
		schemeType = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #45  <Field String schemeType>
		s = ((String) (aschemedata));
	//    5    9:aload_3         
	//    6   10:astore_1        
		if(flag)
	//*   7   11:iload_2         
	//*   8   12:ifeq            23
			s = ((String) ((SchemeData[])((SchemeData []) (aschemedata)).clone()));
	//    9   15:aload_3         
	//   10   16:invokevirtual   #75  <Method Object _5B_Lcom.google.android.exoplayer2.drm.DrmInitData$SchemeData_3B_.clone()>
	//   11   19:checkcast       #51  <Class DrmInitData$SchemeData[]>
	//   12   22:astore_1        
		Arrays.sort(((Object []) (s)), ((Comparator) (this)));
	//   13   23:aload_1         
	//   14   24:aload_0         
	//   15   25:invokestatic    #81  <Method void Arrays.sort(Object[], Comparator)>
		schemeDatas = ((SchemeData []) (s));
	//   16   28:aload_0         
	//   17   29:aload_1         
	//   18   30:putfield        #53  <Field DrmInitData$SchemeData[] schemeDatas>
		schemeDataCount = s.length;
	//   19   33:aload_0         
	//   20   34:aload_1         
	//   21   35:arraylength     
	//   22   36:putfield        #55  <Field int schemeDataCount>
	//   23   39:return          
	}

	public transient DrmInitData(String s, SchemeData aschemedata[])
	{
		this(s, true, aschemedata);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:aload_2         
	//    4    4:invokespecial   #69  <Method void DrmInitData(String, boolean, DrmInitData$SchemeData[])>
	//    5    7:return          
	}

	public DrmInitData(List list)
	{
		this(((String) (null)), false, (SchemeData[])list.toArray(((Object []) (new SchemeData[list.size()]))));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:iconst_0        
	//    3    3:aload_1         
	//    4    4:aload_1         
	//    5    5:invokeinterface #62  <Method int List.size()>
	//    6   10:anewarray       SchemeData[]
	//    7   13:invokeinterface #66  <Method Object[] List.toArray(Object[])>
	//    8   18:checkcast       #51  <Class DrmInitData$SchemeData[]>
	//    9   21:invokespecial   #69  <Method void DrmInitData(String, boolean, DrmInitData$SchemeData[])>
	//   10   24:return          
	}

	public transient DrmInitData(SchemeData aschemedata[])
	{
		this(((String) (null)), aschemedata);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aload_1         
	//    3    3:invokespecial   #88  <Method void DrmInitData(String, DrmInitData$SchemeData[])>
	//    4    6:return          
	}

	private static boolean containsSchemeDataWithUuid(ArrayList arraylist, int i, UUID uuid)
	{
		for(int j = 0; j < i; j++)
	//*   0    0:iconst_0        
	//*   1    1:istore_3        
	//*   2    2:iload_3         
	//*   3    3:iload_1         
	//*   4    4:icmpge          34
			if(((SchemeData)arraylist.get(j)).uuid.equals(((Object) (uuid))))
	//*   5    7:aload_0         
	//*   6    8:iload_3         
	//*   7    9:invokevirtual   #96  <Method Object ArrayList.get(int)>
	//*   8   12:checkcast       #13  <Class DrmInitData$SchemeData>
	//*   9   15:invokestatic    #100 <Method UUID DrmInitData$SchemeData.access$000(DrmInitData$SchemeData)>
	//*  10   18:aload_2         
	//*  11   19:invokevirtual   #106 <Method boolean UUID.equals(Object)>
	//*  12   22:ifeq            27
				return true;
	//   13   25:iconst_1        
	//   14   26:ireturn         

	//   15   27:iload_3         
	//   16   28:iconst_1        
	//   17   29:iadd            
	//   18   30:istore_3        
	//*  19   31:goto            2
		return false;
	//   20   34:iconst_0        
	//   21   35:ireturn         
	}

	public static DrmInitData createSessionCreationData(DrmInitData drminitdata, DrmInitData drminitdata1)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #92  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #110 <Method void ArrayList()>
	//    3    7:astore          8
		boolean flag = false;
	//    4    9:iconst_0        
	//    5   10:istore_3        
		if(drminitdata != null)
	//*   6   11:aload_0         
	//*   7   12:ifnull          69
		{
			String s = drminitdata.schemeType;
	//    8   15:aload_0         
	//    9   16:getfield        #45  <Field String schemeType>
	//   10   19:astore          6
			SchemeData aschemedata[] = drminitdata.schemeDatas;
	//   11   21:aload_0         
	//   12   22:getfield        #53  <Field DrmInitData$SchemeData[] schemeDatas>
	//   13   25:astore          7
			int k = aschemedata.length;
	//   14   27:aload           7
	//   15   29:arraylength     
	//   16   30:istore          4
			int i = 0;
	//   17   32:iconst_0        
	//   18   33:istore_2        
			do
			{
				drminitdata = ((DrmInitData) (s));
	//   19   34:aload           6
	//   20   36:astore_0        
				if(i >= k)
					break;
	//   21   37:iload_2         
	//   22   38:iload           4
	//   23   40:icmpge          71
				drminitdata = ((DrmInitData) (aschemedata[i]));
	//   24   43:aload           7
	//   25   45:iload_2         
	//   26   46:aaload          
	//   27   47:astore_0        
				if(((SchemeData) (drminitdata)).hasData())
	//*  28   48:aload_0         
	//*  29   49:invokevirtual   #114 <Method boolean DrmInitData$SchemeData.hasData()>
	//*  30   52:ifeq            62
					arraylist.add(((Object) (drminitdata)));
	//   31   55:aload           8
	//   32   57:aload_0         
	//   33   58:invokevirtual   #117 <Method boolean ArrayList.add(Object)>
	//   34   61:pop             
				i++;
	//   35   62:iload_2         
	//   36   63:iconst_1        
	//   37   64:iadd            
	//   38   65:istore_2        
			} while(true);
	//   39   66:goto            34
		} else
		{
			drminitdata = null;
	//   40   69:aconst_null     
	//   41   70:astore_0        
		}
		Object obj1 = ((Object) (drminitdata));
	//   42   71:aload_0         
	//   43   72:astore          7
		if(drminitdata1 != null)
	//*  44   74:aload_1         
	//*  45   75:ifnull          158
		{
			Object obj = ((Object) (drminitdata));
	//   46   78:aload_0         
	//   47   79:astore          6
			if(drminitdata == null)
	//*  48   81:aload_0         
	//*  49   82:ifnonnull       91
				obj = ((Object) (drminitdata1.schemeType));
	//   50   85:aload_1         
	//   51   86:getfield        #45  <Field String schemeType>
	//   52   89:astore          6
			int l = arraylist.size();
	//   53   91:aload           8
	//   54   93:invokevirtual   #118 <Method int ArrayList.size()>
	//   55   96:istore          4
			drminitdata = ((DrmInitData) (drminitdata1.schemeDatas));
	//   56   98:aload_1         
	//   57   99:getfield        #53  <Field DrmInitData$SchemeData[] schemeDatas>
	//   58  102:astore_0        
			int i1 = drminitdata.length;
	//   59  103:aload_0         
	//   60  104:arraylength     
	//   61  105:istore          5
			int j = ((int) (flag));
	//   62  107:iload_3         
	//   63  108:istore_2        
			do
			{
				obj1 = obj;
	//   64  109:aload           6
	//   65  111:astore          7
				if(j >= i1)
					break;
	//   66  113:iload_2         
	//   67  114:iload           5
	//   68  116:icmpge          158
				drminitdata1 = ((DrmInitData) (drminitdata[j]));
	//   69  119:aload_0         
	//   70  120:iload_2         
	//   71  121:aaload          
	//   72  122:astore_1        
				if(((SchemeData) (drminitdata1)).hasData() && !containsSchemeDataWithUuid(arraylist, l, ((SchemeData) (drminitdata1)).uuid))
	//*  73  123:aload_1         
	//*  74  124:invokevirtual   #114 <Method boolean DrmInitData$SchemeData.hasData()>
	//*  75  127:ifeq            151
	//*  76  130:aload           8
	//*  77  132:iload           4
	//*  78  134:aload_1         
	//*  79  135:invokestatic    #100 <Method UUID DrmInitData$SchemeData.access$000(DrmInitData$SchemeData)>
	//*  80  138:invokestatic    #120 <Method boolean containsSchemeDataWithUuid(ArrayList, int, UUID)>
	//*  81  141:ifne            151
					arraylist.add(((Object) (drminitdata1)));
	//   82  144:aload           8
	//   83  146:aload_1         
	//   84  147:invokevirtual   #117 <Method boolean ArrayList.add(Object)>
	//   85  150:pop             
				j++;
	//   86  151:iload_2         
	//   87  152:iconst_1        
	//   88  153:iadd            
	//   89  154:istore_2        
			} while(true);
	//   90  155:goto            109
		}
		if(arraylist.isEmpty())
	//*  91  158:aload           8
	//*  92  160:invokevirtual   #123 <Method boolean ArrayList.isEmpty()>
	//*  93  163:ifeq            168
			return null;
	//   94  166:aconst_null     
	//   95  167:areturn         
		else
			return new DrmInitData(((String) (obj1)), ((List) (arraylist)));
	//   96  168:new             #2   <Class DrmInitData>
	//   97  171:dup             
	//   98  172:aload           7
	//   99  174:aload           8
	//  100  176:invokespecial   #125 <Method void DrmInitData(String, List)>
	//  101  179:areturn         
	}

	public int compare(SchemeData schemedata, SchemeData schemedata1)
	{
		if(C.UUID_NIL.equals(((Object) (schemedata.uuid))))
	//*   0    0:getstatic       #134 <Field UUID C.UUID_NIL>
	//*   1    3:aload_1         
	//*   2    4:invokestatic    #100 <Method UUID DrmInitData$SchemeData.access$000(DrmInitData$SchemeData)>
	//*   3    7:invokevirtual   #106 <Method boolean UUID.equals(Object)>
	//*   4   10:ifeq            30
			return !C.UUID_NIL.equals(((Object) (schemedata1.uuid))) ? 1 : 0;
	//    5   13:getstatic       #134 <Field UUID C.UUID_NIL>
	//    6   16:aload_2         
	//    7   17:invokestatic    #100 <Method UUID DrmInitData$SchemeData.access$000(DrmInitData$SchemeData)>
	//    8   20:invokevirtual   #106 <Method boolean UUID.equals(Object)>
	//    9   23:ifeq            28
	//   10   26:iconst_0        
	//   11   27:ireturn         
	//   12   28:iconst_1        
	//   13   29:ireturn         
		else
			return schemedata.uuid.compareTo(schemedata1.uuid);
	//   14   30:aload_1         
	//   15   31:invokestatic    #100 <Method UUID DrmInitData$SchemeData.access$000(DrmInitData$SchemeData)>
	//   16   34:aload_2         
	//   17   35:invokestatic    #100 <Method UUID DrmInitData$SchemeData.access$000(DrmInitData$SchemeData)>
	//   18   38:invokevirtual   #138 <Method int UUID.compareTo(UUID)>
	//   19   41:ireturn         
	}

	public volatile int compare(Object obj, Object obj1)
	{
		return compare((SchemeData)obj, (SchemeData)obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #13  <Class DrmInitData$SchemeData>
	//    3    5:aload_2         
	//    4    6:checkcast       #13  <Class DrmInitData$SchemeData>
	//    5    9:invokevirtual   #141 <Method int compare(DrmInitData$SchemeData, DrmInitData$SchemeData)>
	//    6   12:ireturn         
	}

	public DrmInitData copyWithSchemeType(String s)
	{
		if(Util.areEqual(((Object) (schemeType)), ((Object) (s))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #45  <Field String schemeType>
	//*   2    4:aload_1         
	//*   3    5:invokestatic    #149 <Method boolean Util.areEqual(Object, Object)>
	//*   4    8:ifeq            13
			return this;
	//    5   11:aload_0         
	//    6   12:areturn         
		else
			return new DrmInitData(s, false, schemeDatas);
	//    7   13:new             #2   <Class DrmInitData>
	//    8   16:dup             
	//    9   17:aload_1         
	//   10   18:iconst_0        
	//   11   19:aload_0         
	//   12   20:getfield        #53  <Field DrmInitData$SchemeData[] schemeDatas>
	//   13   23:invokespecial   #69  <Method void DrmInitData(String, boolean, DrmInitData$SchemeData[])>
	//   14   26:areturn         
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
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
		if(obj != null)
	//*   5    7:aload_1         
	//*   6    8:ifnull          61
		{
			if(((Object)this).getClass() != obj.getClass())
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #154 <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #154 <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
				return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			obj = ((Object) ((DrmInitData)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class DrmInitData>
	//   16   28:astore_1        
			return Util.areEqual(((Object) (schemeType)), ((Object) (((DrmInitData) (obj)).schemeType))) && Arrays.equals(((Object []) (schemeDatas)), ((Object []) (((DrmInitData) (obj)).schemeDatas)));
	//   17   29:aload_0         
	//   18   30:getfield        #45  <Field String schemeType>
	//   19   33:aload_1         
	//   20   34:getfield        #45  <Field String schemeType>
	//   21   37:invokestatic    #149 <Method boolean Util.areEqual(Object, Object)>
	//   22   40:ifeq            59
	//   23   43:aload_0         
	//   24   44:getfield        #53  <Field DrmInitData$SchemeData[] schemeDatas>
	//   25   47:aload_1         
	//   26   48:getfield        #53  <Field DrmInitData$SchemeData[] schemeDatas>
	//   27   51:invokestatic    #157 <Method boolean Arrays.equals(Object[], Object[])>
	//   28   54:ifeq            59
	//   29   57:iconst_1        
	//   30   58:ireturn         
	//   31   59:iconst_0        
	//   32   60:ireturn         
		} else
		{
			return false;
	//   33   61:iconst_0        
	//   34   62:ireturn         
		}
	}

	public SchemeData get(int i)
	{
		return schemeDatas[i];
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field DrmInitData$SchemeData[] schemeDatas>
	//    2    4:iload_1         
	//    3    5:aaload          
	//    4    6:areturn         
	}

	public SchemeData get(UUID uuid)
	{
		SchemeData aschemedata[] = schemeDatas;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field DrmInitData$SchemeData[] schemeDatas>
	//    2    4:astore          4
		int i = 0;
	//    3    6:iconst_0        
	//    4    7:istore_2        
		for(int j = aschemedata.length; i < j; i++)
	//*   5    8:aload           4
	//*   6   10:arraylength     
	//*   7   11:istore_3        
	//*   8   12:iload_2         
	//*   9   13:iload_3         
	//*  10   14:icmpge          42
		{
			SchemeData schemedata = aschemedata[i];
	//   11   17:aload           4
	//   12   19:iload_2         
	//   13   20:aaload          
	//   14   21:astore          5
			if(schemedata.matches(uuid))
	//*  15   23:aload           5
	//*  16   25:aload_1         
	//*  17   26:invokevirtual   #164 <Method boolean DrmInitData$SchemeData.matches(UUID)>
	//*  18   29:ifeq            35
				return schemedata;
	//   19   32:aload           5
	//   20   34:areturn         
		}

	//   21   35:iload_2         
	//   22   36:iconst_1        
	//   23   37:iadd            
	//   24   38:istore_2        
	//*  25   39:goto            12
		return null;
	//   26   42:aconst_null     
	//   27   43:areturn         
	}

	public int hashCode()
	{
		if(hashCode == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #167 <Field int hashCode>
	//*   2    4:ifne            43
		{
			int i;
			if(schemeType == null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #45  <Field String schemeType>
	//*   5   11:ifnonnull       19
				i = 0;
	//    6   14:iconst_0        
	//    7   15:istore_1        
			else
	//*   8   16:goto            27
				i = schemeType.hashCode();
	//    9   19:aload_0         
	//   10   20:getfield        #45  <Field String schemeType>
	//   11   23:invokevirtual   #171 <Method int String.hashCode()>
	//   12   26:istore_1        
			hashCode = 31 * i + Arrays.hashCode(((Object []) (schemeDatas)));
	//   13   27:aload_0         
	//   14   28:bipush          31
	//   15   30:iload_1         
	//   16   31:imul            
	//   17   32:aload_0         
	//   18   33:getfield        #53  <Field DrmInitData$SchemeData[] schemeDatas>
	//   19   36:invokestatic    #174 <Method int Arrays.hashCode(Object[])>
	//   20   39:iadd            
	//   21   40:putfield        #167 <Field int hashCode>
		}
		return hashCode;
	//   22   43:aload_0         
	//   23   44:getfield        #167 <Field int hashCode>
	//   24   47:ireturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeString(schemeType);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #45  <Field String schemeType>
	//    3    5:invokevirtual   #180 <Method void Parcel.writeString(String)>
		parcel.writeTypedArray(((Parcelable []) (schemeDatas)), 0);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #53  <Field DrmInitData$SchemeData[] schemeDatas>
	//    7   13:iconst_0        
	//    8   14:invokevirtual   #184 <Method void Parcel.writeTypedArray(Parcelable[], int)>
	//    9   17:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public DrmInitData createFromParcel(Parcel parcel)
		{
			return new DrmInitData(parcel);
		//    0    0:new             #9   <Class DrmInitData>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void DrmInitData(Parcel)>
		//    4    8:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #22  <Method DrmInitData createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public DrmInitData[] newArray(int i)
		{
			return new DrmInitData[i];
		//    0    0:iload_1         
		//    1    1:anewarray       DrmInitData[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #27  <Method DrmInitData[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	private int hashCode;
	public final int schemeDataCount;
	private final SchemeData schemeDatas[];
	public final String schemeType;

	static 
	{
	//    0    0:new             #11  <Class DrmInitData$1>
	//    1    3:dup             
	//    2    4:invokespecial   #32  <Method void DrmInitData$1()>
	//    3    7:putstatic       #34  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
