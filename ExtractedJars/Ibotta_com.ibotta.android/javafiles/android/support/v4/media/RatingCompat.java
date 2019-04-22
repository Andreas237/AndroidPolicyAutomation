// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.annotation.Annotation;

public final class RatingCompat
	implements Parcelable
{
	public static interface StarStyle
		extends Annotation
	{
	}

	public static interface Style
		extends Annotation
	{
	}


	RatingCompat(int i, float f)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
		mRatingStyle = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #33  <Field int mRatingStyle>
		mRatingValue = f;
	//    5    9:aload_0         
	//    6   10:fload_2         
	//    7   11:putfield        #35  <Field float mRatingValue>
	//    8   14:return          
	}

	public int describeContents()
	{
		return mRatingStyle;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field int mRatingStyle>
	//    2    4:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #41  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #42  <Method void StringBuilder()>
	//    3    7:astore_3        
		stringbuilder.append("Rating:style=");
	//    4    8:aload_3         
	//    5    9:ldc1            #44  <String "Rating:style=">
	//    6   11:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(mRatingStyle);
	//    8   15:aload_3         
	//    9   16:aload_0         
	//   10   17:getfield        #33  <Field int mRatingStyle>
	//   11   20:invokevirtual   #51  <Method StringBuilder StringBuilder.append(int)>
	//   12   23:pop             
		stringbuilder.append(" rating=");
	//   13   24:aload_3         
	//   14   25:ldc1            #53  <String " rating=">
	//   15   27:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		float f = mRatingValue;
	//   17   31:aload_0         
	//   18   32:getfield        #35  <Field float mRatingValue>
	//   19   35:fstore_1        
		String s;
		if(f < 0.0F)
	//*  20   36:fload_1         
	//*  21   37:fconst_0        
	//*  22   38:fcmpg           
	//*  23   39:ifge            48
			s = "unrated";
	//   24   42:ldc1            #55  <String "unrated">
	//   25   44:astore_2        
		else
	//*  26   45:goto            53
			s = String.valueOf(f);
	//   27   48:fload_1         
	//   28   49:invokestatic    #61  <Method String String.valueOf(float)>
	//   29   52:astore_2        
		stringbuilder.append(s);
	//   30   53:aload_3         
	//   31   54:aload_2         
	//   32   55:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   33   58:pop             
		return stringbuilder.toString();
	//   34   59:aload_3         
	//   35   60:invokevirtual   #63  <Method String StringBuilder.toString()>
	//   36   63:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeInt(mRatingStyle);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #33  <Field int mRatingStyle>
	//    3    5:invokevirtual   #71  <Method void Parcel.writeInt(int)>
		parcel.writeFloat(mRatingValue);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #35  <Field float mRatingValue>
	//    7   13:invokevirtual   #75  <Method void Parcel.writeFloat(float)>
	//    8   16:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public RatingCompat createFromParcel(Parcel parcel)
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

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #32  <Method RatingCompat createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public RatingCompat[] newArray(int i)
		{
			return new RatingCompat[i];
		//    0    0:iload_1         
		//    1    1:anewarray       RatingCompat[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #37  <Method RatingCompat[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	private final int mRatingStyle;
	private final float mRatingValue;

	static 
	{
	//    0    0:new             #8   <Class RatingCompat$1>
	//    1    3:dup             
	//    2    4:invokespecial   #26  <Method void RatingCompat$1()>
	//    3    7:putstatic       #28  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
