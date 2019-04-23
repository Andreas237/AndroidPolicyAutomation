// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
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
		if(obj != null && android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:aload_0         
	//*   1    1:ifnull          127
	//*   2    4:getstatic       #64  <Field int android.os.Build$VERSION.SDK_INT>
	//*   3    7:bipush          19
	//*   4    9:icmplt          127
		{
			Object obj1 = ((Object) ((Rating)obj));
	//    5   12:aload_0         
	//    6   13:checkcast       #66  <Class Rating>
	//    7   16:astore_2        
			int i = ((Rating) (obj1)).getRatingStyle();
	//    8   17:aload_2         
	//    9   18:invokevirtual   #70  <Method int Rating.getRatingStyle()>
	//   10   21:istore_1        
			if(((Rating) (obj1)).isRated())
	//*  11   22:aload_2         
	//*  12   23:invokevirtual   #74  <Method boolean Rating.isRated()>
	//*  13   26:ifeq            115
				switch(i)
	//*  14   29:iload_1         
				{
	//*  15   30:tableswitch     1 6: default 68
	//	               1 104
	//	               2 93
	//	               3 81
	//	               4 81
	//	               5 81
	//	               6 70
				default:
					return null;
	//   16   68:aconst_null     
	//   17   69:areturn         

				case 6: // '\006'
					obj1 = ((Object) (newPercentageRating(((Rating) (obj1)).getPercentRating())));
	//   18   70:aload_2         
	//   19   71:invokevirtual   #78  <Method float Rating.getPercentRating()>
	//   20   74:invokestatic    #82  <Method RatingCompat newPercentageRating(float)>
	//   21   77:astore_2        
					break;

	//*  22   78:goto            120
				case 3: // '\003'
				case 4: // '\004'
				case 5: // '\005'
					obj1 = ((Object) (newStarRating(i, ((Rating) (obj1)).getStarRating())));
	//   23   81:iload_1         
	//   24   82:aload_2         
	//   25   83:invokevirtual   #85  <Method float Rating.getStarRating()>
	//   26   86:invokestatic    #89  <Method RatingCompat newStarRating(int, float)>
	//   27   89:astore_2        
					break;

	//*  28   90:goto            120
				case 2: // '\002'
					obj1 = ((Object) (newThumbRating(((Rating) (obj1)).isThumbUp())));
	//   29   93:aload_2         
	//   30   94:invokevirtual   #92  <Method boolean Rating.isThumbUp()>
	//   31   97:invokestatic    #96  <Method RatingCompat newThumbRating(boolean)>
	//   32  100:astore_2        
					break;

	//*  33  101:goto            120
				case 1: // '\001'
					obj1 = ((Object) (newHeartRating(((Rating) (obj1)).hasHeart())));
	//   34  104:aload_2         
	//   35  105:invokevirtual   #99  <Method boolean Rating.hasHeart()>
	//   36  108:invokestatic    #102 <Method RatingCompat newHeartRating(boolean)>
	//   37  111:astore_2        
					break;
				}
			else
	//*  38  112:goto            120
				obj1 = ((Object) (newUnratedRating(i)));
	//   39  115:iload_1         
	//   40  116:invokestatic    #106 <Method RatingCompat newUnratedRating(int)>
	//   41  119:astore_2        
			obj1.mRatingObj = obj;
	//   42  120:aload_2         
	//   43  121:aload_0         
	//   44  122:putfield        #108 <Field Object mRatingObj>
			return ((RatingCompat) (obj1));
	//   45  125:aload_2         
	//   46  126:areturn         
		} else
		{
			return null;
	//   47  127:aconst_null     
	//   48  128:areturn         
		}
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
		if(f >= 0.0F && f <= 100F)
	//*   0    0:fload_0         
	//*   1    1:fconst_0        
	//*   2    2:fcmpg           
	//*   3    3:iflt            27
	//*   4    6:fload_0         
	//*   5    7:ldc1            #111 <Float 100F>
	//*   6    9:fcmpl           
	//*   7   10:ifle            16
	//*   8   13:goto            27
		{
			return new RatingCompat(6, f);
	//    9   16:new             #2   <Class RatingCompat>
	//   10   19:dup             
	//   11   20:bipush          6
	//   12   22:fload_0         
	//   13   23:invokespecial   #110 <Method void RatingCompat(int, float)>
	//   14   26:areturn         
		} else
		{
			Log.e("Rating", "Invalid percentage-based rating value");
	//   15   27:ldc1            #39  <String "Rating">
	//   16   29:ldc1            #113 <String "Invalid percentage-based rating value">
	//   17   31:invokestatic    #119 <Method int Log.e(String, String)>
	//   18   34:pop             
			return null;
	//   19   35:aconst_null     
	//   20   36:areturn         
		}
	}

	public static RatingCompat newStarRating(int i, float f)
	{
		float f1;
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     3 5: default 28
	//	               3 80
	//	               4 74
	//	               5 68
		default:
			StringBuilder stringbuilder = new StringBuilder();
	//    2   28:new             #121 <Class StringBuilder>
	//    3   31:dup             
	//    4   32:invokespecial   #122 <Method void StringBuilder()>
	//    5   35:astore_3        
			stringbuilder.append("Invalid rating style (");
	//    6   36:aload_3         
	//    7   37:ldc1            #124 <String "Invalid rating style (">
	//    8   39:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//    9   42:pop             
			stringbuilder.append(i);
	//   10   43:aload_3         
	//   11   44:iload_0         
	//   12   45:invokevirtual   #131 <Method StringBuilder StringBuilder.append(int)>
	//   13   48:pop             
			stringbuilder.append(") for a star rating");
	//   14   49:aload_3         
	//   15   50:ldc1            #133 <String ") for a star rating">
	//   16   52:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//   17   55:pop             
			Log.e("Rating", stringbuilder.toString());
	//   18   56:ldc1            #39  <String "Rating">
	//   19   58:aload_3         
	//   20   59:invokevirtual   #137 <Method String StringBuilder.toString()>
	//   21   62:invokestatic    #119 <Method int Log.e(String, String)>
	//   22   65:pop             
			return null;
	//   23   66:aconst_null     
	//   24   67:areturn         

		case 5: // '\005'
			f1 = 5F;
	//   25   68:ldc1            #138 <Float 5F>
	//   26   70:fstore_2        
			break;

	//*  27   71:goto            83
		case 4: // '\004'
			f1 = 4F;
	//   28   74:ldc1            #139 <Float 4F>
	//   29   76:fstore_2        
			break;

	//*  30   77:goto            83
		case 3: // '\003'
			f1 = 3F;
	//   31   80:ldc1            #140 <Float 3F>
	//   32   82:fstore_2        
			break;
		}
		if(f >= 0.0F && f <= f1)
	//*  33   83:fload_1         
	//*  34   84:fconst_0        
	//*  35   85:fcmpg           
	//*  36   86:iflt            108
	//*  37   89:fload_1         
	//*  38   90:fload_2         
	//*  39   91:fcmpl           
	//*  40   92:ifle            98
	//*  41   95:goto            108
		{
			return new RatingCompat(i, f);
	//   42   98:new             #2   <Class RatingCompat>
	//   43  101:dup             
	//   44  102:iload_0         
	//   45  103:fload_1         
	//   46  104:invokespecial   #110 <Method void RatingCompat(int, float)>
	//   47  107:areturn         
		} else
		{
			Log.e("Rating", "Trying to set out of range star-based rating");
	//   48  108:ldc1            #39  <String "Rating">
	//   49  110:ldc1            #142 <String "Trying to set out of range star-based rating">
	//   50  112:invokestatic    #119 <Method int Log.e(String, String)>
	//   51  115:pop             
			return null;
	//   52  116:aconst_null     
	//   53  117:areturn         
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
	//	               1 42
	//	               2 42
	//	               3 42
	//	               4 42
	//	               5 42
	//	               6 42
		default:
			return null;
	//    2   40:aconst_null     
	//    3   41:areturn         

		case 1: // '\001'
		case 2: // '\002'
		case 3: // '\003'
		case 4: // '\004'
		case 5: // '\005'
		case 6: // '\006'
			return new RatingCompat(i, -1F);
	//    4   42:new             #2   <Class RatingCompat>
	//    5   45:dup             
	//    6   46:iload_0         
	//    7   47:ldc1            #31  <Float -1F>
	//    8   49:invokespecial   #110 <Method void RatingCompat(int, float)>
	//    9   52:areturn         
		}
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
		if(mRatingStyle == 6 && isRated())
	//*   0    0:aload_0         
	//*   1    1:getfield        #55  <Field int mRatingStyle>
	//*   2    4:bipush          6
	//*   3    6:icmpne          24
	//*   4    9:aload_0         
	//*   5   10:invokevirtual   #144 <Method boolean isRated()>
	//*   6   13:ifne            19
	//*   7   16:goto            24
			return mRatingValue;
	//    8   19:aload_0         
	//    9   20:getfield        #57  <Field float mRatingValue>
	//   10   23:freturn         
		else
			return -1F;
	//   11   24:ldc1            #31  <Float -1F>
	//   12   26:freturn         
	}

	public Object getRating()
	{
		if(mRatingObj == null && android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:aload_0         
	//*   1    1:getfield        #108 <Field Object mRatingObj>
	//*   2    4:ifnonnull       138
	//*   3    7:getstatic       #64  <Field int android.os.Build$VERSION.SDK_INT>
	//*   4   10:bipush          19
	//*   5   12:icmplt          138
			if(isRated())
	//*   6   15:aload_0         
	//*   7   16:invokevirtual   #144 <Method boolean isRated()>
	//*   8   19:ifeq            127
			{
				int i = mRatingStyle;
	//    9   22:aload_0         
	//   10   23:getfield        #55  <Field int mRatingStyle>
	//   11   26:istore_1        
				switch(i)
	//*  12   27:iload_1         
				{
	//*  13   28:tableswitch     1 6: default 68
	//	               1 113
	//	               2 99
	//	               3 84
	//	               4 84
	//	               5 84
	//	               6 70
				default:
					return ((Object) (null));
	//   14   68:aconst_null     
	//   15   69:areturn         

				case 6: // '\006'
					mRatingObj = ((Object) (Rating.newPercentageRating(getPercentRating())));
	//   16   70:aload_0         
	//   17   71:aload_0         
	//   18   72:invokevirtual   #147 <Method float getPercentRating()>
	//   19   75:invokestatic    #150 <Method Rating Rating.newPercentageRating(float)>
	//   20   78:putfield        #108 <Field Object mRatingObj>
					break;

	//*  21   81:goto            138
				case 3: // '\003'
				case 4: // '\004'
				case 5: // '\005'
					mRatingObj = ((Object) (Rating.newStarRating(i, getStarRating())));
	//   22   84:aload_0         
	//   23   85:iload_1         
	//   24   86:aload_0         
	//   25   87:invokevirtual   #151 <Method float getStarRating()>
	//   26   90:invokestatic    #154 <Method Rating Rating.newStarRating(int, float)>
	//   27   93:putfield        #108 <Field Object mRatingObj>
					break;

	//*  28   96:goto            138
				case 2: // '\002'
					mRatingObj = ((Object) (Rating.newThumbRating(isThumbUp())));
	//   29   99:aload_0         
	//   30  100:aload_0         
	//   31  101:invokevirtual   #155 <Method boolean isThumbUp()>
	//   32  104:invokestatic    #158 <Method Rating Rating.newThumbRating(boolean)>
	//   33  107:putfield        #108 <Field Object mRatingObj>
					break;

	//*  34  110:goto            138
				case 1: // '\001'
					mRatingObj = ((Object) (Rating.newHeartRating(hasHeart())));
	//   35  113:aload_0         
	//   36  114:aload_0         
	//   37  115:invokevirtual   #159 <Method boolean hasHeart()>
	//   38  118:invokestatic    #161 <Method Rating Rating.newHeartRating(boolean)>
	//   39  121:putfield        #108 <Field Object mRatingObj>
					break;
				}
			} else
	//*  40  124:goto            138
			{
				mRatingObj = ((Object) (Rating.newUnratedRating(mRatingStyle)));
	//   41  127:aload_0         
	//   42  128:aload_0         
	//   43  129:getfield        #55  <Field int mRatingStyle>
	//   44  132:invokestatic    #164 <Method Rating Rating.newUnratedRating(int)>
	//   45  135:putfield        #108 <Field Object mRatingObj>
			}
		return mRatingObj;
	//   46  138:aload_0         
	//   47  139:getfield        #108 <Field Object mRatingObj>
	//   48  142:areturn         
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
	//*   5   36:invokevirtual   #144 <Method boolean isRated()>
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
		int i = mRatingStyle;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field int mRatingStyle>
	//    2    4:istore_1        
		boolean flag = false;
	//    3    5:iconst_0        
	//    4    6:istore_2        
		if(i != 1)
	//*   5    7:iload_1         
	//*   6    8:iconst_1        
	//*   7    9:icmpeq          14
			return false;
	//    8   12:iconst_0        
	//    9   13:ireturn         
		if(mRatingValue == 1.0F)
	//*  10   14:aload_0         
	//*  11   15:getfield        #57  <Field float mRatingValue>
	//*  12   18:fconst_1        
	//*  13   19:fcmpl           
	//*  14   20:ifne            25
			flag = true;
	//   15   23:iconst_1        
	//   16   24:istore_2        
		return flag;
	//   17   25:iload_2         
	//   18   26:ireturn         
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
		int i = mRatingStyle;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field int mRatingStyle>
	//    2    4:istore_1        
		boolean flag = false;
	//    3    5:iconst_0        
	//    4    6:istore_2        
		if(i != 2)
	//*   5    7:iload_1         
	//*   6    8:iconst_2        
	//*   7    9:icmpeq          14
			return false;
	//    8   12:iconst_0        
	//    9   13:ireturn         
		if(mRatingValue == 1.0F)
	//*  10   14:aload_0         
	//*  11   15:getfield        #57  <Field float mRatingValue>
	//*  12   18:fconst_1        
	//*  13   19:fcmpl           
	//*  14   20:ifne            25
			flag = true;
	//   15   23:iconst_1        
	//   16   24:istore_2        
		return flag;
	//   17   25:iload_2         
	//   18   26:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #121 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #122 <Method void StringBuilder()>
	//    3    7:astore_3        
		stringbuilder.append("Rating:style=");
	//    4    8:aload_3         
	//    5    9:ldc1            #166 <String "Rating:style=">
	//    6   11:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(mRatingStyle);
	//    8   15:aload_3         
	//    9   16:aload_0         
	//   10   17:getfield        #55  <Field int mRatingStyle>
	//   11   20:invokevirtual   #131 <Method StringBuilder StringBuilder.append(int)>
	//   12   23:pop             
		stringbuilder.append(" rating=");
	//   13   24:aload_3         
	//   14   25:ldc1            #168 <String " rating=">
	//   15   27:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		float f = mRatingValue;
	//   17   31:aload_0         
	//   18   32:getfield        #57  <Field float mRatingValue>
	//   19   35:fstore_1        
		String s;
		if(f < 0.0F)
	//*  20   36:fload_1         
	//*  21   37:fconst_0        
	//*  22   38:fcmpg           
	//*  23   39:ifge            48
			s = "unrated";
	//   24   42:ldc1            #170 <String "unrated">
	//   25   44:astore_2        
		else
	//*  26   45:goto            53
			s = String.valueOf(f);
	//   27   48:fload_1         
	//   28   49:invokestatic    #176 <Method String String.valueOf(float)>
	//   29   52:astore_2        
		stringbuilder.append(s);
	//   30   53:aload_3         
	//   31   54:aload_2         
	//   32   55:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//   33   58:pop             
		return stringbuilder.toString();
	//   34   59:aload_3         
	//   35   60:invokevirtual   #137 <Method String StringBuilder.toString()>
	//   36   63:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeInt(mRatingStyle);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #55  <Field int mRatingStyle>
	//    3    5:invokevirtual   #184 <Method void Parcel.writeInt(int)>
		parcel.writeFloat(mRatingValue);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #57  <Field float mRatingValue>
	//    7   13:invokevirtual   #188 <Method void Parcel.writeFloat(float)>
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
