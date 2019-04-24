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
		if(obj == null || android.os.Build.VERSION.SDK_INT < 19) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:ifnull          64
	//    2    4:getstatic       #64  <Field int android.os.Build$VERSION.SDK_INT>
	//    3    7:bipush          19
	//    4    9:icmplt          64
_L1:
		int i = RatingCompatKitkat.getRatingStyle(obj);
	//    5   12:aload_0         
	//    6   13:invokestatic    #70  <Method int RatingCompatKitkat.getRatingStyle(Object)>
	//    7   16:istore_1        
		if(!RatingCompatKitkat.isRated(obj)) goto _L4; else goto _L3
	//    8   17:aload_0         
	//    9   18:invokestatic    #74  <Method boolean RatingCompatKitkat.isRated(Object)>
	//   10   21:ifeq            115
_L3:
		i;
	//   11   24:iload_1         
		JVM INSTR tableswitch 1 6: default 64
	//	               1 66
	//	               2 81
	//	               3 92
	//	               4 92
	//	               5 92
	//	               6 104;
	//   12   25:tableswitch     1 6: default 64
	//	               1 66
	//	               2 81
	//	               3 92
	//	               4 92
	//	               5 92
	//	               6 104
		   goto _L2 _L5 _L6 _L7 _L7 _L7 _L8
_L2:
		return null;
	//   13   64:aconst_null     
	//   14   65:areturn         
_L5:
		RatingCompat ratingcompat = newHeartRating(RatingCompatKitkat.hasHeart(obj));
	//   15   66:aload_0         
	//   16   67:invokestatic    #77  <Method boolean RatingCompatKitkat.hasHeart(Object)>
	//   17   70:invokestatic    #81  <Method RatingCompat newHeartRating(boolean)>
	//   18   73:astore_2        
_L10:
		ratingcompat.mRatingObj = obj;
	//   19   74:aload_2         
	//   20   75:aload_0         
	//   21   76:putfield        #83  <Field Object mRatingObj>
		return ratingcompat;
	//   22   79:aload_2         
	//   23   80:areturn         
_L6:
		ratingcompat = newThumbRating(RatingCompatKitkat.isThumbUp(obj));
	//   24   81:aload_0         
	//   25   82:invokestatic    #86  <Method boolean RatingCompatKitkat.isThumbUp(Object)>
	//   26   85:invokestatic    #89  <Method RatingCompat newThumbRating(boolean)>
	//   27   88:astore_2        
		continue; /* Loop/switch isn't completed */
	//   28   89:goto            74
_L7:
		ratingcompat = newStarRating(i, RatingCompatKitkat.getStarRating(obj));
	//   29   92:iload_1         
	//   30   93:aload_0         
	//   31   94:invokestatic    #93  <Method float RatingCompatKitkat.getStarRating(Object)>
	//   32   97:invokestatic    #97  <Method RatingCompat newStarRating(int, float)>
	//   33  100:astore_2        
		continue; /* Loop/switch isn't completed */
	//   34  101:goto            74
_L8:
		ratingcompat = newPercentageRating(RatingCompatKitkat.getPercentRating(obj));
	//   35  104:aload_0         
	//   36  105:invokestatic    #100 <Method float RatingCompatKitkat.getPercentRating(Object)>
	//   37  108:invokestatic    #104 <Method RatingCompat newPercentageRating(float)>
	//   38  111:astore_2        
		continue; /* Loop/switch isn't completed */
	//   39  112:goto            74
_L4:
		ratingcompat = newUnratedRating(i);
	//   40  115:iload_1         
	//   41  116:invokestatic    #108 <Method RatingCompat newUnratedRating(int)>
	//   42  119:astore_2        
		if(true) goto _L10; else goto _L9
	//   43  120:goto            74
_L9:
	}

	public static RatingCompat newHeartRating(boolean flag)
	{
		float f;
		if(flag)
	//*   0    0:iload_0         
	//*   1    1:ifeq            16
			f = 1.0F;
	//    2    4:fconst_1        
	//    3    5:fstore_1        
		else
	//*   4    6:new             #2   <Class RatingCompat>
	//*   5    9:dup             
	//*   6   10:iconst_1        
	//*   7   11:fload_1         
	//*   8   12:invokespecial   #110 <Method void RatingCompat(int, float)>
	//*   9   15:areturn         
			f = 0.0F;
	//   10   16:fconst_0        
	//   11   17:fstore_1        
		return new RatingCompat(1, f);
	//*  12   18:goto            6
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
		i;
	//    0    0:iload_0         
		JVM INSTR tableswitch 3 5: default 28
	//	               3 60
	//	               4 85
	//	               5 91;
	//    1    1:tableswitch     3 5: default 28
	//	               3 60
	//	               4 85
	//	               5 91
		   goto _L1 _L2 _L3 _L4
_L4:
		break MISSING_BLOCK_LABEL_91;
_L1:
		Log.e("Rating", (new StringBuilder()).append("Invalid rating style (").append(i).append(") for a star rating").toString());
	//    2   28:ldc1            #39  <String "Rating">
	//    3   30:new             #121 <Class StringBuilder>
	//    4   33:dup             
	//    5   34:invokespecial   #122 <Method void StringBuilder()>
	//    6   37:ldc1            #124 <String "Invalid rating style (">
	//    7   39:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//    8   42:iload_0         
	//    9   43:invokevirtual   #131 <Method StringBuilder StringBuilder.append(int)>
	//   10   46:ldc1            #133 <String ") for a star rating">
	//   11   48:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//   12   51:invokevirtual   #137 <Method String StringBuilder.toString()>
	//   13   54:invokestatic    #119 <Method int Log.e(String, String)>
	//   14   57:pop             
		return null;
	//   15   58:aconst_null     
	//   16   59:areturn         
_L2:
		float f1 = 3F;
	//   17   60:ldc1            #138 <Float 3F>
	//   18   62:fstore_2        
_L5:
		if(f < 0.0F || f > f1)
	//*  19   63:fload_1         
	//*  20   64:fconst_0        
	//*  21   65:fcmpg           
	//*  22   66:iflt            75
	//*  23   69:fload_1         
	//*  24   70:fload_2         
	//*  25   71:fcmpl           
	//*  26   72:ifle            97
		{
			Log.e("Rating", "Trying to set out of range star-based rating");
	//   27   75:ldc1            #39  <String "Rating">
	//   28   77:ldc1            #140 <String "Trying to set out of range star-based rating">
	//   29   79:invokestatic    #119 <Method int Log.e(String, String)>
	//   30   82:pop             
			return null;
	//   31   83:aconst_null     
	//   32   84:areturn         
		} else
	//*  33   85:ldc1            #141 <Float 4F>
	//*  34   87:fstore_2        
	//*  35   88:goto            63
	//*  36   91:ldc1            #142 <Float 5F>
	//*  37   93:fstore_2        
	//*  38   94:goto            63
		{
			return new RatingCompat(i, f);
	//   39   97:new             #2   <Class RatingCompat>
	//   40  100:dup             
	//   41  101:iload_0         
	//   42  102:fload_1         
	//   43  103:invokespecial   #110 <Method void RatingCompat(int, float)>
	//   44  106:areturn         
		}
_L3:
		f1 = 4F;
		  goto _L5
		f1 = 5F;
		  goto _L5
	}

	public static RatingCompat newThumbRating(boolean flag)
	{
		float f;
		if(flag)
	//*   0    0:iload_0         
	//*   1    1:ifeq            16
			f = 1.0F;
	//    2    4:fconst_1        
	//    3    5:fstore_1        
		else
	//*   4    6:new             #2   <Class RatingCompat>
	//*   5    9:dup             
	//*   6   10:iconst_2        
	//*   7   11:fload_1         
	//*   8   12:invokespecial   #110 <Method void RatingCompat(int, float)>
	//*   9   15:areturn         
			f = 0.0F;
	//   10   16:fconst_0        
	//   11   17:fstore_1        
		return new RatingCompat(2, f);
	//*  12   18:goto            6
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
		if(mRatingObj != null || android.os.Build.VERSION.SDK_INT < 19) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field Object mRatingObj>
	//    2    4:ifnonnull       77
	//    3    7:getstatic       #64  <Field int android.os.Build$VERSION.SDK_INT>
	//    4   10:bipush          19
	//    5   12:icmplt          77
_L1:
		if(!isRated()) goto _L4; else goto _L3
	//    6   15:aload_0         
	//    7   16:invokevirtual   #148 <Method boolean isRated()>
	//    8   19:ifeq            128
_L3:
		mRatingStyle;
	//    9   22:aload_0         
	//   10   23:getfield        #55  <Field int mRatingStyle>
		JVM INSTR tableswitch 1 6: default 64
	//	               1 66
	//	               2 82
	//	               3 96
	//	               4 96
	//	               5 96
	//	               6 114;
	//   11   26:tableswitch     1 6: default 64
	//	               1 66
	//	               2 82
	//	               3 96
	//	               4 96
	//	               5 96
	//	               6 114
		   goto _L5 _L6 _L7 _L8 _L8 _L8 _L9
_L5:
		return ((Object) (null));
	//   12   64:aconst_null     
	//   13   65:areturn         
_L6:
		mRatingObj = RatingCompatKitkat.newHeartRating(hasHeart());
	//   14   66:aload_0         
	//   15   67:aload_0         
	//   16   68:invokevirtual   #152 <Method boolean hasHeart()>
	//   17   71:invokestatic    #155 <Method Object RatingCompatKitkat.newHeartRating(boolean)>
	//   18   74:putfield        #83  <Field Object mRatingObj>
_L2:
		return mRatingObj;
	//   19   77:aload_0         
	//   20   78:getfield        #83  <Field Object mRatingObj>
	//   21   81:areturn         
_L7:
		mRatingObj = RatingCompatKitkat.newThumbRating(isThumbUp());
	//   22   82:aload_0         
	//   23   83:aload_0         
	//   24   84:invokevirtual   #157 <Method boolean isThumbUp()>
	//   25   87:invokestatic    #159 <Method Object RatingCompatKitkat.newThumbRating(boolean)>
	//   26   90:putfield        #83  <Field Object mRatingObj>
		continue; /* Loop/switch isn't completed */
	//   27   93:goto            77
_L8:
		mRatingObj = RatingCompatKitkat.newStarRating(mRatingStyle, getStarRating());
	//   28   96:aload_0         
	//   29   97:aload_0         
	//   30   98:getfield        #55  <Field int mRatingStyle>
	//   31  101:aload_0         
	//   32  102:invokevirtual   #161 <Method float getStarRating()>
	//   33  105:invokestatic    #164 <Method Object RatingCompatKitkat.newStarRating(int, float)>
	//   34  108:putfield        #83  <Field Object mRatingObj>
		continue; /* Loop/switch isn't completed */
	//   35  111:goto            77
_L9:
		mRatingObj = RatingCompatKitkat.newPercentageRating(getPercentRating());
	//   36  114:aload_0         
	//   37  115:aload_0         
	//   38  116:invokevirtual   #166 <Method float getPercentRating()>
	//   39  119:invokestatic    #169 <Method Object RatingCompatKitkat.newPercentageRating(float)>
	//   40  122:putfield        #83  <Field Object mRatingObj>
		continue; /* Loop/switch isn't completed */
	//   41  125:goto            77
_L4:
		mRatingObj = RatingCompatKitkat.newUnratedRating(mRatingStyle);
	//   42  128:aload_0         
	//   43  129:aload_0         
	//   44  130:getfield        #55  <Field int mRatingStyle>
	//   45  133:invokestatic    #172 <Method Object RatingCompatKitkat.newUnratedRating(int)>
	//   46  136:putfield        #83  <Field Object mRatingObj>
		if(true) goto _L2; else goto _L10
	//   47  139:goto            77
_L10:
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
		mRatingStyle;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field int mRatingStyle>
		JVM INSTR tableswitch 3 5: default 32
	//	               3 35
	//	               4 35
	//	               5 35;
	//    2    4:tableswitch     3 5: default 32
	//	               3 35
	//	               4 35
	//	               5 35
		   goto _L1 _L2 _L2 _L2
_L1:
		return -1F;
	//    3   32:ldc1            #31  <Float -1F>
	//    4   34:freturn         
_L2:
		if(isRated())
	//*   5   35:aload_0         
	//*   6   36:invokevirtual   #148 <Method boolean isRated()>
	//*   7   39:ifeq            32
			return mRatingValue;
	//    8   42:aload_0         
	//    9   43:getfield        #57  <Field float mRatingValue>
	//   10   46:freturn         
		if(true) goto _L1; else goto _L3
_L3:
	}

	public boolean hasHeart()
	{
		boolean flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_1        
		if(mRatingStyle != 1)
	//*   2    2:aload_0         
	//*   3    3:getfield        #55  <Field int mRatingStyle>
	//*   4    6:iconst_1        
	//*   5    7:icmpeq          12
			return false;
	//    6   10:iconst_0        
	//    7   11:ireturn         
		if(mRatingValue != 1.0F)
	//*   8   12:aload_0         
	//*   9   13:getfield        #57  <Field float mRatingValue>
	//*  10   16:fconst_1        
	//*  11   17:fcmpl           
	//*  12   18:ifne            23
	//*  13   21:iload_1         
	//*  14   22:ireturn         
			flag = false;
	//   15   23:iconst_0        
	//   16   24:istore_1        
		return flag;
	//*  17   25:goto            21
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
		while(mRatingStyle != 2 || mRatingValue != 1.0F) 
	//*   0    0:aload_0         
	//*   1    1:getfield        #55  <Field int mRatingStyle>
	//*   2    4:iconst_2        
	//*   3    5:icmpeq          10
			return false;
	//    4    8:iconst_0        
	//    5    9:ireturn         
	//    6   10:aload_0         
	//    7   11:getfield        #57  <Field float mRatingValue>
	//    8   14:fconst_1        
	//    9   15:fcmpl           
	//   10   16:ifne            8
		return true;
	//   11   19:iconst_1        
	//   12   20:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = (new StringBuilder()).append("Rating:style=").append(mRatingStyle).append(" rating=");
	//    0    0:new             #121 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #122 <Method void StringBuilder()>
	//    3    7:ldc1            #174 <String "Rating:style=">
	//    4    9:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #55  <Field int mRatingStyle>
	//    7   16:invokevirtual   #131 <Method StringBuilder StringBuilder.append(int)>
	//    8   19:ldc1            #176 <String " rating=">
	//    9   21:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//   10   24:astore_2        
		String s;
		if(mRatingValue < 0.0F)
	//*  11   25:aload_0         
	//*  12   26:getfield        #57  <Field float mRatingValue>
	//*  13   29:fconst_0        
	//*  14   30:fcmpg           
	//*  15   31:ifge            46
			s = "unrated";
	//   16   34:ldc1            #178 <String "unrated">
	//   17   36:astore_1        
		else
	//*  18   37:aload_2         
	//*  19   38:aload_1         
	//*  20   39:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//*  21   42:invokevirtual   #137 <Method String StringBuilder.toString()>
	//*  22   45:areturn         
			s = String.valueOf(mRatingValue);
	//   23   46:aload_0         
	//   24   47:getfield        #57  <Field float mRatingValue>
	//   25   50:invokestatic    #184 <Method String String.valueOf(float)>
	//   26   53:astore_1        
		return stringbuilder.append(s).toString();
	//*  27   54:goto            37
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
