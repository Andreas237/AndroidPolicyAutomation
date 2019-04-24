// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.os.ParcelableCompat;
import android.support.v4.os.ParcelableCompatCreatorCallbacks;
import android.support.v4.view.AbsSavedState;
import android.util.SparseArray;

// Referenced classes of package android.support.design.widget:
//			CoordinatorLayout

protected static class CoordinatorLayout$SavedState extends AbsSavedState
{

	public void writeToParcel(Parcel parcel, int i)
	{
		super.writeToParcel(parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #64  <Method void AbsSavedState.writeToParcel(Parcel, int)>
		int j;
		if(behaviorStates != null)
	//*   4    6:aload_0         
	//*   5    7:getfield        #53  <Field SparseArray behaviorStates>
	//*   6   10:ifnull          24
			j = behaviorStates.size();
	//    7   13:aload_0         
	//    8   14:getfield        #53  <Field SparseArray behaviorStates>
	//    9   17:invokevirtual   #67  <Method int SparseArray.size()>
	//   10   20:istore_3        
		else
	//*  11   21:goto            26
			j = 0;
	//   12   24:iconst_0        
	//   13   25:istore_3        
		parcel.writeInt(j);
	//   14   26:aload_1         
	//   15   27:iload_3         
	//   16   28:invokevirtual   #70  <Method void Parcel.writeInt(int)>
		int ai[] = new int[j];
	//   17   31:iload_3         
	//   18   32:newarray        int[]
	//   19   34:astore          5
		Parcelable aparcelable[] = new Parcelable[j];
	//   20   36:iload_3         
	//   21   37:anewarray       Parcelable[]
	//   22   40:astore          6
		for(int k = 0; k < j; k++)
	//*  23   42:iconst_0        
	//*  24   43:istore          4
	//*  25   45:iload           4
	//*  26   47:iload_3         
	//*  27   48:icmpge          91
		{
			ai[k] = behaviorStates.keyAt(k);
	//   28   51:aload           5
	//   29   53:iload           4
	//   30   55:aload_0         
	//   31   56:getfield        #53  <Field SparseArray behaviorStates>
	//   32   59:iload           4
	//   33   61:invokevirtual   #76  <Method int SparseArray.keyAt(int)>
	//   34   64:iastore         
			aparcelable[k] = (Parcelable)behaviorStates.valueAt(k);
	//   35   65:aload           6
	//   36   67:iload           4
	//   37   69:aload_0         
	//   38   70:getfield        #53  <Field SparseArray behaviorStates>
	//   39   73:iload           4
	//   40   75:invokevirtual   #80  <Method Object SparseArray.valueAt(int)>
	//   41   78:checkcast       #72  <Class Parcelable>
	//   42   81:aastore         
		}

	//   43   82:iload           4
	//   44   84:iconst_1        
	//   45   85:iadd            
	//   46   86:istore          4
	//*  47   88:goto            45
		parcel.writeIntArray(ai);
	//   48   91:aload_1         
	//   49   92:aload           5
	//   50   94:invokevirtual   #83  <Method void Parcel.writeIntArray(int[])>
		parcel.writeParcelableArray(aparcelable, i);
	//   51   97:aload_1         
	//   52   98:aload           6
	//   53  100:iload_2         
	//   54  101:invokevirtual   #87  <Method void Parcel.writeParcelableArray(Parcelable[], int)>
	//   55  104:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = ParcelableCompat.newCreator(new ParcelableCompatCreatorCallbacks() {

		public Object createFromParcel(Parcel parcel, ClassLoader classloader)
		{
			return ((Object) (e(parcel, classloader)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #23  <Method CoordinatorLayout$SavedState e(Parcel, ClassLoader)>
		//    4    6:areturn         
		}

		public CoordinatorLayout.SavedState e(Parcel parcel, ClassLoader classloader)
		{
			return new CoordinatorLayout.SavedState(parcel, classloader);
		//    0    0:new             #9   <Class CoordinatorLayout$SavedState>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokespecial   #26  <Method void CoordinatorLayout$SavedState(Parcel, ClassLoader)>
		//    5    9:areturn         
		}

		public CoordinatorLayout.SavedState[] e(int i)
		{
			return new CoordinatorLayout.SavedState[i];
		//    0    0:iload_1         
		//    1    1:anewarray       CoordinatorLayout.SavedState[]
		//    2    4:areturn         
		}

		public Object[] newArray(int i)
		{
			return ((Object []) (e(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #31  <Method CoordinatorLayout$SavedState[] e(int)>
		//    3    5:areturn         
		}

	}
);
	SparseArray behaviorStates;

	static 
	{
	//    0    0:new             #9   <Class CoordinatorLayout$SavedState$4>
	//    1    3:dup             
	//    2    4:invokespecial   #20  <Method void CoordinatorLayout$SavedState$4()>
	//    3    7:invokestatic    #26  <Method android.os.Parcelable$Creator ParcelableCompat.newCreator(ParcelableCompatCreatorCallbacks)>
	//    4   10:putstatic       #28  <Field android.os.Parcelable$Creator CREATOR>
	//*   5   13:return          
	}

	public CoordinatorLayout$SavedState(Parcel parcel, ClassLoader classloader)
	{
		super(parcel, classloader);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #32  <Method void AbsSavedState(Parcel, ClassLoader)>
		int j = parcel.readInt();
	//    4    6:aload_1         
	//    5    7:invokevirtual   #38  <Method int Parcel.readInt()>
	//    6   10:istore          4
		int ai[] = new int[j];
	//    7   12:iload           4
	//    8   14:newarray        int[]
	//    9   16:astore          5
		parcel.readIntArray(ai);
	//   10   18:aload_1         
	//   11   19:aload           5
	//   12   21:invokevirtual   #42  <Method void Parcel.readIntArray(int[])>
		parcel = ((Parcel) (parcel.readParcelableArray(classloader)));
	//   13   24:aload_1         
	//   14   25:aload_2         
	//   15   26:invokevirtual   #46  <Method Parcelable[] Parcel.readParcelableArray(ClassLoader)>
	//   16   29:astore_1        
		behaviorStates = new SparseArray(j);
	//   17   30:aload_0         
	//   18   31:new             #48  <Class SparseArray>
	//   19   34:dup             
	//   20   35:iload           4
	//   21   37:invokespecial   #51  <Method void SparseArray(int)>
	//   22   40:putfield        #53  <Field SparseArray behaviorStates>
		for(int i = 0; i < j; i++)
	//*  23   43:iconst_0        
	//*  24   44:istore_3        
	//*  25   45:iload_3         
	//*  26   46:iload           4
	//*  27   48:icmpge          72
			behaviorStates.append(ai[i], ((Object) (parcel[i])));
	//   28   51:aload_0         
	//   29   52:getfield        #53  <Field SparseArray behaviorStates>
	//   30   55:aload           5
	//   31   57:iload_3         
	//   32   58:iaload          
	//   33   59:aload_1         
	//   34   60:iload_3         
	//   35   61:aaload          
	//   36   62:invokevirtual   #57  <Method void SparseArray.append(int, Object)>

	//   37   65:iload_3         
	//   38   66:iconst_1        
	//   39   67:iadd            
	//   40   68:istore_3        
	//*  41   69:goto            45
	//   42   72:return          
	}

	public CoordinatorLayout$SavedState(Parcelable parcelable)
	{
		super(parcelable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #60  <Method void AbsSavedState(Parcelable)>
	//    3    5:return          
	}
}
