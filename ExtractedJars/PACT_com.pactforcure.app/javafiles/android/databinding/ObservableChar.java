// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

// Referenced classes of package android.databinding:
//			BaseObservable

public class ObservableChar extends BaseObservable
	implements Parcelable, Serializable
{

	public ObservableChar()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void BaseObservable()>
	//    2    4:return          
	}

	public ObservableChar(char c)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void BaseObservable()>
		mValue = c;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #31  <Field char mValue>
	//    5    9:return          
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public char get()
	{
		return mValue;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field char mValue>
	//    2    4:ireturn         
	}

	public void set(char c)
	{
		if(c != mValue)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #31  <Field char mValue>
	//*   3    5:icmpeq          17
		{
			mValue = c;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #31  <Field char mValue>
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
	//    2    2:getfield        #31  <Field char mValue>
	//    3    5:invokevirtual   #47  <Method void Parcel.writeInt(int)>
	//    4    8:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public ObservableChar createFromParcel(Parcel parcel)
		{
			return new ObservableChar((char)parcel.readInt());
		//    0    0:new             #9   <Class ObservableChar>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokevirtual   #22  <Method int Parcel.readInt()>
		//    4    8:int2char        
		//    5    9:invokespecial   #25  <Method void ObservableChar(char)>
		//    6   12:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #28  <Method ObservableChar createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public ObservableChar[] newArray(int i)
		{
			return new ObservableChar[i];
		//    0    0:iload_1         
		//    1    1:anewarray       ObservableChar[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #33  <Method ObservableChar[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	static final long serialVersionUID = 1L;
	private char mValue;

	static 
	{
	//    0    0:new             #10  <Class ObservableChar$1>
	//    1    3:dup             
	//    2    4:invokespecial   #24  <Method void ObservableChar$1()>
	//    3    7:putstatic       #26  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
