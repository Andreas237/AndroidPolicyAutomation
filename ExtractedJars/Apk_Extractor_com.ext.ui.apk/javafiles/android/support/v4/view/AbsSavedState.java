// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.os.Parcel;
import android.os.Parcelable;

public abstract class AbsSavedState
	implements Parcelable
{

	private AbsSavedState()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
		mSuperState = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #31  <Field Parcelable mSuperState>
	//    5    9:return          
	}

	protected AbsSavedState(Parcel parcel)
	{
		this(parcel, ((ClassLoader) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #35  <Method void AbsSavedState(Parcel, ClassLoader)>
	//    4    6:return          
	}

	protected AbsSavedState(Parcel parcel, ClassLoader classloader)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
		parcel = ((Parcel) (parcel.readParcelable(classloader)));
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #41  <Method Parcelable Parcel.readParcelable(ClassLoader)>
	//    5    9:astore_1        
		if(parcel == null)
	//*   6   10:aload_1         
	//*   7   11:ifnull          20
	//*   8   14:aload_0         
	//*   9   15:aload_1         
	//*  10   16:putfield        #31  <Field Parcelable mSuperState>
	//*  11   19:return          
			parcel = ((Parcel) (EMPTY_STATE));
	//   12   20:getstatic       #24  <Field AbsSavedState EMPTY_STATE>
	//   13   23:astore_1        
		mSuperState = ((Parcelable) (parcel));
	//*  14   24:goto            14
	}

	protected AbsSavedState(Parcelable parcelable)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
		if(parcelable == null)
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       18
			throw new IllegalArgumentException("superState must not be null");
	//    4    8:new             #44  <Class IllegalArgumentException>
	//    5   11:dup             
	//    6   12:ldc1            #46  <String "superState must not be null">
	//    7   14:invokespecial   #49  <Method void IllegalArgumentException(String)>
	//    8   17:athrow          
		if(parcelable == EMPTY_STATE)
	//*   9   18:aload_1         
	//*  10   19:getstatic       #24  <Field AbsSavedState EMPTY_STATE>
	//*  11   22:if_acmpeq       31
	//*  12   25:aload_0         
	//*  13   26:aload_1         
	//*  14   27:putfield        #31  <Field Parcelable mSuperState>
	//*  15   30:return          
			parcelable = null;
	//   16   31:aconst_null     
	//   17   32:astore_1        
		mSuperState = parcelable;
	//*  18   33:goto            25
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
	//    1    1:getfield        #31  <Field Parcelable mSuperState>
	//    2    4:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeParcelable(mSuperState, i);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #31  <Field Parcelable mSuperState>
	//    3    5:iload_2         
	//    4    6:invokevirtual   #61  <Method void Parcel.writeParcelable(Parcelable, int)>
	//    5    9:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.ClassLoaderCreator() {

		public AbsSavedState createFromParcel(Parcel parcel)
		{
			return createFromParcel(parcel, ((ClassLoader) (null)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aconst_null     
		//    3    3:invokevirtual   #19  <Method AbsSavedState createFromParcel(Parcel, ClassLoader)>
		//    4    6:areturn         
		}

		public AbsSavedState createFromParcel(Parcel parcel, ClassLoader classloader)
		{
			if(parcel.readParcelable(classloader) != null)
		//*   0    0:aload_1         
		//*   1    1:aload_2         
		//*   2    2:invokevirtual   #25  <Method Parcelable Parcel.readParcelable(ClassLoader)>
		//*   3    5:ifnull          18
				throw new IllegalStateException("superState must be null");
		//    4    8:new             #27  <Class IllegalStateException>
		//    5   11:dup             
		//    6   12:ldc1            #29  <String "superState must be null">
		//    7   14:invokespecial   #32  <Method void IllegalStateException(String)>
		//    8   17:athrow          
			else
				return AbsSavedState.EMPTY_STATE;
		//    9   18:getstatic       #36  <Field AbsSavedState AbsSavedState.EMPTY_STATE>
		//   10   21:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #39  <Method AbsSavedState createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel, ClassLoader classloader)
		{
			return ((Object) (createFromParcel(parcel, classloader)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #19  <Method AbsSavedState createFromParcel(Parcel, ClassLoader)>
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
		//    2    2:invokevirtual   #45  <Method AbsSavedState[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
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
	//    7   17:putstatic       #27  <Field android.os.Parcelable$Creator CREATOR>
	//*   8   20:return          
	}
}
