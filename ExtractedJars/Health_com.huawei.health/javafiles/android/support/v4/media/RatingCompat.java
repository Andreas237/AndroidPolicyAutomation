// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import java.lang.annotation.Annotation;

// Referenced classes of package android.support.v4.media:
//			RatingCompatKitkat

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
	//    1    1:invokespecial   #53  <Method void Object()>
		mRatingStyle = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #55  <Field int mRatingStyle>
		mRatingValue = f;
	//    5    9:aload_0         
	//    6   10:fload_2         
	//    7   11:putfield        #57  <Field float mRatingValue>
	//    8   14:return          
	}

	public static RatingCompat fromRating(Object obj)
	{
		if(obj == null || android.os.Build.VERSION.SDK_INT < 19)
	//*   0    0:aload_0         
	//*   1    1:ifnull          12
	//*   2    4:getstatic       #64  <Field int android.os.Build$VERSION.SDK_INT>
	//*   3    7:bipush          19
	//*   4    9:icmpge          14
			return null;
	//    5   12:aconst_null     
	//    6   13:areturn         
		int i = RatingCompatKitkat.getRatingStyle(obj);
	//    7   14:aload_0         
	//    8   15:invokestatic    #70  <Method int RatingCompatKitkat.getRatingStyle(Object)>
	//    9   18:istore_1        
		RatingCompat ratingcompat;
		if(RatingCompatKitkat.isRated(obj))
	//*  10   19:aload_0         
	//*  11   20:invokestatic    #74  <Method boolean RatingCompatKitkat.isRated(Object)>
	//*  12   23:ifeq            114
			switch(i)
	//*  13   26:iload_1         
			{
	//*  14   27:tableswitch     1 6: default 64
	//	               1 67
	//	               2 78
	//	               3 89
	//	               4 89
	//	               5 89
	//	               6 101
	//*  15   64:goto            112
			case 1: // '\001'
				ratingcompat = newHeartRating(RatingCompatKitkat.hasHeart(obj));
	//   16   67:aload_0         
	//   17   68:invokestatic    #77  <Method boolean RatingCompatKitkat.hasHeart(Object)>
	//   18   71:invokestatic    #81  <Method RatingCompat newHeartRating(boolean)>
	//   19   74:astore_2        
				break;

	//*  20   75:goto            119
			case 2: // '\002'
				ratingcompat = newThumbRating(RatingCompatKitkat.isThumbUp(obj));
	//   21   78:aload_0         
	//   22   79:invokestatic    #84  <Method boolean RatingCompatKitkat.isThumbUp(Object)>
	//   23   82:invokestatic    #87  <Method RatingCompat newThumbRating(boolean)>
	//   24   85:astore_2        
				break;

	//*  25   86:goto            119
			case 3: // '\003'
			case 4: // '\004'
			case 5: // '\005'
				ratingcompat = newStarRating(i, RatingCompatKitkat.getStarRating(obj));
	//   26   89:iload_1         
	//   27   90:aload_0         
	//   28   91:invokestatic    #91  <Method float RatingCompatKitkat.getStarRating(Object)>
	//   29   94:invokestatic    #95  <Method RatingCompat newStarRating(int, float)>
	//   30   97:astore_2        
				break;

	//*  31   98:goto            119
			case 6: // '\006'
				ratingcompat = newPercentageRating(RatingCompatKitkat.getPercentRating(obj));
	//   32  101:aload_0         
	//   33  102:invokestatic    #98  <Method float RatingCompatKitkat.getPercentRating(Object)>
	//   34  105:invokestatic    #102 <Method RatingCompat newPercentageRating(float)>
	//   35  108:astore_2        
				break;

	//*  36  109:goto            119
			default:
				return null;
	//   37  112:aconst_null     
	//   38  113:areturn         
			}
		else
			ratingcompat = newUnratedRating(i);
	//   39  114:iload_1         
	//   40  115:invokestatic    #106 <Method RatingCompat newUnratedRating(int)>
	//   41  118:astore_2        
		ratingcompat.mRatingObj = obj;
	//   42  119:aload_2         
	//   43  120:aload_0         
	//   44  121:putfield        #108 <Field Object mRatingObj>
		return ratingcompat;
	//   45  124:aload_2         
	//   46  125:areturn         
	}

	public static RatingCompat newHeartRating(boolean flag)
	{
		float f;
		if(flag)
	//*   0    0:iload_0         
	//*   1    1:ifeq            9
			f = 1.0F;
	//    2    4:fconst_1        
	//    3    5:fstore_1        
		else
	//*   4    6:goto            11
			f = 0.0F;
	//    5    9:fconst_0        
	//    6   10:fstore_1        
		return new RatingCompat(1, f);
	//    7   11:new             #2   <Class RatingCompat>
	//    8   14:dup             
	//    9   15:iconst_1        
	//   10   16:fload_1         
	//   11   17:invokespecial   #110 <Method void RatingCompat(int, float)>
	//   12   20:areturn         
	}

	public static RatingCompat newPercentageRating(float f)
	{
		if(f < 0.0F || f > 100F)
	//*   0    0:fload_0         
	//*   1    1:fconst_0        
	//*   2    2:fcmpg           
	//*   3    3:iflt            13
	//*   4    6:fload_0         
	//*   5    7:ldc1            #111 <Float 100F>
	//*   6    9:fcmpl           
	//*   7   10:ifle            23
		{
			Log.e("Rating", "Invalid percentage-based rating value");
	//    8   13:ldc1            #39  <String "Rating">
	//    9   15:ldc1            #113 <String "Invalid percentage-based rating value">
	//   10   17:invokestatic    #119 <Method int Log.e(String, String)>
	//   11   20:pop             
			return null;
	//   12   21:aconst_null     
	//   13   22:areturn         
		} else
		{
			return new RatingCompat(6, f);
	//   14   23:new             #2   <Class RatingCompat>
	//   15   26:dup             
	//   16   27:bipush          6
	//   17   29:fload_0         
	//   18   30:invokespecial   #110 <Method void RatingCompat(int, float)>
	//   19   33:areturn         
		}
	}

	public static RatingCompat newStarRating(int i, float f)
	{
		float f1;
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     3 5: default 28
	//	               3 31
	//	               4 37
	//	               5 43
	//*   2   28:goto            49
		case 3: // '\003'
			f1 = 3F;
	//    3   31:ldc1            #120 <Float 3F>
	//    4   33:fstore_2        
			break;

	//*   5   34:goto            81
		case 4: // '\004'
			f1 = 4F;
	//    6   37:ldc1            #121 <Float 4F>
	//    7   39:fstore_2        
			break;

	//*   8   40:goto            81
		case 5: // '\005'
			f1 = 5F;
	//    9   43:ldc1            #122 <Float 5F>
	//   10   45:fstore_2        
			break;

	//*  11   46:goto            81
		default:
			Log.e("Rating", (new StringBuilder()).append("Invalid rating style (").append(i).append(") for a star rating").toString());
	//   12   49:ldc1            #39  <String "Rating">
	//   13   51:new             #124 <Class StringBuilder>
	//   14   54:dup             
	//   15   55:invokespecial   #125 <Method void StringBuilder()>
	//   16   58:ldc1            #127 <String "Invalid rating style (">
	//   17   60:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
	//   18   63:iload_0         
	//   19   64:invokevirtual   #134 <Method StringBuilder StringBuilder.append(int)>
	//   20   67:ldc1            #136 <String ") for a star rating">
	//   21   69:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
	//   22   72:invokevirtual   #140 <Method String StringBuilder.toString()>
	//   23   75:invokestatic    #119 <Method int Log.e(String, String)>
	//   24   78:pop             
			return null;
	//   25   79:aconst_null     
	//   26   80:areturn         
		}
		if(f < 0.0F || f > f1)
	//*  27   81:fload_1         
	//*  28   82:fconst_0        
	//*  29   83:fcmpg           
	//*  30   84:iflt            93
	//*  31   87:fload_1         
	//*  32   88:fload_2         
	//*  33   89:fcmpl           
	//*  34   90:ifle            103
		{
			Log.e("Rating", "Trying to set out of range star-based rating");
	//   35   93:ldc1            #39  <String "Rating">
	//   36   95:ldc1            #142 <String "Trying to set out of range star-based rating">
	//   37   97:invokestatic    #119 <Method int Log.e(String, String)>
	//   38  100:pop             
			return null;
	//   39  101:aconst_null     
	//   40  102:areturn         
		} else
		{
			return new RatingCompat(i, f);
	//   41  103:new             #2   <Class RatingCompat>
	//   42  106:dup             
	//   43  107:iload_0         
	//   44  108:fload_1         
	//   45  109:invokespecial   #110 <Method void RatingCompat(int, float)>
	//   46  112:areturn         
		}
	}

	public static RatingCompat newThumbRating(boolean flag)
	{
		float f;
		if(flag)
	//*   0    0:iload_0         
	//*   1    1:ifeq            9
			f = 1.0F;
	//    2    4:fconst_1        
	//    3    5:fstore_1        
		else
	//*   4    6:goto            11
			f = 0.0F;
	//    5    9:fconst_0        
	//    6   10:fstore_1        
		return new RatingCompat(2, f);
	//    7   11:new             #2   <Class RatingCompat>
	//    8   14:dup             
	//    9   15:iconst_2        
	//   10   16:fload_1         
	//   11   17:invokespecial   #110 <Method void RatingCompat(int, float)>
	//   12   20:areturn         
	}

	public static RatingCompat newUnratedRating(int i)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     1 6: default 40
	//	               1 43
	//	               2 43
	//	               3 43
	//	               4 43
	//	               5 43
	//	               6 43
	//*   2   40:goto            54
		case 1: // '\001'
		case 2: // '\002'
		case 3: // '\003'
		case 4: // '\004'
		case 5: // '\005'
		case 6: // '\006'
			return new RatingCompat(i, -1F);
	//    3   43:new             #2   <Class RatingCompat>
	//    4   46:dup             
	//    5   47:iload_0         
	//    6   48:ldc1            #31  <Float -1F>
	//    7   50:invokespecial   #110 <Method void RatingCompat(int, float)>
	//    8   53:areturn         
		}
		return null;
	//    9   54:aconst_null     
	//   10   55:areturn         
	}

	public int describeContents()
	{
		return mRatingStyle;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field int mRatingStyle>
	//    2    4:ireturn         
	}

	public float getPercentRating()
	{
		if(mRatingStyle != 6 || !isRated())
	//*   0    0:aload_0         
	//*   1    1:getfield        #55  <Field int mRatingStyle>
	//*   2    4:bipush          6
	//*   3    6:icmpne          16
	//*   4    9:aload_0         
	//*   5   10:invokevirtual   #148 <Method boolean isRated()>
	//*   6   13:ifne            19
			return -1F;
	//    7   16:ldc1            #31  <Float -1F>
	//    8   18:freturn         
		else
			return mRatingValue;
	//    9   19:aload_0         
	//   10   20:getfield        #57  <Field float mRatingValue>
	//   11   23:freturn         
	}

	public Object getRating()
	{
		if(mRatingObj != null || android.os.Build.VERSION.SDK_INT < 19)
	//*   0    0:aload_0         
	//*   1    1:getfield        #108 <Field Object mRatingObj>
	//*   2    4:ifnonnull       15
	//*   3    7:getstatic       #64  <Field int android.os.Build$VERSION.SDK_INT>
	//*   4   10:bipush          19
	//*   5   12:icmpge          20
			return mRatingObj;
	//    6   15:aload_0         
	//    7   16:getfield        #108 <Field Object mRatingObj>
	//    8   19:areturn         
		if(isRated())
	//*   9   20:aload_0         
	//*  10   21:invokevirtual   #148 <Method boolean isRated()>
	//*  11   24:ifeq            130
			switch(mRatingStyle)
	//*  12   27:aload_0         
	//*  13   28:getfield        #55  <Field int mRatingStyle>
			{
	//*  14   31:tableswitch     1 6: default 68
	//	               1 71
	//	               2 85
	//	               3 99
	//	               4 99
	//	               5 99
	//	               6 117
	//*  15   68:goto            128
			case 1: // '\001'
				mRatingObj = RatingCompatKitkat.newHeartRating(hasHeart());
	//   16   71:aload_0         
	//   17   72:aload_0         
	//   18   73:invokevirtual   #152 <Method boolean hasHeart()>
	//   19   76:invokestatic    #155 <Method Object RatingCompatKitkat.newHeartRating(boolean)>
	//   20   79:putfield        #108 <Field Object mRatingObj>
				break;

	//*  21   82:goto            141
			case 2: // '\002'
				mRatingObj = RatingCompatKitkat.newThumbRating(isThumbUp());
	//   22   85:aload_0         
	//   23   86:aload_0         
	//   24   87:invokevirtual   #157 <Method boolean isThumbUp()>
	//   25   90:invokestatic    #159 <Method Object RatingCompatKitkat.newThumbRating(boolean)>
	//   26   93:putfield        #108 <Field Object mRatingObj>
				break;

	//*  27   96:goto            141
			case 3: // '\003'
			case 4: // '\004'
			case 5: // '\005'
				mRatingObj = RatingCompatKitkat.newStarRating(mRatingStyle, getStarRating());
	//   28   99:aload_0         
	//   29  100:aload_0         
	//   30  101:getfield        #55  <Field int mRatingStyle>
	//   31  104:aload_0         
	//   32  105:invokevirtual   #161 <Method float getStarRating()>
	//   33  108:invokestatic    #164 <Method Object RatingCompatKitkat.newStarRating(int, float)>
	//   34  111:putfield        #108 <Field Object mRatingObj>
				break;

	//*  35  114:goto            141
			case 6: // '\006'
				mRatingObj = RatingCompatKitkat.newPercentageRating(getPercentRating());
	//   36  117:aload_0         
	//   37  118:aload_0         
	//   38  119:invokevirtual   #166 <Method float getPercentRating()>
	//   39  122:invokestatic    #169 <Method Object RatingCompatKitkat.newPercentageRating(float)>
	//   40  125:putfield        #108 <Field Object mRatingObj>
				// fall through

			default:
				return ((Object) (null));
	//   41  128:aconst_null     
	//   42  129:areturn         
			}
		else
			mRatingObj = RatingCompatKitkat.newUnratedRating(mRatingStyle);
	//   43  130:aload_0         
	//   44  131:aload_0         
	//   45  132:getfield        #55  <Field int mRatingStyle>
	//   46  135:invokestatic    #172 <Method Object RatingCompatKitkat.newUnratedRating(int)>
	//   47  138:putfield        #108 <Field Object mRatingObj>
		return mRatingObj;
	//   48  141:aload_0         
	//   49  142:getfield        #108 <Field Object mRatingObj>
	//   50  145:areturn         
	}

	public int getRatingStyle()
	{
		return mRatingStyle;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field int mRatingStyle>
	//    2    4:ireturn         
	}

	public float getStarRating()
	{
		switch(mRatingStyle)
	//*   0    0:aload_0         
	//*   1    1:getfield        #55  <Field int mRatingStyle>
		{
	//*   2    4:tableswitch     3 5: default 32
	//	               3 35
	//	               4 35
	//	               5 35
	//*   3   32:goto            47
		case 3: // '\003'
		case 4: // '\004'
		case 5: // '\005'
			if(isRated())
	//*   4   35:aload_0         
	//*   5   36:invokevirtual   #148 <Method boolean isRated()>
	//*   6   39:ifeq            47
				return mRatingValue;
	//    7   42:aload_0         
	//    8   43:getfield        #57  <Field float mRatingValue>
	//    9   46:freturn         
			break;
		}
		return -1F;
	//   10   47:ldc1            #31  <Float -1F>
	//   11   49:freturn         
	}

	public boolean hasHeart()
	{
		if(mRatingStyle != 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #55  <Field int mRatingStyle>
	//*   2    4:iconst_1        
	//*   3    5:icmpeq          10
			return false;
	//    4    8:iconst_0        
	//    5    9:ireturn         
		return mRatingValue == 1.0F;
	//    6   10:aload_0         
	//    7   11:getfield        #57  <Field float mRatingValue>
	//    8   14:fconst_1        
	//    9   15:fcmpl           
	//   10   16:ifne            21
	//   11   19:iconst_1        
	//   12   20:ireturn         
	//   13   21:iconst_0        
	//   14   22:ireturn         
	}

	public boolean isRated()
	{
		return mRatingValue >= 0.0F;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field float mRatingValue>
	//    2    4:fconst_0        
	//    3    5:fcmpl           
	//    4    6:iflt            11
	//    5    9:iconst_1        
	//    6   10:ireturn         
	//    7   11:iconst_0        
	//    8   12:ireturn         
	}

	public boolean isThumbUp()
	{
		if(mRatingStyle != 2)
	//*   0    0:aload_0         
	//*   1    1:getfield        #55  <Field int mRatingStyle>
	//*   2    4:iconst_2        
	//*   3    5:icmpeq          10
			return false;
	//    4    8:iconst_0        
	//    5    9:ireturn         
		return mRatingValue == 1.0F;
	//    6   10:aload_0         
	//    7   11:getfield        #57  <Field float mRatingValue>
	//    8   14:fconst_1        
	//    9   15:fcmpl           
	//   10   16:ifne            21
	//   11   19:iconst_1        
	//   12   20:ireturn         
	//   13   21:iconst_0        
	//   14   22:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = (new StringBuilder()).append("Rating:style=").append(mRatingStyle).append(" rating=");
	//    0    0:new             #124 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #125 <Method void StringBuilder()>
	//    3    7:ldc1            #174 <String "Rating:style=">
	//    4    9:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #55  <Field int mRatingStyle>
	//    7   16:invokevirtual   #134 <Method StringBuilder StringBuilder.append(int)>
	//    8   19:ldc1            #176 <String " rating=">
	//    9   21:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
	//   10   24:astore_2        
		String s;
		if(mRatingValue < 0.0F)
	//*  11   25:aload_0         
	//*  12   26:getfield        #57  <Field float mRatingValue>
	//*  13   29:fconst_0        
	//*  14   30:fcmpg           
	//*  15   31:ifge            40
			s = "unrated";
	//   16   34:ldc1            #178 <String "unrated">
	//   17   36:astore_1        
		else
	//*  18   37:goto            48
			s = String.valueOf(mRatingValue);
	//   19   40:aload_0         
	//   20   41:getfield        #57  <Field float mRatingValue>
	//   21   44:invokestatic    #184 <Method String String.valueOf(float)>
	//   22   47:astore_1        
		return stringbuilder.append(s).toString();
	//   23   48:aload_2         
	//   24   49:aload_1         
	//   25   50:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
	//   26   53:invokevirtual   #140 <Method String StringBuilder.toString()>
	//   27   56:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeInt(mRatingStyle);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #55  <Field int mRatingStyle>
	//    3    5:invokevirtual   #192 <Method void Parcel.writeInt(int)>
		parcel.writeFloat(mRatingValue);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #57  <Field float mRatingValue>
	//    7   13:invokevirtual   #196 <Method void Parcel.writeFloat(float)>
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
	public static final int RATING_3_STARS = 3;
	public static final int RATING_4_STARS = 4;
	public static final int RATING_5_STARS = 5;
	public static final int RATING_HEART = 1;
	public static final int RATING_NONE = 0;
	private static final float RATING_NOT_RATED = -1F;
	public static final int RATING_PERCENTAGE = 6;
	public static final int RATING_THUMB_UP_DOWN = 2;
	private static final String TAG = "Rating";
	private Object mRatingObj;
	private final int mRatingStyle;
	private final float mRatingValue;

	static 
	{
	//    0    0:new             #8   <Class RatingCompat$1>
	//    1    3:dup             
	//    2    4:invokespecial   #48  <Method void RatingCompat$1()>
	//    3    7:putstatic       #50  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
