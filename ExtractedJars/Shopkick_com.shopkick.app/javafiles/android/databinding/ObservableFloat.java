// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

// Referenced classes of package android.databinding:
//			BaseObservableField, Observable

public class ObservableFloat extends BaseObservableField
	implements Parcelable, Serializable
{

	public ObservableFloat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void BaseObservableField()>
	//    2    4:return          
	}

	public ObservableFloat(float f)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void BaseObservableField()>
		mValue = f;
	//    2    4:aload_0         
	//    3    5:fload_1         
	//    4    6:putfield        #31  <Field float mValue>
	//    5    9:return          
	}

	public transient ObservableFloat(Observable aobservable[])
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

	public float get()
	{
		return mValue;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field float mValue>
	//    2    4:freturn         
	}

	public void set(float f)
	{
		if(f != mValue)
	//*   0    0:fload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #31  <Field float mValue>
	//*   3    5:fcmpl           
	//*   4    6:ifeq            18
		{
			mValue = f;
	//    5    9:aload_0         
	//    6   10:fload_1         
	//    7   11:putfield        #31  <Field float mValue>
			notifyChange();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #42  <Method void notifyChange()>
		}
	//   10   18:return          
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeFloat(mValue);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #31  <Field float mValue>
	//    3    5:invokevirtual   #49  <Method void Parcel.writeFloat(float)>
	//    4    8:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public ObservableFloat createFromParcel(Parcel parcel)
		{
			return new ObservableFloat(parcel.readFloat());
		//    0    0:new             #9   <Class ObservableFloat>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokevirtual   #22  <Method float Parcel.readFloat()>
		//    4    8:invokespecial   #25  <Method void ObservableFloat(float)>
		//    5   11:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #28  <Method ObservableFloat createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public ObservableFloat[] newArray(int i)
		{
			return new ObservableFloat[i];
		//    0    0:iload_1         
		//    1    1:anewarray       ObservableFloat[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #33  <Method ObservableFloat[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	static final long serialVersionUID = 1L;
	private float mValue;

	static 
	{
	//    0    0:new             #10  <Class ObservableFloat$1>
	//    1    3:dup             
	//    2    4:invokespecial   #24  <Method void ObservableFloat$1()>
	//    3    7:putstatic       #26  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
