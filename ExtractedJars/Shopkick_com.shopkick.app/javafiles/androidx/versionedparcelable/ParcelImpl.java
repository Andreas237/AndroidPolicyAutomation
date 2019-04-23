// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package androidx.versionedparcelable:
//			VersionedParcelParcel, VersionedParcelable

public class ParcelImpl
	implements Parcelable
{

	protected ParcelImpl(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
		mParcel = (new VersionedParcelParcel(parcel)).readVersionedParcelable();
	//    2    4:aload_0         
	//    3    5:new             #29  <Class VersionedParcelParcel>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #31  <Method void VersionedParcelParcel(Parcel)>
	//    7   13:invokevirtual   #35  <Method VersionedParcelable VersionedParcelParcel.readVersionedParcelable()>
	//    8   16:putfield        #37  <Field VersionedParcelable mParcel>
	//    9   19:return          
	}

	public ParcelImpl(VersionedParcelable versionedparcelable)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
		mParcel = versionedparcelable;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #37  <Field VersionedParcelable mParcel>
	//    5    9:return          
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public VersionedParcelable getVersionedParcel()
	{
		return mParcel;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field VersionedParcelable mParcel>
	//    2    4:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		(new VersionedParcelParcel(parcel)).writeVersionedParcelable(mParcel);
	//    0    0:new             #29  <Class VersionedParcelParcel>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #31  <Method void VersionedParcelParcel(Parcel)>
	//    4    8:aload_0         
	//    5    9:getfield        #37  <Field VersionedParcelable mParcel>
	//    6   12:invokevirtual   #48  <Method void VersionedParcelParcel.writeVersionedParcelable(VersionedParcelable)>
	//    7   15:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public ParcelImpl createFromParcel(Parcel parcel)
		{
			return new ParcelImpl(parcel);
		//    0    0:new             #9   <Class ParcelImpl>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void ParcelImpl(Parcel)>
		//    4    8:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #22  <Method ParcelImpl createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public ParcelImpl[] newArray(int i)
		{
			return new ParcelImpl[i];
		//    0    0:iload_1         
		//    1    1:anewarray       ParcelImpl[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #27  <Method ParcelImpl[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	private final VersionedParcelable mParcel;

	static 
	{
	//    0    0:new             #8   <Class ParcelImpl$1>
	//    1    3:dup             
	//    2    4:invokespecial   #22  <Method void ParcelImpl$1()>
	//    3    7:putstatic       #24  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
