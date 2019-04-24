// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.os.ParcelableCompat;
import android.support.v4.os.ParcelableCompatCreatorCallbacks;

public abstract class AbsSavedState
	implements Parcelable
{

	private AbsSavedState()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void Object()>
		mSuperState = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #37  <Field Parcelable mSuperState>
	//    5    9:return          
	}

	protected AbsSavedState(Parcel parcel)
	{
		this(parcel, ((ClassLoader) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #41  <Method void AbsSavedState(Parcel, ClassLoader)>
	//    4    6:return          
	}

	protected AbsSavedState(Parcel parcel, ClassLoader classloader)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void Object()>
		parcel = ((Parcel) (parcel.readParcelable(classloader)));
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #47  <Method Parcelable Parcel.readParcelable(ClassLoader)>
	//    5    9:astore_1        
		if(parcel == null)
	//*   6   10:aload_1         
	//*   7   11:ifnull          17
	//*   8   14:goto            21
			parcel = ((Parcel) (EMPTY_STATE));
	//    9   17:getstatic       #24  <Field AbsSavedState EMPTY_STATE>
	//   10   20:astore_1        
		mSuperState = ((Parcelable) (parcel));
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:putfield        #37  <Field Parcelable mSuperState>
	//   14   26:return          
	}

	protected AbsSavedState(Parcelable parcelable)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void Object()>
		if(parcelable == null)
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       18
			throw new IllegalArgumentException("superState must not be null");
	//    4    8:new             #50  <Class IllegalArgumentException>
	//    5   11:dup             
	//    6   12:ldc1            #52  <String "superState must not be null">
	//    7   14:invokespecial   #55  <Method void IllegalArgumentException(String)>
	//    8   17:athrow          
		if(parcelable == EMPTY_STATE)
	//*   9   18:aload_1         
	//*  10   19:getstatic       #24  <Field AbsSavedState EMPTY_STATE>
	//*  11   22:if_acmpeq       28
	//*  12   25:goto            30
			parcelable = null;
	//   13   28:aconst_null     
	//   14   29:astore_1        
		mSuperState = parcelable;
	//   15   30:aload_0         
	//   16   31:aload_1         
	//   17   32:putfield        #37  <Field Parcelable mSuperState>
	//   18   35:return          
	}


	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public final Parcelable getSuperState()
	{
		return mSuperState;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field Parcelable mSuperState>
	//    2    4:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeParcelable(mSuperState, i);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #37  <Field Parcelable mSuperState>
	//    3    5:iload_2         
	//    4    6:invokevirtual   #67  <Method void Parcel.writeParcelable(Parcelable, int)>
	//    5    9:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = ParcelableCompat.newCreator(new ParcelableCompatCreatorCallbacks() {

		public AbsSavedState createFromParcel(Parcel parcel, ClassLoader classloader)
		{
			if(parcel.readParcelable(classloader) != null)
		//*   0    0:aload_1         
		//*   1    1:aload_2         
		//*   2    2:invokevirtual   #22  <Method Parcelable Parcel.readParcelable(ClassLoader)>
		//*   3    5:ifnull          18
				throw new IllegalStateException("superState must be null");
		//    4    8:new             #24  <Class IllegalStateException>
		//    5   11:dup             
		//    6   12:ldc1            #26  <String "superState must be null">
		//    7   14:invokespecial   #29  <Method void IllegalStateException(String)>
		//    8   17:athrow          
			else
				return AbsSavedState.EMPTY_STATE;
		//    9   18:getstatic       #33  <Field AbsSavedState AbsSavedState.EMPTY_STATE>
		//   10   21:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel, ClassLoader classloader)
		{
			return ((Object) (createFromParcel(parcel, classloader)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #36  <Method AbsSavedState createFromParcel(Parcel, ClassLoader)>
		//    4    6:areturn         
		}

		public AbsSavedState[] newArray(int i)
		{
			return new AbsSavedState[i];
		//    0    0:iload_1         
		//    1    1:anewarray       AbsSavedState[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #41  <Method AbsSavedState[] newArray(int)>
		//    3    5:areturn         
		}

	}
);
	public static final AbsSavedState EMPTY_STATE = new AbsSavedState() {

	}
;
	private final Parcelable mSuperState;

	static 
	{
	//    0    0:new             #8   <Class AbsSavedState$1>
	//    1    3:dup             
	//    2    4:invokespecial   #22  <Method void AbsSavedState$1()>
	//    3    7:putstatic       #24  <Field AbsSavedState EMPTY_STATE>
	//    4   10:new             #10  <Class AbsSavedState$2>
	//    5   13:dup             
	//    6   14:invokespecial   #25  <Method void AbsSavedState$2()>
	//    7   17:invokestatic    #31  <Method android.os.Parcelable$Creator ParcelableCompat.newCreator(ParcelableCompatCreatorCallbacks)>
	//    8   20:putstatic       #33  <Field android.os.Parcelable$Creator CREATOR>
	//*   9   23:return          
	}
}
