// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

// Referenced classes of package android.support.v4.media:
//			cv

public final class RatingCompat
	implements Parcelable
{

	RatingCompat(int i, float f)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		a = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #28  <Field int a>
		b = f;
	//    5    9:aload_0         
	//    6   10:fload_2         
	//    7   11:putfield        #30  <Field float b>
	//    8   14:return          
	}

	public static RatingCompat a(float f)
	{
		if(f >= 0.0F && f <= 100F)
	//*   0    0:fload_0         
	//*   1    1:fconst_0        
	//*   2    2:fcmpg           
	//*   3    3:iflt            27
	//*   4    6:fload_0         
	//*   5    7:ldc1            #32  <Float 100F>
	//*   6    9:fcmpl           
	//*   7   10:ifle            16
	//*   8   13:goto            27
		{
			return new RatingCompat(6, f);
	//    9   16:new             #2   <Class RatingCompat>
	//   10   19:dup             
	//   11   20:bipush          6
	//   12   22:fload_0         
	//   13   23:invokespecial   #34  <Method void RatingCompat(int, float)>
	//   14   26:areturn         
		} else
		{
			Log.e("Rating", "Invalid percentage-based rating value");
	//   15   27:ldc1            #36  <String "Rating">
	//   16   29:ldc1            #38  <String "Invalid percentage-based rating value">
	//   17   31:invokestatic    #44  <Method int Log.e(String, String)>
	//   18   34:pop             
			return null;
	//   19   35:aconst_null     
	//   20   36:areturn         
		}
	}

	public static RatingCompat a(int i)
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
	//    7   47:ldc1            #46  <Float -1F>
	//    8   49:invokespecial   #34  <Method void RatingCompat(int, float)>
	//    9   52:areturn         
		}
	}

	public static RatingCompat a(int i, float f)
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
	//    2   28:new             #49  <Class StringBuilder>
	//    3   31:dup             
	//    4   32:invokespecial   #50  <Method void StringBuilder()>
	//    5   35:astore_3        
			stringbuilder.append("Invalid rating style (");
	//    6   36:aload_3         
	//    7   37:ldc1            #52  <String "Invalid rating style (">
	//    8   39:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//    9   42:pop             
			stringbuilder.append(i);
	//   10   43:aload_3         
	//   11   44:iload_0         
	//   12   45:invokevirtual   #59  <Method StringBuilder StringBuilder.append(int)>
	//   13   48:pop             
			stringbuilder.append(") for a star rating");
	//   14   49:aload_3         
	//   15   50:ldc1            #61  <String ") for a star rating">
	//   16   52:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   17   55:pop             
			Log.e("Rating", stringbuilder.toString());
	//   18   56:ldc1            #36  <String "Rating">
	//   19   58:aload_3         
	//   20   59:invokevirtual   #65  <Method String StringBuilder.toString()>
	//   21   62:invokestatic    #44  <Method int Log.e(String, String)>
	//   22   65:pop             
			return null;
	//   23   66:aconst_null     
	//   24   67:areturn         

		case 5: // '\005'
			f1 = 5F;
	//   25   68:ldc1            #66  <Float 5F>
	//   26   70:fstore_2        
			break;

	//*  27   71:goto            83
		case 4: // '\004'
			f1 = 4F;
	//   28   74:ldc1            #67  <Float 4F>
	//   29   76:fstore_2        
			break;

	//*  30   77:goto            83
		case 3: // '\003'
			f1 = 3F;
	//   31   80:ldc1            #68  <Float 3F>
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
	//   46  104:invokespecial   #34  <Method void RatingCompat(int, float)>
	//   47  107:areturn         
		} else
		{
			Log.e("Rating", "Trying to set out of range star-based rating");
	//   48  108:ldc1            #36  <String "Rating">
	//   49  110:ldc1            #70  <String "Trying to set out of range star-based rating">
	//   50  112:invokestatic    #44  <Method int Log.e(String, String)>
	//   51  115:pop             
			return null;
	//   52  116:aconst_null     
	//   53  117:areturn         
		}
	}

	public static RatingCompat a(Object obj)
	{
		if(obj != null && android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:aload_0         
	//*   1    1:ifnull          127
	//*   2    4:getstatic       #76  <Field int android.os.Build$VERSION.SDK_INT>
	//*   3    7:bipush          19
	//*   4    9:icmplt          127
		{
			Object obj1 = ((Object) ((Rating)obj));
	//    5   12:aload_0         
	//    6   13:checkcast       #78  <Class Rating>
	//    7   16:astore_2        
			int i = ((Rating) (obj1)).getRatingStyle();
	//    8   17:aload_2         
	//    9   18:invokevirtual   #82  <Method int Rating.getRatingStyle()>
	//   10   21:istore_1        
			if(((Rating) (obj1)).isRated())
	//*  11   22:aload_2         
	//*  12   23:invokevirtual   #86  <Method boolean Rating.isRated()>
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
					obj1 = ((Object) (a(((Rating) (obj1)).getPercentRating())));
	//   18   70:aload_2         
	//   19   71:invokevirtual   #90  <Method float Rating.getPercentRating()>
	//   20   74:invokestatic    #92  <Method RatingCompat a(float)>
	//   21   77:astore_2        
					break;

	//*  22   78:goto            120
				case 3: // '\003'
				case 4: // '\004'
				case 5: // '\005'
					obj1 = ((Object) (a(i, ((Rating) (obj1)).getStarRating())));
	//   23   81:iload_1         
	//   24   82:aload_2         
	//   25   83:invokevirtual   #95  <Method float Rating.getStarRating()>
	//   26   86:invokestatic    #97  <Method RatingCompat a(int, float)>
	//   27   89:astore_2        
					break;

	//*  28   90:goto            120
				case 2: // '\002'
					obj1 = ((Object) (b(((Rating) (obj1)).isThumbUp())));
	//   29   93:aload_2         
	//   30   94:invokevirtual   #100 <Method boolean Rating.isThumbUp()>
	//   31   97:invokestatic    #103 <Method RatingCompat b(boolean)>
	//   32  100:astore_2        
					break;

	//*  33  101:goto            120
				case 1: // '\001'
					obj1 = ((Object) (a(((Rating) (obj1)).hasHeart())));
	//   34  104:aload_2         
	//   35  105:invokevirtual   #106 <Method boolean Rating.hasHeart()>
	//   36  108:invokestatic    #108 <Method RatingCompat a(boolean)>
	//   37  111:astore_2        
					break;
				}
			else
	//*  38  112:goto            120
				obj1 = ((Object) (a(i)));
	//   39  115:iload_1         
	//   40  116:invokestatic    #110 <Method RatingCompat a(int)>
	//   41  119:astore_2        
			obj1.c = obj;
	//   42  120:aload_2         
	//   43  121:aload_0         
	//   44  122:putfield        #112 <Field Object c>
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

	public static RatingCompat a(boolean flag)
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
	//   11   17:invokespecial   #34  <Method void RatingCompat(int, float)>
	//   12   20:areturn         
	}

	public static RatingCompat b(boolean flag)
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
	//   11   17:invokespecial   #34  <Method void RatingCompat(int, float)>
	//   12   20:areturn         
	}

	public int describeContents()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field int a>
	//    2    4:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #49  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #50  <Method void StringBuilder()>
	//    3    7:astore_3        
		stringbuilder.append("Rating:style=");
	//    4    8:aload_3         
	//    5    9:ldc1            #115 <String "Rating:style=">
	//    6   11:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(a);
	//    8   15:aload_3         
	//    9   16:aload_0         
	//   10   17:getfield        #28  <Field int a>
	//   11   20:invokevirtual   #59  <Method StringBuilder StringBuilder.append(int)>
	//   12   23:pop             
		stringbuilder.append(" rating=");
	//   13   24:aload_3         
	//   14   25:ldc1            #117 <String " rating=">
	//   15   27:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		float f = b;
	//   17   31:aload_0         
	//   18   32:getfield        #30  <Field float b>
	//   19   35:fstore_1        
		String s;
		if(f < 0.0F)
	//*  20   36:fload_1         
	//*  21   37:fconst_0        
	//*  22   38:fcmpg           
	//*  23   39:ifge            48
			s = "unrated";
	//   24   42:ldc1            #119 <String "unrated">
	//   25   44:astore_2        
		else
	//*  26   45:goto            53
			s = String.valueOf(f);
	//   27   48:fload_1         
	//   28   49:invokestatic    #125 <Method String String.valueOf(float)>
	//   29   52:astore_2        
		stringbuilder.append(s);
	//   30   53:aload_3         
	//   31   54:aload_2         
	//   32   55:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   33   58:pop             
		return stringbuilder.toString();
	//   34   59:aload_3         
	//   35   60:invokevirtual   #65  <Method String StringBuilder.toString()>
	//   36   63:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeInt(a);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #28  <Field int a>
	//    3    5:invokevirtual   #133 <Method void Parcel.writeInt(int)>
		parcel.writeFloat(b);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #30  <Field float b>
	//    7   13:invokevirtual   #137 <Method void Parcel.writeFloat(float)>
	//    8   16:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new cv();
	private final int a;
	private final float b;
	private Object c;

	static 
	{
	//    0    0:new             #18  <Class cv>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void cv()>
	//    3    7:putstatic       #23  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
