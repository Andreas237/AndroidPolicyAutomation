// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package android.support.v4.app:
//			FragmentState, BackStackState

final class FragmentManagerState
	implements Parcelable
{

	public FragmentManagerState()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
		mPrimaryNavActiveIndex = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #30  <Field int mPrimaryNavActiveIndex>
	//    5    9:return          
	}

	public FragmentManagerState(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
		mPrimaryNavActiveIndex = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #30  <Field int mPrimaryNavActiveIndex>
		mActive = (FragmentState[])parcel.createTypedArray(FragmentState.CREATOR);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:getstatic       #34  <Field android.os.Parcelable$Creator FragmentState.CREATOR>
	//    8   14:invokevirtual   #40  <Method Object[] Parcel.createTypedArray(android.os.Parcelable$Creator)>
	//    9   17:checkcast       #41  <Class FragmentState[]>
	//   10   20:putfield        #43  <Field FragmentState[] mActive>
		mAdded = parcel.createIntArray();
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:invokevirtual   #47  <Method int[] Parcel.createIntArray()>
	//   14   28:putfield        #49  <Field int[] mAdded>
		mBackStack = (BackStackState[])parcel.createTypedArray(BackStackState.CREATOR);
	//   15   31:aload_0         
	//   16   32:aload_1         
	//   17   33:getstatic       #52  <Field android.os.Parcelable$Creator BackStackState.CREATOR>
	//   18   36:invokevirtual   #40  <Method Object[] Parcel.createTypedArray(android.os.Parcelable$Creator)>
	//   19   39:checkcast       #53  <Class BackStackState[]>
	//   20   42:putfield        #55  <Field BackStackState[] mBackStack>
		mPrimaryNavActiveIndex = parcel.readInt();
	//   21   45:aload_0         
	//   22   46:aload_1         
	//   23   47:invokevirtual   #59  <Method int Parcel.readInt()>
	//   24   50:putfield        #30  <Field int mPrimaryNavActiveIndex>
	//   25   53:return          
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeTypedArray(((Parcelable []) (mActive)), i);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #43  <Field FragmentState[] mActive>
	//    3    5:iload_2         
	//    4    6:invokevirtual   #66  <Method void Parcel.writeTypedArray(Parcelable[], int)>
		parcel.writeIntArray(mAdded);
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #49  <Field int[] mAdded>
	//    8   14:invokevirtual   #70  <Method void Parcel.writeIntArray(int[])>
		parcel.writeTypedArray(((Parcelable []) (mBackStack)), i);
	//    9   17:aload_1         
	//   10   18:aload_0         
	//   11   19:getfield        #55  <Field BackStackState[] mBackStack>
	//   12   22:iload_2         
	//   13   23:invokevirtual   #66  <Method void Parcel.writeTypedArray(Parcelable[], int)>
		parcel.writeInt(mPrimaryNavActiveIndex);
	//   14   26:aload_1         
	//   15   27:aload_0         
	//   16   28:getfield        #30  <Field int mPrimaryNavActiveIndex>
	//   17   31:invokevirtual   #74  <Method void Parcel.writeInt(int)>
	//   18   34:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public FragmentManagerState createFromParcel(Parcel parcel)
		{
			return new FragmentManagerState(parcel);
		//    0    0:new             #9   <Class FragmentManagerState>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void FragmentManagerState(Parcel)>
		//    4    8:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #22  <Method FragmentManagerState createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public FragmentManagerState[] newArray(int i)
		{
			return new FragmentManagerState[i];
		//    0    0:iload_1         
		//    1    1:anewarray       FragmentManagerState[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #27  <Method FragmentManagerState[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	FragmentState mActive[];
	int mAdded[];
	BackStackState mBackStack[];
	int mPrimaryNavActiveIndex;

	static 
	{
	//    0    0:new             #8   <Class FragmentManagerState$1>
	//    1    3:dup             
	//    2    4:invokespecial   #24  <Method void FragmentManagerState$1()>
	//    3    7:putstatic       #26  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
