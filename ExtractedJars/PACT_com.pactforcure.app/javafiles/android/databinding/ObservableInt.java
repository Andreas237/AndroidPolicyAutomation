// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

// Referenced classes of package android.databinding:
//			BaseObservable

public class ObservableInt extends BaseObservable
	implements Parcelable, Serializable
{

	public ObservableInt()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void BaseObservable()>
	//    2    4:return          
	}

	public ObservableInt(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void BaseObservable()>
		mValue = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #31  <Field int mValue>
	//    5    9:return          
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public int get()
	{
		return mValue;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field int mValue>
	//    2    4:ireturn         
	}

	public void set(int i)
	{
		if(i != mValue)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #31  <Field int mValue>
	//*   3    5:icmpeq          17
		{
			mValue = i;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #31  <Field int mValue>
			notifyChange();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #38  <Method void notifyChange()>
		}
	//    9   17:return          
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeInt(mValue);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #31  <Field int mValue>
	//    3    5:invokevirtual   #45  <Method void Parcel.writeInt(int)>
	//    4    8:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public ObservableInt createFromParcel(Parcel parcel)
		{
			return new ObservableInt(parcel.readInt());
		//    0    0:new             #9   <Class ObservableInt>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokevirtual   #22  <Method int Parcel.readInt()>
		//    4    8:invokespecial   #25  <Method void ObservableInt(int)>
		//    5   11:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #28  <Method ObservableInt createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public ObservableInt[] newArray(int i)
		{
			return new ObservableInt[i];
		//    0    0:iload_1         
		//    1    1:anewarray       ObservableInt[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #33  <Method ObservableInt[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	static final long serialVersionUID = 1L;
	private int mValue;

	static 
	{
	//    0    0:new             #10  <Class ObservableInt$1>
	//    1    3:dup             
	//    2    4:invokespecial   #24  <Method void ObservableInt$1()>
	//    3    7:putstatic       #26  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
