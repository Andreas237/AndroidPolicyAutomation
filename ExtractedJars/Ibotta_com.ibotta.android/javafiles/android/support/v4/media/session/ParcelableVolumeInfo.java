// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

public class ParcelableVolumeInfo
	implements Parcelable
{

	public ParcelableVolumeInfo(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
		volumeType = parcel.readInt();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #33  <Method int Parcel.readInt()>
	//    5    9:putfield        #35  <Field int volumeType>
		controlType = parcel.readInt();
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #33  <Method int Parcel.readInt()>
	//    9   17:putfield        #37  <Field int controlType>
		maxVolume = parcel.readInt();
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokevirtual   #33  <Method int Parcel.readInt()>
	//   13   25:putfield        #39  <Field int maxVolume>
		currentVolume = parcel.readInt();
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:invokevirtual   #33  <Method int Parcel.readInt()>
	//   17   33:putfield        #41  <Field int currentVolume>
		audioStream = parcel.readInt();
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:invokevirtual   #33  <Method int Parcel.readInt()>
	//   21   41:putfield        #43  <Field int audioStream>
	//   22   44:return          
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeInt(volumeType);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field int volumeType>
	//    3    5:invokevirtual   #50  <Method void Parcel.writeInt(int)>
		parcel.writeInt(controlType);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #37  <Field int controlType>
	//    7   13:invokevirtual   #50  <Method void Parcel.writeInt(int)>
		parcel.writeInt(maxVolume);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #39  <Field int maxVolume>
	//   11   21:invokevirtual   #50  <Method void Parcel.writeInt(int)>
		parcel.writeInt(currentVolume);
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #41  <Field int currentVolume>
	//   15   29:invokevirtual   #50  <Method void Parcel.writeInt(int)>
		parcel.writeInt(audioStream);
	//   16   32:aload_1         
	//   17   33:aload_0         
	//   18   34:getfield        #43  <Field int audioStream>
	//   19   37:invokevirtual   #50  <Method void Parcel.writeInt(int)>
	//   20   40:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public ParcelableVolumeInfo createFromParcel(Parcel parcel)
		{
			return new ParcelableVolumeInfo(parcel);
		//    0    0:new             #9   <Class ParcelableVolumeInfo>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void ParcelableVolumeInfo(Parcel)>
		//    4    8:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #22  <Method ParcelableVolumeInfo createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public ParcelableVolumeInfo[] newArray(int i)
		{
			return new ParcelableVolumeInfo[i];
		//    0    0:iload_1         
		//    1    1:anewarray       ParcelableVolumeInfo[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #27  <Method ParcelableVolumeInfo[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	public int audioStream;
	public int controlType;
	public int currentVolume;
	public int maxVolume;
	public int volumeType;

	static 
	{
	//    0    0:new             #8   <Class ParcelableVolumeInfo$1>
	//    1    3:dup             
	//    2    4:invokespecial   #22  <Method void ParcelableVolumeInfo$1()>
	//    3    7:putstatic       #24  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
