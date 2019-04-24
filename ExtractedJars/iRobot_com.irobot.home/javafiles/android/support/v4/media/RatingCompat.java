// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;

public final class RatingCompat
	implements Parcelable
{

	RatingCompat(int i, float f)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		a = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #27  <Field int a>
		b = f;
	//    5    9:aload_0         
	//    6   10:fload_2         
	//    7   11:putfield        #29  <Field float b>
	//    8   14:return          
	}

	public int describeContents()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field int a>
	//    2    4:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #35  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #36  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("Rating:style=");
	//    4    8:aload_2         
	//    5    9:ldc1            #38  <String "Rating:style=">
	//    6   11:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(a);
	//    8   15:aload_2         
	//    9   16:aload_0         
	//   10   17:getfield        #27  <Field int a>
	//   11   20:invokevirtual   #45  <Method StringBuilder StringBuilder.append(int)>
	//   12   23:pop             
		stringbuilder.append(" rating=");
	//   13   24:aload_2         
	//   14   25:ldc1            #47  <String " rating=">
	//   15   27:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		String s;
		if(b < 0.0F)
	//*  17   31:aload_0         
	//*  18   32:getfield        #29  <Field float b>
	//*  19   35:fconst_0        
	//*  20   36:fcmpg           
	//*  21   37:ifge            46
			s = "unrated";
	//   22   40:ldc1            #49  <String "unrated">
	//   23   42:astore_1        
		else
	//*  24   43:goto            54
			s = String.valueOf(b);
	//   25   46:aload_0         
	//   26   47:getfield        #29  <Field float b>
	//   27   50:invokestatic    #55  <Method String String.valueOf(float)>
	//   28   53:astore_1        
		stringbuilder.append(s);
	//   29   54:aload_2         
	//   30   55:aload_1         
	//   31   56:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   32   59:pop             
		return stringbuilder.toString();
	//   33   60:aload_2         
	//   34   61:invokevirtual   #57  <Method String StringBuilder.toString()>
	//   35   64:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeInt(a);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #27  <Field int a>
	//    3    5:invokevirtual   #65  <Method void Parcel.writeInt(int)>
		parcel.writeFloat(b);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #29  <Field float b>
	//    7   13:invokevirtual   #69  <Method void Parcel.writeFloat(float)>
	//    8   16:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public RatingCompat a(Parcel parcel)
		{
			return new RatingCompat(parcel.readInt(), parcel.readFloat());
		//    0    0:new             #9   <Class RatingCompat>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokevirtual   #22  <Method int Parcel.readInt()>
		//    4    8:aload_1         
		//    5    9:invokevirtual   #26  <Method float Parcel.readFloat()>
		//    6   12:invokespecial   #29  <Method void RatingCompat(int, float)>
		//    7   15:areturn         
		}

		public RatingCompat[] a(int i)
		{
			return new RatingCompat[i];
		//    0    0:iload_1         
		//    1    1:anewarray       RatingCompat[]
		//    2    4:areturn         
		}

		public Object createFromParcel(Parcel parcel)
		{
			return ((Object) (a(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #34  <Method RatingCompat a(Parcel)>
		//    3    5:areturn         
		}

		public Object[] newArray(int i)
		{
			return ((Object []) (a(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #38  <Method RatingCompat[] a(int)>
		//    3    5:areturn         
		}

	}
;
	private final int a;
	private final float b;

	static 
	{
	//    0    0:new             #8   <Class RatingCompat$1>
	//    1    3:dup             
	//    2    4:invokespecial   #20  <Method void RatingCompat$1()>
	//    3    7:putstatic       #22  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
