// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

// Referenced classes of package android.databinding:
//			BaseObservable

public class ObservableBoolean extends BaseObservable
	implements Parcelable, Serializable
{

	public ObservableBoolean()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void BaseObservable()>
	//    2    4:return          
	}

	public ObservableBoolean(boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void BaseObservable()>
		mValue = flag;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #31  <Field boolean mValue>
	//    5    9:return          
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean get()
	{
		return mValue;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field boolean mValue>
	//    2    4:ireturn         
	}

	public void set(boolean flag)
	{
		if(flag != mValue)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #31  <Field boolean mValue>
	//*   3    5:icmpeq          17
		{
			mValue = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #31  <Field boolean mValue>
			notifyChange();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #39  <Method void notifyChange()>
		}
	//    9   17:return          
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		if(mValue)
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field boolean mValue>
	//*   2    4:ifeq            15
			i = 1;
	//    3    7:iconst_1        
	//    4    8:istore_2        
		else
	//*   5    9:aload_1         
	//*   6   10:iload_2         
	//*   7   11:invokevirtual   #47  <Method void Parcel.writeInt(int)>
	//*   8   14:return          
			i = 0;
	//    9   15:iconst_0        
	//   10   16:istore_2        
		parcel.writeInt(i);
	//*  11   17:goto            9
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public ObservableBoolean createFromParcel(Parcel parcel)
		{
			boolean flag = true;
		//    0    0:iconst_1        
		//    1    1:istore_2        
			if(parcel.readInt() != 1)
		//*   2    2:aload_1         
		//*   3    3:invokevirtual   #22  <Method int Parcel.readInt()>
		//*   4    6:iconst_1        
		//*   5    7:icmpne          19
		//*   6   10:new             #9   <Class ObservableBoolean>
		//*   7   13:dup             
		//*   8   14:iload_2         
		//*   9   15:invokespecial   #25  <Method void ObservableBoolean(boolean)>
		//*  10   18:areturn         
				flag = false;
		//   11   19:iconst_0        
		//   12   20:istore_2        
			return new ObservableBoolean(flag);
		//*  13   21:goto            10
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #28  <Method ObservableBoolean createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public ObservableBoolean[] newArray(int i)
		{
			return new ObservableBoolean[i];
		//    0    0:iload_1         
		//    1    1:anewarray       ObservableBoolean[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #33  <Method ObservableBoolean[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	static final long serialVersionUID = 1L;
	private boolean mValue;

	static 
	{
	//    0    0:new             #10  <Class ObservableBoolean$1>
	//    1    3:dup             
	//    2    4:invokespecial   #24  <Method void ObservableBoolean$1()>
	//    3    7:putstatic       #26  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
