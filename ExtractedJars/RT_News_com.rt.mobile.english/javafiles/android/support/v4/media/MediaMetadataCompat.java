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
		//*   3    7:ifeq            67
		//*   4   10:getstatic       #92  <Field ArrayMap MediaMetadataCompat.METADATA_KEYS_TYPE>
		//*   5   13:aload_1         
		//*   6   14:invokevirtual   #101 <Method Object ArrayMap.get(Object)>
		//*   7   17:checkcast       #103 <Class Integer>
		//*   8   20:invokevirtual   #106 <Method int Integer.intValue()>
		//*   9   23:iconst_2        
		//*  10   24:icmpeq          67
			{
				bitmap = ((Bitmap) (new StringBuilder()));
		//   11   27:new             #108 <Class StringBuilder>
		//   12   30:dup             
		//   13   31:invokespecial   #109 <Method void StringBuilder()>
		//   14   34:astore_2        
				((StringBuilder) (bitmap)).append("The ");
		//   15   35:aload_2         
		//   16   36:ldc1            #111 <String "The ">
		//   17   38:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
		//   18   41:pop             
				((StringBuilder) (bitmap)).append(s);
		//   19   42:aload_2         
		//   20   43:aload_1         
		//   21   44:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
		//   22   47:pop             
				((StringBuilder) (bitmap)).append(" key cannot be used to put a Bitmap");
		//   23   48:aload_2         
		//   24   49:ldc1            #117 <String " key cannot be used to put a Bitmap">
		//   25   51:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
		//   26   54:pop             
				throw new IllegalArgumentException(((StringBuilder) (bitmap)).toString());
		//   27   55:new             #119 <Class IllegalArgumentException>
		//   28   58:dup             
		//   29   59:aload_2         
		//   30   60:invokevirtual   #123 <Method String StringBuilder.toString()>
		//   31   63:invokespecial   #126 <Method void IllegalArgumentException(String)>
		//   32   66:athrow          
			} else
			{
				mBundle.putParcelable(s, ((Parcelable) (bitmap)));
		//   33   67:aload_0         
		//   34   68:getfield        #18  <Field Bundle mBundle>
		//   35   71:aload_1         
		//   36   72:aload_2         
		//   37   73:invokevirtual   #130 <Method void Bundle.putParcelable(String, Parcelable)>
				return this;
		//   38   76:aload_0         
		//   39   77:areturn         
			}
		}

		public Builder putLong(String s, long l)
		{
			if(MediaMetadataCompat.METADATA_KEYS_TYPE.containsKey(((Object) (s))) && ((Integer)MediaMetadataCompat.METADATA_KEYS_TYPE.get(((Object) (s)))).intValue() != 0)
		//*   0    0:getstatic       #92  <Field ArrayMap MediaMetadataCompat.METADATA_KEYS_TYPE>
		//*   1    3:aload_1         
		//*   2    4:invokevirtual   #98  <Method boolean ArrayMap.containsKey(Object)>
		//*   3    7:ifeq            71
		//*   4   10:getstatic       #92  <Field ArrayMap MediaMetadataCompat.METADATA_KEYS_TYPE>
		//*   5   13:aload_1         
		//*   6   14:invokevirtual   #101 <Method Object ArrayMap.get(Object)>
		//*   7   17:checkcast       #103 <Class Integer>
		//*   8   20:invokevirtual   #106 <Method int Integer.intValue()>
		//*   9   23:ifeq            71
			{
				StringBuilder stringbuilder = new StringBuilder();
		//   10   26:new             #108 <Class StringBuilder>
		//   11   29:dup             
		//   12   30:invokespecial   #109 <Method void StringBuilder()>
		//   13   33:astore          4
				stringbuilder.append("The ");
		//   14   35:aload           4
		//   15   37:ldc1            #111 <String "The ">
		//   16   39:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
		//   17   42:pop             
				stringbuilder.append(s);
		//   18   43:aload           4
		//   19   45:aload_1         
		//   20   46:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
		//   21   49:pop             
				stringbuilder.append(" key cannot be used to put a long");
		//   22   50:aload           4
		//   23   52:ldc1            #134 <String " key cannot be used to put a long">
		//   24   54:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
		//   25   57:pop             
				throw new IllegalArgumentException(stringbuilder.toString());
		//   26   58:new             #119 <Class IllegalArgumentException>
		//   27   61:dup             
		//   28   62:aload           4
		//   29   64:invokevirtual   #123 <Method String StringBuilder.toString()>
		//   30   67:invokespecial   #126 <Method void IllegalArgumentException(String)>
		//   31   70:athrow          
			} else
			{
				mBundle.putLong(s, l);
		//   32   71:aload_0         
		//   33   72:getfield        #18  <Field Bundle mBundle>
		//   34   75:aload_1         
		//   35   76:lload_2         
		//   36   77:invokevirtual   #137 <Method void Bundle.putLong(String, long)>
				return this;
		//   37   80:aload_0         
		//   38   81:areturn         
			}
		}

		public Builder putRating(String s, RatingCompat ratingcompat)
		{
			if(MediaMetadataCompat.METADATA_KEYS_TYPE.containsKey(((Object) (s))) && ((Integer)MediaMetadataCompat.METADATA_KEYS_TYPE.get(((Object) (s)))).intValue() != 3)
		//*   0    0:getstatic       #92  <Field ArrayMap MediaMetadataCompat.METADATA_KEYS_TYPE>
		//*   1    3:aload_1         
		//*   2    4:invokevirtual   #98  <Method boolean ArrayMap.containsKey(Object)>
		//*   3    7:ifeq            67
		//*   4   10:getstatic       #92  <Field ArrayMap MediaMetadataCompat.METADATA_KEYS_TYPE>
		//*   5   13:aload_1         
		//*   6   14:invokevirtual   #101 <Method Object ArrayMap.get(Object)>
		//*   7   17:checkcast       #103 <Class Integer>
		//*   8   20:invokevirtual   #106 <Method int Integer.intValue()>
		//*   9   23:iconst_3        
		//*  10   24:icmpeq          67
			{
				ratingcompat = ((RatingCompat) (new StringBuilder()));
		//   11   27:new             #108 <Class StringBuilder>
		//   12   30:dup             
		//   13   31:invokespecial   #109 <Method void StringBuilder()>
		//   14   34:astore_2        
				((StringBuilder) (ratingcompat)).append("The ");
		//   15   35:aload_2         
		//   16   36:ldc1            #111 <String "The ">
		//   17   38:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
		//   18   41:pop             
				((StringBuilder) (ratingcompat)).append(s);
		//   19   42:aload_2         
		//   20   43:aload_1         
		//   21   44:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
		//   22   47:pop             
				((StringBuilder) (ratingcompat)).append(" key cannot be used to put a Rating");
		//   23   48:aload_2         
		//   24   49:ldc1            #141 <String " key cannot be used to put a Rating">
		//   25   51:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
		//   26   54:pop             
				throw new IllegalArgumentException(((StringBuilder) (ratingcompat)).toString());
		//   27   55:new             #119 <Class IllegalArgumentException>
		//   28   58:dup             
		//   29   59:aload_2         
		//   30   60:invokevirtual   #123 <Method String StringBuilder.toString()>
		//   31   63:invokespecial   #126 <Method void IllegalArgumentException(String)>
		//   32   66:athrow          
			}
			if(android.os.Build.VERSION.SDK_INT >= 19)
		//*  33   67:getstatic       #147 <Field int android.os.Build$VERSION.SDK_INT>
		//*  34   70:bipush          19
		//*  35   72:icmplt          92
			{
				mBundle.putParcelable(s, (Parcelable)ratingcompat.getRating());
		//   36   75:aload_0         
		//   37   76:getfield        #18  <Field Bundle mBundle>
		//   38   79:aload_1         
		//   39   80:aload_2         
		//   40   81:invokevirtual   #152 <Method Object RatingCompat.getRating()>
		//   41   84:checkcast       #154 <Class Parcelable>
		//   42   87:invokevirtual   #130 <Method void Bundle.putParcelable(String, Parcelable)>
				return this;
		//   43   90:aload_0         
		//   44   91:areturn         
			} else
			{
				mBundle.putParcelable(s, ((Parcelable) (ratingcompat)));
		//   45   92:aload_0         
		//   46   93:getfield        #18  <Field Bundle mBundle>
		//   47   96:aload_1         
		//   48   97:aload_2         
		//   49   98:invokevirtual   #130 <Method void Bundle.putParcelable(String, Parcelable)>
				return this;
		//   50  101:aload_0         
		//   51  102:areturn         
			}
		}

		public Builder putString(String s, String s1)
		{
			if(MediaMetadataCompat.METADATA_KEYS_TYPE.containsKey(((Object) (s))) && ((Integer)MediaMetadataCompat.METADATA_KEYS_TYPE.get(((Object) (s)))).intValue() != 1)
		//*   0    0:getstatic       #92  <Field ArrayMap MediaMetadataCompat.METADATA_KEYS_TYPE>
		//*   1    3:aload_1         
		//*   2    4:invokevirtual   #98  <Method boolean ArrayMap.containsKey(Object)>
		//*   3    7:ifeq            67
		//*   4   10:getstatic       #92  <Field ArrayMap MediaMetadataCompat.METADATA_KEYS_TYPE>
		//*   5   13:aload_1         
		//*   6   14:invokevirtual   #101 <Method Object ArrayMap.get(Object)>
		//*   7   17:checkcast       #103 <Class Integer>
		//*   8   20:invokevirtual   #106 <Method int Integer.intValue()>
		//*   9   23:iconst_1        
		//*  10   24:icmpeq          67
			{
				s1 = ((String) (new StringBuilder()));
		//   11   27:new             #108 <Class StringBuilder>
		//   12   30:dup             
		//   13   31:invokespecial   #109 <Method void StringBuilder()>
		//   14   34:astore_2        
				((StringBuilder) (s1)).append("The ");
		//   15   35:aload_2         
		//   16   36:ldc1            #111 <String "The ">
		//   17   38:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
		//   18   41:pop             
				((StringBuilder) (s1)).append(s);
		//   19   42:aload_2         
		//   20   43:aload_1         
		//   21   44:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
		//   22   47:pop             
				((StringBuilder) (s1)).append(" key cannot be used to put a String");
		//   23   48:aload_2         
		//   24   49:ldc1            #158 <String " key cannot be used to put a String">
		//   25   51:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
		//   26   54:pop             
				throw new IllegalArgumentException(((StringBuilder) (s1)).toString());
		//   27   55:new             #119 <Class IllegalArgumentException>
		//   28   58:dup             
		//   29   59:aload_2         
		//   30   60:invokevirtual   #123 <Method String StringBuilder.toString()>
		//   31   63:invokespecial   #126 <Method void IllegalArgumentException(String)>
		//   32   66:athrow          
			} else
			{
				mBundle.putCharSequence(s, ((CharSequence) (s1)));
		//   33   67:aload_0         
		//   34   68:getfield        #18  <Field Bundle mBundle>
		//   35   71:aload_1         
		//   36   72:aload_2         
		//   37   73:invokevirtual   #162 <Method void Bundle.putCharSequence(String, CharSequence)>
				return this;
		//   38   76:aload_0         
		//   39   77:areturn         
			}
		}

		public Builder putText(String s, CharSequence charsequence)
		{
			if(MediaMetadataCompat.METADATA_KEYS_TYPE.containsKey(((Object) (s))) && ((Integer)MediaMetadataCompat.METADATA_KEYS_TYPE.get(((Object) (s)))).intValue() != 1)
		//*   0    0:getstatic       #92  <Field ArrayMap MediaMetadataCompat.METADATA_KEYS_TYPE>
		//*   1    3:aload_1         
		//*   2    4:invokevirtual   #98  <Method boolean ArrayMap.containsKey(Object)>
		//*   3    7:ifeq            67
		//*   4   10:getstatic       #92  <Field ArrayMap MediaMetadataCompat.METADATA_KEYS_TYPE>
		//*   5   13:aload_1         
		//*   6   14:invokevirtual   #101 <Method Object ArrayMap.get(Object)>
		//*   7   17:checkcast       #103 <Class Integer>
		//*   8   20:invokevirtual   #106 <Method int Integer.intValue()>
		//*   9   23:iconst_1        
		//*  10   24:icmpeq          67
			{
				charsequence = ((CharSequence) (new StringBuilder()));
		//   11   27:new             #108 <Class StringBuilder>
		//   12   30:dup             
		//   13   31:invokespecial   #109 <Method void StringBuilder()>
		//   14   34:astore_2        
				((StringBuilder) (charsequence)).append("The ");
		//   15   35:aload_2         
		//   16   36:ldc1            #111 <String "The ">
		//   17   38:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
		//   18   41:pop             
				((StringBuilder) (charsequence)).append(s);
		//   19   42:aload_2         
		//   20   43:aload_1         
		//   21   44:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
		//   22   47:pop             
				((StringBuilder) (charsequence)).append(" key cannot be used to put a CharSequence");
		//   23   48:aload_2         
		//   24   49:ldc1            #166 <String " key cannot be used to put a CharSequence">
		//   25   51:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
		//   26   54:pop             
				throw new IllegalArgumentException(((StringBuilder) (charsequence)).toString());
		//   27   55:new             #119 <Class IllegalArgumentException>
		//   28   58:dup             
		//   29   59:aload_2         
		//   30   60:invokevirtual   #123 <Method String StringBuilder.toString()>
		//   31   63:invokespecial   #126 <Method void IllegalArgumentException(String)>
		//   32   66:athrow          
			} else
			{
				mBundle.putCharSequence(s, charsequence);
		//   33   67:aload_0         
		//   34   68:getfield        #18  <Field Bundle mBundle>
		//   35   71:aload_1         
		//   36   72:aload_2         
		//   37   73:invokevirtual   #162 <Method void Bundle.putCharSequence(String, CharSequence)>
				return this;
		//   38   76:aload_0         
		//   39   77:areturn         
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
		mBundle.setClassLoader(((Class) (android/support/v4/media/MediaMetadataCompat)).getClassLoader());
	//    8   16:aload_0         
	//    9   17:getfield        #184 <Field Bundle mBundle>
	//   10   20:ldc1            #2   <Class MediaMetadataCompat>
	//   11   22:invokevirtual   #190 <Method ClassLoader Class.getClassLoader()>
	//   12   25:invokevirtual   #194 <Method void Bundle.setClassLoader(ClassLoader)>
	//   13   28:return          
	}

	MediaMetadataCompat(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #178 <Method void Object()>
		mBundle = parcel.readBundle();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #201 <Method Bundle Parcel.readBundle()>
	//    5    9:putfield        #184 <Field Bundle mBundle>
		mBundle.setClassLoader(((Class) (android/support/v4/media/MediaMetadataCompat)).getClassLoader());
	//    6   12:aload_0         
	//    7   13:getfield        #184 <Field Bundle mBundle>
	//    8   16:ldc1            #2   <Class MediaMetadataCompat>
	//    9   18:invokevirtual   #190 <Method ClassLoader Class.getClassLoader()>
	//   10   21:invokevirtual   #194 <Method void Bundle.setClassLoader(ClassLoader)>
	//   11   24:return          
	}

	public static MediaMetadataCompat fromMediaMetadata(Object obj)
	{
		if(obj != null && android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:aload_0         
	//*   1    1:ifnull          51
	//*   2    4:getstatic       #208 <Field int android.os.Build$VERSION.SDK_INT>
	//*   3    7:bipush          21
	//*   4    9:icmplt          51
		{
			Parcel parcel = Parcel.obtain();
	//    5   12:invokestatic    #212 <Method Parcel Parcel.obtain()>
	//    6   15:astore_1        
			MediaMetadataCompatApi21.writeToParcel(obj, parcel, 0);
	//    7   16:aload_0         
	//    8   17:aload_1         
	//    9   18:iconst_0        
	//   10   19:invokestatic    #218 <Method void MediaMetadataCompatApi21.writeToParcel(Object, Parcel, int)>
			parcel.setDataPosition(0);
	//   11   22:aload_1         
	//   12   23:iconst_0        
	//   13   24:invokevirtual   #222 <Method void Parcel.setDataPosition(int)>
			MediaMetadataCompat mediametadatacompat = (MediaMetadataCompat)CREATOR.createFromParcel(parcel);
	//   14   27:getstatic       #175 <Field android.os.Parcelable$Creator CREATOR>
	//   15   30:aload_1         
	//   16   31:invokeinterface #228 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   17   36:checkcast       #2   <Class MediaMetadataCompat>
	//   18   39:astore_2        
			parcel.recycle();
	//   19   40:aload_1         
	//   20   41:invokevirtual   #231 <Method void Parcel.recycle()>
			mediametadatacompat.mMetadataObj = obj;
	//   21   44:aload_2         
	//   22   45:aload_0         
	//   23   46:putfield        #233 <Field Object mMetadataObj>
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
	//    3    5:invokevirtual   #237 <Method boolean Bundle.containsKey(String)>
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
	//    3    5:invokevirtual   #247 <Method Parcelable Bundle.getParcelable(String)>
	//    4    8:checkcast       #249 <Class Bitmap>
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
	//   10   17:ldc1            #251 <String "Failed to retrieve a key as Bitmap.">
	//   11   19:aload_1         
	//   12   20:invokestatic    #257 <Method int Log.w(String, String, Throwable)>
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
		Object obj;
		Uri uri;
		String s;
		CharSequence acharsequence[];
label0:
		{
			if(mDescription != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #262 <Field MediaDescriptionCompat mDescription>
	//*   2    4:ifnull          12
				return mDescription;
	//    3    7:aload_0         
	//    4    8:getfield        #262 <Field MediaDescriptionCompat mDescription>
	//    5   11:areturn         
			s = getString("android.media.metadata.MEDIA_ID");
	//    6   12:aload_0         
	//    7   13:ldc1            #99  <String "android.media.metadata.MEDIA_ID">
	//    8   15:invokevirtual   #266 <Method String getString(String)>
	//    9   18:astore          7
			acharsequence = new CharSequence[3];
	//   10   20:iconst_3        
	//   11   21:anewarray       CharSequence[]
	//   12   24:astore          8
			obj = ((Object) (getText("android.media.metadata.DISPLAY_TITLE")));
	//   13   26:aload_0         
	//   14   27:ldc1            #87  <String "android.media.metadata.DISPLAY_TITLE">
	//   15   29:invokevirtual   #272 <Method CharSequence getText(String)>
	//   16   32:astore          4
			if(!TextUtils.isEmpty(((CharSequence) (obj))))
	//*  17   34:aload           4
	//*  18   36:invokestatic    #278 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  19   39:ifne            71
			{
				acharsequence[0] = ((CharSequence) (obj));
	//   20   42:aload           8
	//   21   44:iconst_0        
	//   22   45:aload           4
	//   23   47:aastore         
				acharsequence[1] = getText("android.media.metadata.DISPLAY_SUBTITLE");
	//   24   48:aload           8
	//   25   50:iconst_1        
	//   26   51:aload_0         
	//   27   52:ldc1            #84  <String "android.media.metadata.DISPLAY_SUBTITLE">
	//   28   54:invokevirtual   #272 <Method CharSequence getText(String)>
	//   29   57:aastore         
				acharsequence[2] = getText("android.media.metadata.DISPLAY_DESCRIPTION");
	//   30   58:aload           8
	//   31   60:iconst_2        
	//   32   61:aload_0         
	//   33   62:ldc1            #75  <String "android.media.metadata.DISPLAY_DESCRIPTION">
	//   34   64:invokevirtual   #272 <Method CharSequence getText(String)>
	//   35   67:aastore         
			} else
	//*  36   68:goto            130
			{
				int l = 0;
	//   37   71:iconst_0        
	//   38   72:istore_2        
				int i1;
				for(int i = l; l < acharsequence.length && i < PREFERRED_DESCRIPTION_ORDER.length; l = i1)
	//*  39   73:iload_2         
	//*  40   74:istore_1        
	//*  41   75:iload_2         
	//*  42   76:aload           8
	//*  43   78:arraylength     
	//*  44   79:icmpge          130
	//*  45   82:iload_1         
	//*  46   83:getstatic       #168 <Field String[] PREFERRED_DESCRIPTION_ORDER>
	//*  47   86:arraylength     
	//*  48   87:icmpge          130
				{
					obj = ((Object) (getText(PREFERRED_DESCRIPTION_ORDER[i])));
	//   49   90:aload_0         
	//   50   91:getstatic       #168 <Field String[] PREFERRED_DESCRIPTION_ORDER>
	//   51   94:iload_1         
	//   52   95:aaload          
	//   53   96:invokevirtual   #272 <Method CharSequence getText(String)>
	//   54   99:astore          4
					i1 = l;
	//   55  101:iload_2         
	//   56  102:istore_3        
					if(!TextUtils.isEmpty(((CharSequence) (obj))))
	//*  57  103:aload           4
	//*  58  105:invokestatic    #278 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  59  108:ifne            121
					{
						acharsequence[l] = ((CharSequence) (obj));
	//   60  111:aload           8
	//   61  113:iload_2         
	//   62  114:aload           4
	//   63  116:aastore         
						i1 = l + 1;
	//   64  117:iload_2         
	//   65  118:iconst_1        
	//   66  119:iadd            
	//   67  120:istore_3        
					}
					i++;
	//   68  121:iload_1         
	//   69  122:iconst_1        
	//   70  123:iadd            
	//   71  124:istore_1        
				}

	//   72  125:iload_3         
	//   73  126:istore_2        
			}
	//*  74  127:goto            75
			int j = 0;
	//   75  130:iconst_0        
	//   76  131:istore_1        
			do
			{
				String as[] = PREFERRED_BITMAP_ORDER;
	//   77  132:getstatic       #170 <Field String[] PREFERRED_BITMAP_ORDER>
	//   78  135:astore          4
				uri = null;
	//   79  137:aconst_null     
	//   80  138:astore          6
				if(j >= as.length)
					break;
	//   81  140:iload_1         
	//   82  141:aload           4
	//   83  143:arraylength     
	//   84  144:icmpge          173
				as = ((String []) (getBitmap(PREFERRED_BITMAP_ORDER[j])));
	//   85  147:aload_0         
	//   86  148:getstatic       #170 <Field String[] PREFERRED_BITMAP_ORDER>
	//   87  151:iload_1         
	//   88  152:aaload          
	//   89  153:invokevirtual   #280 <Method Bitmap getBitmap(String)>
	//   90  156:astore          4
				if(as != null)
	//*  91  158:aload           4
	//*  92  160:ifnull          166
					break label0;
	//   93  163:goto            176
				j++;
	//   94  166:iload_1         
	//   95  167:iconst_1        
	//   96  168:iadd            
	//   97  169:istore_1        
			} while(true);
	//   98  170:goto            132
			as = null;
	//   99  173:aconst_null     
	//  100  174:astore          4
		}
		Object obj1;
label1:
		{
			int k = 0;
	//  101  176:iconst_0        
	//  102  177:istore_1        
			do
			{
				if(k >= PREFERRED_URI_ORDER.length)
					break;
	//  103  178:iload_1         
	//  104  179:getstatic       #172 <Field String[] PREFERRED_URI_ORDER>
	//  105  182:arraylength     
	//  106  183:icmpge          222
				obj1 = ((Object) (getString(PREFERRED_URI_ORDER[k])));
	//  107  186:aload_0         
	//  108  187:getstatic       #172 <Field String[] PREFERRED_URI_ORDER>
	//  109  190:iload_1         
	//  110  191:aaload          
	//  111  192:invokevirtual   #266 <Method String getString(String)>
	//  112  195:astore          5
				if(!TextUtils.isEmpty(((CharSequence) (obj1))))
	//* 113  197:aload           5
	//* 114  199:invokestatic    #278 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 115  202:ifne            215
				{
					obj1 = ((Object) (Uri.parse(((String) (obj1)))));
	//  116  205:aload           5
	//  117  207:invokestatic    #286 <Method Uri Uri.parse(String)>
	//  118  210:astore          5
					break label1;
	//  119  212:goto            225
				}
				k++;
	//  120  215:iload_1         
	//  121  216:iconst_1        
	//  122  217:iadd            
	//  123  218:istore_1        
			} while(true);
	//  124  219:goto            178
			obj1 = null;
	//  125  222:aconst_null     
	//  126  223:astore          5
		}
		Object obj2 = ((Object) (getString("android.media.metadata.MEDIA_URI")));
	//  127  225:aload_0         
	//  128  226:ldc1            #102 <String "android.media.metadata.MEDIA_URI">
	//  129  228:invokevirtual   #266 <Method String getString(String)>
	//  130  231:astore          9
		if(!TextUtils.isEmpty(((CharSequence) (obj2))))
	//* 131  233:aload           9
	//* 132  235:invokestatic    #278 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 133  238:ifne            248
			uri = Uri.parse(((String) (obj2)));
	//  134  241:aload           9
	//  135  243:invokestatic    #286 <Method Uri Uri.parse(String)>
	//  136  246:astore          6
		obj2 = ((Object) (new MediaDescriptionCompat.Builder()));
	//  137  248:new             #288 <Class MediaDescriptionCompat$Builder>
	//  138  251:dup             
	//  139  252:invokespecial   #289 <Method void MediaDescriptionCompat$Builder()>
	//  140  255:astore          9
		((MediaDescriptionCompat.Builder) (obj2)).setMediaId(s);
	//  141  257:aload           9
	//  142  259:aload           7
	//  143  261:invokevirtual   #293 <Method MediaDescriptionCompat$Builder MediaDescriptionCompat$Builder.setMediaId(String)>
	//  144  264:pop             
		((MediaDescriptionCompat.Builder) (obj2)).setTitle(acharsequence[0]);
	//  145  265:aload           9
	//  146  267:aload           8
	//  147  269:iconst_0        
	//  148  270:aaload          
	//  149  271:invokevirtual   #297 <Method MediaDescriptionCompat$Builder MediaDescriptionCompat$Builder.setTitle(CharSequence)>
	//  150  274:pop             
		((MediaDescriptionCompat.Builder) (obj2)).setSubtitle(acharsequence[1]);
	//  151  275:aload           9
	//  152  277:aload           8
	//  153  279:iconst_1        
	//  154  280:aaload          
	//  155  281:invokevirtual   #300 <Method MediaDescriptionCompat$Builder MediaDescriptionCompat$Builder.setSubtitle(CharSequence)>
	//  156  284:pop             
		((MediaDescriptionCompat.Builder) (obj2)).setDescription(acharsequence[2]);
	//  157  285:aload           9
	//  158  287:aload           8
	//  159  289:iconst_2        
	//  160  290:aaload          
	//  161  291:invokevirtual   #303 <Method MediaDescriptionCompat$Builder MediaDescriptionCompat$Builder.setDescription(CharSequence)>
	//  162  294:pop             
		((MediaDescriptionCompat.Builder) (obj2)).setIconBitmap(((Bitmap) (as)));
	//  163  295:aload           9
	//  164  297:aload           4
	//  165  299:invokevirtual   #307 <Method MediaDescriptionCompat$Builder MediaDescriptionCompat$Builder.setIconBitmap(Bitmap)>
	//  166  302:pop             
		((MediaDescriptionCompat.Builder) (obj2)).setIconUri(((Uri) (obj1)));
	//  167  303:aload           9
	//  168  305:aload           5
	//  169  307:invokevirtual   #311 <Method MediaDescriptionCompat$Builder MediaDescriptionCompat$Builder.setIconUri(Uri)>
	//  170  310:pop             
		((MediaDescriptionCompat.Builder) (obj2)).setMediaUri(uri);
	//  171  311:aload           9
	//  172  313:aload           6
	//  173  315:invokevirtual   #314 <Method MediaDescriptionCompat$Builder MediaDescriptionCompat$Builder.setMediaUri(Uri)>
	//  174  318:pop             
		as = ((String []) (new Bundle()));
	//  175  319:new             #180 <Class Bundle>
	//  176  322:dup             
	//  177  323:invokespecial   #315 <Method void Bundle()>
	//  178  326:astore          4
		if(mBundle.containsKey("android.media.metadata.BT_FOLDER_TYPE"))
	//* 179  328:aload_0         
	//* 180  329:getfield        #184 <Field Bundle mBundle>
	//* 181  332:ldc1            #60  <String "android.media.metadata.BT_FOLDER_TYPE">
	//* 182  334:invokevirtual   #237 <Method boolean Bundle.containsKey(String)>
	//* 183  337:ifeq            354
			((Bundle) (as)).putLong("android.media.extra.BT_FOLDER_TYPE", getLong("android.media.metadata.BT_FOLDER_TYPE"));
	//  184  340:aload           4
	//  185  342:ldc2            #317 <String "android.media.extra.BT_FOLDER_TYPE">
	//  186  345:aload_0         
	//  187  346:ldc1            #60  <String "android.media.metadata.BT_FOLDER_TYPE">
	//  188  348:invokevirtual   #321 <Method long getLong(String)>
	//  189  351:invokevirtual   #325 <Method void Bundle.putLong(String, long)>
		if(mBundle.containsKey("android.media.metadata.DOWNLOAD_STATUS"))
	//* 190  354:aload_0         
	//* 191  355:getfield        #184 <Field Bundle mBundle>
	//* 192  358:ldc1            #90  <String "android.media.metadata.DOWNLOAD_STATUS">
	//* 193  360:invokevirtual   #237 <Method boolean Bundle.containsKey(String)>
	//* 194  363:ifeq            380
			((Bundle) (as)).putLong("android.media.extra.DOWNLOAD_STATUS", getLong("android.media.metadata.DOWNLOAD_STATUS"));
	//  195  366:aload           4
	//  196  368:ldc2            #327 <String "android.media.extra.DOWNLOAD_STATUS">
	//  197  371:aload_0         
	//  198  372:ldc1            #90  <String "android.media.metadata.DOWNLOAD_STATUS">
	//  199  374:invokevirtual   #321 <Method long getLong(String)>
	//  200  377:invokevirtual   #325 <Method void Bundle.putLong(String, long)>
		if(!((Bundle) (as)).isEmpty())
	//* 201  380:aload           4
	//* 202  382:invokevirtual   #330 <Method boolean Bundle.isEmpty()>
	//* 203  385:ifne            396
			((MediaDescriptionCompat.Builder) (obj2)).setExtras(((Bundle) (as)));
	//  204  388:aload           9
	//  205  390:aload           4
	//  206  392:invokevirtual   #334 <Method MediaDescriptionCompat$Builder MediaDescriptionCompat$Builder.setExtras(Bundle)>
	//  207  395:pop             
		mDescription = ((MediaDescriptionCompat.Builder) (obj2)).build();
	//  208  396:aload_0         
	//  209  397:aload           9
	//  210  399:invokevirtual   #337 <Method MediaDescriptionCompat MediaDescriptionCompat$Builder.build()>
	//  211  402:putfield        #262 <Field MediaDescriptionCompat mDescription>
		return mDescription;
	//  212  405:aload_0         
	//  213  406:getfield        #262 <Field MediaDescriptionCompat mDescription>
	//  214  409:areturn         
	}

	public long getLong(String s)
	{
		return mBundle.getLong(s, 0L);
	//    0    0:aload_0         
	//    1    1:getfield        #184 <Field Bundle mBundle>
	//    2    4:aload_1         
	//    3    5:lconst_0        
	//    4    6:invokevirtual   #340 <Method long Bundle.getLong(String, long)>
	//    5    9:lreturn         
	}

	public Object getMediaMetadata()
	{
		if(mMetadataObj == null && android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:aload_0         
	//*   1    1:getfield        #233 <Field Object mMetadataObj>
	//*   2    4:ifnonnull       42
	//*   3    7:getstatic       #208 <Field int android.os.Build$VERSION.SDK_INT>
	//*   4   10:bipush          21
	//*   5   12:icmplt          42
		{
			Parcel parcel = Parcel.obtain();
	//    6   15:invokestatic    #212 <Method Parcel Parcel.obtain()>
	//    7   18:astore_1        
			writeToParcel(parcel, 0);
	//    8   19:aload_0         
	//    9   20:aload_1         
	//   10   21:iconst_0        
	//   11   22:invokevirtual   #345 <Method void writeToParcel(Parcel, int)>
			parcel.setDataPosition(0);
	//   12   25:aload_1         
	//   13   26:iconst_0        
	//   14   27:invokevirtual   #222 <Method void Parcel.setDataPosition(int)>
			mMetadataObj = MediaMetadataCompatApi21.createFromParcel(parcel);
	//   15   30:aload_0         
	//   16   31:aload_1         
	//   17   32:invokestatic    #346 <Method Object MediaMetadataCompatApi21.createFromParcel(Parcel)>
	//   18   35:putfield        #233 <Field Object mMetadataObj>
			parcel.recycle();
	//   19   38:aload_1         
	//   20   39:invokevirtual   #231 <Method void Parcel.recycle()>
		}
		return mMetadataObj;
	//   21   42:aload_0         
	//   22   43:getfield        #233 <Field Object mMetadataObj>
	//   23   46:areturn         
	}

	public RatingCompat getRating(String s)
	{
		try
		{
			if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #208 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          20
				return RatingCompat.fromRating(((Object) (mBundle.getParcelable(s))));
	//    3    8:aload_0         
	//    4    9:getfield        #184 <Field Bundle mBundle>
	//    5   12:aload_1         
	//    6   13:invokevirtual   #247 <Method Parcelable Bundle.getParcelable(String)>
	//    7   16:invokestatic    #354 <Method RatingCompat RatingCompat.fromRating(Object)>
	//    8   19:areturn         
			s = ((String) ((RatingCompat)mBundle.getParcelable(s)));
	//    9   20:aload_0         
	//   10   21:getfield        #184 <Field Bundle mBundle>
	//   11   24:aload_1         
	//   12   25:invokevirtual   #247 <Method Parcelable Bundle.getParcelable(String)>
	//   13   28:checkcast       #350 <Class RatingCompat>
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
	//   19   37:ldc2            #356 <String "Failed to retrieve a key as Rating.">
	//   20   40:aload_1         
	//   21   41:invokestatic    #257 <Method int Log.w(String, String, Throwable)>
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
	//    3    5:invokevirtual   #359 <Method CharSequence Bundle.getCharSequence(String)>
	//    4    8:astore_1        
		if(s != null)
	//*   5    9:aload_1         
	//*   6   10:ifnull          20
			return ((CharSequence) (s)).toString();
	//    7   13:aload_1         
	//    8   14:invokeinterface #363 <Method String CharSequence.toString()>
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
	//    3    5:invokevirtual   #359 <Method CharSequence Bundle.getCharSequence(String)>
	//    4    8:areturn         
	}

	public Set keySet()
	{
		return mBundle.keySet();
	//    0    0:aload_0         
	//    1    1:getfield        #184 <Field Bundle mBundle>
	//    2    4:invokevirtual   #367 <Method Set Bundle.keySet()>
	//    3    7:areturn         
	}

	public int size()
	{
		return mBundle.size();
	//    0    0:aload_0         
	//    1    1:getfield        #184 <Field Bundle mBundle>
	//    2    4:invokevirtual   #372 <Method int Bundle.size()>
	//    3    7:ireturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeBundle(mBundle);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #184 <Field Bundle mBundle>
	//    3    5:invokevirtual   #375 <Method void Parcel.writeBundle(Bundle)>
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
