// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package android.support.v7.widget:
//			LinearLayoutManager

public static class LinearLayoutManager$SavedState
	implements Parcelable
{

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	boolean hasValidAnchor()
	{
		return mAnchorPosition >= 0;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field int mAnchorPosition>
	//    2    4:iflt            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	void invalidateAnchor()
	{
		mAnchorPosition = -1;
	//    0    0:aload_0         
	//    1    1:iconst_m1       
	//    2    2:putfield        #41  <Field int mAnchorPosition>
	//    3    5:return          
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeInt(mAnchorPosition);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #41  <Field int mAnchorPosition>
	//    3    5:invokevirtual   #56  <Method void Parcel.writeInt(int)>
		parcel.writeInt(mAnchorOffset);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #43  <Field int mAnchorOffset>
	//    7   13:invokevirtual   #56  <Method void Parcel.writeInt(int)>
		if(mAnchorLayoutFromEnd)
	//*   8   16:aload_0         
	//*   9   17:getfield        #45  <Field boolean mAnchorLayoutFromEnd>
	//*  10   20:ifeq            28
			i = 1;
	//   11   23:iconst_1        
	//   12   24:istore_2        
		else
	//*  13   25:goto            30
			i = 0;
	//   14   28:iconst_0        
	//   15   29:istore_2        
		parcel.writeInt(i);
	//   16   30:aload_1         
	//   17   31:iload_2         
	//   18   32:invokevirtual   #56  <Method void Parcel.writeInt(int)>
	//   19   35:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public LinearLayoutManager.SavedState createFromParcel(Parcel parcel)
		{
			return new LinearLayoutManager.SavedState(parcel);
		//    0    0:new             #9   <Class LinearLayoutManager$SavedState>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #22  <Method void LinearLayoutManager$SavedState(Parcel)>
		//    4    8:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #25  <Method LinearLayoutManager$SavedState createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public LinearLayoutManager.SavedState[] newArray(int i)
		{
			return new LinearLayoutManager.SavedState[i];
		//    0    0:iload_1         
		//    1    1:anewarray       LinearLayoutManager.SavedState[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #30  <Method LinearLayoutManager$SavedState[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	boolean mAnchorLayoutFromEnd;
	int mAnchorOffset;
	int mAnchorPosition;

	static 
	{
	//    0    0:new             #11  <Class LinearLayoutManager$SavedState$1>
	//    1    3:dup             
	//    2    4:invokespecial   #28  <Method void LinearLayoutManager$SavedState$1()>
	//    3    7:putstatic       #30  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}

	public LinearLayoutManager$SavedState()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
	//    2    4:return          
	}

	LinearLayoutManager$SavedState(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
		mAnchorPosition = parcel.readInt();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #39  <Method int Parcel.readInt()>
	//    5    9:putfield        #41  <Field int mAnchorPosition>
		mAnchorOffset = parcel.readInt();
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #39  <Method int Parcel.readInt()>
	//    9   17:putfield        #43  <Field int mAnchorOffset>
		boolean flag;
		if(parcel.readInt() == 1)
	//*  10   20:aload_1         
	//*  11   21:invokevirtual   #39  <Method int Parcel.readInt()>
	//*  12   24:iconst_1        
	//*  13   25:icmpne          33
			flag = true;
	//   14   28:iconst_1        
	//   15   29:istore_2        
		else
	//*  16   30:goto            35
			flag = false;
	//   17   33:iconst_0        
	//   18   34:istore_2        
		mAnchorLayoutFromEnd = flag;
	//   19   35:aload_0         
	//   20   36:iload_2         
	//   21   37:putfield        #45  <Field boolean mAnchorLayoutFromEnd>
	//   22   40:return          
	}

	public LinearLayoutManager$SavedState(LinearLayoutManager$SavedState linearlayoutmanager$savedstate)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
		mAnchorPosition = linearlayoutmanager$savedstate.mAnchorPosition;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:getfield        #41  <Field int mAnchorPosition>
	//    5    9:putfield        #41  <Field int mAnchorPosition>
		mAnchorOffset = linearlayoutmanager$savedstate.mAnchorOffset;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:getfield        #43  <Field int mAnchorOffset>
	//    9   17:putfield        #43  <Field int mAnchorOffset>
		mAnchorLayoutFromEnd = linearlayoutmanager$savedstate.mAnchorLayoutFromEnd;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:getfield        #45  <Field boolean mAnchorLayoutFromEnd>
	//   13   25:putfield        #45  <Field boolean mAnchorLayoutFromEnd>
	//   14   28:return          
	}
}
