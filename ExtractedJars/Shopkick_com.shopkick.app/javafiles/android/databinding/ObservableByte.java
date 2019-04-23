// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

// Referenced classes of package android.databinding:
//			BaseObservableField, Observable

public class ObservableByte extends BaseObservableField
	implements Parcelable, Serializable
{

	public ObservableByte()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void BaseObservableField()>
	//    2    4:return          
	}

	public ObservableByte(byte byte0)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void BaseObservableField()>
		mValue = byte0;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #31  <Field byte mValue>
	//    5    9:return          
	}

	public transient ObservableByte(Observable aobservable[])
	{
		super(aobservable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #34  <Method void BaseObservableField(Observable[])>
	//    3    5:return          
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public byte get()
	{
		return mValue;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field byte mValue>
	//    2    4:ireturn         
	}

	public void set(byte byte0)
	{
		if(byte0 != mValue)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #31  <Field byte mValue>
	//*   3    5:icmpeq          17
		{
			mValue = byte0;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #31  <Field byte mValue>
			notifyChange();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #42  <Method void notifyChange()>
		}
	//    9   17:return          
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeByte(mValue);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #31  <Field byte mValue>
	//    3    5:invokevirtual   #49  <Method void Parcel.writeByte(byte)>
	//    4    8:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public ObservableByte createFromParcel(Parcel parcel)
		{
			return new ObservableByte(parcel.readByte());
		//    0    0:new             #9   <Class ObservableByte>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokevirtual   #22  <Method byte Parcel.readByte()>
		//    4    8:invokespecial   #25  <Method void ObservableByte(byte)>
		//    5   11:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #28  <Method ObservableByte createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public ObservableByte[] newArray(int i)
		{
			return new ObservableByte[i];
		//    0    0:iload_1         
		//    1    1:anewarray       ObservableByte[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #33  <Method ObservableByte[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	static final long serialVersionUID = 1L;
	private byte mValue;

	static 
	{
	//    0    0:new             #10  <Class ObservableByte$1>
	//    1    3:dup             
	//    2    4:invokespecial   #24  <Method void ObservableByte$1()>
	//    3    7:putstatic       #26  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
