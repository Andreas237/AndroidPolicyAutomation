// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.os.*;

// Referenced classes of package android.support.v4.app:
//			Fragment

public static class Fragment$SavedState
	implements Parcelable
{

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeBundle(mState);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #28  <Field Bundle mState>
	//    3    5:invokevirtual   #48  <Method void Parcel.writeBundle(Bundle)>
	//    4    8:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public Fragment.SavedState createFromParcel(Parcel parcel)
		{
			return new Fragment.SavedState(parcel, ((ClassLoader) (null)));
		//    0    0:new             #9   <Class Fragment$SavedState>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #22  <Method void Fragment$SavedState(Parcel, ClassLoader)>
		//    5    9:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #25  <Method Fragment$SavedState createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public Fragment.SavedState[] newArray(int i)
		{
			return new Fragment.SavedState[i];
		//    0    0:iload_1         
		//    1    1:anewarray       Fragment.SavedState[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #30  <Method Fragment$SavedState[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	final Bundle mState;

	static 
	{
	//    0    0:new             #11  <Class Fragment$SavedState$1>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void Fragment$SavedState$1()>
	//    3    7:putstatic       #23  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}

	Fragment$SavedState(Bundle bundle)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		mState = bundle;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #28  <Field Bundle mState>
	//    5    9:return          
	}

	Fragment$SavedState(Parcel parcel, ClassLoader classloader)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		mState = parcel.readBundle();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #35  <Method Bundle Parcel.readBundle()>
	//    5    9:putfield        #28  <Field Bundle mState>
		if(classloader != null && mState != null)
	//*   6   12:aload_2         
	//*   7   13:ifnull          31
	//*   8   16:aload_0         
	//*   9   17:getfield        #28  <Field Bundle mState>
	//*  10   20:ifnull          31
			mState.setClassLoader(classloader);
	//   11   23:aload_0         
	//   12   24:getfield        #28  <Field Bundle mState>
	//   13   27:aload_2         
	//   14   28:invokevirtual   #41  <Method void Bundle.setClassLoader(ClassLoader)>
	//   15   31:return          
	}
}
