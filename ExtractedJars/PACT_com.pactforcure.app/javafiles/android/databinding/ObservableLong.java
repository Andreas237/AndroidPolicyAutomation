// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

// Referenced classes of package android.databinding:
//			BaseObservable

public class ObservableLong extends BaseObservable
	implements Parcelable, Serializable
{

	public ObservableLong()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void BaseObservable()>
	//    2    4:return          
	}

	public ObservableLong(long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void BaseObservable()>
		mValue = l;
	//    2    4:aload_0         
	//    3    5:lload_1         
	//    4    6:putfield        #30  <Field long mValue>
	//    5    9:return          
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public long get()
	{
		return mValue;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field long mValue>
	//    2    4:lreturn         
	}

	public void set(long l)
	{
		if(l != mValue)
	//*   0    0:lload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #30  <Field long mValue>
	//*   3    5:lcmp            
	//*   4    6:ifeq            18
		{
			mValue = l;
	//    5    9:aload_0         
	//    6   10:lload_1         
	//    7   11:putfield        #30  <Field long mValue>
			notifyChange();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #38  <Method void notifyChange()>
		}
	//   10   18:return          
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeLong(mValue);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #30  <Field long mValue>
	//    3    5:invokevirtual   #45  <Method void Parcel.writeLong(long)>
	//    4    8:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public ObservableLong createFromParcel(Parcel parcel)
		{
			return new ObservableLong(parcel.readLong());
		//    0    0:new             #9   <Class ObservableLong>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokevirtual   #22  <Method long Parcel.readLong()>
		//    4    8:invokespecial   #25  <Method void ObservableLong(long)>
		//    5   11:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #28  <Method ObservableLong createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public ObservableLong[] newArray(int i)
		{
			return new ObservableLong[i];
		//    0    0:iload_1         
		//    1    1:anewarray       ObservableLong[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #33  <Method ObservableLong[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	static final long serialVersionUID = 1L;
	private long mValue;

	static 
	{
	//    0    0:new             #10  <Class ObservableLong$1>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void ObservableLong$1()>
	//    3    7:putstatic       #25  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
