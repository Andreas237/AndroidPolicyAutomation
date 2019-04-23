// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package android.support.v4.app:
//			az, FragmentState, BackStackState

final class FragmentManagerState
	implements Parcelable
{

	public FragmentManagerState()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
		d = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #30  <Field int d>
	//    5    9:return          
	}

	public FragmentManagerState(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
		d = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #30  <Field int d>
		a = (FragmentState[])parcel.createTypedArray(FragmentState.CREATOR);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:getstatic       #34  <Field android.os.Parcelable$Creator FragmentState.CREATOR>
	//    8   14:invokevirtual   #40  <Method Object[] Parcel.createTypedArray(android.os.Parcelable$Creator)>
	//    9   17:checkcast       #41  <Class FragmentState[]>
	//   10   20:putfield        #43  <Field FragmentState[] a>
		b = parcel.createIntArray();
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:invokevirtual   #47  <Method int[] Parcel.createIntArray()>
	//   14   28:putfield        #49  <Field int[] b>
		c = (BackStackState[])parcel.createTypedArray(BackStackState.CREATOR);
	//   15   31:aload_0         
	//   16   32:aload_1         
	//   17   33:getstatic       #52  <Field android.os.Parcelable$Creator BackStackState.CREATOR>
	//   18   36:invokevirtual   #40  <Method Object[] Parcel.createTypedArray(android.os.Parcelable$Creator)>
	//   19   39:checkcast       #53  <Class BackStackState[]>
	//   20   42:putfield        #55  <Field BackStackState[] c>
		d = parcel.readInt();
	//   21   45:aload_0         
	//   22   46:aload_1         
	//   23   47:invokevirtual   #59  <Method int Parcel.readInt()>
	//   24   50:putfield        #30  <Field int d>
		e = parcel.readInt();
	//   25   53:aload_0         
	//   26   54:aload_1         
	//   27   55:invokevirtual   #59  <Method int Parcel.readInt()>
	//   28   58:putfield        #61  <Field int e>
	//   29   61:return          
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeTypedArray(((Parcelable []) (a)), i);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #43  <Field FragmentState[] a>
	//    3    5:iload_2         
	//    4    6:invokevirtual   #68  <Method void Parcel.writeTypedArray(Parcelable[], int)>
		parcel.writeIntArray(b);
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #49  <Field int[] b>
	//    8   14:invokevirtual   #72  <Method void Parcel.writeIntArray(int[])>
		parcel.writeTypedArray(((Parcelable []) (c)), i);
	//    9   17:aload_1         
	//   10   18:aload_0         
	//   11   19:getfield        #55  <Field BackStackState[] c>
	//   12   22:iload_2         
	//   13   23:invokevirtual   #68  <Method void Parcel.writeTypedArray(Parcelable[], int)>
		parcel.writeInt(d);
	//   14   26:aload_1         
	//   15   27:aload_0         
	//   16   28:getfield        #30  <Field int d>
	//   17   31:invokevirtual   #76  <Method void Parcel.writeInt(int)>
		parcel.writeInt(e);
	//   18   34:aload_1         
	//   19   35:aload_0         
	//   20   36:getfield        #61  <Field int e>
	//   21   39:invokevirtual   #76  <Method void Parcel.writeInt(int)>
	//   22   42:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new az();
	FragmentState a[];
	int b[];
	BackStackState c[];
	int d;
	int e;

	static 
	{
	//    0    0:new             #21  <Class az>
	//    1    3:dup             
	//    2    4:invokespecial   #24  <Method void az()>
	//    3    7:putstatic       #26  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
