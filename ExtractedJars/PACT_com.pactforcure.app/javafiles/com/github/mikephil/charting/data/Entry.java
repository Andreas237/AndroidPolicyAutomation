// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.data;

import android.os.*;

public class Entry
	implements Parcelable
{

	public Entry(float f, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
		mVal = 0.0F;
	//    2    4:aload_0         
	//    3    5:fconst_0        
	//    4    6:putfield        #29  <Field float mVal>
		mXIndex = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #31  <Field int mXIndex>
		mData = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #33  <Field Object mData>
		mVal = f;
	//   11   19:aload_0         
	//   12   20:fload_1         
	//   13   21:putfield        #29  <Field float mVal>
		mXIndex = i;
	//   14   24:aload_0         
	//   15   25:iload_2         
	//   16   26:putfield        #31  <Field int mXIndex>
	//   17   29:return          
	}

	public Entry(float f, int i, Object obj)
	{
		this(f, i);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #36  <Method void Entry(float, int)>
		mData = obj;
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:putfield        #33  <Field Object mData>
	//    7   11:return          
	}

	protected Entry(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
		mVal = 0.0F;
	//    2    4:aload_0         
	//    3    5:fconst_0        
	//    4    6:putfield        #29  <Field float mVal>
		mXIndex = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #31  <Field int mXIndex>
		mData = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #33  <Field Object mData>
		mVal = parcel.readFloat();
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:invokevirtual   #43  <Method float Parcel.readFloat()>
	//   14   24:putfield        #29  <Field float mVal>
		mXIndex = parcel.readInt();
	//   15   27:aload_0         
	//   16   28:aload_1         
	//   17   29:invokevirtual   #47  <Method int Parcel.readInt()>
	//   18   32:putfield        #31  <Field int mXIndex>
		if(parcel.readInt() == 1)
	//*  19   35:aload_1         
	//*  20   36:invokevirtual   #47  <Method int Parcel.readInt()>
	//*  21   39:iconst_1        
	//*  22   40:icmpne          56
			mData = ((Object) (parcel.readParcelable(((Class) (java/lang/Object)).getClassLoader())));
	//   23   43:aload_0         
	//   24   44:aload_1         
	//   25   45:ldc1            #4   <Class Object>
	//   26   47:invokevirtual   #53  <Method ClassLoader Class.getClassLoader()>
	//   27   50:invokevirtual   #57  <Method Parcelable Parcel.readParcelable(ClassLoader)>
	//   28   53:putfield        #33  <Field Object mData>
	//   29   56:return          
	}

	public Entry copy()
	{
		return new Entry(mVal, mXIndex, mData);
	//    0    0:new             #2   <Class Entry>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #29  <Field float mVal>
	//    4    8:aload_0         
	//    5    9:getfield        #31  <Field int mXIndex>
	//    6   12:aload_0         
	//    7   13:getfield        #33  <Field Object mData>
	//    8   16:invokespecial   #61  <Method void Entry(float, int, Object)>
	//    9   19:areturn         
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean equalTo(Entry entry)
	{
		while(entry == null || entry.mData != mData || entry.mXIndex != mXIndex || Math.abs(entry.mVal - mVal) > 1E-05F) 
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
	//    4    6:aload_1         
	//    5    7:getfield        #33  <Field Object mData>
	//    6   10:aload_0         
	//    7   11:getfield        #33  <Field Object mData>
	//    8   14:if_acmpne       4
	//    9   17:aload_1         
	//   10   18:getfield        #31  <Field int mXIndex>
	//   11   21:aload_0         
	//   12   22:getfield        #31  <Field int mXIndex>
	//   13   25:icmpne          4
	//   14   28:aload_1         
	//   15   29:getfield        #29  <Field float mVal>
	//   16   32:aload_0         
	//   17   33:getfield        #29  <Field float mVal>
	//   18   36:fsub            
	//   19   37:invokestatic    #70  <Method float Math.abs(float)>
	//   20   40:ldc1            #71  <Float 1E-05F>
	//   21   42:fcmpl           
	//   22   43:ifgt            4
		return true;
	//   23   46:iconst_1        
	//   24   47:ireturn         
	}

	public Object getData()
	{
		return mData;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field Object mData>
	//    2    4:areturn         
	}

	public float getVal()
	{
		return mVal;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field float mVal>
	//    2    4:freturn         
	}

	public int getXIndex()
	{
		return mXIndex;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field int mXIndex>
	//    2    4:ireturn         
	}

	public void setData(Object obj)
	{
		mData = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #33  <Field Object mData>
	//    3    5:return          
	}

	public void setVal(float f)
	{
		mVal = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #29  <Field float mVal>
	//    3    5:return          
	}

	public void setXIndex(int i)
	{
		mXIndex = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #31  <Field int mXIndex>
	//    3    5:return          
	}

	public String toString()
	{
		return (new StringBuilder()).append("Entry, xIndex: ").append(mXIndex).append(" val (sum): ").append(getVal()).toString();
	//    0    0:new             #85  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #86  <Method void StringBuilder()>
	//    3    7:ldc1            #88  <String "Entry, xIndex: ">
	//    4    9:invokevirtual   #92  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #31  <Field int mXIndex>
	//    7   16:invokevirtual   #95  <Method StringBuilder StringBuilder.append(int)>
	//    8   19:ldc1            #97  <String " val (sum): ">
	//    9   21:invokevirtual   #92  <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:invokevirtual   #99  <Method float getVal()>
	//   12   28:invokevirtual   #102 <Method StringBuilder StringBuilder.append(float)>
	//   13   31:invokevirtual   #104 <Method String StringBuilder.toString()>
	//   14   34:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeFloat(mVal);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #29  <Field float mVal>
	//    3    5:invokevirtual   #109 <Method void Parcel.writeFloat(float)>
		parcel.writeInt(mXIndex);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #31  <Field int mXIndex>
	//    7   13:invokevirtual   #112 <Method void Parcel.writeInt(int)>
		if(mData != null)
	//*   8   16:aload_0         
	//*   9   17:getfield        #33  <Field Object mData>
	//*  10   20:ifnull          61
		{
			if(mData instanceof Parcelable)
	//*  11   23:aload_0         
	//*  12   24:getfield        #33  <Field Object mData>
	//*  13   27:instanceof      #6   <Class Parcelable>
	//*  14   30:ifeq            51
			{
				parcel.writeInt(1);
	//   15   33:aload_1         
	//   16   34:iconst_1        
	//   17   35:invokevirtual   #112 <Method void Parcel.writeInt(int)>
				parcel.writeParcelable((Parcelable)mData, i);
	//   18   38:aload_1         
	//   19   39:aload_0         
	//   20   40:getfield        #33  <Field Object mData>
	//   21   43:checkcast       #6   <Class Parcelable>
	//   22   46:iload_2         
	//   23   47:invokevirtual   #116 <Method void Parcel.writeParcelable(Parcelable, int)>
				return;
	//   24   50:return          
			} else
			{
				throw new ParcelFormatException("Cannot parcel an Entry with non-parcelable data");
	//   25   51:new             #118 <Class ParcelFormatException>
	//   26   54:dup             
	//   27   55:ldc1            #120 <String "Cannot parcel an Entry with non-parcelable data">
	//   28   57:invokespecial   #123 <Method void ParcelFormatException(String)>
	//   29   60:athrow          
			}
		} else
		{
			parcel.writeInt(0);
	//   30   61:aload_1         
	//   31   62:iconst_0        
	//   32   63:invokevirtual   #112 <Method void Parcel.writeInt(int)>
			return;
	//   33   66:return          
		}
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public Entry createFromParcel(Parcel parcel)
		{
			return new Entry(parcel);
		//    0    0:new             #9   <Class Entry>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void Entry(Parcel)>
		//    4    8:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #22  <Method Entry createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public Entry[] newArray(int i)
		{
			return new Entry[i];
		//    0    0:iload_1         
		//    1    1:anewarray       Entry[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #27  <Method Entry[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	private Object mData;
	private float mVal;
	private int mXIndex;

	static 
	{
	//    0    0:new             #8   <Class Entry$1>
	//    1    3:dup             
	//    2    4:invokespecial   #22  <Method void Entry$1()>
	//    3    7:putstatic       #24  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
