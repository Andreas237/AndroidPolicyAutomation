// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

public class ParcelableSparseArray extends SparseArray
	implements Parcelable
{

	public ParcelableSparseArray()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void SparseArray()>
	//    2    4:return          
	}

	public ParcelableSparseArray(Parcel parcel, ClassLoader classloader)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void SparseArray()>
		int j = parcel.readInt();
	//    2    4:aload_1         
	//    3    5:invokevirtual   #32  <Method int Parcel.readInt()>
	//    4    8:istore          4
		int ai[] = new int[j];
	//    5   10:iload           4
	//    6   12:newarray        int[]
	//    7   14:astore          5
		parcel.readIntArray(ai);
	//    8   16:aload_1         
	//    9   17:aload           5
	//   10   19:invokevirtual   #36  <Method void Parcel.readIntArray(int[])>
		parcel = ((Parcel) (parcel.readParcelableArray(classloader)));
	//   11   22:aload_1         
	//   12   23:aload_2         
	//   13   24:invokevirtual   #40  <Method Parcelable[] Parcel.readParcelableArray(ClassLoader)>
	//   14   27:astore_1        
		for(int i = 0; i < j; i++)
	//*  15   28:iconst_0        
	//*  16   29:istore_3        
	//*  17   30:iload_3         
	//*  18   31:iload           4
	//*  19   33:icmpge          54
			put(ai[i], ((Object) (parcel[i])));
	//   20   36:aload_0         
	//   21   37:aload           5
	//   22   39:iload_3         
	//   23   40:iaload          
	//   24   41:aload_1         
	//   25   42:iload_3         
	//   26   43:aaload          
	//   27   44:invokevirtual   #44  <Method void put(int, Object)>

	//   28   47:iload_3         
	//   29   48:iconst_1        
	//   30   49:iadd            
	//   31   50:istore_3        
	//*  32   51:goto            30
	//   33   54:return          
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		int k = size();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #50  <Method int size()>
	//    2    4:istore          4
		int ai[] = new int[k];
	//    3    6:iload           4
	//    4    8:newarray        int[]
	//    5   10:astore          5
		Parcelable aparcelable[] = new Parcelable[k];
	//    6   12:iload           4
	//    7   14:anewarray       Parcelable[]
	//    8   17:astore          6
		for(int j = 0; j < k; j++)
	//*   9   19:iconst_0        
	//*  10   20:istore_3        
	//*  11   21:iload_3         
	//*  12   22:iload           4
	//*  13   24:icmpge          55
		{
			ai[j] = keyAt(j);
	//   14   27:aload           5
	//   15   29:iload_3         
	//   16   30:aload_0         
	//   17   31:iload_3         
	//   18   32:invokevirtual   #54  <Method int keyAt(int)>
	//   19   35:iastore         
			aparcelable[j] = (Parcelable)valueAt(j);
	//   20   36:aload           6
	//   21   38:iload_3         
	//   22   39:aload_0         
	//   23   40:iload_3         
	//   24   41:invokevirtual   #58  <Method Object valueAt(int)>
	//   25   44:checkcast       #7   <Class Parcelable>
	//   26   47:aastore         
		}

	//   27   48:iload_3         
	//   28   49:iconst_1        
	//   29   50:iadd            
	//   30   51:istore_3        
	//*  31   52:goto            21
		parcel.writeInt(k);
	//   32   55:aload_1         
	//   33   56:iload           4
	//   34   58:invokevirtual   #62  <Method void Parcel.writeInt(int)>
		parcel.writeIntArray(ai);
	//   35   61:aload_1         
	//   36   62:aload           5
	//   37   64:invokevirtual   #65  <Method void Parcel.writeIntArray(int[])>
		parcel.writeParcelableArray(aparcelable, i);
	//   38   67:aload_1         
	//   39   68:aload           6
	//   40   70:iload_2         
	//   41   71:invokevirtual   #69  <Method void Parcel.writeParcelableArray(Parcelable[], int)>
	//   42   74:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.ClassLoaderCreator() {

		public ParcelableSparseArray createFromParcel(Parcel parcel)
		{
			return new ParcelableSparseArray(parcel, ((ClassLoader) (null)));
		//    0    0:new             #9   <Class ParcelableSparseArray>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #19  <Method void ParcelableSparseArray(Parcel, ClassLoader)>
		//    5    9:areturn         
		}

		public ParcelableSparseArray createFromParcel(Parcel parcel, ClassLoader classloader)
		{
			return new ParcelableSparseArray(parcel, classloader);
		//    0    0:new             #9   <Class ParcelableSparseArray>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokespecial   #19  <Method void ParcelableSparseArray(Parcel, ClassLoader)>
		//    5    9:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #23  <Method ParcelableSparseArray createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel, ClassLoader classloader)
		{
			return ((Object) (createFromParcel(parcel, classloader)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #26  <Method ParcelableSparseArray createFromParcel(Parcel, ClassLoader)>
		//    4    6:areturn         
		}

		public ParcelableSparseArray[] newArray(int i)
		{
			return new ParcelableSparseArray[i];
		//    0    0:iload_1         
		//    1    1:anewarray       ParcelableSparseArray[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #31  <Method ParcelableSparseArray[] newArray(int)>
		//    3    5:areturn         
		}

	}
;

	static 
	{
	//    0    0:new             #9   <Class ParcelableSparseArray$1>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void ParcelableSparseArray$1()>
	//    3    7:putstatic       #23  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
