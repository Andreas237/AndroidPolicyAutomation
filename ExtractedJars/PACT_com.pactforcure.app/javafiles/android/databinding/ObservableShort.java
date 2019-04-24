// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

// Referenced classes of package android.databinding:
//			BaseObservable

public class ObservableShort extends BaseObservable
	implements Parcelable, Serializable
{

	public ObservableShort()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void BaseObservable()>
	//    2    4:return          
	}

	public ObservableShort(short word0)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void BaseObservable()>
		mValue = word0;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #31  <Field short mValue>
	//    5    9:return          
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public short get()
	{
		return mValue;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field short mValue>
	//    2    4:ireturn         
	}

	public void set(short word0)
	{
		if(word0 != mValue)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #31  <Field short mValue>
	//*   3    5:icmpeq          17
		{
			mValue = word0;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #31  <Field short mValue>
			notifyChange();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #39  <Method void notifyChange()>
		}
	//    9   17:return          
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeInt(((int) (mValue)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #31  <Field short mValue>
	//    3    5:invokevirtual   #47  <Method void Parcel.writeInt(int)>
	//    4    8:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public ObservableShort createFromParcel(Parcel parcel)
		{
			return new ObservableShort((short)parcel.readInt());
		//    0    0:new             #9   <Class ObservableShort>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokevirtual   #22  <Method int Parcel.readInt()>
		//    4    8:int2short       
		//    5    9:invokespecial   #25  <Method void ObservableShort(short)>
		//    6   12:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #28  <Method ObservableShort createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public ObservableShort[] newArray(int i)
		{
			return new ObservableShort[i];
		//    0    0:iload_1         
		//    1    1:anewarray       ObservableShort[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #33  <Method ObservableShort[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	static final long serialVersionUID = 1L;
	private short mValue;

	static 
	{
	//    0    0:new             #10  <Class ObservableShort$1>
	//    1    3:dup             
	//    2    4:invokespecial   #24  <Method void ObservableShort$1()>
	//    3    7:putstatic       #26  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
