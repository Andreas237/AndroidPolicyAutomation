// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

// Referenced classes of package android.databinding:
//			BaseObservableField, Observable

public class ObservableDouble extends BaseObservableField
	implements Parcelable, Serializable
{

	public ObservableDouble()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void BaseObservableField()>
	//    2    4:return          
	}

	public ObservableDouble(double d)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void BaseObservableField()>
		mValue = d;
	//    2    4:aload_0         
	//    3    5:dload_1         
	//    4    6:putfield        #31  <Field double mValue>
	//    5    9:return          
	}

	public transient ObservableDouble(Observable aobservable[])
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

	public double get()
	{
		return mValue;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field double mValue>
	//    2    4:dreturn         
	}

	public void set(double d)
	{
		if(d != mValue)
	//*   0    0:dload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #31  <Field double mValue>
	//*   3    5:dcmpl           
	//*   4    6:ifeq            18
		{
			mValue = d;
	//    5    9:aload_0         
	//    6   10:dload_1         
	//    7   11:putfield        #31  <Field double mValue>
			notifyChange();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #42  <Method void notifyChange()>
		}
	//   10   18:return          
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeDouble(mValue);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #31  <Field double mValue>
	//    3    5:invokevirtual   #49  <Method void Parcel.writeDouble(double)>
	//    4    8:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public ObservableDouble createFromParcel(Parcel parcel)
		{
			return new ObservableDouble(parcel.readDouble());
		//    0    0:new             #9   <Class ObservableDouble>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokevirtual   #22  <Method double Parcel.readDouble()>
		//    4    8:invokespecial   #25  <Method void ObservableDouble(double)>
		//    5   11:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #28  <Method ObservableDouble createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public ObservableDouble[] newArray(int i)
		{
			return new ObservableDouble[i];
		//    0    0:iload_1         
		//    1    1:anewarray       ObservableDouble[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #33  <Method ObservableDouble[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	static final long serialVersionUID = 1L;
	private double mValue;

	static 
	{
	//    0    0:new             #10  <Class ObservableDouble$1>
	//    1    3:dup             
	//    2    4:invokespecial   #24  <Method void ObservableDouble$1()>
	//    3    7:putstatic       #26  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
