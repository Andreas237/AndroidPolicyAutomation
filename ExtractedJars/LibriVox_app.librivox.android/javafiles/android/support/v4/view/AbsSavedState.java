// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package android.support.v4.view:
//			a

public abstract class AbsSavedState
	implements Parcelable
{

	private AbsSavedState()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
		mSuperState = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #30  <Field Parcelable mSuperState>
	//    5    9:return          
	}

	protected AbsSavedState(Parcel parcel)
	{
		this(parcel, ((ClassLoader) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #34  <Method void AbsSavedState(Parcel, ClassLoader)>
	//    4    6:return          
	}

	protected AbsSavedState(Parcel parcel, ClassLoader classloader)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
		parcel = ((Parcel) (parcel.readParcelable(classloader)));
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #40  <Method Parcelable Parcel.readParcelable(ClassLoader)>
	//    5    9:astore_1        
		if(parcel == null)
	//*   6   10:aload_1         
	//*   7   11:ifnull          17
	//*   8   14:goto            21
			parcel = ((Parcel) (EMPTY_STATE));
	//    9   17:getstatic       #21  <Field AbsSavedState EMPTY_STATE>
	//   10   20:astore_1        
		mSuperState = ((Parcelable) (parcel));
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:putfield        #30  <Field Parcelable mSuperState>
	//   14   26:return          
	}

	protected AbsSavedState(Parcelable parcelable)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
		if(parcelable != null)
	//*   2    4:aload_1         
	//*   3    5:ifnull          26
		{
			if(parcelable == EMPTY_STATE)
	//*   4    8:aload_1         
	//*   5    9:getstatic       #21  <Field AbsSavedState EMPTY_STATE>
	//*   6   12:if_acmpeq       18
	//*   7   15:goto            20
				parcelable = null;
	//    8   18:aconst_null     
	//    9   19:astore_1        
			mSuperState = parcelable;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #30  <Field Parcelable mSuperState>
			return;
	//   13   25:return          
		} else
		{
			throw new IllegalArgumentException("superState must not be null");
	//   14   26:new             #43  <Class IllegalArgumentException>
	//   15   29:dup             
	//   16   30:ldc1            #45  <String "superState must not be null">
	//   17   32:invokespecial   #48  <Method void IllegalArgumentException(String)>
	//   18   35:athrow          
		}
	}

	AbsSavedState(_cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #50  <Method void AbsSavedState()>
	//    2    4:return          
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
	//    1    1:getfield        #30  <Field Parcelable mSuperState>
	//    2    4:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeParcelable(mSuperState, i);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #30  <Field Parcelable mSuperState>
	//    3    5:iload_2         
	//    4    6:invokevirtual   #60  <Method void Parcel.writeParcelable(Parcelable, int)>
	//    5    9:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new a();
	public static final AbsSavedState EMPTY_STATE = new _cls1();
	private final Parcelable mSuperState;

	static 
	{
	//    0    0:new             #16  <Class AbsSavedState$1>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void AbsSavedState$1()>
	//    3    7:putstatic       #21  <Field AbsSavedState EMPTY_STATE>
	//    4   10:new             #23  <Class a>
	//    5   13:dup             
	//    6   14:invokespecial   #24  <Method void a()>
	//    7   17:putstatic       #26  <Field android.os.Parcelable$Creator CREATOR>
	//*   8   20:return          
	}

	private class _cls1 extends AbsSavedState
	{

		_cls1()
		{
			super(((_cls1) (null)));
		//    0    0:aload_0         
		//    1    1:aconst_null     
		//    2    2:invokespecial   #9   <Method void AbsSavedState(AbsSavedState$1)>
		//    3    5:return          
		}
	}

}
