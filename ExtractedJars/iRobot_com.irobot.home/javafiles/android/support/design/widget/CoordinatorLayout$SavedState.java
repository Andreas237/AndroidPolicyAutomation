// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.os.Parcel;
import android.os.Parcelable;
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
	//    3    3:invokespecial   #58  <Method void AbsSavedState.writeToParcel(Parcel, int)>
		SparseArray sparsearray = a;
	//    4    6:aload_0         
	//    5    7:getfield        #47  <Field SparseArray a>
	//    6   10:astore          5
		int k = 0;
	//    7   12:iconst_0        
	//    8   13:istore          4
		int j;
		if(sparsearray != null)
	//*   9   15:aload           5
	//*  10   17:ifnull          31
			j = a.size();
	//   11   20:aload_0         
	//   12   21:getfield        #47  <Field SparseArray a>
	//   13   24:invokevirtual   #61  <Method int SparseArray.size()>
	//   14   27:istore_3        
		else
	//*  15   28:goto            33
			j = 0;
	//   16   31:iconst_0        
	//   17   32:istore_3        
		parcel.writeInt(j);
	//   18   33:aload_1         
	//   19   34:iload_3         
	//   20   35:invokevirtual   #64  <Method void Parcel.writeInt(int)>
		int ai[] = new int[j];
	//   21   38:iload_3         
	//   22   39:newarray        int[]
	//   23   41:astore          5
		Parcelable aparcelable[] = new Parcelable[j];
	//   24   43:iload_3         
	//   25   44:anewarray       Parcelable[]
	//   26   47:astore          6
		for(; k < j; k++)
	//*  27   49:iload           4
	//*  28   51:iload_3         
	//*  29   52:icmpge          95
		{
			ai[k] = a.keyAt(k);
	//   30   55:aload           5
	//   31   57:iload           4
	//   32   59:aload_0         
	//   33   60:getfield        #47  <Field SparseArray a>
	//   34   63:iload           4
	//   35   65:invokevirtual   #70  <Method int SparseArray.keyAt(int)>
	//   36   68:iastore         
			aparcelable[k] = (Parcelable)a.valueAt(k);
	//   37   69:aload           6
	//   38   71:iload           4
	//   39   73:aload_0         
	//   40   74:getfield        #47  <Field SparseArray a>
	//   41   77:iload           4
	//   42   79:invokevirtual   #74  <Method Object SparseArray.valueAt(int)>
	//   43   82:checkcast       #66  <Class Parcelable>
	//   44   85:aastore         
		}

	//   45   86:iload           4
	//   46   88:iconst_1        
	//   47   89:iadd            
	//   48   90:istore          4
	//*  49   92:goto            49
		parcel.writeIntArray(ai);
	//   50   95:aload_1         
	//   51   96:aload           5
	//   52   98:invokevirtual   #77  <Method void Parcel.writeIntArray(int[])>
		parcel.writeParcelableArray(aparcelable, i);
	//   53  101:aload_1         
	//   54  102:aload           6
	//   55  104:iload_2         
	//   56  105:invokevirtual   #81  <Method void Parcel.writeParcelableArray(Parcelable[], int)>
	//   57  108:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.ClassLoaderCreator() {

		public CoordinatorLayout.SavedState a(Parcel parcel)
		{
			return new CoordinatorLayout.SavedState(parcel, ((ClassLoader) (null)));
		//    0    0:new             #9   <Class CoordinatorLayout$SavedState>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #22  <Method void CoordinatorLayout$SavedState(Parcel, ClassLoader)>
		//    5    9:areturn         
		}

		public CoordinatorLayout.SavedState a(Parcel parcel, ClassLoader classloader)
		{
			return new CoordinatorLayout.SavedState(parcel, classloader);
		//    0    0:new             #9   <Class CoordinatorLayout$SavedState>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokespecial   #22  <Method void CoordinatorLayout$SavedState(Parcel, ClassLoader)>
		//    5    9:areturn         
		}

		public CoordinatorLayout.SavedState[] a(int i)
		{
			return new CoordinatorLayout.SavedState[i];
		//    0    0:iload_1         
		//    1    1:anewarray       CoordinatorLayout.SavedState[]
		//    2    4:areturn         
		}

		public Object createFromParcel(Parcel parcel)
		{
			return ((Object) (a(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #28  <Method CoordinatorLayout$SavedState a(Parcel)>
		//    3    5:areturn         
		}

		public Object createFromParcel(Parcel parcel, ClassLoader classloader)
		{
			return ((Object) (a(parcel, classloader)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #31  <Method CoordinatorLayout$SavedState a(Parcel, ClassLoader)>
		//    4    6:areturn         
		}

		public Object[] newArray(int i)
		{
			return ((Object []) (a(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #35  <Method CoordinatorLayout$SavedState[] a(int)>
		//    3    5:areturn         
		}

	}
;
	SparseArray a;

	static 
	{
	//    0    0:new             #9   <Class CoordinatorLayout$SavedState$1>
	//    1    3:dup             
	//    2    4:invokespecial   #20  <Method void CoordinatorLayout$SavedState$1()>
	//    3    7:putstatic       #22  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}

	public CoordinatorLayout$SavedState(Parcel parcel, ClassLoader classloader)
	{
		super(parcel, classloader);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #26  <Method void AbsSavedState(Parcel, ClassLoader)>
		int j = parcel.readInt();
	//    4    6:aload_1         
	//    5    7:invokevirtual   #32  <Method int Parcel.readInt()>
	//    6   10:istore          4
		int ai[] = new int[j];
	//    7   12:iload           4
	//    8   14:newarray        int[]
	//    9   16:astore          5
		parcel.readIntArray(ai);
	//   10   18:aload_1         
	//   11   19:aload           5
	//   12   21:invokevirtual   #36  <Method void Parcel.readIntArray(int[])>
		parcel = ((Parcel) (parcel.readParcelableArray(classloader)));
	//   13   24:aload_1         
	//   14   25:aload_2         
	//   15   26:invokevirtual   #40  <Method Parcelable[] Parcel.readParcelableArray(ClassLoader)>
	//   16   29:astore_1        
		a = new SparseArray(j);
	//   17   30:aload_0         
	//   18   31:new             #42  <Class SparseArray>
	//   19   34:dup             
	//   20   35:iload           4
	//   21   37:invokespecial   #45  <Method void SparseArray(int)>
	//   22   40:putfield        #47  <Field SparseArray a>
		for(int i = 0; i < j; i++)
	//*  23   43:iconst_0        
	//*  24   44:istore_3        
	//*  25   45:iload_3         
	//*  26   46:iload           4
	//*  27   48:icmpge          72
			a.append(ai[i], ((Object) (parcel[i])));
	//   28   51:aload_0         
	//   29   52:getfield        #47  <Field SparseArray a>
	//   30   55:aload           5
	//   31   57:iload_3         
	//   32   58:iaload          
	//   33   59:aload_1         
	//   34   60:iload_3         
	//   35   61:aaload          
	//   36   62:invokevirtual   #51  <Method void SparseArray.append(int, Object)>

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
	//    2    2:invokespecial   #54  <Method void AbsSavedState(Parcelable)>
	//    3    5:return          
	}
}
