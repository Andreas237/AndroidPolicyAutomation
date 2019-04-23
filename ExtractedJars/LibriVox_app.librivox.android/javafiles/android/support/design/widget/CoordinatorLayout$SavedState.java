// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.AbsSavedState;
import android.util.SparseArray;

// Referenced classes of package android.support.design.widget:
//			ao

public class CoordinatorLayout$SavedState extends AbsSavedState
{

	public void writeToParcel(Parcel parcel, int i)
	{
		super.writeToParcel(parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #53  <Method void AbsSavedState.writeToParcel(Parcel, int)>
		SparseArray sparsearray = a;
	//    4    6:aload_0         
	//    5    7:getfield        #42  <Field SparseArray a>
	//    6   10:astore          5
		int k = 0;
	//    7   12:iconst_0        
	//    8   13:istore          4
		int j;
		if(sparsearray != null)
	//*   9   15:aload           5
	//*  10   17:ifnull          29
			j = sparsearray.size();
	//   11   20:aload           5
	//   12   22:invokevirtual   #56  <Method int SparseArray.size()>
	//   13   25:istore_3        
		else
	//*  14   26:goto            31
			j = 0;
	//   15   29:iconst_0        
	//   16   30:istore_3        
		parcel.writeInt(j);
	//   17   31:aload_1         
	//   18   32:iload_3         
	//   19   33:invokevirtual   #59  <Method void Parcel.writeInt(int)>
		int ai[] = new int[j];
	//   20   36:iload_3         
	//   21   37:newarray        int[]
	//   22   39:astore          5
		Parcelable aparcelable[] = new Parcelable[j];
	//   23   41:iload_3         
	//   24   42:anewarray       Parcelable[]
	//   25   45:astore          6
		for(; k < j; k++)
	//*  26   47:iload           4
	//*  27   49:iload_3         
	//*  28   50:icmpge          93
		{
			ai[k] = a.keyAt(k);
	//   29   53:aload           5
	//   30   55:iload           4
	//   31   57:aload_0         
	//   32   58:getfield        #42  <Field SparseArray a>
	//   33   61:iload           4
	//   34   63:invokevirtual   #65  <Method int SparseArray.keyAt(int)>
	//   35   66:iastore         
			aparcelable[k] = (Parcelable)a.valueAt(k);
	//   36   67:aload           6
	//   37   69:iload           4
	//   38   71:aload_0         
	//   39   72:getfield        #42  <Field SparseArray a>
	//   40   75:iload           4
	//   41   77:invokevirtual   #69  <Method Object SparseArray.valueAt(int)>
	//   42   80:checkcast       #61  <Class Parcelable>
	//   43   83:aastore         
		}

	//   44   84:iload           4
	//   45   86:iconst_1        
	//   46   87:iadd            
	//   47   88:istore          4
	//*  48   90:goto            47
		parcel.writeIntArray(ai);
	//   49   93:aload_1         
	//   50   94:aload           5
	//   51   96:invokevirtual   #72  <Method void Parcel.writeIntArray(int[])>
		parcel.writeParcelableArray(aparcelable, i);
	//   52   99:aload_1         
	//   53  100:aload           6
	//   54  102:iload_2         
	//   55  103:invokevirtual   #76  <Method void Parcel.writeParcelableArray(Parcelable[], int)>
	//   56  106:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new ao();
	SparseArray a;

	static 
	{
	//    0    0:new             #12  <Class ao>
	//    1    3:dup             
	//    2    4:invokespecial   #15  <Method void ao()>
	//    3    7:putstatic       #17  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}

	public CoordinatorLayout$SavedState(Parcel parcel, ClassLoader classloader)
	{
		super(parcel, classloader);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #21  <Method void AbsSavedState(Parcel, ClassLoader)>
		int j = parcel.readInt();
	//    4    6:aload_1         
	//    5    7:invokevirtual   #27  <Method int Parcel.readInt()>
	//    6   10:istore          4
		int ai[] = new int[j];
	//    7   12:iload           4
	//    8   14:newarray        int[]
	//    9   16:astore          5
		parcel.readIntArray(ai);
	//   10   18:aload_1         
	//   11   19:aload           5
	//   12   21:invokevirtual   #31  <Method void Parcel.readIntArray(int[])>
		parcel = ((Parcel) (parcel.readParcelableArray(classloader)));
	//   13   24:aload_1         
	//   14   25:aload_2         
	//   15   26:invokevirtual   #35  <Method Parcelable[] Parcel.readParcelableArray(ClassLoader)>
	//   16   29:astore_1        
		a = new SparseArray(j);
	//   17   30:aload_0         
	//   18   31:new             #37  <Class SparseArray>
	//   19   34:dup             
	//   20   35:iload           4
	//   21   37:invokespecial   #40  <Method void SparseArray(int)>
	//   22   40:putfield        #42  <Field SparseArray a>
		for(int i = 0; i < j; i++)
	//*  23   43:iconst_0        
	//*  24   44:istore_3        
	//*  25   45:iload_3         
	//*  26   46:iload           4
	//*  27   48:icmpge          72
			a.append(ai[i], ((Object) (parcel[i])));
	//   28   51:aload_0         
	//   29   52:getfield        #42  <Field SparseArray a>
	//   30   55:aload           5
	//   31   57:iload_3         
	//   32   58:iaload          
	//   33   59:aload_1         
	//   34   60:iload_3         
	//   35   61:aaload          
	//   36   62:invokevirtual   #46  <Method void SparseArray.append(int, Object)>

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
	//    2    2:invokespecial   #49  <Method void AbsSavedState(Parcelable)>
	//    3    5:return          
	}
}
