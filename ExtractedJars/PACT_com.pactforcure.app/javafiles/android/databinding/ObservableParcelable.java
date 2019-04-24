// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

// Referenced classes of package android.databinding:
//			ObservableField

public class ObservableParcelable extends ObservableField
	implements Parcelable, Serializable
{

	public ObservableParcelable()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void ObservableField()>
	//    2    4:return          
	}

	public ObservableParcelable(Parcelable parcelable)
	{
		super(((Object) (parcelable)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #31  <Method void ObservableField(Object)>
	//    3    5:return          
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeParcelable((Parcelable)get(), 0);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #41  <Method Object get()>
	//    3    5:checkcast       #7   <Class Parcelable>
	//    4    8:iconst_0        
	//    5    9:invokevirtual   #47  <Method void Parcel.writeParcelable(Parcelable, int)>
	//    6   12:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public ObservableParcelable createFromParcel(Parcel parcel)
		{
			return new ObservableParcelable(parcel.readParcelable(((Object)this).getClass().getClassLoader()));
		//    0    0:new             #9   <Class ObservableParcelable>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aload_0         
		//    4    6:invokevirtual   #20  <Method Class Object.getClass()>
		//    5    9:invokevirtual   #26  <Method ClassLoader Class.getClassLoader()>
		//    6   12:invokevirtual   #32  <Method Parcelable Parcel.readParcelable(ClassLoader)>
		//    7   15:invokespecial   #35  <Method void ObservableParcelable(Parcelable)>
		//    8   18:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #38  <Method ObservableParcelable createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public ObservableParcelable[] newArray(int i)
		{
			return new ObservableParcelable[i];
		//    0    0:iload_1         
		//    1    1:anewarray       ObservableParcelable[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #43  <Method ObservableParcelable[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	static final long serialVersionUID = 1L;

	static 
	{
	//    0    0:new             #11  <Class ObservableParcelable$1>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void ObservableParcelable$1()>
	//    3    7:putstatic       #25  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
