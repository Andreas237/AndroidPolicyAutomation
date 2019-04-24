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
		//   13   17:invokestatic    #103 <Method float Math.min(float, float)>
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
		//   31   41:invokestatic    #107 <Method Bitmap Bitmap.createScaledBitmap(Bitmap, int, int, boolean)>
		//   32   44:areturn         
		}

		public MediaMetadataCompat build()
		{
			return new MediaMetadataCompat(mBundle);
		//    0    0:new             #6   <Class MediaMetadataCompat>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #18  <Field Bundle mBundle>
		//    4    8:invokespecial   #110 <Method void MediaMetadataCompat(Bundle)>
		//    5   11:areturn         
		}

		public Builder putBitmap(String s, Bitmap bitmap)
		{
			if(MediaMetadataCompat.METADATA_KEYS_TYPE.containsKey(((Object) (s))) && ((Integer)MediaMetadataCompat.METADATA_KEYS_TYPE.get(((Object) (s)))).intValue() != 2)
		//*   0    0:getstatic       #114 <Field ArrayMap MediaMetadataCompat.METADATA_KEYS_TYPE>
		//*   1    3:aload_1         
		//*   2    4:invokevirtual   #119 <Method boolean ArrayMap.containsKey(Object)>
		//*   3    7:ifeq            59
		//*   4   10:getstatic       #114 <Field ArrayMap MediaMetadataCompat.METADATA_KEYS_TYPE>
		//*   5   13:aload_1         
		//*   6   14:invokevirtual   #122 <Method Object ArrayMap.get(Object)>
		//*   7   17:checkcast       #124 <Class Integer>
		//*   8   20:invokevirtual   #127 <Method int Integer.intValue()>
		//*   9   23:iconst_2        
		//*  10   24:icmpeq          59
			{
				throw new IllegalArgumentException((new StringBuilder()).append("The ").append(s).append(" key cannot be used to put a Bitmap").toString());
		//   11   27:new             #129 <Class IllegalArgumentException>
		//   12   30:dup             
		//   13   31:new             #131 <Class StringBuilder>
		//   14   34:dup             
		//   15   35:invokespecial   #132 <Method void StringBuilder()>
		//   16   38:ldc1            #134 <String "The ">
		//   17   40:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
		//   18   43:aload_1         
		//   19   44:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
		//   20   47:ldc1            #140 <String " key cannot be used to put a Bitmap">
		//   21   49:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
		//   22   52:invokevirtual   #144 <Method String StringBuilder.toString()>
		//   23   55:invokespecial   #147 <Method void IllegalArgumentException(String)>
		//   24   58:athrow          
			} else
			{
				mBundle.putParcelable(s, ((Parcelable) (bitmap)));
		//   25   59:aload_0         
		//   26   60:getfield        #18  <Field Bundle mBundle>
		//   27   63:aload_1         
		//   28   64:aload_2         
		//   29   65:invokevirtual   #151 <Method void Bundle.putParcelable(String, Parcelable)>
				return this;
		//   30   68:aload_0         
		//   31   69:areturn         
			}
		}

		public Builder putLong(String s, long l)
		{
			if(MediaMetadataCompat.METADATA_KEYS_TYPE.containsKey(((Object) (s))) && ((Integer)MediaMetadataCompat.METADATA_KEYS_TYPE.get(((Object) (s)))).intValue() != 0)
		//*   0    0:getstatic       #114 <Field ArrayMap MediaMetadataCompat.METADATA_KEYS_TYPE>
		//*   1    3:aload_1         
		//*   2    4:invokevirtual   #119 <Method boolean ArrayMap.containsKey(Object)>
		//*   3    7:ifeq            58
		//*   4   10:getstatic       #114 <Field ArrayMap MediaMetadataCompat.METADATA_KEYS_TYPE>
		//*   5   13:aload_1         
		//*   6   14:invokevirtual   #122 <Method Object ArrayMap.get(Object)>
		//*   7   17:checkcast       #124 <Class Integer>
		//*   8   20:invokevirtual   #127 <Method int Integer.intValue()>
		//*   9   23:ifeq            58
			{
				throw new IllegalArgumentException((new StringBuilder()).append("The ").append(s).append(" key cannot be used to put a long").toString());
		//   10   26:new             #129 <Class IllegalArgumentException>
		//   11   29:dup             
		//   12   30:new             #131 <Class StringBuilder>
		//   13   33:dup             
		//   14   34:invokespecial   #132 <Method void StringBuilder()>
		//   15   37:ldc1            #134 <String "The ">
		//   16   39:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
		//   17   42:aload_1         
		//   18   43:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
		//   19   46:ldc1            #155 <String " key cannot be used to put a long">
		//   20   48:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
		//   21   51:invokevirtual   #144 <Method String StringBuilder.toString()>
		//   22   54:invokespecial   #147 <Method void IllegalArgumentException(String)>
		//   23   57:athrow          
			} else
			{
				mBundle.putLong(s, l);
		//   24   58:aload_0         
		//   25   59:getfield        #18  <Field Bundle mBundle>
		//   26   62:aload_1         
		//   27   63:lload_2         
		//   28   64:invokevirtual   #158 <Method void Bundle.putLong(String, long)>
				return this;
		//   29   67:aload_0         
		//   30   68:areturn         
			}
		}

		public Builder putRating(String s, RatingCompat ratingcompat)
		{
			if(MediaMetadataCompat.METADATA_KEYS_TYPE.containsKey(((Object) (s))) && ((Integer)MediaMetadataCompat.METADATA_KEYS_TYPE.get(((Object) (s)))).intValue() != 3)
		//*   0    0:getstatic       #114 <Field ArrayMap MediaMetadataCompat.METADATA_KEYS_TYPE>
		//*   1    3:aload_1         
		//*   2    4:invokevirtual   #119 <Method boolean ArrayMap.containsKey(Object)>
		//*   3    7:ifeq            59
		//*   4   10:getstatic       #114 <Field ArrayMap MediaMetadataCompat.METADATA_KEYS_TYPE>
		//*   5   13:aload_1         
		//*   6   14:invokevirtual   #122 <Method Object ArrayMap.get(Object)>
		//*   7   17:checkcast       #124 <Class Integer>
		//*   8   20:invokevirtual   #127 <Method int Integer.intValue()>
		//*   9   23:iconst_3        
		//*  10   24:icmpeq          59
				throw new IllegalArgumentException((new StringBuilder()).append("The ").append(s).append(" key cannot be used to put a Rating").toString());
		//   11   27:new             #129 <Class IllegalArgumentException>
		//   12   30:dup             
		//   13   31:new             #131 <Class StringBuilder>
		//   14   34:dup             
		//   15   35:invokespecial   #132 <Method void StringBuilder()>
		//   16   38:ldc1            #134 <String "The ">
		//   17   40:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
		//   18   43:aload_1         
		//   19   44:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
		//   20   47:ldc1            #162 <String " key cannot be used to put a Rating">
		//   21   49:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
		//   22   52:invokevirtual   #144 <Method String StringBuilder.toString()>
		//   23   55:invokespecial   #147 <Method void IllegalArgumentException(String)>
		//   24   58:athrow          
			if(android.os.Build.VERSION.SDK_INT >= 19)
		//*  25   59:getstatic       #80  <Field int android.os.Build$VERSION.SDK_INT>
		//*  26   62:bipush          19
		//*  27   64:icmplt          84
			{
				mBundle.putParcelable(s, (Parcelable)ratingcompat.getRating());
		//   28   67:aload_0         
		//   29   68:getfield        #18  <Field Bundle mBundle>
		//   30   71:aload_1         
		//   31   72:aload_2         
		//   32   73:invokevirtual   #167 <Method Object RatingCompat.getRating()>
		//   33   76:checkcast       #169 <Class Parcelable>
		//   34   79:invokevirtual   #151 <Method void Bundle.putParcelable(String, Parcelable)>
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
		//   41   90:invokevirtual   #151 <Method void Bundle.putParcelable(String, Parcelable)>
				return this;
		//   42   93:aload_0         
		//   43   94:areturn         
			}
		}

		public Builder putString(String s, String s1)
		{
			if(MediaMetadataCompat.METADATA_KEYS_TYPE.containsKey(((Object) (s))) && ((Integer)MediaMetadataCompat.METADATA_KEYS_TYPE.get(((Object) (s)))).intValue() != 1)
		//*   0    0:getstatic       #114 <Field ArrayMap MediaMetadataCompat.METADATA_KEYS_TYPE>
		//*   1    3:aload_1         
		//*   2    4:invokevirtual   #119 <Method boolean ArrayMap.containsKey(Object)>
		//*   3    7:ifeq            59
		//*   4   10:getstatic       #114 <Field ArrayMap MediaMetadataCompat.METADATA_KEYS_TYPE>
		//*   5   13:aload_1         
		//*   6   14:invokevirtual   #122 <Method Object ArrayMap.get(Object)>
		//*   7   17:checkcast       #124 <Class Integer>
		//*   8   20:invokevirtual   #127 <Method int Integer.intValue()>
		//*   9   23:iconst_1        
		//*  10   24:icmpeq          59
			{
				throw new IllegalArgumentException((new StringBuilder()).append("The ").append(s).append(" key cannot be used to put a String").toString());
		//   11   27:new             #129 <Class IllegalArgumentException>
		//   12   30:dup             
		//   13   31:new             #131 <Class StringBuilder>
		//   14   34:dup             
		//   15   35:invokespecial   #132 <Method void StringBuilder()>
		//   16   38:ldc1            #134 <String "The ">
		//   17   40:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
		//   18   43:aload_1         
		//   19   44:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
		//   20   47:ldc1            #173 <String " key cannot be used to put a String">
		//   21   49:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
		//   22   52:invokevirtual   #144 <Method String StringBuilder.toString()>
		//   23   55:invokespecial   #147 <Method void IllegalArgumentException(String)>
		//   24   58:athrow          
			} else
			{
				mBundle.putCharSequence(s, ((CharSequence) (s1)));
		//   25   59:aload_0         
		//   26   60:getfield        #18  <Field Bundle mBundle>
		//   27   63:aload_1         
		//   28   64:aload_2         
		//   29   65:invokevirtual   #177 <Method void Bundle.putCharSequence(String, CharSequence)>
				return this;
		//   30   68:aload_0         
		//   31   69:areturn         
			}
		}

		public Builder putText(String s, CharSequence charsequence)
		{
			if(MediaMetadataCompat.METADATA_KEYS_TYPE.containsKey(((Object) (s))) && ((Integer)MediaMetadataCompat.METADATA_KEYS_TYPE.get(((Object) (s)))).intValue() != 1)
		//*   0    0:getstatic       #114 <Field ArrayMap MediaMetadataCompat.METADATA_KEYS_TYPE>
		//*   1    3:aload_1         
		//*   2    4:invokevirtual   #119 <Method boolean ArrayMap.containsKey(Object)>
		//*   3    7:ifeq            59
		//*   4   10:getstatic       #114 <Field ArrayMap MediaMetadataCompat.METADATA_KEYS_TYPE>
		//*   5   13:aload_1         
		//*   6   14:invokevirtual   #122 <Method Object ArrayMap.get(Object)>
		//*   7   17:checkcast       #124 <Class Integer>
		//*   8   20:invokevirtual   #127 <Method int Integer.intValue()>
		//*   9   23:iconst_1        
		//*  10   24:icmpeq          59
			{
				throw new IllegalArgumentException((new StringBuilder()).append("The ").append(s).append(" key cannot be used to put a CharSequence").toString());
		//   11   27:new             #129 <Class IllegalArgumentException>
		//   12   30:dup             
		//   13   31:new             #131 <Class StringBuilder>
		//   14   34:dup             
		//   15   35:invokespecial   #132 <Method void StringBuilder()>
		//   16   38:ldc1            #134 <String "The ">
		//   17   40:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
		//   18   43:aload_1         
		//   19   44:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
		//   20   47:ldc1            #181 <String " key cannot be used to put a CharSequence">
		//   21   49:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
		//   22   52:invokevirtual   #144 <Method String StringBuilder.toString()>
		//   23   55:invokespecial   #147 <Method void IllegalArgumentException(String)>
		//   24   58:athrow          
			} else
			{
				mBundle.putCharSequence(s, charsequence);
		//   25   59:aload_0         
		//   26   60:getfield        #18  <Field Bundle mBundle>
		//   27   63:aload_1         
		//   28   64:aload_2         
		//   29   65:invokevirtual   #177 <Method void Bundle.putCharSequence(String, CharSequence)>
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
		//   10   24:ifeq            147
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
				if(obj != null && (obj instanceof Bitmap))
		//*  20   47:aload           4
		//*  21   49:ifnull          144
		//*  22   52:aload           4
		//*  23   54:instanceof      #59  <Class Bitmap>
		//*  24   57:ifeq            144
				{
					obj = ((Object) ((Bitmap)obj));
		//   25   60:aload           4
		//   26   62:checkcast       #59  <Class Bitmap>
		//   27   65:astore          4
					if(((Bitmap) (obj)).getHeight() > i || ((Bitmap) (obj)).getWidth() > i)
		//*  28   67:aload           4
		//*  29   69:invokevirtual   #63  <Method int Bitmap.getHeight()>
		//*  30   72:iload_2         
		//*  31   73:icmpgt          85
		//*  32   76:aload           4
		//*  33   78:invokevirtual   #66  <Method int Bitmap.getWidth()>
		//*  34   81:iload_2         
		//*  35   82:icmple          101
						putBitmap(s, scaleBitmap(((Bitmap) (obj)), i));
		//   36   85:aload_0         
		//   37   86:aload_3         
		//   38   87:aload_0         
		//   39   88:aload           4
		//   40   90:iload_2         
		//   41   91:invokespecial   #70  <Method Bitmap scaleBitmap(Bitmap, int)>
		//   42   94:invokevirtual   #74  <Method MediaMetadataCompat$Builder putBitmap(String, Bitmap)>
		//   43   97:pop             
					else
		//*  44   98:goto            144
					if(android.os.Build.VERSION.SDK_INT >= 14 && (s.equals("android.media.metadata.ART") || s.equals("android.media.metadata.ALBUM_ART")))
		//*  45  101:getstatic       #80  <Field int android.os.Build$VERSION.SDK_INT>
		//*  46  104:bipush          14
		//*  47  106:icmplt          144
		//*  48  109:aload_3         
		//*  49  110:ldc1            #82  <String "android.media.metadata.ART">
		//*  50  112:invokevirtual   #86  <Method boolean String.equals(Object)>
		//*  51  115:ifne            127
		//*  52  118:aload_3         
		//*  53  119:ldc1            #88  <String "android.media.metadata.ALBUM_ART">
		//*  54  121:invokevirtual   #86  <Method boolean String.equals(Object)>
		//*  55  124:ifeq            144
						putBitmap(s, ((Bitmap) (obj)).copy(((Bitmap) (obj)).getConfig(), false));
		//   56  127:aload_0         
		//   57  128:aload_3         
		//   58  129:aload           4
		//   59  131:aload           4
		//   60  133:invokevirtual   #92  <Method android.graphics.Bitmap$Config Bitmap.getConfig()>
		//   61  136:iconst_0        
		//   62  137:invokevirtual   #96  <Method Bitmap Bitmap.copy(android.graphics.Bitmap$Config, boolean)>
		//   63  140:invokevirtual   #74  <Method MediaMetadataCompat$Builder putBitmap(String, Bitmap)>
		//   64  143:pop             
				}
			} while(true);
		//   65  144:goto            18
		//   66  147:return          
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
	//    1    1:invokespecial   #175 <Method void Object()>
		mBundle = new Bundle(bundle);
	//    2    4:aload_0         
	//    3    5:new             #177 <Class Bundle>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #179 <Method void Bundle(Bundle)>
	//    7   13:putfield        #181 <Field Bundle mBundle>
	//    8   16:return          
	}

	MediaMetadataCompat(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #175 <Method void Object()>
		mBundle = parcel.readBundle();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #188 <Method Bundle Parcel.readBundle()>
	//    5    9:putfield        #181 <Field Bundle mBundle>
	//    6   12:return          
	}

	public static MediaMetadataCompat fromMediaMetadata(Object obj)
	{
		if(obj == null || android.os.Build.VERSION.SDK_INT < 21)
	//*   0    0:aload_0         
	//*   1    1:ifnull          12
	//*   2    4:getstatic       #195 <Field int android.os.Build$VERSION.SDK_INT>
	//*   3    7:bipush          21
	//*   4    9:icmpge          14
		{
			return null;
	//    5   12:aconst_null     
	//    6   13:areturn         
		} else
		{
			Parcel parcel = Parcel.obtain();
	//    7   14:invokestatic    #199 <Method Parcel Parcel.obtain()>
	//    8   17:astore_1        
			MediaMetadataCompatApi21.writeToParcel(obj, parcel, 0);
	//    9   18:aload_0         
	//   10   19:aload_1         
	//   11   20:iconst_0        
	//   12   21:invokestatic    #205 <Method void MediaMetadataCompatApi21.writeToParcel(Object, Parcel, int)>
			parcel.setDataPosition(0);
	//   13   24:aload_1         
	//   14   25:iconst_0        
	//   15   26:invokevirtual   #209 <Method void Parcel.setDataPosition(int)>
			MediaMetadataCompat mediametadatacompat = (MediaMetadataCompat)CREATOR.createFromParcel(parcel);
	//   16   29:getstatic       #172 <Field android.os.Parcelable$Creator CREATOR>
	//   17   32:aload_1         
	//   18   33:invokeinterface #215 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   19   38:checkcast       #2   <Class MediaMetadataCompat>
	//   20   41:astore_2        
			parcel.recycle();
	//   21   42:aload_1         
	//   22   43:invokevirtual   #218 <Method void Parcel.recycle()>
			mediametadatacompat.mMetadataObj = obj;
	//   23   46:aload_2         
	//   24   47:aload_0         
	//   25   48:putfield        #220 <Field Object mMetadataObj>
			return mediametadatacompat;
	//   26   51:aload_2         
	//   27   52:areturn         
		}
	}

	public boolean containsKey(String s)
	{
		return mBundle.containsKey(s);
	//    0    0:aload_0         
	//    1    1:getfield        #181 <Field Bundle mBundle>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #224 <Method boolean Bundle.containsKey(String)>
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
	//    1    1:getfield        #181 <Field Bundle mBundle>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #234 <Method Parcelable Bundle.getParcelable(String)>
	//    4    8:checkcast       #236 <Class Bitmap>
	//    5   11:astore_1        
		}
	//*   6   12:aload_1         
	//*   7   13:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   8   14:astore_1        
		{
			Log.w("MediaMetadata", "Failed to retrieve a key as Bitmap.", ((Throwable) (s)));
	//    9   15:ldc1            #136 <String "MediaMetadata">
	//   10   17:ldc1            #238 <String "Failed to retrieve a key as Bitmap.">
	//   11   19:aload_1         
	//   12   20:invokestatic    #244 <Method int Log.w(String, String, Throwable)>
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
	//    1    1:getfield        #181 <Field Bundle mBundle>
	//    2    4:areturn         
	}

	public MediaDescriptionCompat getDescription()
	{
		if(mDescription != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #249 <Field MediaDescriptionCompat mDescription>
	//*   2    4:ifnull          12
			return mDescription;
	//    3    7:aload_0         
	//    4    8:getfield        #249 <Field MediaDescriptionCompat mDescription>
	//    5   11:areturn         
		String s = getString("android.media.metadata.MEDIA_ID");
	//    6   12:aload_0         
	//    7   13:ldc1            #96  <String "android.media.metadata.MEDIA_ID">
	//    8   15:invokevirtual   #253 <Method String getString(String)>
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
	//   19   35:invokevirtual   #259 <Method CharSequence getText(String)>
	//   20   38:astore          4
		if(!TextUtils.isEmpty(((CharSequence) (obj))))
	//*  21   40:aload           4
	//*  22   42:invokestatic    #265 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  23   45:ifne            77
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
	//   32   60:invokevirtual   #259 <Method CharSequence getText(String)>
	//   33   63:aastore         
			acharsequence[2] = getText("android.media.metadata.DISPLAY_DESCRIPTION");
	//   34   64:aload           8
	//   35   66:iconst_2        
	//   36   67:aload_0         
	//   37   68:ldc1            #75  <String "android.media.metadata.DISPLAY_DESCRIPTION">
	//   38   70:invokevirtual   #259 <Method CharSequence getText(String)>
	//   39   73:aastore         
		} else
	//*  40   74:goto            144
		{
			int k = 0;
	//   41   77:iconst_0        
	//   42   78:istore_2        
			int i = 0;
	//   43   79:iconst_0        
	//   44   80:istore_1        
			do
			{
				int l = acharsequence.length;
	//   45   81:aload           8
	//   46   83:arraylength     
	//   47   84:istore_3        
				if(k >= 3 || i >= PREFERRED_DESCRIPTION_ORDER.length)
					break;
	//   48   85:iload_2         
	//   49   86:iconst_3        
	//   50   87:icmpge          144
	//   51   90:iload_1         
	//   52   91:getstatic       #165 <Field String[] PREFERRED_DESCRIPTION_ORDER>
	//   53   94:arraylength     
	//   54   95:icmpge          144
				String as[] = PREFERRED_DESCRIPTION_ORDER;
	//   55   98:getstatic       #165 <Field String[] PREFERRED_DESCRIPTION_ORDER>
	//   56  101:astore          4
				l = i + 1;
	//   57  103:iload_1         
	//   58  104:iconst_1        
	//   59  105:iadd            
	//   60  106:istore_3        
				as = ((String []) (getText(as[i])));
	//   61  107:aload_0         
	//   62  108:aload           4
	//   63  110:iload_1         
	//   64  111:aaload          
	//   65  112:invokevirtual   #259 <Method CharSequence getText(String)>
	//   66  115:astore          4
				i = k;
	//   67  117:iload_2         
	//   68  118:istore_1        
				if(!TextUtils.isEmpty(((CharSequence) (as))))
	//*  69  119:aload           4
	//*  70  121:invokestatic    #265 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  71  124:ifne            137
				{
					i = k + 1;
	//   72  127:iload_2         
	//   73  128:iconst_1        
	//   74  129:iadd            
	//   75  130:istore_1        
					acharsequence[k] = ((CharSequence) (as));
	//   76  131:aload           8
	//   77  133:iload_2         
	//   78  134:aload           4
	//   79  136:aastore         
				}
				k = i;
	//   80  137:iload_1         
	//   81  138:istore_2        
				i = l;
	//   82  139:iload_3         
	//   83  140:istore_1        
			} while(true);
	//   84  141:goto            81
		}
		int j = 0;
	//   85  144:iconst_0        
	//   86  145:istore_1        
		do
		{
			as = ((String []) (obj1));
	//   87  146:aload           5
	//   88  148:astore          4
			if(j >= PREFERRED_BITMAP_ORDER.length)
				break;
	//   89  150:iload_1         
	//   90  151:getstatic       #167 <Field String[] PREFERRED_BITMAP_ORDER>
	//   91  154:arraylength     
	//   92  155:icmpge          184
			as = ((String []) (getBitmap(PREFERRED_BITMAP_ORDER[j])));
	//   93  158:aload_0         
	//   94  159:getstatic       #167 <Field String[] PREFERRED_BITMAP_ORDER>
	//   95  162:iload_1         
	//   96  163:aaload          
	//   97  164:invokevirtual   #267 <Method Bitmap getBitmap(String)>
	//   98  167:astore          4
			if(as != null)
	//*  99  169:aload           4
	//* 100  171:ifnull          177
				break;
	//  101  174:goto            184
			j++;
	//  102  177:iload_1         
	//  103  178:iconst_1        
	//  104  179:iadd            
	//  105  180:istore_1        
		} while(true);
	//  106  181:goto            146
		j = 0;
	//  107  184:iconst_0        
	//  108  185:istore_1        
		do
		{
			obj1 = ((Object) (uri));
	//  109  186:aload           6
	//  110  188:astore          5
			if(j >= PREFERRED_URI_ORDER.length)
				break;
	//  111  190:iload_1         
	//  112  191:getstatic       #169 <Field String[] PREFERRED_URI_ORDER>
	//  113  194:arraylength     
	//  114  195:icmpge          234
			obj1 = ((Object) (getString(PREFERRED_URI_ORDER[j])));
	//  115  198:aload_0         
	//  116  199:getstatic       #169 <Field String[] PREFERRED_URI_ORDER>
	//  117  202:iload_1         
	//  118  203:aaload          
	//  119  204:invokevirtual   #253 <Method String getString(String)>
	//  120  207:astore          5
			if(!TextUtils.isEmpty(((CharSequence) (obj1))))
	//* 121  209:aload           5
	//* 122  211:invokestatic    #265 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 123  214:ifne            227
			{
				obj1 = ((Object) (Uri.parse(((String) (obj1)))));
	//  124  217:aload           5
	//  125  219:invokestatic    #273 <Method Uri Uri.parse(String)>
	//  126  222:astore          5
				break;
	//  127  224:goto            234
			}
			j++;
	//  128  227:iload_1         
	//  129  228:iconst_1        
	//  130  229:iadd            
	//  131  230:istore_1        
		} while(true);
	//  132  231:goto            186
		uri = null;
	//  133  234:aconst_null     
	//  134  235:astore          6
		Object obj2 = ((Object) (getString("android.media.metadata.MEDIA_URI")));
	//  135  237:aload_0         
	//  136  238:ldc1            #99  <String "android.media.metadata.MEDIA_URI">
	//  137  240:invokevirtual   #253 <Method String getString(String)>
	//  138  243:astore          9
		if(!TextUtils.isEmpty(((CharSequence) (obj2))))
	//* 139  245:aload           9
	//* 140  247:invokestatic    #265 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 141  250:ifne            260
			uri = Uri.parse(((String) (obj2)));
	//  142  253:aload           9
	//  143  255:invokestatic    #273 <Method Uri Uri.parse(String)>
	//  144  258:astore          6
		obj2 = ((Object) (new MediaDescriptionCompat.Builder()));
	//  145  260:new             #275 <Class MediaDescriptionCompat$Builder>
	//  146  263:dup             
	//  147  264:invokespecial   #276 <Method void MediaDescriptionCompat$Builder()>
	//  148  267:astore          9
		((MediaDescriptionCompat.Builder) (obj2)).setMediaId(s);
	//  149  269:aload           9
	//  150  271:aload           7
	//  151  273:invokevirtual   #280 <Method MediaDescriptionCompat$Builder MediaDescriptionCompat$Builder.setMediaId(String)>
	//  152  276:pop             
		((MediaDescriptionCompat.Builder) (obj2)).setTitle(acharsequence[0]);
	//  153  277:aload           9
	//  154  279:aload           8
	//  155  281:iconst_0        
	//  156  282:aaload          
	//  157  283:invokevirtual   #284 <Method MediaDescriptionCompat$Builder MediaDescriptionCompat$Builder.setTitle(CharSequence)>
	//  158  286:pop             
		((MediaDescriptionCompat.Builder) (obj2)).setSubtitle(acharsequence[1]);
	//  159  287:aload           9
	//  160  289:aload           8
	//  161  291:iconst_1        
	//  162  292:aaload          
	//  163  293:invokevirtual   #287 <Method MediaDescriptionCompat$Builder MediaDescriptionCompat$Builder.setSubtitle(CharSequence)>
	//  164  296:pop             
		((MediaDescriptionCompat.Builder) (obj2)).setDescription(acharsequence[2]);
	//  165  297:aload           9
	//  166  299:aload           8
	//  167  301:iconst_2        
	//  168  302:aaload          
	//  169  303:invokevirtual   #290 <Method MediaDescriptionCompat$Builder MediaDescriptionCompat$Builder.setDescription(CharSequence)>
	//  170  306:pop             
		((MediaDescriptionCompat.Builder) (obj2)).setIconBitmap(((Bitmap) (as)));
	//  171  307:aload           9
	//  172  309:aload           4
	//  173  311:invokevirtual   #294 <Method MediaDescriptionCompat$Builder MediaDescriptionCompat$Builder.setIconBitmap(Bitmap)>
	//  174  314:pop             
		((MediaDescriptionCompat.Builder) (obj2)).setIconUri(((Uri) (obj1)));
	//  175  315:aload           9
	//  176  317:aload           5
	//  177  319:invokevirtual   #298 <Method MediaDescriptionCompat$Builder MediaDescriptionCompat$Builder.setIconUri(Uri)>
	//  178  322:pop             
		((MediaDescriptionCompat.Builder) (obj2)).setMediaUri(uri);
	//  179  323:aload           9
	//  180  325:aload           6
	//  181  327:invokevirtual   #301 <Method MediaDescriptionCompat$Builder MediaDescriptionCompat$Builder.setMediaUri(Uri)>
	//  182  330:pop             
		if(mBundle.containsKey("android.media.metadata.BT_FOLDER_TYPE"))
	//* 183  331:aload_0         
	//* 184  332:getfield        #181 <Field Bundle mBundle>
	//* 185  335:ldc1            #60  <String "android.media.metadata.BT_FOLDER_TYPE">
	//* 186  337:invokevirtual   #224 <Method boolean Bundle.containsKey(String)>
	//* 187  340:ifeq            374
		{
			Bundle bundle = new Bundle();
	//  188  343:new             #177 <Class Bundle>
	//  189  346:dup             
	//  190  347:invokespecial   #302 <Method void Bundle()>
	//  191  350:astore          4
			bundle.putLong("android.media.extra.BT_FOLDER_TYPE", getLong("android.media.metadata.BT_FOLDER_TYPE"));
	//  192  352:aload           4
	//  193  354:ldc2            #304 <String "android.media.extra.BT_FOLDER_TYPE">
	//  194  357:aload_0         
	//  195  358:ldc1            #60  <String "android.media.metadata.BT_FOLDER_TYPE">
	//  196  360:invokevirtual   #308 <Method long getLong(String)>
	//  197  363:invokevirtual   #312 <Method void Bundle.putLong(String, long)>
			((MediaDescriptionCompat.Builder) (obj2)).setExtras(bundle);
	//  198  366:aload           9
	//  199  368:aload           4
	//  200  370:invokevirtual   #316 <Method MediaDescriptionCompat$Builder MediaDescriptionCompat$Builder.setExtras(Bundle)>
	//  201  373:pop             
		}
		mDescription = ((MediaDescriptionCompat.Builder) (obj2)).build();
	//  202  374:aload_0         
	//  203  375:aload           9
	//  204  377:invokevirtual   #319 <Method MediaDescriptionCompat MediaDescriptionCompat$Builder.build()>
	//  205  380:putfield        #249 <Field MediaDescriptionCompat mDescription>
		return mDescription;
	//  206  383:aload_0         
	//  207  384:getfield        #249 <Field MediaDescriptionCompat mDescription>
	//  208  387:areturn         
	}

	public long getLong(String s)
	{
		return mBundle.getLong(s, 0L);
	//    0    0:aload_0         
	//    1    1:getfield        #181 <Field Bundle mBundle>
	//    2    4:aload_1         
	//    3    5:lconst_0        
	//    4    6:invokevirtual   #322 <Method long Bundle.getLong(String, long)>
	//    5    9:lreturn         
	}

	public Object getMediaMetadata()
	{
		if(mMetadataObj != null || android.os.Build.VERSION.SDK_INT < 21)
	//*   0    0:aload_0         
	//*   1    1:getfield        #220 <Field Object mMetadataObj>
	//*   2    4:ifnonnull       15
	//*   3    7:getstatic       #195 <Field int android.os.Build$VERSION.SDK_INT>
	//*   4   10:bipush          21
	//*   5   12:icmpge          20
		{
			return mMetadataObj;
	//    6   15:aload_0         
	//    7   16:getfield        #220 <Field Object mMetadataObj>
	//    8   19:areturn         
		} else
		{
			Parcel parcel = Parcel.obtain();
	//    9   20:invokestatic    #199 <Method Parcel Parcel.obtain()>
	//   10   23:astore_1        
			writeToParcel(parcel, 0);
	//   11   24:aload_0         
	//   12   25:aload_1         
	//   13   26:iconst_0        
	//   14   27:invokevirtual   #327 <Method void writeToParcel(Parcel, int)>
			parcel.setDataPosition(0);
	//   15   30:aload_1         
	//   16   31:iconst_0        
	//   17   32:invokevirtual   #209 <Method void Parcel.setDataPosition(int)>
			mMetadataObj = MediaMetadataCompatApi21.createFromParcel(parcel);
	//   18   35:aload_0         
	//   19   36:aload_1         
	//   20   37:invokestatic    #328 <Method Object MediaMetadataCompatApi21.createFromParcel(Parcel)>
	//   21   40:putfield        #220 <Field Object mMetadataObj>
			parcel.recycle();
	//   22   43:aload_1         
	//   23   44:invokevirtual   #218 <Method void Parcel.recycle()>
			return mMetadataObj;
	//   24   47:aload_0         
	//   25   48:getfield        #220 <Field Object mMetadataObj>
	//   26   51:areturn         
		}
	}

	public RatingCompat getRating(String s)
	{
label0:
		{
			if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #195 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          23
			{
				s = ((String) (RatingCompat.fromRating(((Object) (mBundle.getParcelable(s))))));
	//    3    8:aload_0         
	//    4    9:getfield        #181 <Field Bundle mBundle>
	//    5   12:aload_1         
	//    6   13:invokevirtual   #234 <Method Parcelable Bundle.getParcelable(String)>
	//    7   16:invokestatic    #336 <Method RatingCompat RatingCompat.fromRating(Object)>
	//    8   19:astore_1        
				break label0;
	//    9   20:goto            35
			}
			try
			{
				s = ((String) ((RatingCompat)mBundle.getParcelable(s)));
	//   10   23:aload_0         
	//   11   24:getfield        #181 <Field Bundle mBundle>
	//   12   27:aload_1         
	//   13   28:invokevirtual   #234 <Method Parcelable Bundle.getParcelable(String)>
	//   14   31:checkcast       #332 <Class RatingCompat>
	//   15   34:astore_1        
			}
	//*  16   35:aload_1         
	//*  17   36:areturn         
			// Misplaced declaration of an exception variable
			catch(String s)
	//*  18   37:astore_1        
			{
				Log.w("MediaMetadata", "Failed to retrieve a key as Rating.", ((Throwable) (s)));
	//   19   38:ldc1            #136 <String "MediaMetadata">
	//   20   40:ldc2            #338 <String "Failed to retrieve a key as Rating.">
	//   21   43:aload_1         
	//   22   44:invokestatic    #244 <Method int Log.w(String, String, Throwable)>
	//   23   47:pop             
				return null;
	//   24   48:aconst_null     
	//   25   49:areturn         
			}
		}
		return ((RatingCompat) (s));
	}

	public String getString(String s)
	{
		s = ((String) (mBundle.getCharSequence(s)));
	//    0    0:aload_0         
	//    1    1:getfield        #181 <Field Bundle mBundle>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #341 <Method CharSequence Bundle.getCharSequence(String)>
	//    4    8:astore_1        
		if(s != null)
	//*   5    9:aload_1         
	//*   6   10:ifnull          20
			return ((CharSequence) (s)).toString();
	//    7   13:aload_1         
	//    8   14:invokeinterface #345 <Method String CharSequence.toString()>
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
	//    1    1:getfield        #181 <Field Bundle mBundle>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #341 <Method CharSequence Bundle.getCharSequence(String)>
	//    4    8:areturn         
	}

	public Set keySet()
	{
		return mBundle.keySet();
	//    0    0:aload_0         
	//    1    1:getfield        #181 <Field Bundle mBundle>
	//    2    4:invokevirtual   #349 <Method Set Bundle.keySet()>
	//    3    7:areturn         
	}

	public int size()
	{
		return mBundle.size();
	//    0    0:aload_0         
	//    1    1:getfield        #181 <Field Bundle mBundle>
	//    2    4:invokevirtual   #354 <Method int Bundle.size()>
	//    3    7:ireturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeBundle(mBundle);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #181 <Field Bundle mBundle>
	//    3    5:invokevirtual   #357 <Method void Parcel.writeBundle(Bundle)>
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
	//    0    0:new             #146 <Class ArrayMap>
	//    1    3:dup             
	//    2    4:invokespecial   #149 <Method void ArrayMap()>
	//    3    7:putstatic       #151 <Field ArrayMap METADATA_KEYS_TYPE>
		METADATA_KEYS_TYPE.put("android.media.metadata.TITLE", ((Object) (Integer.valueOf(1))));
	//    4   10:getstatic       #151 <Field ArrayMap METADATA_KEYS_TYPE>
	//    5   13:ldc1            #108 <String "android.media.metadata.TITLE">
	//    6   15:iconst_1        
	//    7   16:invokestatic    #157 <Method Integer Integer.valueOf(int)>
	//    8   19:invokevirtual   #161 <Method Object ArrayMap.put(Object, Object)>
	//    9   22:pop             
		METADATA_KEYS_TYPE.put("android.media.metadata.ARTIST", ((Object) (Integer.valueOf(1))));
	//   10   23:getstatic       #151 <Field ArrayMap METADATA_KEYS_TYPE>
	//   11   26:ldc1            #51  <String "android.media.metadata.ARTIST">
	//   12   28:iconst_1        
	//   13   29:invokestatic    #157 <Method Integer Integer.valueOf(int)>
	//   14   32:invokevirtual   #161 <Method Object ArrayMap.put(Object, Object)>
	//   15   35:pop             
		METADATA_KEYS_TYPE.put("android.media.metadata.DURATION", ((Object) (Integer.valueOf(0))));
	//   16   36:getstatic       #151 <Field ArrayMap METADATA_KEYS_TYPE>
	//   17   39:ldc1            #90  <String "android.media.metadata.DURATION">
	//   18   41:iconst_0        
	//   19   42:invokestatic    #157 <Method Integer Integer.valueOf(int)>
	//   20   45:invokevirtual   #161 <Method Object ArrayMap.put(Object, Object)>
	//   21   48:pop             
		METADATA_KEYS_TYPE.put("android.media.metadata.ALBUM", ((Object) (Integer.valueOf(1))));
	//   22   49:getstatic       #151 <Field ArrayMap METADATA_KEYS_TYPE>
	//   23   52:ldc1            #36  <String "android.media.metadata.ALBUM">
	//   24   54:iconst_1        
	//   25   55:invokestatic    #157 <Method Integer Integer.valueOf(int)>
	//   26   58:invokevirtual   #161 <Method Object ArrayMap.put(Object, Object)>
	//   27   61:pop             
		METADATA_KEYS_TYPE.put("android.media.metadata.AUTHOR", ((Object) (Integer.valueOf(1))));
	//   28   62:getstatic       #151 <Field ArrayMap METADATA_KEYS_TYPE>
	//   29   65:ldc1            #57  <String "android.media.metadata.AUTHOR">
	//   30   67:iconst_1        
	//   31   68:invokestatic    #157 <Method Integer Integer.valueOf(int)>
	//   32   71:invokevirtual   #161 <Method Object ArrayMap.put(Object, Object)>
	//   33   74:pop             
		METADATA_KEYS_TYPE.put("android.media.metadata.WRITER", ((Object) (Integer.valueOf(1))));
	//   34   75:getstatic       #151 <Field ArrayMap METADATA_KEYS_TYPE>
	//   35   78:ldc1            #117 <String "android.media.metadata.WRITER">
	//   36   80:iconst_1        
	//   37   81:invokestatic    #157 <Method Integer Integer.valueOf(int)>
	//   38   84:invokevirtual   #161 <Method Object ArrayMap.put(Object, Object)>
	//   39   87:pop             
		METADATA_KEYS_TYPE.put("android.media.metadata.COMPOSER", ((Object) (Integer.valueOf(1))));
	//   40   88:getstatic       #151 <Field ArrayMap METADATA_KEYS_TYPE>
	//   41   91:ldc1            #66  <String "android.media.metadata.COMPOSER">
	//   42   93:iconst_1        
	//   43   94:invokestatic    #157 <Method Integer Integer.valueOf(int)>
	//   44   97:invokevirtual   #161 <Method Object ArrayMap.put(Object, Object)>
	//   45  100:pop             
		METADATA_KEYS_TYPE.put("android.media.metadata.COMPILATION", ((Object) (Integer.valueOf(1))));
	//   46  101:getstatic       #151 <Field ArrayMap METADATA_KEYS_TYPE>
	//   47  104:ldc1            #63  <String "android.media.metadata.COMPILATION">
	//   48  106:iconst_1        
	//   49  107:invokestatic    #157 <Method Integer Integer.valueOf(int)>
	//   50  110:invokevirtual   #161 <Method Object ArrayMap.put(Object, Object)>
	//   51  113:pop             
		METADATA_KEYS_TYPE.put("android.media.metadata.DATE", ((Object) (Integer.valueOf(1))));
	//   52  114:getstatic       #151 <Field ArrayMap METADATA_KEYS_TYPE>
	//   53  117:ldc1            #69  <String "android.media.metadata.DATE">
	//   54  119:iconst_1        
	//   55  120:invokestatic    #157 <Method Integer Integer.valueOf(int)>
	//   56  123:invokevirtual   #161 <Method Object ArrayMap.put(Object, Object)>
	//   57  126:pop             
		METADATA_KEYS_TYPE.put("android.media.metadata.YEAR", ((Object) (Integer.valueOf(0))));
	//   58  127:getstatic       #151 <Field ArrayMap METADATA_KEYS_TYPE>
	//   59  130:ldc1            #120 <String "android.media.metadata.YEAR">
	//   60  132:iconst_0        
	//   61  133:invokestatic    #157 <Method Integer Integer.valueOf(int)>
	//   62  136:invokevirtual   #161 <Method Object ArrayMap.put(Object, Object)>
	//   63  139:pop             
		METADATA_KEYS_TYPE.put("android.media.metadata.GENRE", ((Object) (Integer.valueOf(1))));
	//   64  140:getstatic       #151 <Field ArrayMap METADATA_KEYS_TYPE>
	//   65  143:ldc1            #93  <String "android.media.metadata.GENRE">
	//   66  145:iconst_1        
	//   67  146:invokestatic    #157 <Method Integer Integer.valueOf(int)>
	//   68  149:invokevirtual   #161 <Method Object ArrayMap.put(Object, Object)>
	//   69  152:pop             
		METADATA_KEYS_TYPE.put("android.media.metadata.TRACK_NUMBER", ((Object) (Integer.valueOf(0))));
	//   70  153:getstatic       #151 <Field ArrayMap METADATA_KEYS_TYPE>
	//   71  156:ldc1            #111 <String "android.media.metadata.TRACK_NUMBER">
	//   72  158:iconst_0        
	//   73  159:invokestatic    #157 <Method Integer Integer.valueOf(int)>
	//   74  162:invokevirtual   #161 <Method Object ArrayMap.put(Object, Object)>
	//   75  165:pop             
		METADATA_KEYS_TYPE.put("android.media.metadata.NUM_TRACKS", ((Object) (Integer.valueOf(0))));
	//   76  166:getstatic       #151 <Field ArrayMap METADATA_KEYS_TYPE>
	//   77  169:ldc1            #102 <String "android.media.metadata.NUM_TRACKS">
	//   78  171:iconst_0        
	//   79  172:invokestatic    #157 <Method Integer Integer.valueOf(int)>
	//   80  175:invokevirtual   #161 <Method Object ArrayMap.put(Object, Object)>
	//   81  178:pop             
		METADATA_KEYS_TYPE.put("android.media.metadata.DISC_NUMBER", ((Object) (Integer.valueOf(0))));
	//   82  179:getstatic       #151 <Field ArrayMap METADATA_KEYS_TYPE>
	//   83  182:ldc1            #72  <String "android.media.metadata.DISC_NUMBER">
	//   84  184:iconst_0        
	//   85  185:invokestatic    #157 <Method Integer Integer.valueOf(int)>
	//   86  188:invokevirtual   #161 <Method Object ArrayMap.put(Object, Object)>
	//   87  191:pop             
		METADATA_KEYS_TYPE.put("android.media.metadata.ALBUM_ARTIST", ((Object) (Integer.valueOf(1))));
	//   88  192:getstatic       #151 <Field ArrayMap METADATA_KEYS_TYPE>
	//   89  195:ldc1            #42  <String "android.media.metadata.ALBUM_ARTIST">
	//   90  197:iconst_1        
	//   91  198:invokestatic    #157 <Method Integer Integer.valueOf(int)>
	//   92  201:invokevirtual   #161 <Method Object ArrayMap.put(Object, Object)>
	//   93  204:pop             
		METADATA_KEYS_TYPE.put("android.media.metadata.ART", ((Object) (Integer.valueOf(2))));
	//   94  205:getstatic       #151 <Field ArrayMap METADATA_KEYS_TYPE>
	//   95  208:ldc1            #48  <String "android.media.metadata.ART">
	//   96  210:iconst_2        
	//   97  211:invokestatic    #157 <Method Integer Integer.valueOf(int)>
	//   98  214:invokevirtual   #161 <Method Object ArrayMap.put(Object, Object)>
	//   99  217:pop             
		METADATA_KEYS_TYPE.put("android.media.metadata.ART_URI", ((Object) (Integer.valueOf(1))));
	//  100  218:getstatic       #151 <Field ArrayMap METADATA_KEYS_TYPE>
	//  101  221:ldc1            #54  <String "android.media.metadata.ART_URI">
	//  102  223:iconst_1        
	//  103  224:invokestatic    #157 <Method Integer Integer.valueOf(int)>
	//  104  227:invokevirtual   #161 <Method Object ArrayMap.put(Object, Object)>
	//  105  230:pop             
		METADATA_KEYS_TYPE.put("android.media.metadata.ALBUM_ART", ((Object) (Integer.valueOf(2))));
	//  106  231:getstatic       #151 <Field ArrayMap METADATA_KEYS_TYPE>
	//  107  234:ldc1            #39  <String "android.media.metadata.ALBUM_ART">
	//  108  236:iconst_2        
	//  109  237:invokestatic    #157 <Method Integer Integer.valueOf(int)>
	//  110  240:invokevirtual   #161 <Method Object ArrayMap.put(Object, Object)>
	//  111  243:pop             
		METADATA_KEYS_TYPE.put("android.media.metadata.ALBUM_ART_URI", ((Object) (Integer.valueOf(1))));
	//  112  244:getstatic       #151 <Field ArrayMap METADATA_KEYS_TYPE>
	//  113  247:ldc1            #45  <String "android.media.metadata.ALBUM_ART_URI">
	//  114  249:iconst_1        
	//  115  250:invokestatic    #157 <Method Integer Integer.valueOf(int)>
	//  116  253:invokevirtual   #161 <Method Object ArrayMap.put(Object, Object)>
	//  117  256:pop             
		METADATA_KEYS_TYPE.put("android.media.metadata.USER_RATING", ((Object) (Integer.valueOf(3))));
	//  118  257:getstatic       #151 <Field ArrayMap METADATA_KEYS_TYPE>
	//  119  260:ldc1            #114 <String "android.media.metadata.USER_RATING">
	//  120  262:iconst_3        
	//  121  263:invokestatic    #157 <Method Integer Integer.valueOf(int)>
	//  122  266:invokevirtual   #161 <Method Object ArrayMap.put(Object, Object)>
	//  123  269:pop             
		METADATA_KEYS_TYPE.put("android.media.metadata.RATING", ((Object) (Integer.valueOf(3))));
	//  124  270:getstatic       #151 <Field ArrayMap METADATA_KEYS_TYPE>
	//  125  273:ldc1            #105 <String "android.media.metadata.RATING">
	//  126  275:iconst_3        
	//  127  276:invokestatic    #157 <Method Integer Integer.valueOf(int)>
	//  128  279:invokevirtual   #161 <Method Object ArrayMap.put(Object, Object)>
	//  129  282:pop             
		METADATA_KEYS_TYPE.put("android.media.metadata.DISPLAY_TITLE", ((Object) (Integer.valueOf(1))));
	//  130  283:getstatic       #151 <Field ArrayMap METADATA_KEYS_TYPE>
	//  131  286:ldc1            #87  <String "android.media.metadata.DISPLAY_TITLE">
	//  132  288:iconst_1        
	//  133  289:invokestatic    #157 <Method Integer Integer.valueOf(int)>
	//  134  292:invokevirtual   #161 <Method Object ArrayMap.put(Object, Object)>
	//  135  295:pop             
		METADATA_KEYS_TYPE.put("android.media.metadata.DISPLAY_SUBTITLE", ((Object) (Integer.valueOf(1))));
	//  136  296:getstatic       #151 <Field ArrayMap METADATA_KEYS_TYPE>
	//  137  299:ldc1            #84  <String "android.media.metadata.DISPLAY_SUBTITLE">
	//  138  301:iconst_1        
	//  139  302:invokestatic    #157 <Method Integer Integer.valueOf(int)>
	//  140  305:invokevirtual   #161 <Method Object ArrayMap.put(Object, Object)>
	//  141  308:pop             
		METADATA_KEYS_TYPE.put("android.media.metadata.DISPLAY_DESCRIPTION", ((Object) (Integer.valueOf(1))));
	//  142  309:getstatic       #151 <Field ArrayMap METADATA_KEYS_TYPE>
	//  143  312:ldc1            #75  <String "android.media.metadata.DISPLAY_DESCRIPTION">
	//  144  314:iconst_1        
	//  145  315:invokestatic    #157 <Method Integer Integer.valueOf(int)>
	//  146  318:invokevirtual   #161 <Method Object ArrayMap.put(Object, Object)>
	//  147  321:pop             
		METADATA_KEYS_TYPE.put("android.media.metadata.DISPLAY_ICON", ((Object) (Integer.valueOf(2))));
	//  148  322:getstatic       #151 <Field ArrayMap METADATA_KEYS_TYPE>
	//  149  325:ldc1            #78  <String "android.media.metadata.DISPLAY_ICON">
	//  150  327:iconst_2        
	//  151  328:invokestatic    #157 <Method Integer Integer.valueOf(int)>
	//  152  331:invokevirtual   #161 <Method Object ArrayMap.put(Object, Object)>
	//  153  334:pop             
		METADATA_KEYS_TYPE.put("android.media.metadata.DISPLAY_ICON_URI", ((Object) (Integer.valueOf(1))));
	//  154  335:getstatic       #151 <Field ArrayMap METADATA_KEYS_TYPE>
	//  155  338:ldc1            #81  <String "android.media.metadata.DISPLAY_ICON_URI">
	//  156  340:iconst_1        
	//  157  341:invokestatic    #157 <Method Integer Integer.valueOf(int)>
	//  158  344:invokevirtual   #161 <Method Object ArrayMap.put(Object, Object)>
	//  159  347:pop             
		METADATA_KEYS_TYPE.put("android.media.metadata.MEDIA_ID", ((Object) (Integer.valueOf(1))));
	//  160  348:getstatic       #151 <Field ArrayMap METADATA_KEYS_TYPE>
	//  161  351:ldc1            #96  <String "android.media.metadata.MEDIA_ID">
	//  162  353:iconst_1        
	//  163  354:invokestatic    #157 <Method Integer Integer.valueOf(int)>
	//  164  357:invokevirtual   #161 <Method Object ArrayMap.put(Object, Object)>
	//  165  360:pop             
		METADATA_KEYS_TYPE.put("android.media.metadata.BT_FOLDER_TYPE", ((Object) (Integer.valueOf(0))));
	//  166  361:getstatic       #151 <Field ArrayMap METADATA_KEYS_TYPE>
	//  167  364:ldc1            #60  <String "android.media.metadata.BT_FOLDER_TYPE">
	//  168  366:iconst_0        
	//  169  367:invokestatic    #157 <Method Integer Integer.valueOf(int)>
	//  170  370:invokevirtual   #161 <Method Object ArrayMap.put(Object, Object)>
	//  171  373:pop             
		METADATA_KEYS_TYPE.put("android.media.metadata.MEDIA_URI", ((Object) (Integer.valueOf(1))));
	//  172  374:getstatic       #151 <Field ArrayMap METADATA_KEYS_TYPE>
	//  173  377:ldc1            #99  <String "android.media.metadata.MEDIA_URI">
	//  174  379:iconst_1        
	//  175  380:invokestatic    #157 <Method Integer Integer.valueOf(int)>
	//  176  383:invokevirtual   #161 <Method Object ArrayMap.put(Object, Object)>
	//  177  386:pop             
		METADATA_KEYS_TYPE.put("android.media.metadata.ADVERTISEMENT", ((Object) (Integer.valueOf(0))));
	//  178  387:getstatic       #151 <Field ArrayMap METADATA_KEYS_TYPE>
	//  179  390:ldc1            #33  <String "android.media.metadata.ADVERTISEMENT">
	//  180  392:iconst_0        
	//  181  393:invokestatic    #157 <Method Integer Integer.valueOf(int)>
	//  182  396:invokevirtual   #161 <Method Object ArrayMap.put(Object, Object)>
	//  183  399:pop             
	//  184  400:bipush          7
	//  185  402:anewarray       String[]
	//  186  405:dup             
	//  187  406:iconst_0        
	//  188  407:ldc1            #108 <String "android.media.metadata.TITLE">
	//  189  409:aastore         
	//  190  410:dup             
	//  191  411:iconst_1        
	//  192  412:ldc1            #51  <String "android.media.metadata.ARTIST">
	//  193  414:aastore         
	//  194  415:dup             
	//  195  416:iconst_2        
	//  196  417:ldc1            #36  <String "android.media.metadata.ALBUM">
	//  197  419:aastore         
	//  198  420:dup             
	//  199  421:iconst_3        
	//  200  422:ldc1            #42  <String "android.media.metadata.ALBUM_ARTIST">
	//  201  424:aastore         
	//  202  425:dup             
	//  203  426:iconst_4        
	//  204  427:ldc1            #117 <String "android.media.metadata.WRITER">
	//  205  429:aastore         
	//  206  430:dup             
	//  207  431:iconst_5        
	//  208  432:ldc1            #57  <String "android.media.metadata.AUTHOR">
	//  209  434:aastore         
	//  210  435:dup             
	//  211  436:bipush          6
	//  212  438:ldc1            #66  <String "android.media.metadata.COMPOSER">
	//  213  440:aastore         
	//  214  441:putstatic       #165 <Field String[] PREFERRED_DESCRIPTION_ORDER>
	//  215  444:iconst_3        
	//  216  445:anewarray       String[]
	//  217  448:dup             
	//  218  449:iconst_0        
	//  219  450:ldc1            #78  <String "android.media.metadata.DISPLAY_ICON">
	//  220  452:aastore         
	//  221  453:dup             
	//  222  454:iconst_1        
	//  223  455:ldc1            #48  <String "android.media.metadata.ART">
	//  224  457:aastore         
	//  225  458:dup             
	//  226  459:iconst_2        
	//  227  460:ldc1            #39  <String "android.media.metadata.ALBUM_ART">
	//  228  462:aastore         
	//  229  463:putstatic       #167 <Field String[] PREFERRED_BITMAP_ORDER>
	//  230  466:iconst_3        
	//  231  467:anewarray       String[]
	//  232  470:dup             
	//  233  471:iconst_0        
	//  234  472:ldc1            #81  <String "android.media.metadata.DISPLAY_ICON_URI">
	//  235  474:aastore         
	//  236  475:dup             
	//  237  476:iconst_1        
	//  238  477:ldc1            #54  <String "android.media.metadata.ART_URI">
	//  239  479:aastore         
	//  240  480:dup             
	//  241  481:iconst_2        
	//  242  482:ldc1            #45  <String "android.media.metadata.ALBUM_ART_URI">
	//  243  484:aastore         
	//  244  485:putstatic       #169 <Field String[] PREFERRED_URI_ORDER>
	//  245  488:new             #8   <Class MediaMetadataCompat$1>
	//  246  491:dup             
	//  247  492:invokespecial   #170 <Method void MediaMetadataCompat$1()>
	//  248  495:putstatic       #172 <Field android.os.Parcelable$Creator CREATOR>
	//* 249  498:return          
	}
}
