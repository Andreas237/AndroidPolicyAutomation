// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.data;

import android.content.ContentValues;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.common.data:
//			AbstractDataBuffer, DataHolder

public class DataBufferSafeParcelable extends AbstractDataBuffer
{

	public DataBufferSafeParcelable(DataHolder dataholder, android.os.Parcelable.Creator creator)
	{
		super(dataholder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #26  <Method void AbstractDataBuffer(DataHolder)>
		zznl = creator;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #28  <Field android.os.Parcelable$Creator zznl>
	//    6   10:return          
	}

	public static void addValue(DataHolder.Builder builder, SafeParcelable safeparcelable)
	{
		Parcel parcel = Parcel.obtain();
	//    0    0:invokestatic    #38  <Method Parcel Parcel.obtain()>
	//    1    3:astore_2        
		safeparcelable.writeToParcel(parcel, 0);
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:iconst_0        
	//    5    7:invokeinterface #44  <Method void SafeParcelable.writeToParcel(Parcel, int)>
		safeparcelable = ((SafeParcelable) (new ContentValues()));
	//    6   12:new             #46  <Class ContentValues>
	//    7   15:dup             
	//    8   16:invokespecial   #48  <Method void ContentValues()>
	//    9   19:astore_1        
		((ContentValues) (safeparcelable)).put("data", parcel.marshall());
	//   10   20:aload_1         
	//   11   21:ldc1            #9   <String "data">
	//   12   23:aload_2         
	//   13   24:invokevirtual   #52  <Method byte[] Parcel.marshall()>
	//   14   27:invokevirtual   #56  <Method void ContentValues.put(String, byte[])>
		builder.withRow(((ContentValues) (safeparcelable)));
	//   15   30:aload_0         
	//   16   31:aload_1         
	//   17   32:invokevirtual   #62  <Method DataHolder$Builder DataHolder$Builder.withRow(ContentValues)>
	//   18   35:pop             
		parcel.recycle();
	//   19   36:aload_2         
	//   20   37:invokevirtual   #65  <Method void Parcel.recycle()>
	//   21   40:return          
	}

	public static DataHolder.Builder buildDataHolder()
	{
		return DataHolder.builder(zznk);
	//    0    0:getstatic       #20  <Field String[] zznk>
	//    1    3:invokestatic    #74  <Method DataHolder$Builder DataHolder.builder(String[])>
	//    2    6:areturn         
	}

	public SafeParcelable get(int i)
	{
		byte abyte0[] = mDataHolder.getByteArray("data", i, mDataHolder.getWindowIndex(i));
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field DataHolder mDataHolder>
	//    2    4:ldc1            #9   <String "data">
	//    3    6:iload_1         
	//    4    7:aload_0         
	//    5    8:getfield        #80  <Field DataHolder mDataHolder>
	//    6   11:iload_1         
	//    7   12:invokevirtual   #84  <Method int DataHolder.getWindowIndex(int)>
	//    8   15:invokevirtual   #88  <Method byte[] DataHolder.getByteArray(String, int, int)>
	//    9   18:astore_3        
		Parcel parcel = Parcel.obtain();
	//   10   19:invokestatic    #38  <Method Parcel Parcel.obtain()>
	//   11   22:astore_2        
		parcel.unmarshall(abyte0, 0, abyte0.length);
	//   12   23:aload_2         
	//   13   24:aload_3         
	//   14   25:iconst_0        
	//   15   26:aload_3         
	//   16   27:arraylength     
	//   17   28:invokevirtual   #92  <Method void Parcel.unmarshall(byte[], int, int)>
		parcel.setDataPosition(0);
	//   18   31:aload_2         
	//   19   32:iconst_0        
	//   20   33:invokevirtual   #96  <Method void Parcel.setDataPosition(int)>
		SafeParcelable safeparcelable = (SafeParcelable)zznl.createFromParcel(parcel);
	//   21   36:aload_0         
	//   22   37:getfield        #28  <Field android.os.Parcelable$Creator zznl>
	//   23   40:aload_2         
	//   24   41:invokeinterface #102 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   25   46:checkcast       #40  <Class SafeParcelable>
	//   26   49:astore_3        
		parcel.recycle();
	//   27   50:aload_2         
	//   28   51:invokevirtual   #65  <Method void Parcel.recycle()>
		return safeparcelable;
	//   29   54:aload_3         
	//   30   55:areturn         
	}

	public volatile Object get(int i)
	{
		return ((Object) (get(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #106 <Method SafeParcelable get(int)>
	//    3    5:areturn         
	}

	public static final String DATA_FIELD = "data";
	private static final String zznk[] = {
		"data"
	};
	private final android.os.Parcelable.Creator zznl;

	static 
	{
	//    0    0:iconst_1        
	//    1    1:anewarray       String[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:ldc1            #9   <String "data">
	//    5    8:aastore         
	//    6    9:putstatic       #20  <Field String[] zznk>
	//*   7   12:return          
	}
}
