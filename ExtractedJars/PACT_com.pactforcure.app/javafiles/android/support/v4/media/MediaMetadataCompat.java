// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.*;
import android.support.v4.util.ArrayMap;
import android.text.TextUtils;
import android.util.Log;
import java.lang.annotation.Annotation;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package android.support.v4.media:
//			MediaMetadataCompatApi21, RatingCompat, MediaDescriptionCompat

public final class MediaMetadataCompat
	implements Parcelable
{
	public static interface BitmapKey
		extends Annotation
	{
	}

	public static final class Builder
	{

		private Bitmap scaleBitmap(Bitmap bitmap, int i)
		{
			float f = i;
		//    0    0:iload_2         
		//    1    1:i2f             
		//    2    2:fstore_3        
			f = Math.min(f / (float)bitmap.getWidth(), f / (float)bitmap.getHeight());
		//    3    3:fload_3         
		//    4    4:aload_1         
		//    5    5:invokevirtual   #66  <Method int Bitmap.getWidth()>
		//    6    8:i2f             
		//    7    9:fdiv            
		//    8   10:fload_3         
		//    9   11:aload_1         
		//   10   12:invokevirtual   #63  <Method int Bitmap.getHeight()>
		//   11   15:i2f             
		//   12   16:fdiv            
		//   13   17:invokestatic    #81  <Method float Math.min(float, float)>
		//   14   20:fstore_3        
			i = (int)((float)bitmap.getHeight() * f);
		//   15   21:aload_1         
		//   16   22:invokevirtual   #63  <Method int Bitmap.getHeight()>
		//   17   25:i2f             
		//   18   26:fload_3         
		//   19   27:fmul            
		//   20   28:f2i             
		//   21   29:istore_2        
			return Bitmap.createScaledBitmap(bitmap, (int)((float)bitmap.getWidth() * f), i, true);
		//   22   30:aload_1         
		//   23   31:aload_1         
		//   24   32:invokevirtual   #66  <Method int Bitmap.getWidth()>
		//   25   35:i2f             
		//   26   36:fload_3         
		//   27   37:fmul            
		//   28   38:f2i             
		//   29   39:iload_2         
		//   30   40:iconst_1        
		//   31   41:invokestatic    #85  <Method Bitmap Bitmap.createScaledBitmap(Bitmap, int, int, boolean)>
		//   32   44:areturn         
		}

		public MediaMetadataCompat build()
		{
			return new MediaMetadataCompat(mBundle);
		//    0    0:new             #6   <Class MediaMetadataCompat>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #18  <Field Bundle mBundle>
		//    4    8:invokespecial   #88  <Method void MediaMetadataCompat(Bundle)>
		//    5   11:areturn         
		}

		public Builder putBitmap(String s, Bitmap bitmap)
		{
			if(MediaMetadataCompat.METADATA_KEYS_TYPE.containsKey(((Object) (s))) && ((Integer)MediaMetadataCompat.METADATA_KEYS_TYPE.get(((Object) (s)))).intValue() != 2)
		//*   0    0:getstatic       #92  <Field ArrayMap MediaMetadataCompat.METADATA_KEYS_TYPE>
		//*   1    3:aload_1         
		//*   2    4:invokevirtual   #98  <Method boolean ArrayMap.containsKey(Object)>
		//*   3    7:ifeq            59
		//*   4   10:getstatic       #92  <Field ArrayMap MediaMetadataCompat.METADATA_KEYS_TYPE>
		//*   5   13:aload_1         
		//*   6   14:invokevirtual   #101 <Method Object ArrayMap.get(Object)>
		//*   7   17:checkcast       #103 <Class Integer>
		//*   8   20:invokevirtual   #106 <Method int Integer.intValue()>
		//*   9   23:iconst_2        
		//*  10   24:icmpeq          59
			{
				throw new IllegalArgumentException((new StringBuilder()).append("The ").append(s).append(" key cannot be used to put a Bitmap").toString());
		//   11   27:new             #108 <Class IllegalArgumentException>
		//   12   30:dup             
		//   13   31:new             #110 <Class StringBuilder>
		//   14   34:dup             
		//   15   35:invokespecial   #111 <Method void StringBuilder()>
		//   16   38:ldc1            #113 <String "The ">
		//   17   40:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
		//   18   43:aload_1         
		//   19   44:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
		//   20   47:ldc1            #119 <String " key cannot be used to put a Bitmap">
		//   21   49:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
		//   22   52:invokevirtual   #123 <Method String StringBuilder.toString()>
		//   23   55:invokespecial   #126 <Method void IllegalArgumentException(String)>
		//   24   58:athrow          
			} else
			{
				mBundle.putParcelable(s, ((Parcelable) (bitmap)));
		//   25   59:aload_0         
		//   26   60:getfield        #18  <Field Bundle mBundle>
		//   27   63:aload_1         
		//   28   64:aload_2         
		//   29   65:invokevirtual   #130 <Method void Bundle.putParcelable(String, Parcelable)>
				return this;
		//   30   68:aload_0         
		//   31   69:areturn         
			}
		}

		public Builder putLong(String s, long l)
		{
			if(MediaMetadataCompat.METADATA_KEYS_TYPE.containsKey(((Object) (s))) && ((Integer)MediaMetadataCompat.METADATA_KEYS_TYPE.get(((Object) (s)))).intValue() != 0)
		//*   0    0:getstatic       #92  <Field ArrayMap MediaMetadataCompat.METADATA_KEYS_TYPE>
		//*   1    3:aload_1         
		//*   2    4:invokevirtual   #98  <Method boolean ArrayMap.containsKey(Object)>
		//*   3    7:ifeq            58
		//*   4   10:getstatic       #92  <Field ArrayMap MediaMetadataCompat.METADATA_KEYS_TYPE>
		//*   5   13:aload_1         
		//*   6   14:invokevirtual   #101 <Method Object ArrayMap.get(Object)>
		//*   7   17:checkcast       #103 <Class Integer>
		//*   8   20:invokevirtual   #106 <Method int Integer.intValue()>
		//*   9   23:ifeq            58
			{
				throw new IllegalArgumentException((new StringBuilder()).append("The ").append(s).append(" key cannot be used to put a long").toString());
		//   10   26:new             #108 <Class IllegalArgumentException>
		//   11   29:dup             
		//   12   30:new             #110 <Class StringBuilder>
		//   13   33:dup             
		//   14   34:invokespecial   #111 <Method void StringBuilder()>
		//   15   37:ldc1            #113 <String "The ">
		//   16   39:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
		//   17   42:aload_1         
		//   18   43:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
		//   19   46:ldc1            #134 <String " key cannot be used to put a long">
		//   20   48:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
		//   21   51:invokevirtual   #123 <Method String StringBuilder.toString()>
		//   22   54:invokespecial   #126 <Method void IllegalArgumentException(String)>
		//   23   57:athrow          
			} else
			{
				mBundle.putLong(s, l);
		//   24   58:aload_0         
		//   25   59:getfield        #18  <Field Bundle mBundle>
		//   26   62:aload_1         
		//   27   63:lload_2         
		//   28   64:invokevirtual   #137 <Method void Bundle.putLong(String, long)>
				return this;
		//   29   67:aload_0         
		//   30   68:areturn         
			}
		}

		public Builder putRating(String s, RatingCompat ratingcompat)
		{
			if(MediaMetadataCompat.METADATA_KEYS_TYPE.containsKey(((Object) (s))) && ((Integer)MediaMetadataCompat.METADATA_KEYS_TYPE.get(((Object) (s)))).intValue() != 3)
		//*   0    0:getstatic       #92  <Field ArrayMap MediaMetadataCompat.METADATA_KEYS_TYPE>
		//*   1    3:aload_1         
		//*   2    4:invokevirtual   #98  <Method boolean ArrayMap.containsKey(Object)>
		//*   3    7:ifeq            59
		//*   4   10:getstatic       #92  <Field ArrayMap MediaMetadataCompat.METADATA_KEYS_TYPE>
		//*   5   13:aload_1         
		//*   6   14:invokevirtual   #101 <Method Object ArrayMap.get(Object)>
		//*   7   17:checkcast       #103 <Class Integer>
		//*   8   20:invokevirtual   #106 <Method int Integer.intValue()>
		//*   9   23:iconst_3        
		//*  10   24:icmpeq          59
				throw new IllegalArgumentException((new StringBuilder()).append("The ").append(s).append(" key cannot be used to put a Rating").toString());
		//   11   27:new             #108 <Class IllegalArgumentException>
		//   12   30:dup             
		//   13   31:new             #110 <Class StringBuilder>
		//   14   34:dup             
		//   15   35:invokespecial   #111 <Method void StringBuilder()>
		//   16   38:ldc1            #113 <String "The ">
		//   17   40:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
		//   18   43:aload_1         
		//   19   44:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
		//   20   47:ldc1            #141 <String " key cannot be used to put a Rating">
		//   21   49:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
		//   22   52:invokevirtual   #123 <Method String StringBuilder.toString()>
		//   23   55:invokespecial   #126 <Method void IllegalArgumentException(String)>
		//   24   58:athrow          
			if(android.os.Build.VERSION.SDK_INT >= 19)
		//*  25   59:getstatic       #147 <Field int android.os.Build$VERSION.SDK_INT>
		//*  26   62:bipush          19
		//*  27   64:icmplt          84
			{
				mBundle.putParcelable(s, (Parcelable)ratingcompat.getRating());
		//   28   67:aload_0         
		//   29   68:getfield        #18  <Field Bundle mBundle>
		//   30   71:aload_1         
		//   31   72:aload_2         
		//   32   73:invokevirtual   #152 <Method Object RatingCompat.getRating()>
		//   33   76:checkcast       #154 <Class Parcelable>
		//   34   79:invokevirtual   #130 <Method void Bundle.putParcelable(String, Parcelable)>
				return this;
		//   35   82:aload_0         
		//   36   83:areturn         
			} else
			{
				mBundle.putParcelable(s, ((Parcelable) (ratingcompat)));
		//   37   84:aload_0         
		//   38   85:getfield        #18  <Field Bundle mBundle>
		//   39   88:aload_1         
		//   40   89:aload_2         
		//   41   90:invokevirtual   #130 <Method void Bundle.putParcelable(String, Parcelable)>
				return this;
		//   42   93:aload_0         
		//   43   94:areturn         
			}
		}

		public Builder putString(String s, String s1)
		{
			if(MediaMetadataCompat.METADATA_KEYS_TYPE.containsKey(((Object) (s))) && ((Integer)MediaMetadataCompat.METADATA_KEYS_TYPE.get(((Object) (s)))).intValue() != 1)
		//*   0    0:getstatic       #92  <Field ArrayMap MediaMetadataCompat.METADATA_KEYS_TYPE>
		//*   1    3:aload_1         
		//*   2    4:invokevirtual   #98  <Method boolean ArrayMap.containsKey(Object)>
		//*   3    7:ifeq            59
		//*   4   10:getstatic       #92  <Field ArrayMap MediaMetadataCompat.METADATA_KEYS_TYPE>
		//*   5   13:aload_1         
		//*   6   14:invokevirtual   #101 <Method Object ArrayMap.get(Object)>
		//*   7   17:checkcast       #103 <Class Integer>
		//*   8   20:invokevirtual   #106 <Method int Integer.intValue()>
		//*   9   23:iconst_1        
		//*  10   24:icmpeq          59
			{
				throw new IllegalArgumentException((new StringBuilder()).append("The ").append(s).append(" key cannot be used to put a String").toString());
		//   11   27:new             #108 <Class IllegalArgumentException>
		//   12   30:dup             
		//   13   31:new             #110 <Class StringBuilder>
		//   14   34:dup             
		//   15   35:invokespecial   #111 <Method void StringBuilder()>
		//   16   38:ldc1            #113 <String "The ">
		//   17   40:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
		//   18   43:aload_1         
		//   19   44:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
		//   20   47:ldc1            #158 <String " key cannot be used to put a String">
		//   21   49:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
		//   22   52:invokevirtual   #123 <Method String StringBuilder.toString()>
		//   23   55:invokespecial   #126 <Method void IllegalArgumentException(String)>
		//   24   58:athrow          
			} else
			{
				mBundle.putCharSequence(s, ((CharSequence) (s1)));
		//   25   59:aload_0         
		//   26   60:getfield        #18  <Field Bundle mBundle>
		//   27   63:aload_1         
		//   28   64:aload_2         
		//   29   65:invokevirtual   #162 <Method void Bundle.putCharSequence(String, CharSequence)>
				return this;
		//   30   68:aload_0         
		//   31   69:areturn         
			}
		}

		public Builder putText(String s, CharSequence charsequence)
		{
			if(MediaMetadataCompat.METADATA_KEYS_TYPE.containsKey(((Object) (s))) && ((Integer)MediaMetadataCompat.METADATA_KEYS_TYPE.get(((Object) (s)))).intValue() != 1)
		//*   0    0:getstatic       #92  <Field ArrayMap MediaMetadataCompat.METADATA_KEYS_TYPE>
		//*   1    3:aload_1         
		//*   2    4:invokevirtual   #98  <Method boolean ArrayMap.containsKey(Object)>
		//*   3    7:ifeq            59
		//*   4   10:getstatic       #92  <Field ArrayMap MediaMetadataCompat.METADATA_KEYS_TYPE>
		//*   5   13:aload_1         
		//*   6   14:invokevirtual   #101 <Method Object ArrayMap.get(Object)>
		//*   7   17:checkcast       #103 <Class Integer>
		//*   8   20:invokevirtual   #106 <Method int Integer.intValue()>
		//*   9   23:iconst_1        
		//*  10   24:icmpeq          59
			{
				throw new IllegalArgumentException((new StringBuilder()).append("The ").append(s).append(" key cannot be used to put a CharSequence").toString());
		//   11   27:new             #108 <Class IllegalArgumentException>
		//   12   30:dup             
		//   13   31:new             #110 <Class StringBuilder>
		//   14   34:dup             
		//   15   35:invokespecial   #111 <Method void StringBuilder()>
		//   16   38:ldc1            #113 <String "The ">
		//   17   40:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
		//   18   43:aload_1         
		//   19   44:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
		//   20   47:ldc1            #166 <String " key cannot be used to put a CharSequence">
		//   21   49:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
		//   22   52:invokevirtual   #123 <Method String StringBuilder.toString()>
		//   23   55:invokespecial   #126 <Method void IllegalArgumentException(String)>
		//   24   58:athrow          
			} else
			{
				mBundle.putCharSequence(s, charsequence);
		//   25   59:aload_0         
		//   26   60:getfield        #18  <Field Bundle mBundle>
		//   27   63:aload_1         
		//   28   64:aload_2         
		//   29   65:invokevirtual   #162 <Method void Bundle.putCharSequence(String, CharSequence)>
				return this;
		//   30   68:aload_0         
		//   31   69:areturn         
			}
		}

		private final Bundle mBundle;

		public Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
			mBundle = new Bundle();
		//    2    4:aload_0         
		//    3    5:new             #15  <Class Bundle>
		//    4    8:dup             
		//    5    9:invokespecial   #16  <Method void Bundle()>
		//    6   12:putfield        #18  <Field Bundle mBundle>
		//    7   15:return          
		}

		public Builder(MediaMetadataCompat mediametadatacompat)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
			mBundle = new Bundle(mediametadatacompat.mBundle);
		//    2    4:aload_0         
		//    3    5:new             #15  <Class Bundle>
		//    4    8:dup             
		//    5    9:aload_1         
		//    6   10:getfield        #21  <Field Bundle MediaMetadataCompat.mBundle>
		//    7   13:invokespecial   #24  <Method void Bundle(Bundle)>
		//    8   16:putfield        #18  <Field Bundle mBundle>
		//    9   19:return          
		}

		public Builder(MediaMetadataCompat mediametadatacompat, int i)
		{
			this(mediametadatacompat);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #31  <Method void MediaMetadataCompat$Builder(MediaMetadataCompat)>
			mediametadatacompat = ((MediaMetadataCompat) (mBundle.keySet().iterator()));
		//    3    5:aload_0         
		//    4    6:getfield        #18  <Field Bundle mBundle>
		//    5    9:invokevirtual   #35  <Method Set Bundle.keySet()>
		//    6   12:invokeinterface #41  <Method Iterator Set.iterator()>
		//    7   17:astore_1        
			do
			{
				if(!((Iterator) (mediametadatacompat)).hasNext())
					break;
		//    8   18:aload_1         
		//    9   19:invokeinterface #47  <Method boolean Iterator.hasNext()>
		//   10   24:ifeq            96
				String s = (String)((Iterator) (mediametadatacompat)).next();
		//   11   27:aload_1         
		//   12   28:invokeinterface #51  <Method Object Iterator.next()>
		//   13   33:checkcast       #53  <Class String>
		//   14   36:astore_3        
				Object obj = mBundle.get(s);
		//   15   37:aload_0         
		//   16   38:getfield        #18  <Field Bundle mBundle>
		//   17   41:aload_3         
		//   18   42:invokevirtual   #57  <Method Object Bundle.get(String)>
		//   19   45:astore          4
				if(obj instanceof Bitmap)
		//*  20   47:aload           4
		//*  21   49:instanceof      #59  <Class Bitmap>
		//*  22   52:ifeq            18
				{
					obj = ((Object) ((Bitmap)obj));
		//   23   55:aload           4
		//   24   57:checkcast       #59  <Class Bitmap>
		//   25   60:astore          4
					if(((Bitmap) (obj)).getHeight() > i || ((Bitmap) (obj)).getWidth() > i)
		//*  26   62:aload           4
		//*  27   64:invokevirtual   #63  <Method int Bitmap.getHeight()>
		//*  28   67:iload_2         
		//*  29   68:icmpgt          80
		//*  30   71:aload           4
		//*  31   73:invokevirtual   #66  <Method int Bitmap.getWidth()>
		//*  32   76:iload_2         
		//*  33   77:icmple          18
						putBitmap(s, scaleBitmap(((Bitmap) (obj)), i));
		//   34   80:aload_0         
		//   35   81:aload_3         
		//   36   82:aload_0         
		//   37   83:aload           4
		//   38   85:iload_2         
		//   39   86:invokespecial   #70  <Method Bitmap scaleBitmap(Bitmap, int)>
		//   40   89:invokevirtual   #74  <Method MediaMetadataCompat$Builder putBitmap(String, Bitmap)>
		//   41   92:pop             
				}
			} while(true);
		//   42   93:goto            18
		//   43   96:return          
		}
	}

	public static interface LongKey
		extends Annotation
	{
	}

	public static interface RatingKey
		extends Annotation
	{
	}

	public static interface TextKey
		extends Annotation
	{
	}


	MediaMetadataCompat(Bundle bundle)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #178 <Method void Object()>
		mBundle = new Bundle(bundle);
	//    2    4:aload_0         
	//    3    5:new             #180 <Class Bundle>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #182 <Method void Bundle(Bundle)>
	//    7   13:putfield        #184 <Field Bundle mBundle>
	//    8   16:return          
	}

	MediaMetadataCompat(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #178 <Method void Object()>
		mBundle = parcel.readBundle();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #191 <Method Bundle Parcel.readBundle()>
	//    5    9:putfield        #184 <Field Bundle mBundle>
	//    6   12:return          
	}

	public static MediaMetadataCompat fromMediaMetadata(Object obj)
	{
		if(obj != null && android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:aload_0         
	//*   1    1:ifnull          51
	//*   2    4:getstatic       #198 <Field int android.os.Build$VERSION.SDK_INT>
	//*   3    7:bipush          21
	//*   4    9:icmplt          51
		{
			Parcel parcel = Parcel.obtain();
	//    5   12:invokestatic    #202 <Method Parcel Parcel.obtain()>
	//    6   15:astore_1        
			MediaMetadataCompatApi21.writeToParcel(obj, parcel, 0);
	//    7   16:aload_0         
	//    8   17:aload_1         
	//    9   18:iconst_0        
	//   10   19:invokestatic    #208 <Method void MediaMetadataCompatApi21.writeToParcel(Object, Parcel, int)>
			parcel.setDataPosition(0);
	//   11   22:aload_1         
	//   12   23:iconst_0        
	//   13   24:invokevirtual   #212 <Method void Parcel.setDataPosition(int)>
			MediaMetadataCompat mediametadatacompat = (MediaMetadataCompat)CREATOR.createFromParcel(parcel);
	//   14   27:getstatic       #175 <Field android.os.Parcelable$Creator CREATOR>
	//   15   30:aload_1         
	//   16   31:invokeinterface #218 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   17   36:checkcast       #2   <Class MediaMetadataCompat>
	//   18   39:astore_2        
			parcel.recycle();
	//   19   40:aload_1         
	//   20   41:invokevirtual   #221 <Method void Parcel.recycle()>
			mediametadatacompat.mMetadataObj = obj;
	//   21   44:aload_2         
	//   22   45:aload_0         
	//   23   46:putfield        #223 <Field Object mMetadataObj>
			return mediametadatacompat;
	//   24   49:aload_2         
	//   25   50:areturn         
		} else
		{
			return null;
	//   26   51:aconst_null     
	//   27   52:areturn         
		}
	}

	public boolean containsKey(String s)
	{
		return mBundle.containsKey(s);
	//    0    0:aload_0         
	//    1    1:getfield        #184 <Field Bundle mBundle>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #227 <Method boolean Bundle.containsKey(String)>
	//    4    8:ireturn         
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public Bitmap getBitmap(String s)
	{
		try
		{
			s = ((String) ((Bitmap)mBundle.getParcelable(s)));
	//    0    0:aload_0         
	//    1    1:getfield        #184 <Field Bundle mBundle>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #237 <Method Parcelable Bundle.getParcelable(String)>
	//    4    8:checkcast       #239 <Class Bitmap>
	//    5   11:astore_1        
		}
	//*   6   12:aload_1         
	//*   7   13:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   8   14:astore_1        
		{
			Log.w("MediaMetadata", "Failed to retrieve a key as Bitmap.", ((Throwable) (s)));
	//    9   15:ldc1            #139 <String "MediaMetadata">
	//   10   17:ldc1            #241 <String "Failed to retrieve a key as Bitmap.">
	//   11   19:aload_1         
	//   12   20:invokestatic    #247 <Method int Log.w(String, String, Throwable)>
	//   13   23:pop             
			return null;
	//   14   24:aconst_null     
	//   15   25:areturn         
		}
		return ((Bitmap) (s));
	}

	public Bundle getBundle()
	{
		return mBundle;
	//    0    0:aload_0         
	//    1    1:getfield        #184 <Field Bundle mBundle>
	//    2    4:areturn         
	}

	public MediaDescriptionCompat getDescription()
	{
		int i;
		if(mDescription != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #252 <Field MediaDescriptionCompat mDescription>
	//*   2    4:ifnull          12
			return mDescription;
	//    3    7:aload_0         
	//    4    8:getfield        #252 <Field MediaDescriptionCompat mDescription>
	//    5   11:areturn         
		String s = getString("android.media.metadata.MEDIA_ID");
	//    6   12:aload_0         
	//    7   13:ldc1            #99  <String "android.media.metadata.MEDIA_ID">
	//    8   15:invokevirtual   #256 <Method String getString(String)>
	//    9   18:astore          7
		CharSequence acharsequence[] = new CharSequence[3];
	//   10   20:iconst_3        
	//   11   21:anewarray       CharSequence[]
	//   12   24:astore          8
		Object obj1 = null;
	//   13   26:aconst_null     
	//   14   27:astore          5
		Uri uri = null;
	//   15   29:aconst_null     
	//   16   30:astore          6
		Object obj = ((Object) (getText("android.media.metadata.DISPLAY_TITLE")));
	//   17   32:aload_0         
	//   18   33:ldc1            #87  <String "android.media.metadata.DISPLAY_TITLE">
	//   19   35:invokevirtual   #262 <Method CharSequence getText(String)>
	//   20   38:astore          4
		Object obj2;
		if(!TextUtils.isEmpty(((CharSequence) (obj))))
	//*  21   40:aload           4
	//*  22   42:invokestatic    #268 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  23   45:ifne            332
		{
			acharsequence[0] = ((CharSequence) (obj));
	//   24   48:aload           8
	//   25   50:iconst_0        
	//   26   51:aload           4
	//   27   53:aastore         
			acharsequence[1] = getText("android.media.metadata.DISPLAY_SUBTITLE");
	//   28   54:aload           8
	//   29   56:iconst_1        
	//   30   57:aload_0         
	//   31   58:ldc1            #84  <String "android.media.metadata.DISPLAY_SUBTITLE">
	//   32   60:invokevirtual   #262 <Method CharSequence getText(String)>
	//   33   63:aastore         
			acharsequence[2] = getText("android.media.metadata.DISPLAY_DESCRIPTION");
	//   34   64:aload           8
	//   35   66:iconst_2        
	//   36   67:aload_0         
	//   37   68:ldc1            #75  <String "android.media.metadata.DISPLAY_DESCRIPTION">
	//   38   70:invokevirtual   #262 <Method CharSequence getText(String)>
	//   39   73:aastore         
		} else
	//*  40   74:iconst_0        
	//*  41   75:istore_1        
	//*  42   76:aload           5
	//*  43   78:astore          4
	//*  44   80:iload_1         
	//*  45   81:getstatic       #170 <Field String[] PREFERRED_BITMAP_ORDER>
	//*  46   84:arraylength     
	//*  47   85:icmpge          104
	//*  48   88:aload_0         
	//*  49   89:getstatic       #170 <Field String[] PREFERRED_BITMAP_ORDER>
	//*  50   92:iload_1         
	//*  51   93:aaload          
	//*  52   94:invokevirtual   #270 <Method Bitmap getBitmap(String)>
	//*  53   97:astore          4
	//*  54   99:aload           4
	//*  55  101:ifnull          391
	//*  56  104:iconst_0        
	//*  57  105:istore_1        
	//*  58  106:aload           6
	//*  59  108:astore          5
	//*  60  110:iload_1         
	//*  61  111:getstatic       #172 <Field String[] PREFERRED_URI_ORDER>
	//*  62  114:arraylength     
	//*  63  115:icmpge          144
	//*  64  118:aload_0         
	//*  65  119:getstatic       #172 <Field String[] PREFERRED_URI_ORDER>
	//*  66  122:iload_1         
	//*  67  123:aaload          
	//*  68  124:invokevirtual   #256 <Method String getString(String)>
	//*  69  127:astore          5
	//*  70  129:aload           5
	//*  71  131:invokestatic    #268 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  72  134:ifne            398
	//*  73  137:aload           5
	//*  74  139:invokestatic    #276 <Method Uri Uri.parse(String)>
	//*  75  142:astore          5
	//*  76  144:aconst_null     
	//*  77  145:astore          6
	//*  78  147:aload_0         
	//*  79  148:ldc1            #102 <String "android.media.metadata.MEDIA_URI">
	//*  80  150:invokevirtual   #256 <Method String getString(String)>
	//*  81  153:astore          9
	//*  82  155:aload           9
	//*  83  157:invokestatic    #268 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  84  160:ifne            170
	//*  85  163:aload           9
	//*  86  165:invokestatic    #276 <Method Uri Uri.parse(String)>
	//*  87  168:astore          6
	//*  88  170:new             #278 <Class MediaDescriptionCompat$Builder>
	//*  89  173:dup             
	//*  90  174:invokespecial   #279 <Method void MediaDescriptionCompat$Builder()>
	//*  91  177:astore          9
	//*  92  179:aload           9
	//*  93  181:aload           7
	//*  94  183:invokevirtual   #283 <Method MediaDescriptionCompat$Builder MediaDescriptionCompat$Builder.setMediaId(String)>
	//*  95  186:pop             
	//*  96  187:aload           9
	//*  97  189:aload           8
	//*  98  191:iconst_0        
	//*  99  192:aaload          
	//* 100  193:invokevirtual   #287 <Method MediaDescriptionCompat$Builder MediaDescriptionCompat$Builder.setTitle(CharSequence)>
	//* 101  196:pop             
	//* 102  197:aload           9
	//* 103  199:aload           8
	//* 104  201:iconst_1        
	//* 105  202:aaload          
	//* 106  203:invokevirtual   #290 <Method MediaDescriptionCompat$Builder MediaDescriptionCompat$Builder.setSubtitle(CharSequence)>
	//* 107  206:pop             
	//* 108  207:aload           9
	//* 109  209:aload           8
	//* 110  211:iconst_2        
	//* 111  212:aaload          
	//* 112  213:invokevirtual   #293 <Method MediaDescriptionCompat$Builder MediaDescriptionCompat$Builder.setDescription(CharSequence)>
	//* 113  216:pop             
	//* 114  217:aload           9
	//* 115  219:aload           4
	//* 116  221:invokevirtual   #297 <Method MediaDescriptionCompat$Builder MediaDescriptionCompat$Builder.setIconBitmap(Bitmap)>
	//* 117  224:pop             
	//* 118  225:aload           9
	//* 119  227:aload           5
	//* 120  229:invokevirtual   #301 <Method MediaDescriptionCompat$Builder MediaDescriptionCompat$Builder.setIconUri(Uri)>
	//* 121  232:pop             
	//* 122  233:aload           9
	//* 123  235:aload           6
	//* 124  237:invokevirtual   #304 <Method MediaDescriptionCompat$Builder MediaDescriptionCompat$Builder.setMediaUri(Uri)>
	//* 125  240:pop             
	//* 126  241:new             #180 <Class Bundle>
	//* 127  244:dup             
	//* 128  245:invokespecial   #305 <Method void Bundle()>
	//* 129  248:astore          4
	//* 130  250:aload_0         
	//* 131  251:getfield        #184 <Field Bundle mBundle>
	//* 132  254:ldc1            #60  <String "android.media.metadata.BT_FOLDER_TYPE">
	//* 133  256:invokevirtual   #227 <Method boolean Bundle.containsKey(String)>
	//* 134  259:ifeq            276
	//* 135  262:aload           4
	//* 136  264:ldc2            #307 <String "android.media.extra.BT_FOLDER_TYPE">
	//* 137  267:aload_0         
	//* 138  268:ldc1            #60  <String "android.media.metadata.BT_FOLDER_TYPE">
	//* 139  270:invokevirtual   #311 <Method long getLong(String)>
	//* 140  273:invokevirtual   #315 <Method void Bundle.putLong(String, long)>
	//* 141  276:aload_0         
	//* 142  277:getfield        #184 <Field Bundle mBundle>
	//* 143  280:ldc1            #90  <String "android.media.metadata.DOWNLOAD_STATUS">
	//* 144  282:invokevirtual   #227 <Method boolean Bundle.containsKey(String)>
	//* 145  285:ifeq            302
	//* 146  288:aload           4
	//* 147  290:ldc2            #317 <String "android.media.extra.DOWNLOAD_STATUS">
	//* 148  293:aload_0         
	//* 149  294:ldc1            #90  <String "android.media.metadata.DOWNLOAD_STATUS">
	//* 150  296:invokevirtual   #311 <Method long getLong(String)>
	//* 151  299:invokevirtual   #315 <Method void Bundle.putLong(String, long)>
	//* 152  302:aload           4
	//* 153  304:invokevirtual   #320 <Method boolean Bundle.isEmpty()>
	//* 154  307:ifne            318
	//* 155  310:aload           9
	//* 156  312:aload           4
	//* 157  314:invokevirtual   #324 <Method MediaDescriptionCompat$Builder MediaDescriptionCompat$Builder.setExtras(Bundle)>
	//* 158  317:pop             
	//* 159  318:aload_0         
	//* 160  319:aload           9
	//* 161  321:invokevirtual   #327 <Method MediaDescriptionCompat MediaDescriptionCompat$Builder.build()>
	//* 162  324:putfield        #252 <Field MediaDescriptionCompat mDescription>
	//* 163  327:aload_0         
	//* 164  328:getfield        #252 <Field MediaDescriptionCompat mDescription>
	//* 165  331:areturn         
		{
			int j = 0;
	//  166  332:iconst_0        
	//  167  333:istore_2        
			i = 0;
	//  168  334:iconst_0        
	//  169  335:istore_1        
			while(j < acharsequence.length && i < PREFERRED_DESCRIPTION_ORDER.length) 
	//* 170  336:iload_2         
	//* 171  337:aload           8
	//* 172  339:arraylength     
	//* 173  340:icmpge          74
	//* 174  343:iload_1         
	//* 175  344:getstatic       #168 <Field String[] PREFERRED_DESCRIPTION_ORDER>
	//* 176  347:arraylength     
	//* 177  348:icmpge          74
			{
				CharSequence charsequence = getText(PREFERRED_DESCRIPTION_ORDER[i]);
	//  178  351:aload_0         
	//  179  352:getstatic       #168 <Field String[] PREFERRED_DESCRIPTION_ORDER>
	//  180  355:iload_1         
	//  181  356:aaload          
	//  182  357:invokevirtual   #262 <Method CharSequence getText(String)>
	//  183  360:astore          4
				int k = j;
	//  184  362:iload_2         
	//  185  363:istore_3        
				if(!TextUtils.isEmpty(charsequence))
	//* 186  364:aload           4
	//* 187  366:invokestatic    #268 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 188  369:ifne            382
				{
					acharsequence[j] = charsequence;
	//  189  372:aload           8
	//  190  374:iload_2         
	//  191  375:aload           4
	//  192  377:aastore         
					k = j + 1;
	//  193  378:iload_2         
	//  194  379:iconst_1        
	//  195  380:iadd            
	//  196  381:istore_3        
				}
				i++;
	//  197  382:iload_1         
	//  198  383:iconst_1        
	//  199  384:iadd            
	//  200  385:istore_1        
				j = k;
	//  201  386:iload_3         
	//  202  387:istore_2        
			}
		}
		i = 0;
_L4:
		obj = obj1;
		if(i >= PREFERRED_BITMAP_ORDER.length) goto _L2; else goto _L1
_L1:
		obj = ((Object) (getBitmap(PREFERRED_BITMAP_ORDER[i])));
		if(obj == null) goto _L3; else goto _L2
_L2:
		i = 0;
_L5:
		obj1 = ((Object) (uri));
		if(i < PREFERRED_URI_ORDER.length)
		{
			obj1 = ((Object) (getString(PREFERRED_URI_ORDER[i])));
			if(TextUtils.isEmpty(((CharSequence) (obj1))))
				break MISSING_BLOCK_LABEL_398;
			obj1 = ((Object) (Uri.parse(((String) (obj1)))));
		}
		uri = null;
		obj2 = ((Object) (getString("android.media.metadata.MEDIA_URI")));
		if(!TextUtils.isEmpty(((CharSequence) (obj2))))
			uri = Uri.parse(((String) (obj2)));
		obj2 = ((Object) (new MediaDescriptionCompat.Builder()));
		((MediaDescriptionCompat.Builder) (obj2)).setMediaId(s);
		((MediaDescriptionCompat.Builder) (obj2)).setTitle(acharsequence[0]);
		((MediaDescriptionCompat.Builder) (obj2)).setSubtitle(acharsequence[1]);
		((MediaDescriptionCompat.Builder) (obj2)).setDescription(acharsequence[2]);
		((MediaDescriptionCompat.Builder) (obj2)).setIconBitmap(((Bitmap) (obj)));
		((MediaDescriptionCompat.Builder) (obj2)).setIconUri(((Uri) (obj1)));
		((MediaDescriptionCompat.Builder) (obj2)).setMediaUri(uri);
		obj = ((Object) (new Bundle()));
		if(mBundle.containsKey("android.media.metadata.BT_FOLDER_TYPE"))
			((Bundle) (obj)).putLong("android.media.extra.BT_FOLDER_TYPE", getLong("android.media.metadata.BT_FOLDER_TYPE"));
		if(mBundle.containsKey("android.media.metadata.DOWNLOAD_STATUS"))
			((Bundle) (obj)).putLong("android.media.extra.DOWNLOAD_STATUS", getLong("android.media.metadata.DOWNLOAD_STATUS"));
		if(!((Bundle) (obj)).isEmpty())
			((MediaDescriptionCompat.Builder) (obj2)).setExtras(((Bundle) (obj)));
		mDescription = ((MediaDescriptionCompat.Builder) (obj2)).build();
		return mDescription;
	//* 203  388:goto            336
_L3:
		i++;
	//  204  391:iload_1         
	//  205  392:iconst_1        
	//  206  393:iadd            
	//  207  394:istore_1        
		  goto _L4
	//* 208  395:goto            76
		i++;
	//  209  398:iload_1         
	//  210  399:iconst_1        
	//  211  400:iadd            
	//  212  401:istore_1        
		  goto _L5
	//* 213  402:goto            106
	}

	public long getLong(String s)
	{
		return mBundle.getLong(s, 0L);
	//    0    0:aload_0         
	//    1    1:getfield        #184 <Field Bundle mBundle>
	//    2    4:aload_1         
	//    3    5:lconst_0        
	//    4    6:invokevirtual   #330 <Method long Bundle.getLong(String, long)>
	//    5    9:lreturn         
	}

	public Object getMediaMetadata()
	{
		if(mMetadataObj == null && android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:aload_0         
	//*   1    1:getfield        #223 <Field Object mMetadataObj>
	//*   2    4:ifnonnull       42
	//*   3    7:getstatic       #198 <Field int android.os.Build$VERSION.SDK_INT>
	//*   4   10:bipush          21
	//*   5   12:icmplt          42
		{
			Parcel parcel = Parcel.obtain();
	//    6   15:invokestatic    #202 <Method Parcel Parcel.obtain()>
	//    7   18:astore_1        
			writeToParcel(parcel, 0);
	//    8   19:aload_0         
	//    9   20:aload_1         
	//   10   21:iconst_0        
	//   11   22:invokevirtual   #335 <Method void writeToParcel(Parcel, int)>
			parcel.setDataPosition(0);
	//   12   25:aload_1         
	//   13   26:iconst_0        
	//   14   27:invokevirtual   #212 <Method void Parcel.setDataPosition(int)>
			mMetadataObj = MediaMetadataCompatApi21.createFromParcel(parcel);
	//   15   30:aload_0         
	//   16   31:aload_1         
	//   17   32:invokestatic    #336 <Method Object MediaMetadataCompatApi21.createFromParcel(Parcel)>
	//   18   35:putfield        #223 <Field Object mMetadataObj>
			parcel.recycle();
	//   19   38:aload_1         
	//   20   39:invokevirtual   #221 <Method void Parcel.recycle()>
		}
		return mMetadataObj;
	//   21   42:aload_0         
	//   22   43:getfield        #223 <Field Object mMetadataObj>
	//   23   46:areturn         
	}

	public RatingCompat getRating(String s)
	{
		try
		{
			if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #198 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          20
				return RatingCompat.fromRating(((Object) (mBundle.getParcelable(s))));
	//    3    8:aload_0         
	//    4    9:getfield        #184 <Field Bundle mBundle>
	//    5   12:aload_1         
	//    6   13:invokevirtual   #237 <Method Parcelable Bundle.getParcelable(String)>
	//    7   16:invokestatic    #344 <Method RatingCompat RatingCompat.fromRating(Object)>
	//    8   19:areturn         
			s = ((String) ((RatingCompat)mBundle.getParcelable(s)));
	//    9   20:aload_0         
	//   10   21:getfield        #184 <Field Bundle mBundle>
	//   11   24:aload_1         
	//   12   25:invokevirtual   #237 <Method Parcelable Bundle.getParcelable(String)>
	//   13   28:checkcast       #340 <Class RatingCompat>
	//   14   31:astore_1        
		}
	//*  15   32:aload_1         
	//*  16   33:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  17   34:astore_1        
		{
			Log.w("MediaMetadata", "Failed to retrieve a key as Rating.", ((Throwable) (s)));
	//   18   35:ldc1            #139 <String "MediaMetadata">
	//   19   37:ldc2            #346 <String "Failed to retrieve a key as Rating.">
	//   20   40:aload_1         
	//   21   41:invokestatic    #247 <Method int Log.w(String, String, Throwable)>
	//   22   44:pop             
			return null;
	//   23   45:aconst_null     
	//   24   46:areturn         
		}
		return ((RatingCompat) (s));
	}

	public String getString(String s)
	{
		s = ((String) (mBundle.getCharSequence(s)));
	//    0    0:aload_0         
	//    1    1:getfield        #184 <Field Bundle mBundle>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #349 <Method CharSequence Bundle.getCharSequence(String)>
	//    4    8:astore_1        
		if(s != null)
	//*   5    9:aload_1         
	//*   6   10:ifnull          20
			return ((CharSequence) (s)).toString();
	//    7   13:aload_1         
	//    8   14:invokeinterface #353 <Method String CharSequence.toString()>
	//    9   19:areturn         
		else
			return null;
	//   10   20:aconst_null     
	//   11   21:areturn         
	}

	public CharSequence getText(String s)
	{
		return mBundle.getCharSequence(s);
	//    0    0:aload_0         
	//    1    1:getfield        #184 <Field Bundle mBundle>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #349 <Method CharSequence Bundle.getCharSequence(String)>
	//    4    8:areturn         
	}

	public Set keySet()
	{
		return mBundle.keySet();
	//    0    0:aload_0         
	//    1    1:getfield        #184 <Field Bundle mBundle>
	//    2    4:invokevirtual   #357 <Method Set Bundle.keySet()>
	//    3    7:areturn         
	}

	public int size()
	{
		return mBundle.size();
	//    0    0:aload_0         
	//    1    1:getfield        #184 <Field Bundle mBundle>
	//    2    4:invokevirtual   #362 <Method int Bundle.size()>
	//    3    7:ireturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeBundle(mBundle);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #184 <Field Bundle mBundle>
	//    3    5:invokevirtual   #365 <Method void Parcel.writeBundle(Bundle)>
	//    4    8:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public MediaMetadataCompat createFromParcel(Parcel parcel)
		{
			return new MediaMetadataCompat(parcel);
		//    0    0:new             #9   <Class MediaMetadataCompat>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void MediaMetadataCompat(Parcel)>
		//    4    8:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #22  <Method MediaMetadataCompat createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public MediaMetadataCompat[] newArray(int i)
		{
			return new MediaMetadataCompat[i];
		//    0    0:iload_1         
		//    1    1:anewarray       MediaMetadataCompat[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #27  <Method MediaMetadataCompat[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	static final ArrayMap METADATA_KEYS_TYPE;
	public static final String METADATA_KEY_ADVERTISEMENT = "android.media.metadata.ADVERTISEMENT";
	public static final String METADATA_KEY_ALBUM = "android.media.metadata.ALBUM";
	public static final String METADATA_KEY_ALBUM_ART = "android.media.metadata.ALBUM_ART";
	public static final String METADATA_KEY_ALBUM_ARTIST = "android.media.metadata.ALBUM_ARTIST";
	public static final String METADATA_KEY_ALBUM_ART_URI = "android.media.metadata.ALBUM_ART_URI";
	public static final String METADATA_KEY_ART = "android.media.metadata.ART";
	public static final String METADATA_KEY_ARTIST = "android.media.metadata.ARTIST";
	public static final String METADATA_KEY_ART_URI = "android.media.metadata.ART_URI";
	public static final String METADATA_KEY_AUTHOR = "android.media.metadata.AUTHOR";
	public static final String METADATA_KEY_BT_FOLDER_TYPE = "android.media.metadata.BT_FOLDER_TYPE";
	public static final String METADATA_KEY_COMPILATION = "android.media.metadata.COMPILATION";
	public static final String METADATA_KEY_COMPOSER = "android.media.metadata.COMPOSER";
	public static final String METADATA_KEY_DATE = "android.media.metadata.DATE";
	public static final String METADATA_KEY_DISC_NUMBER = "android.media.metadata.DISC_NUMBER";
	public static final String METADATA_KEY_DISPLAY_DESCRIPTION = "android.media.metadata.DISPLAY_DESCRIPTION";
	public static final String METADATA_KEY_DISPLAY_ICON = "android.media.metadata.DISPLAY_ICON";
	public static final String METADATA_KEY_DISPLAY_ICON_URI = "android.media.metadata.DISPLAY_ICON_URI";
	public static final String METADATA_KEY_DISPLAY_SUBTITLE = "android.media.metadata.DISPLAY_SUBTITLE";
	public static final String METADATA_KEY_DISPLAY_TITLE = "android.media.metadata.DISPLAY_TITLE";
	public static final String METADATA_KEY_DOWNLOAD_STATUS = "android.media.metadata.DOWNLOAD_STATUS";
	public static final String METADATA_KEY_DURATION = "android.media.metadata.DURATION";
	public static final String METADATA_KEY_GENRE = "android.media.metadata.GENRE";
	public static final String METADATA_KEY_MEDIA_ID = "android.media.metadata.MEDIA_ID";
	public static final String METADATA_KEY_MEDIA_URI = "android.media.metadata.MEDIA_URI";
	public static final String METADATA_KEY_NUM_TRACKS = "android.media.metadata.NUM_TRACKS";
	public static final String METADATA_KEY_RATING = "android.media.metadata.RATING";
	public static final String METADATA_KEY_TITLE = "android.media.metadata.TITLE";
	public static final String METADATA_KEY_TRACK_NUMBER = "android.media.metadata.TRACK_NUMBER";
	public static final String METADATA_KEY_USER_RATING = "android.media.metadata.USER_RATING";
	public static final String METADATA_KEY_WRITER = "android.media.metadata.WRITER";
	public static final String METADATA_KEY_YEAR = "android.media.metadata.YEAR";
	static final int METADATA_TYPE_BITMAP = 2;
	static final int METADATA_TYPE_LONG = 0;
	static final int METADATA_TYPE_RATING = 3;
	static final int METADATA_TYPE_TEXT = 1;
	private static final String PREFERRED_BITMAP_ORDER[] = {
		"android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART"
	};
	private static final String PREFERRED_DESCRIPTION_ORDER[] = {
		"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER"
	};
	private static final String PREFERRED_URI_ORDER[] = {
		"android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI"
	};
	private static final String TAG = "MediaMetadata";
	final Bundle mBundle;
	private MediaDescriptionCompat mDescription;
	private Object mMetadataObj;

	static 
	{
		METADATA_KEYS_TYPE = new ArrayMap();
	//    0    0:new             #149 <Class ArrayMap>
	//    1    3:dup             
	//    2    4:invokespecial   #152 <Method void ArrayMap()>
	//    3    7:putstatic       #154 <Field ArrayMap METADATA_KEYS_TYPE>
		METADATA_KEYS_TYPE.put("android.media.metadata.TITLE", ((Object) (Integer.valueOf(1))));
	//    4   10:getstatic       #154 <Field ArrayMap METADATA_KEYS_TYPE>
	//    5   13:ldc1            #111 <String "android.media.metadata.TITLE">
	//    6   15:iconst_1        
	//    7   16:invokestatic    #160 <Method Integer Integer.valueOf(int)>
	//    8   19:invokevirtual   #164 <Method Object ArrayMap.put(Object, Object)>
	//    9   22:pop             
		METADATA_KEYS_TYPE.put("android.media.metadata.ARTIST", ((Object) (Integer.valueOf(1))));
	//   10   23:getstatic       #154 <Field ArrayMap METADATA_KEYS_TYPE>
	//   11   26:ldc1            #51  <String "android.media.metadata.ARTIST">
	//   12   28:iconst_1        
	//   13   29:invokestatic    #160 <Method Integer Integer.valueOf(int)>
	//   14   32:invokevirtual   #164 <Method Object ArrayMap.put(Object, Object)>
	//   15   35:pop             
		METADATA_KEYS_TYPE.put("android.media.metadata.DURATION", ((Object) (Integer.valueOf(0))));
	//   16   36:getstatic       #154 <Field ArrayMap METADATA_KEYS_TYPE>
	//   17   39:ldc1            #93  <String "android.media.metadata.DURATION">
	//   18   41:iconst_0        
	//   19   42:invokestatic    #160 <Method Integer Integer.valueOf(int)>
	//   20   45:invokevirtual   #164 <Method Object ArrayMap.put(Object, Object)>
	//   21   48:pop             
		METADATA_KEYS_TYPE.put("android.media.metadata.ALBUM", ((Object) (Integer.valueOf(1))));
	//   22   49:getstatic       #154 <Field ArrayMap METADATA_KEYS_TYPE>
	//   23   52:ldc1            #36  <String "android.media.metadata.ALBUM">
	//   24   54:iconst_1        
	//   25   55:invokestatic    #160 <Method Integer Integer.valueOf(int)>
	//   26   58:invokevirtual   #164 <Method Object ArrayMap.put(Object, Object)>
	//   27   61:pop             
		METADATA_KEYS_TYPE.put("android.media.metadata.AUTHOR", ((Object) (Integer.valueOf(1))));
	//   28   62:getstatic       #154 <Field ArrayMap METADATA_KEYS_TYPE>
	//   29   65:ldc1            #57  <String "android.media.metadata.AUTHOR">
	//   30   67:iconst_1        
	//   31   68:invokestatic    #160 <Method Integer Integer.valueOf(int)>
	//   32   71:invokevirtual   #164 <Method Object ArrayMap.put(Object, Object)>
	//   33   74:pop             
		METADATA_KEYS_TYPE.put("android.media.metadata.WRITER", ((Object) (Integer.valueOf(1))));
	//   34   75:getstatic       #154 <Field ArrayMap METADATA_KEYS_TYPE>
	//   35   78:ldc1            #120 <String "android.media.metadata.WRITER">
	//   36   80:iconst_1        
	//   37   81:invokestatic    #160 <Method Integer Integer.valueOf(int)>
	//   38   84:invokevirtual   #164 <Method Object ArrayMap.put(Object, Object)>
	//   39   87:pop             
		METADATA_KEYS_TYPE.put("android.media.metadata.COMPOSER", ((Object) (Integer.valueOf(1))));
	//   40   88:getstatic       #154 <Field ArrayMap METADATA_KEYS_TYPE>
	//   41   91:ldc1            #66  <String "android.media.metadata.COMPOSER">
	//   42   93:iconst_1        
	//   43   94:invokestatic    #160 <Method Integer Integer.valueOf(int)>
	//   44   97:invokevirtual   #164 <Method Object ArrayMap.put(Object, Object)>
	//   45  100:pop             
		METADATA_KEYS_TYPE.put("android.media.metadata.COMPILATION", ((Object) (Integer.valueOf(1))));
	//   46  101:getstatic       #154 <Field ArrayMap METADATA_KEYS_TYPE>
	//   47  104:ldc1            #63  <String "android.media.metadata.COMPILATION">
	//   48  106:iconst_1        
	//   49  107:invokestatic    #160 <Method Integer Integer.valueOf(int)>
	//   50  110:invokevirtual   #164 <Method Object ArrayMap.put(Object, Object)>
	//   51  113:pop             
		METADATA_KEYS_TYPE.put("android.media.metadata.DATE", ((Object) (Integer.valueOf(1))));
	//   52  114:getstatic       #154 <Field ArrayMap METADATA_KEYS_TYPE>
	//   53  117:ldc1            #69  <String "android.media.metadata.DATE">
	//   54  119:iconst_1        
	//   55  120:invokestatic    #160 <Method Integer Integer.valueOf(int)>
	//   56  123:invokevirtual   #164 <Method Object ArrayMap.put(Object, Object)>
	//   57  126:pop             
		METADATA_KEYS_TYPE.put("android.media.metadata.YEAR", ((Object) (Integer.valueOf(0))));
	//   58  127:getstatic       #154 <Field ArrayMap METADATA_KEYS_TYPE>
	//   59  130:ldc1            #123 <String "android.media.metadata.YEAR">
	//   60  132:iconst_0        
	//   61  133:invokestatic    #160 <Method Integer Integer.valueOf(int)>
	//   62  136:invokevirtual   #164 <Method Object ArrayMap.put(Object, Object)>
	//   63  139:pop             
		METADATA_KEYS_TYPE.put("android.media.metadata.GENRE", ((Object) (Integer.valueOf(1))));
	//   64  140:getstatic       #154 <Field ArrayMap METADATA_KEYS_TYPE>
	//   65  143:ldc1            #96  <String "android.media.metadata.GENRE">
	//   66  145:iconst_1        
	//   67  146:invokestatic    #160 <Method Integer Integer.valueOf(int)>
	//   68  149:invokevirtual   #164 <Method Object ArrayMap.put(Object, Object)>
	//   69  152:pop             
		METADATA_KEYS_TYPE.put("android.media.metadata.TRACK_NUMBER", ((Object) (Integer.valueOf(0))));
	//   70  153:getstatic       #154 <Field ArrayMap METADATA_KEYS_TYPE>
	//   71  156:ldc1            #114 <String "android.media.metadata.TRACK_NUMBER">
	//   72  158:iconst_0        
	//   73  159:invokestatic    #160 <Method Integer Integer.valueOf(int)>
	//   74  162:invokevirtual   #164 <Method Object ArrayMap.put(Object, Object)>
	//   75  165:pop             
		METADATA_KEYS_TYPE.put("android.media.metadata.NUM_TRACKS", ((Object) (Integer.valueOf(0))));
	//   76  166:getstatic       #154 <Field ArrayMap METADATA_KEYS_TYPE>
	//   77  169:ldc1            #105 <String "android.media.metadata.NUM_TRACKS">
	//   78  171:iconst_0        
	//   79  172:invokestatic    #160 <Method Integer Integer.valueOf(int)>
	//   80  175:invokevirtual   #164 <Method Object ArrayMap.put(Object, Object)>
	//   81  178:pop             
		METADATA_KEYS_TYPE.put("android.media.metadata.DISC_NUMBER", ((Object) (Integer.valueOf(0))));
	//   82  179:getstatic       #154 <Field ArrayMap METADATA_KEYS_TYPE>
	//   83  182:ldc1            #72  <String "android.media.metadata.DISC_NUMBER">
	//   84  184:iconst_0        
	//   85  185:invokestatic    #160 <Method Integer Integer.valueOf(int)>
	//   86  188:invokevirtual   #164 <Method Object ArrayMap.put(Object, Object)>
	//   87  191:pop             
		METADATA_KEYS_TYPE.put("android.media.metadata.ALBUM_ARTIST", ((Object) (Integer.valueOf(1))));
	//   88  192:getstatic       #154 <Field ArrayMap METADATA_KEYS_TYPE>
	//   89  195:ldc1            #42  <String "android.media.metadata.ALBUM_ARTIST">
	//   90  197:iconst_1        
	//   91  198:invokestatic    #160 <Method Integer Integer.valueOf(int)>
	//   92  201:invokevirtual   #164 <Method Object ArrayMap.put(Object, Object)>
	//   93  204:pop             
		METADATA_KEYS_TYPE.put("android.media.metadata.ART", ((Object) (Integer.valueOf(2))));
	//   94  205:getstatic       #154 <Field ArrayMap METADATA_KEYS_TYPE>
	//   95  208:ldc1            #48  <String "android.media.metadata.ART">
	//   96  210:iconst_2        
	//   97  211:invokestatic    #160 <Method Integer Integer.valueOf(int)>
	//   98  214:invokevirtual   #164 <Method Object ArrayMap.put(Object, Object)>
	//   99  217:pop             
		METADATA_KEYS_TYPE.put("android.media.metadata.ART_URI", ((Object) (Integer.valueOf(1))));
	//  100  218:getstatic       #154 <Field ArrayMap METADATA_KEYS_TYPE>
	//  101  221:ldc1            #54  <String "android.media.metadata.ART_URI">
	//  102  223:iconst_1        
	//  103  224:invokestatic    #160 <Method Integer Integer.valueOf(int)>
	//  104  227:invokevirtual   #164 <Method Object ArrayMap.put(Object, Object)>
	//  105  230:pop             
		METADATA_KEYS_TYPE.put("android.media.metadata.ALBUM_ART", ((Object) (Integer.valueOf(2))));
	//  106  231:getstatic       #154 <Field ArrayMap METADATA_KEYS_TYPE>
	//  107  234:ldc1            #39  <String "android.media.metadata.ALBUM_ART">
	//  108  236:iconst_2        
	//  109  237:invokestatic    #160 <Method Integer Integer.valueOf(int)>
	//  110  240:invokevirtual   #164 <Method Object ArrayMap.put(Object, Object)>
	//  111  243:pop             
		METADATA_KEYS_TYPE.put("android.media.metadata.ALBUM_ART_URI", ((Object) (Integer.valueOf(1))));
	//  112  244:getstatic       #154 <Field ArrayMap METADATA_KEYS_TYPE>
	//  113  247:ldc1            #45  <String "android.media.metadata.ALBUM_ART_URI">
	//  114  249:iconst_1        
	//  115  250:invokestatic    #160 <Method Integer Integer.valueOf(int)>
	//  116  253:invokevirtual   #164 <Method Object ArrayMap.put(Object, Object)>
	//  117  256:pop             
		METADATA_KEYS_TYPE.put("android.media.metadata.USER_RATING", ((Object) (Integer.valueOf(3))));
	//  118  257:getstatic       #154 <Field ArrayMap METADATA_KEYS_TYPE>
	//  119  260:ldc1            #117 <String "android.media.metadata.USER_RATING">
	//  120  262:iconst_3        
	//  121  263:invokestatic    #160 <Method Integer Integer.valueOf(int)>
	//  122  266:invokevirtual   #164 <Method Object ArrayMap.put(Object, Object)>
	//  123  269:pop             
		METADATA_KEYS_TYPE.put("android.media.metadata.RATING", ((Object) (Integer.valueOf(3))));
	//  124  270:getstatic       #154 <Field ArrayMap METADATA_KEYS_TYPE>
	//  125  273:ldc1            #108 <String "android.media.metadata.RATING">
	//  126  275:iconst_3        
	//  127  276:invokestatic    #160 <Method Integer Integer.valueOf(int)>
	//  128  279:invokevirtual   #164 <Method Object ArrayMap.put(Object, Object)>
	//  129  282:pop             
		METADATA_KEYS_TYPE.put("android.media.metadata.DISPLAY_TITLE", ((Object) (Integer.valueOf(1))));
	//  130  283:getstatic       #154 <Field ArrayMap METADATA_KEYS_TYPE>
	//  131  286:ldc1            #87  <String "android.media.metadata.DISPLAY_TITLE">
	//  132  288:iconst_1        
	//  133  289:invokestatic    #160 <Method Integer Integer.valueOf(int)>
	//  134  292:invokevirtual   #164 <Method Object ArrayMap.put(Object, Object)>
	//  135  295:pop             
		METADATA_KEYS_TYPE.put("android.media.metadata.DISPLAY_SUBTITLE", ((Object) (Integer.valueOf(1))));
	//  136  296:getstatic       #154 <Field ArrayMap METADATA_KEYS_TYPE>
	//  137  299:ldc1            #84  <String "android.media.metadata.DISPLAY_SUBTITLE">
	//  138  301:iconst_1        
	//  139  302:invokestatic    #160 <Method Integer Integer.valueOf(int)>
	//  140  305:invokevirtual   #164 <Method Object ArrayMap.put(Object, Object)>
	//  141  308:pop             
		METADATA_KEYS_TYPE.put("android.media.metadata.DISPLAY_DESCRIPTION", ((Object) (Integer.valueOf(1))));
	//  142  309:getstatic       #154 <Field ArrayMap METADATA_KEYS_TYPE>
	//  143  312:ldc1            #75  <String "android.media.metadata.DISPLAY_DESCRIPTION">
	//  144  314:iconst_1        
	//  145  315:invokestatic    #160 <Method Integer Integer.valueOf(int)>
	//  146  318:invokevirtual   #164 <Method Object ArrayMap.put(Object, Object)>
	//  147  321:pop             
		METADATA_KEYS_TYPE.put("android.media.metadata.DISPLAY_ICON", ((Object) (Integer.valueOf(2))));
	//  148  322:getstatic       #154 <Field ArrayMap METADATA_KEYS_TYPE>
	//  149  325:ldc1            #78  <String "android.media.metadata.DISPLAY_ICON">
	//  150  327:iconst_2        
	//  151  328:invokestatic    #160 <Method Integer Integer.valueOf(int)>
	//  152  331:invokevirtual   #164 <Method Object ArrayMap.put(Object, Object)>
	//  153  334:pop             
		METADATA_KEYS_TYPE.put("android.media.metadata.DISPLAY_ICON_URI", ((Object) (Integer.valueOf(1))));
	//  154  335:getstatic       #154 <Field ArrayMap METADATA_KEYS_TYPE>
	//  155  338:ldc1            #81  <String "android.media.metadata.DISPLAY_ICON_URI">
	//  156  340:iconst_1        
	//  157  341:invokestatic    #160 <Method Integer Integer.valueOf(int)>
	//  158  344:invokevirtual   #164 <Method Object ArrayMap.put(Object, Object)>
	//  159  347:pop             
		METADATA_KEYS_TYPE.put("android.media.metadata.MEDIA_ID", ((Object) (Integer.valueOf(1))));
	//  160  348:getstatic       #154 <Field ArrayMap METADATA_KEYS_TYPE>
	//  161  351:ldc1            #99  <String "android.media.metadata.MEDIA_ID">
	//  162  353:iconst_1        
	//  163  354:invokestatic    #160 <Method Integer Integer.valueOf(int)>
	//  164  357:invokevirtual   #164 <Method Object ArrayMap.put(Object, Object)>
	//  165  360:pop             
		METADATA_KEYS_TYPE.put("android.media.metadata.BT_FOLDER_TYPE", ((Object) (Integer.valueOf(0))));
	//  166  361:getstatic       #154 <Field ArrayMap METADATA_KEYS_TYPE>
	//  167  364:ldc1            #60  <String "android.media.metadata.BT_FOLDER_TYPE">
	//  168  366:iconst_0        
	//  169  367:invokestatic    #160 <Method Integer Integer.valueOf(int)>
	//  170  370:invokevirtual   #164 <Method Object ArrayMap.put(Object, Object)>
	//  171  373:pop             
		METADATA_KEYS_TYPE.put("android.media.metadata.MEDIA_URI", ((Object) (Integer.valueOf(1))));
	//  172  374:getstatic       #154 <Field ArrayMap METADATA_KEYS_TYPE>
	//  173  377:ldc1            #102 <String "android.media.metadata.MEDIA_URI">
	//  174  379:iconst_1        
	//  175  380:invokestatic    #160 <Method Integer Integer.valueOf(int)>
	//  176  383:invokevirtual   #164 <Method Object ArrayMap.put(Object, Object)>
	//  177  386:pop             
		METADATA_KEYS_TYPE.put("android.media.metadata.ADVERTISEMENT", ((Object) (Integer.valueOf(0))));
	//  178  387:getstatic       #154 <Field ArrayMap METADATA_KEYS_TYPE>
	//  179  390:ldc1            #33  <String "android.media.metadata.ADVERTISEMENT">
	//  180  392:iconst_0        
	//  181  393:invokestatic    #160 <Method Integer Integer.valueOf(int)>
	//  182  396:invokevirtual   #164 <Method Object ArrayMap.put(Object, Object)>
	//  183  399:pop             
		METADATA_KEYS_TYPE.put("android.media.metadata.DOWNLOAD_STATUS", ((Object) (Integer.valueOf(0))));
	//  184  400:getstatic       #154 <Field ArrayMap METADATA_KEYS_TYPE>
	//  185  403:ldc1            #90  <String "android.media.metadata.DOWNLOAD_STATUS">
	//  186  405:iconst_0        
	//  187  406:invokestatic    #160 <Method Integer Integer.valueOf(int)>
	//  188  409:invokevirtual   #164 <Method Object ArrayMap.put(Object, Object)>
	//  189  412:pop             
	//  190  413:bipush          7
	//  191  415:anewarray       String[]
	//  192  418:dup             
	//  193  419:iconst_0        
	//  194  420:ldc1            #111 <String "android.media.metadata.TITLE">
	//  195  422:aastore         
	//  196  423:dup             
	//  197  424:iconst_1        
	//  198  425:ldc1            #51  <String "android.media.metadata.ARTIST">
	//  199  427:aastore         
	//  200  428:dup             
	//  201  429:iconst_2        
	//  202  430:ldc1            #36  <String "android.media.metadata.ALBUM">
	//  203  432:aastore         
	//  204  433:dup             
	//  205  434:iconst_3        
	//  206  435:ldc1            #42  <String "android.media.metadata.ALBUM_ARTIST">
	//  207  437:aastore         
	//  208  438:dup             
	//  209  439:iconst_4        
	//  210  440:ldc1            #120 <String "android.media.metadata.WRITER">
	//  211  442:aastore         
	//  212  443:dup             
	//  213  444:iconst_5        
	//  214  445:ldc1            #57  <String "android.media.metadata.AUTHOR">
	//  215  447:aastore         
	//  216  448:dup             
	//  217  449:bipush          6
	//  218  451:ldc1            #66  <String "android.media.metadata.COMPOSER">
	//  219  453:aastore         
	//  220  454:putstatic       #168 <Field String[] PREFERRED_DESCRIPTION_ORDER>
	//  221  457:iconst_3        
	//  222  458:anewarray       String[]
	//  223  461:dup             
	//  224  462:iconst_0        
	//  225  463:ldc1            #78  <String "android.media.metadata.DISPLAY_ICON">
	//  226  465:aastore         
	//  227  466:dup             
	//  228  467:iconst_1        
	//  229  468:ldc1            #48  <String "android.media.metadata.ART">
	//  230  470:aastore         
	//  231  471:dup             
	//  232  472:iconst_2        
	//  233  473:ldc1            #39  <String "android.media.metadata.ALBUM_ART">
	//  234  475:aastore         
	//  235  476:putstatic       #170 <Field String[] PREFERRED_BITMAP_ORDER>
	//  236  479:iconst_3        
	//  237  480:anewarray       String[]
	//  238  483:dup             
	//  239  484:iconst_0        
	//  240  485:ldc1            #81  <String "android.media.metadata.DISPLAY_ICON_URI">
	//  241  487:aastore         
	//  242  488:dup             
	//  243  489:iconst_1        
	//  244  490:ldc1            #54  <String "android.media.metadata.ART_URI">
	//  245  492:aastore         
	//  246  493:dup             
	//  247  494:iconst_2        
	//  248  495:ldc1            #45  <String "android.media.metadata.ALBUM_ART_URI">
	//  249  497:aastore         
	//  250  498:putstatic       #172 <Field String[] PREFERRED_URI_ORDER>
	//  251  501:new             #8   <Class MediaMetadataCompat$1>
	//  252  504:dup             
	//  253  505:invokespecial   #173 <Method void MediaMetadataCompat$1()>
	//  254  508:putstatic       #175 <Field android.os.Parcelable$Creator CREATOR>
	//* 255  511:return          
	}
}
